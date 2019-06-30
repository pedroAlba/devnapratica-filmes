import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FeaturesRouterModule } from './features.routing';
import { FilmeModule } from './filme/filme.module';
import { RouterModule } from '@angular/router';
import { AtorModule } from './ator/ator.module';
import { DiretorModule } from './diretor/diretor.module';
import { GeneroModule } from './genero/genero.module';

@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    FeaturesRouterModule,
    FilmeModule,
    AtorModule,
    DiretorModule,
    GeneroModule,
  ],
  exports: [
    RouterModule
  ]
})
export class FeaturesModule { }
