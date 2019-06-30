import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
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
import { GeneroRouterModule } from './genero.routing';
import { GeneroFormComponent } from './views/genero-form/genero-form.component';
import { DiretorFormComponent } from '../diretor/views/diretor-form/diretor-form.component';
import { GeneroResolver } from './views/genero-form/genero.resolver';
import { GeneroListComponent } from './views/genero-list/genero-list.component';
import {DialogModule} from 'primeng/dialog';

@NgModule({
  declarations: [GeneroFormComponent, GeneroListComponent],
  imports: [
    CommonModule,
    GeneroRouterModule,
    CardModule,
    ButtonModule,
    TableModule,
    ReactiveFormsModule,
    InputTextModule,
    KeyFilterModule,
    CalendarModule,
    RadioButtonModule,
    MessageModule,
    ToastModule,
    DialogModule
  ],
  providers: [
    MessageService,
    GeneroResolver
  ]
})
export class GeneroModule { }
