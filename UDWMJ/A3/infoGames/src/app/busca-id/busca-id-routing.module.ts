import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { BuscaIdPage } from './busca-id.page';

const routes: Routes = [
  {
    path: '',
    component: BuscaIdPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class BuscaIdPageRoutingModule {}
