import { NgModule } from '@angular/core';
import { PermissionsModule } from '@seniorsistemas/platform-components';
import { AtorService } from './ator.service';

@NgModule({
    imports: [
        PermissionsModule.forChild([
            {
                name: 'ator.ts',
                actions: ['Visualizar', 'Incluir', 'Editar', 'Excluir'],
                uri: `res://senior.com.br/erpx_arq/acme/entities/ator`,
            },
        ]),
    ],
    providers: [
      AtorService,
    ],
    declarations: [
    ],
    exports: [
    ],

})
export class AtorModule {}
