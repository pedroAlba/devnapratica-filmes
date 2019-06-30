import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';

const routes: Routes = [{
  path: 'filmes', redirectTo: 'filme/list'
},
  {
    path: 'atores', redirectTo: 'ator/list'
  },
  {
    path: 'diretores', redirectTo: 'diretor/list'
  },
  {
    path: 'generos', redirectTo: 'genero/list'
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class FeaturesRouterModule {
}
