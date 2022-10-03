import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { NovoPageRoutingModule } from './novo-routing.module';

import { NovoPage } from './novo.page';

import { FormularioComponent } from '../formulario/formulario.component';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    NovoPageRoutingModule
  ],
  declarations: [NovoPage, FormularioComponent]
})
export class NovoPageModule {}
