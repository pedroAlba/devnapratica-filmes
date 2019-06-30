import { Component, OnInit } from '@angular/core';
import { FilmeService } from 'src/app/core/entities/filme/filme.service';
import { MessageService } from 'primeng/components/common/messageservice';
import { ActivatedRoute, Router } from '@angular/router';
import { catchError } from 'rxjs/operators';
import { throwError } from 'rxjs';
import { Ator } from 'src/app/core/entities/ator/ator';
import { AtorService } from 'src/app/core/entities/ator/ator.service';
import { Diretor } from 'src/app/core/entities/diretor/diretor';
import { DiretorService } from 'src/app/core/entities/diretor/diretor.service';
import { SelectableRowDblClick } from 'primeng/table';

@Component({
  selector: 'app-cliente-list',
  templateUrl: './diretor-list.component.html',
})
export class DiretorListComponent implements OnInit {

  items: Diretor[];
  columns: any[];
  filmes;
  showDialog: boolean = false
  showExperienteDialog: boolean = false
  ehExperiente: boolean = false
  selected;

  constructor(
    private diretorService: DiretorService,
    private messageService: MessageService,
    private router: Router,
    private route: ActivatedRoute
    ) { }

  ngOnInit() {
    this.diretorService.list()
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

  public onAdd() {
    this.router.navigate(['/diretor/create'], { relativeTo: this.route });
  }

  public editItem(item: Diretor) {
    this.router.navigate([`/diretor/edit/${item.id}`], { relativeTo: this.route });
  }

  public showFilmes(item: Diretor) {
    this.selected = item;
    this.diretorService.retornaFilmesByDiretor(item.nome).subscribe(({ filmes }) => {
      this.filmes = filmes;
      console.log(this.filmes)
      this.showDialog = true
    })
  }

  atualizarExperiencia(item: Diretor) {
    this.diretorService.atualizaStatusDiretor(item.nome).subscribe(( { ehExperiente }) => {
      this.selected = item.nome
      this.ehExperiente = ehExperiente
      this.showExperienteDialog = true
    })
  }

  public onRemoveConfirm(item: any) {
    const { id, nome } = item.data;

    this.diretorService.delete(id)
    .pipe(this.listErrorCatch(`Error`, `Erro ao deletar o diretor`))
    .subscribe(() => {
      this.messageService.clear('removeConfirm');
      this.items = this.items.filter(item => item.id !== id);
      this.items.find((item: Diretor) => item.id === id);
      this.messageService.add({
        key: 'remove-toast',
        severity: 'success',
        summary: `Sucesso!`,
        detail: `Diretor ${nome} deletado!`
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
