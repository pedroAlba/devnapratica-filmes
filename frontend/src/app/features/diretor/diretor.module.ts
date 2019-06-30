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
import { DiretorFormComponent } from './views/diretor-form/diretor-form.component';
import { DiretorListComponent } from './views/diretor-list/diretor-list.component';
import { DiretorResolver } from './views/diretor-form/diretor.resolver';
import { DiretorRouterModule } from './diretor.routing';
import {DialogModule} from 'primeng/dialog';
@NgModule({
  declarations: [DiretorFormComponent, DiretorListComponent],
  imports: [
    CommonModule,
    DiretorRouterModule,
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
    DiretorResolver
  ]
})
export class DiretorModule { }
