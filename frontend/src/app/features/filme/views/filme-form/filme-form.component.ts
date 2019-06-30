import { Component, OnInit, Input } from '@angular/core';
import { FormGroup, FormBuilder, Validators, FormControl } from '@angular/forms';
import { Filme } from 'src/app/core/entities/filme/filme';
import { FilmeService } from 'src/app/core/entities/filme/filme.service';
import { catchError, takeUntil } from 'rxjs/operators';
import { throwError, Subject } from 'rxjs';
import { Router, ActivatedRoute } from '@angular/router';
import { MessageService } from 'primeng/api';
import { Diretor } from 'src/app/core/entities/diretor/diretor';
import { DiretorService } from 'src/app/core/entities/diretor/diretor.service';
import { GeneroService } from 'src/app/core/entities/genero/genero.service';
import { AtorService } from 'src/app/core/entities/ator/ator.service';

@Component({
  selector: 'app-cliente-form',
  templateUrl: './filme-form.component.html',
  styleUrls: ['./filme-form.component.scss']
})
export class FilmeFormComponent implements OnInit {
  public filmeForm: FormGroup;
  @Input() filme: Filme;
  private routeParams: any;
  private ngUnsubscribe = new Subject();

  private diretores;
  private generos;
  private atores;

  constructor(
    private filmeService: FilmeService,
    private diretorService: DiretorService,
    private generoService: GeneroService,
    private atorService: AtorService,
    private formBuilder: FormBuilder,
    private router: Router,
    private messageService: MessageService,
    private route: ActivatedRoute
    ) { }

  ngOnInit() {

    this.filmeForm = this.getFormGroup();

    this.route.params.pipe(takeUntil(this.ngUnsubscribe)).subscribe((params: any) => this.onRouteParamsChange(params));
    this.route.data.pipe(takeUntil(this.ngUnsubscribe)).subscribe((data: any) => this.onRouteDataChange(data));

    this.diretorService.list().subscribe(({ contents }) => {
      this.diretores = contents
    })

    this.generoService.list().subscribe(({ contents }) => {
      this.generos = contents
    })

    this.atorService.list().subscribe(({ contents}) => {
      this.atores = contents
    })
  }

  private getFormGroup() {
    return this.formBuilder.group({
      nome: new FormControl(undefined, Validators.compose([Validators.required])),
      diretor: new FormControl(undefined, Validators.compose([Validators.required])),
      genero: new FormControl(undefined, Validators.compose([Validators.required])),
      atores: new FormControl(undefined, Validators.compose([Validators.required])),
    });
  }

  private validateAllFormFields(formGroup: FormGroup) {
    Object.keys(formGroup.controls).forEach(field => {
        const control = formGroup.get(field);
        if (control instanceof FormControl) {
          control.markAsDirty({ onlySelf: true });
        } else if (control instanceof FormGroup) {
          this.validateAllFormFields(control);
        }
    });
  }

  public onSave() {
    if (!this.filmeForm.valid) {
      return this.validateAllFormFields(this.filmeForm);
    }

    this.getSaveObservable()
    .pipe(
      catchError((err: any) => {
      console.log(err);
      return throwError(err);
    })
    ).subscribe(() => {
      this.goBack();
      console.log(`Saved`);
    });
  }

  public isNew() {
    return this.routeParams.id === undefined;
  }

  private goBack() {
    const previousRoute = '/filme/list';
    this.router.navigate([previousRoute], { relativeTo: this.route.parent });
  }

  public onRouteDataChange(data: any) {
    const entity = data[0];
    if (data[0]) {
        const value: any = Filme.fromDto(entity);
        this.filmeForm.patchValue(value);
    } else {
        this.filmeForm.patchValue(new Filme());
    }
  }

  public onRouteParamsChange(params: any) {
    this.routeParams = params;
}

  private getSaveObservable() {
    const { value } = this.filmeForm;
    const filmeDto = Filme.toDto(value);

    let observable;

    if (this.isNew()) {
        observable = this.filmeService.insert(filmeDto);
        this.messageService.add({
          key: 'form-toast',
          severity: 'success',
          summary: `Sucesso!`,
          detail: `O Filme foi inserido com sucesso!`
        });
    } else {
        const id = this.routeParams.id;
        observable = this.filmeService.update(id, filmeDto);
    }

    return observable;
  }

}
