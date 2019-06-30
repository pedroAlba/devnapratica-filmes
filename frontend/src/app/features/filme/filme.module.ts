import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FilmeFormComponent } from './views/filme-form/filme-form.component';
import { FilmeListComponent } from './views/filme-list/filme-list.component';
import { ClienteRouterModule } from './filme.routing';
import { TableModule } from 'primeng/table';
import { CardModule } from 'primeng/card';
import { ButtonModule } from 'primeng/button';
import { ReactiveFormsModule } from '@angular/forms';
import { InputTextModule } from 'primeng/inputtext';
import { KeyFilterModule } from 'primeng/keyfilter';
import { CalendarModule } from 'primeng/calendar';
import { RadioButtonModule } from 'primeng/radiobutton';
import { MessageService } from 'primeng/api';
import { MessageModule } from 'primeng/message';
import { ToastModule } from 'primeng/toast';
import { FilmeResolver } from './views/filme-form/filme.resolver';

@NgModule({
  declarations: [FilmeFormComponent, FilmeListComponent],
  imports: [
    CommonModule,
    ClienteRouterModule,
    CardModule,
    ButtonModule,
    TableModule,
    ReactiveFormsModule,
    InputTextModule,
    KeyFilterModule,
    CalendarModule,
    RadioButtonModule,
    MessageModule,
    ToastModule
  ],
  providers: [
    MessageService,
    FilmeResolver
  ]
})
export class FilmeModule { }
