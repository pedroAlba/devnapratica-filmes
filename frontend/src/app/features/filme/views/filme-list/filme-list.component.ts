import { Component, OnInit } from '@angular/core';
import { FilmeService } from 'src/app/core/entities/filme/filme.service';
import { MessageService } from 'primeng/components/common/messageservice';
import { Filme } from 'src/app/core/entities/filme/filme';
import { ActivatedRoute, Router } from '@angular/router';
import { catchError } from 'rxjs/operators';
import { throwError } from 'rxjs';

@Component({
  selector: 'app-filme-list',
  templateUrl: './filme-list.component.html',
  styleUrls: ['./filme-list.component.scss']
})
export class FilmeListComponent implements OnInit {

  filmes: Filme[];
  columns: any[];

  constructor(
    private filmeService: FilmeService,
    private messageService: MessageService,
    private router: Router,
    private route: ActivatedRoute
    ) { }

  ngOnInit() {
    this.filmeService.list()
    .pipe(this.listErrorCatch())
    .subscribe(({ contents }) => {
      this.filmes = contents;
    });

    this.columns = this.getGridColumns();

  }

  private getGridColumns() {
    const gridcloumns = [
      { field: 'nome', header: 'Nome' },
      { field: 'dataLancamento', header: 'Data de Lançamento' },
    ];

    return gridcloumns;
  }

  public onRemove(item: Filme) {
    this.messageService.add({
      key: 'removeConfirm',
      data: item, sticky: true,
      severity: 'info',
      summary: 'Voce tem certeza?',
      detail: 'Confirme para DELETAR'
    });
  }

  public onAdd() {
    this.router.navigate(['/filme/create'], { relativeTo: this.route });
  }

  public editItem(filme: Filme) {
    this.router.navigate([`/filme/edit/${filme.id}`], { relativeTo: this.route });
  }

  public onRemoveConfirm(item: any) {
    const { id, nome } = item.data;

    this.filmeService.delete(id).subscribe(() => {
      this.messageService.clear('removeConfirm');
      this.filmes = this.filmes.filter(filme => filme.id !== id);
      this.filmes.find((filme: Filme) => filme.id === id);
      this.messageService.add({
        key: 'remove-toast',
        severity: 'success',
        summary: `Sucesso!`,
        detail: `Filme ${nome} deletado!`
      });
    });
  }

  public onRemoveReject() {
    this.messageService.clear('removeConfirm');
  }

  private listErrorCatch() {
      return catchError((err: any) => {
        if (err) {
          this.messageService.add({
            key: 'remove-toast',
            severity: 'error',
            summary: 'Erro!',
            detail: `Erro ao carregar a lista!`
          });
        }
        return throwError(err);
      });
  }

}
