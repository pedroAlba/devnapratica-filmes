import { NgModule } from '@angular/core';
import { PermissionsModule } from '@seniorsistemas/platform-components';
import { FilmeService } from './filme.service';

@NgModule({
    imports: [
        PermissionsModule.forChild([
            {
                name: 'filme',
                actions: ['Visualizar', 'Incluir', 'Editar', 'Excluir'],
                uri: `res://senior.com.br/erpx_arq/acme/entities/filme`,
            },
        ]),
    ],
    providers: [
      FilmeService,
    ],
    declarations: [
    ],
    exports: [
    ],

})
export class FilmeModule {}
