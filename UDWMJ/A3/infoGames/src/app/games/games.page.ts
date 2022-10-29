import { Component, OnInit } from '@angular/core';

interface IGames {
  id?: number;
  name: string;
  rating: number;
}

@Component({
  selector: 'app-games',
  templateUrl: './games.page.html',
  styleUrls: ['./games.page.scss'],
})
export class GamesPage implements OnInit {
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

  ngOnInit() {
  }

  voltar(): void {
    window.history.back()
  }
  
  async salvar(): Promise<void> {
    const novo = {
      name: this.name,
      rating: this.rating
    };

    console.log(Object.keys(novo));

    const body = Object.keys(novo)
      .map(k => `${encodeURIComponent(k)}=${encodeURIComponent(novo[k])}`)
      .join('&');

    await fetch(this.url, { method: 'POST', body: new URLSearchParams(body) });
    this.buscar();

    this.voltar()

  }

}
