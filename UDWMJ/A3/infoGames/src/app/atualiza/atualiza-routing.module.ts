import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { AtualizaPage } from './atualiza.page';

const routes: Routes = [
  {
    path: '',
    component: AtualizaPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class AtualizaPageRoutingModule {}
