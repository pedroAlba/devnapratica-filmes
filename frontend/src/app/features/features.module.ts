import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FeaturesRouterModule } from './features.routing';
import { FilmeModule } from './filme/filme.module';
import { RouterModule } from '@angular/router';
import { AtorModule } from './ator/ator.module';

@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    FeaturesRouterModule,
    FilmeModule,
    AtorModule,
  ],
  exports: [
    RouterModule
  ]
})
export class FeaturesModule { }
