import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AtorRouterModule } from './ator.routing';
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
import { AtorFormComponent } from './views/ator-form/ator-form.component';
import { AtorListComponent } from './views/ator-list/ator-list.component';
import { AtorResolver } from './views/ator-form/ator.resolver';
import {DialogModule} from 'primeng/dialog';

@NgModule({
  declarations: [AtorFormComponent, AtorListComponent],
  imports: [
    CommonModule,
    AtorRouterModule,
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
    AtorResolver
  ]
})
export class AtorModule { }
