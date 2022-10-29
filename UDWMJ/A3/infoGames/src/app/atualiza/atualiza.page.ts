import { Component, OnInit } from '@angular/core';

interface IGames {
  id?: number;
  name: string;
  rating: number;
}

@Component({
  selector: 'app-atualiza',
  templateUrl: './atualiza.page.html',
  styleUrls: ['./atualiza.page.scss'],
})
export class AtualizaPage implements OnInit {
  public url = 'http://localhost:3333/games';
  public games: IGames[] = [];
  public id: number;
  public name: string
  public rating: number;

  constructor() { 
    this.buscar();
  }

  ngOnInit() {
  }

  async buscar(): Promise<void> {
    const resposta = await fetch(this.url);
    this.games = await resposta.json();
  }

  voltar(): void {
    window.history.back()
  }

  async buscarPorId(id: number): Promise<void> {
    const resposta = await fetch(`${this.url}/${id}`);
    const game: IGames = await resposta.json();

    this.name = game.name;
    this.rating = game.rating;
  }

  async atualizar(id: number): Promise<void> {
    const produtoAtualizado = {
      name: this.name,
      rating: this.rating
    };

    const body = Object.keys(produtoAtualizado)
      .map(k => `${encodeURIComponent(k)}=${encodeURIComponent(produtoAtualizado[k])}`)
      .join('&');

    await fetch(`${this.url}/${id}`, { method: 'PUT', body: new URLSearchParams(body) });
    this.buscar();
    this.voltar()
  }

}
