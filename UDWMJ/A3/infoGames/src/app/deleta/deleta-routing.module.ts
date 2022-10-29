import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { DeletaPage } from './deleta.page';

const routes: Routes = [
  {
    path: '',
    component: DeletaPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class DeletaPageRoutingModule {}
