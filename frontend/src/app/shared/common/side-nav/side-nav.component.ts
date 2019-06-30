import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-side-nav',
  templateUrl: './side-nav.component.html',
  styleUrls: ['./side-nav.component.scss']
})
export class SideNavComponent implements OnInit {

  items = [
    {
      label: 'Filme',
      routerLink: '/filmes'
    },
    {
      label: 'Atores',
      routerLink: '/atores'
    },
    {
      label: 'Generos',
      routerLink: '/generos'
    },
    {
      label: 'Diretores',
      routerLink: '/diretores'
    }
  ];

  constructor() { }

  ngOnInit() {
  }

}
