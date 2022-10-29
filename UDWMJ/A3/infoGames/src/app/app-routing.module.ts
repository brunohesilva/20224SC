import { NgModule } from '@angular/core';
import { PreloadAllModules, RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {
    path: 'home',
    loadChildren: () => import('./home/home.module').then( m => m.HomePageModule)
  },
  {
    path: '',
    redirectTo: 'home',
    pathMatch: 'full'
  },
  {
    path: 'busca-id',
    loadChildren: () => import('./busca-id/busca-id.module').then( m => m.BuscaIdPageModule)
  },
  {
    path: 'games',
    loadChildren: () => import('./games/games.module').then( m => m.GamesPageModule)
  },
  {
    path: 'atualiza',
    loadChildren: () => import('./atualiza/atualiza.module').then( m => m.AtualizaPageModule)
  },
  {
    path: 'deleta',
    loadChildren: () => import('./deleta/deleta.module').then( m => m.DeletaPageModule)
  },
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes, { preloadingStrategy: PreloadAllModules })
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
