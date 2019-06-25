import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FilmeModule } from './entities/filme/filme.module';
import { AtorModule } from './entities/ator/ator.module';

@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    FilmeModule,
    AtorModule
  ]
})
export class CoreModule { }
