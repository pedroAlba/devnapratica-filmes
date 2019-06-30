import { Component, OnInit } from '@angular/core';
import { FilmeService } from 'src/app/core/entities/filme/filme.service';
import { MessageService } from 'primeng/components/common/messageservice';
import { ActivatedRoute, Router } from '@angular/router';
import { catchError } from 'rxjs/operators';
import { throwError } from 'rxjs';
import { Ator } from 'src/app/core/entities/ator/ator';
import { AtorService } from 'src/app/core/entities/ator/ator.service';

@Component({
  selector: 'app-cliente-list',
  templateUrl: './ator-list.component.html',
})
export class AtorListComponent implements OnInit {

  items: Ator[];
  columns: any[];
  filmes;
  showDialog: boolean = false
  showRicoDialog: boolean = false
  selected;
  ehRico: Boolean = false

  constructor(
    private atorService: AtorService,
    private messageService: MessageService,
    private router: Router,
    private route: ActivatedRoute
    ) { }

  ngOnInit() {
    this.atorService.list()
    .pipe(this.listErrorCatch())
    .subscribe(({ contents }) => {
      this.items = contents;
    });

    this.columns = this.getGridColumns();
    
  }

  private getGridColumns() {
    const gridcloumns = [
      { field: 'id', header: 'Id' },
      { field: 'nome', header: 'Nome' },
      { field: '', header: 'Ações' }
    ];

    return gridcloumns;
  }

  public onRemove(item: Ator) {
    this.messageService.add({
      key: 'removeConfirm',
      data: item, sticky: true,
      severity: 'info',
      summary: 'Voce tem certeza?',
      detail: 'Confirme para DELETAR'
    });
  }

  public showFilmes(item: Ator) {
    this.selected = item;
    this.atorService.retornaFilmesByAtor(item.nome).subscribe(({ filmes }) => {
      this.filmes = filmes;
      console.log(this.filmes)
      this.showDialog = true
    })
  }

  public onAdd() {
    this.router.navigate(['/ator/create'], { relativeTo: this.route });
  }

  public editItem(item: Ator) {
    this.router.navigate([`/ator/edit/${item.id}`], { relativeTo: this.route });
  }

  atualizarRiqueza(item: Ator) {
    this.atorService.atualizaStatusAtor(item.nome).subscribe(( {ehRico }) => {
      this.selected = item.nome
      this.ehRico = ehRico
      this.showRicoDialog = true
    })
  }
  public onRemoveConfirm(item: any) {
    const { id, nome } = item.data;

    this.atorService.delete(id)
    .pipe(this.listErrorCatch(`Error`, `Erro ao deletar o item`))
    .subscribe(() => {
      this.messageService.clear('removeConfirm');
      this.items = this.items.filter(item => item.id !== id);
      this.items.find((item: Ator) => item.id === id);
      this.messageService.add({
        key: 'remove-toast',
        severity: 'success',
        summary: `Sucesso!`,
        detail: `Ator ${nome} deletado!`
      });
    });
  }

  public onRemoveReject() {
    this.messageService.clear('removeConfirm');
  }

  private listErrorCatch(summary?: string, detail?: string) {
      return catchError((err: any) => {
        if (err) {
          this.messageService.add({
            key: 'remove-toast',
            severity: 'error',
            summary: summary || `Error!`,
            detail: detail || `Default error!`
          });
        }
        this.messageService.clear('removeConfirm');
        return throwError(err);
      });
  }

}
