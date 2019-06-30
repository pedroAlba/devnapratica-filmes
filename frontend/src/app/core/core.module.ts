import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {FilmeModule} from './entities/filme/filme.module';
import {AtorModule} from './entities/ator/ator.module';
import {GeneroModule} from './entities/genero/genero.module';
import {DiretorModule} from './entities/diretor/diretor.module';

@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    FilmeModule,
    AtorModule,
    DiretorModule,
    GeneroModule,
    DiretorModule
  ]
})
export class CoreModule {
}
