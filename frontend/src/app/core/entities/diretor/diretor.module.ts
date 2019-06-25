import { NgModule } from '@angular/core';
import { PermissionsModule } from '@seniorsistemas/platform-components';
import { DiretorService } from './diretor.service';
import {Diretor} from './diretor';

@NgModule({
  imports: [
    PermissionsModule.forChild([
      {
        name: 'diretor.ts',
        actions: ['Visualizar', 'Incluir', 'Editar', 'Excluir'],
        uri: `res://senior.com.br/erpx_arq/acme/entities/diretor`,
      },
    ]),
  ],
  providers: [
    DiretorService,
  ],
  declarations: [
  ],
  exports: [
  ],

})
export class DiretorModule {}
