import { Component, OnInit, Input } from '@angular/core';
import { FormGroup, FormBuilder, Validators, FormControl } from '@angular/forms';
import { Filme } from 'src/app/core/entities/filme/filme';
import { FilmeService } from 'src/app/core/entities/filme/filme.service';
import { catchError, takeUntil } from 'rxjs/operators';
import { throwError, Subject } from 'rxjs';
import { Router, ActivatedRoute } from '@angular/router';
import { MessageService } from 'primeng/api';
import { Ator } from 'src/app/core/entities/ator/ator';
import { AtorService } from 'src/app/core/entities/ator/ator.service';
import { DiretorService } from 'src/app/core/entities/diretor/diretor.service';
import { Diretor } from 'src/app/core/entities/diretor/diretor';

@Component({
  selector: 'app-diretor-form',
  templateUrl: './diretor-form.component.html',
})
export class DiretorFormComponent implements OnInit {
  public atorForm: FormGroup;
  @Input() item: Diretor;
  private routeParams: any;
  private ngUnsubscribe = new Subject();

  constructor(
    private atorService: DiretorService,
    private formBuilder: FormBuilder,
    private router: Router,
    private messageService: MessageService,
    private route: ActivatedRoute
    ) { }

  ngOnInit() {

    this.atorForm = this.getFormGroup();

    this.route.params.pipe(takeUntil(this.ngUnsubscribe)).subscribe((params: any) => this.onRouteParamsChange(params));
    this.route.data.pipe(takeUntil(this.ngUnsubscribe)).subscribe((data: any) => this.onRouteDataChange(data));

  }

  private getFormGroup() {
    return this.formBuilder.group({
      nome: new FormControl(undefined, Validators.compose([Validators.required])),
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
    if (!this.atorForm.valid) {
      return this.validateAllFormFields(this.atorForm);
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
    const previousRoute = '/diretor/list';
    this.router.navigate([previousRoute], { relativeTo: this.route.parent });
  }

  public onRouteDataChange(data: any) {
    const entity = data[0];
    if (data[0]) {
        const value: any = Diretor.fromDto(entity);
        this.atorForm.patchValue(value);
    } else {
        this.atorForm.patchValue(new Diretor());
    }
  }

  public onRouteParamsChange(params: any) {
    this.routeParams = params;
}

  private getSaveObservable() {
    const { value } = this.atorForm;
    const diretorDto = Diretor.toDto(value);

    let observable;

    if (this.isNew()) {
        observable = this.atorService.insert(diretorDto);
        this.messageService.add({
          key: 'form-toast',
          severity: 'success',
          summary: `Sucesso!`,
          detail: `O diretor foi inserido com sucesso!`
        });
    } else {
        const id = this.routeParams.id;
        observable = this.atorService.update(id, diretorDto);
    }

    return observable;
  }
}
