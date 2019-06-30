import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DiretorListComponent } from './views/diretor-list/diretor-list.component';
import { DiretorResolver } from './views/diretor-form/diretor.resolver';
import { DiretorFormComponent } from './views/diretor-form/diretor-form.component';

const routes: Routes = [{
  path: 'diretor',  children: [
    {
      path: 'create', component: DiretorFormComponent
    },
    {
      path: 'list', component: DiretorListComponent
    },
    {
      path: 'edit/:id', component: DiretorFormComponent, resolve: [DiretorResolver]
    }
  ]
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class DiretorRouterModule { }
