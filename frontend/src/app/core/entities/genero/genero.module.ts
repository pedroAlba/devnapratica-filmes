import { NgModule } from '@angular/core';
import { PermissionsModule } from '@seniorsistemas/platform-components';
import { GeneroService } from './genero.service';

@NgModule({
  imports: [
    PermissionsModule.forChild([
      {
        name: 'genero',
        actions: ['Visualizar', 'Incluir', 'Editar', 'Excluir'],
        uri: `res://senior.com.br/erpx_arq/acme/entities/genero`,
      },
    ]),
  ],
  providers: [
    GeneroService,
  ],
  declarations: [
  ],
  exports: [
  ],

})
export class GeneroModule {}
