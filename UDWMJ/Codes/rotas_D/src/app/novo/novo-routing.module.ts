import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { NovoPage } from './novo.page';

const routes: Routes = [
  {
    path: '',
    component: NovoPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class NovoPageRoutingModule {}
