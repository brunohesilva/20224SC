import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { AtualizaPageRoutingModule } from './atualiza-routing.module';

import { AtualizaPage } from './atualiza.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    AtualizaPageRoutingModule
  ],
  declarations: [AtualizaPage]
})
export class AtualizaPageModule {}
