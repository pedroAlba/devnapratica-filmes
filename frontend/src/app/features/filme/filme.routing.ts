import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { FilmeFormComponent } from './views/filme-form/filme-form.component';
import { FilmeListComponent } from './views/filme-list/filme-list.component';
import { FilmeResolver } from './views/filme-form/filme.resolver';

const routes: Routes = [{
  path: 'filme',  children: [
    {
      path: 'create', component: FilmeFormComponent
    },
    {
      path: 'list', component: FilmeListComponent
    },
    {
      path: 'edit/:id', component: FilmeFormComponent, resolve: [FilmeResolver]
    }
  ]
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class ClienteRouterModule { }
