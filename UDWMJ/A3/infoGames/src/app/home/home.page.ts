import { Component } from '@angular/core';

interface IGames {
  id?: number;
  name: string;
  rating: number;
}

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {
  public url = 'http://localhost:3333/games';
  public games: IGames[] = [];
  public id: number;
  public name: string
  public rating: number;

  constructor() {
    this.buscar();
  }

  async buscar(): Promise<void> {
    const resposta = await fetch(this.url);
    this.games = await resposta.json();
  }
}
