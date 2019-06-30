import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AtorFormComponent } from './views/ator-form/ator-form.component';
import { AtorListComponent } from './views/ator-list/ator-list.component';
import { AtorResolver } from './views/ator-form/ator.resolver';

const routes: Routes = [{
  path: 'ator',  children: [
    {
      path: 'create', component: AtorFormComponent
    },
    {
      path: 'list', component: AtorListComponent
    },
    {
      path: 'edit/:id', component: AtorFormComponent, resolve: [AtorResolver]
    }
  ]
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AtorRouterModule { }
