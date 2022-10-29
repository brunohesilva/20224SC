import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { BuscaIdPageRoutingModule } from './busca-id-routing.module';

import { BuscaIdPage } from './busca-id.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    BuscaIdPageRoutingModule
  ],
  declarations: [BuscaIdPage]
})
export class BuscaIdPageModule {}
