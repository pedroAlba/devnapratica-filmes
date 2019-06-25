import { Component, OnInit } from '@angular/core';
import { FilmeService } from 'src/app/core/entities/filme/filme.service';
import { MessageService } from 'primeng/components/common/messageservice';
import { Filme } from 'src/app/core/entities/filme/filme';
import { ActivatedRoute, Router } from '@angular/router';
import { catchError } from 'rxjs/operators';
import { throwError } from 'rxjs';

@Component({
  selector: 'app-cliente-list',
  templateUrl: './cliente-list.component.html',
  styleUrls: ['./cliente-list.component.scss']
})
export class ClienteListComponent implements OnInit {

  clientes: Filme[];
  columns: any[];

  constructor(
    private clienteService: FilmeService,
    private messageService: MessageService,
    private router: Router,
    private route: ActivatedRoute
    ) { }

  ngOnInit() {
    this.clienteService.list()
    .pipe(this.listErrorCatch())
    .subscribe(({ contents }) => {
      this.clientes = contents;
    });

    this.columns = this.getGridColumns();

  }

  private getGridColumns() {
    const gridcloumns = [
      { field: 'nome', header: 'Nome' },
      { field: 'dataLancamento', header: 'Data de Nascimento' },
      { field: 'creditoHabilitado', header: 'Credito Habilitado' },
      { field: 'cpf', header: 'CPF' },
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

  public editItem(cliente: Filme) {
    this.router.navigate([`/cliente/edit/${cliente.id}`], { relativeTo: this.route });
  }

  public onRemoveConfirm(item: any) {
    const { id, nome } = item.data;

    this.clienteService.delete(id).subscribe(() => {
      this.messageService.clear('removeConfirm');
      this.clientes = this.clientes.filter(cliente => cliente.id !== id);
      this.clientes.find((cliente: Filme) => cliente.id === id);
      this.messageService.add({
        key: 'remove-toast',
        severity: 'success',
        summary: `Sucesso!`,
        detail: `Cliente ${nome} deletado!`
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
