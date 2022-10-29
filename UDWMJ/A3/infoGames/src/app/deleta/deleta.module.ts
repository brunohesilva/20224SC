import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { DeletaPageRoutingModule } from './deleta-routing.module';

import { DeletaPage } from './deleta.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    DeletaPageRoutingModule
  ],
  declarations: [DeletaPage]
})
export class DeletaPageModule {}
