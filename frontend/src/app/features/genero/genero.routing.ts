import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { GeneroFormComponent } from './views/genero-form/genero-form.component';
import { GeneroListComponent } from './views/genero-list/genero-list.component';
import { GeneroResolver } from './views/genero-form/genero.resolver';

const routes: Routes = [{
  path: 'genero',  children: [
    {
      path: 'create', component: GeneroFormComponent
    },
    {
      path: 'list', component: GeneroListComponent
    },
    {
      path: 'edit/:id', component: GeneroFormComponent, resolve: [GeneroResolver]
    }
  ]
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class GeneroRouterModule { }
