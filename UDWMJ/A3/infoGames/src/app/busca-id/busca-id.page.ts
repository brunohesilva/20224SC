import { Component, OnInit } from '@angular/core';

interface IGames {
  id?: number;
  name: string;
  rating: number;
}

@Component({
  selector: 'app-busca-id',
  templateUrl: './busca-id.page.html',
  styleUrls: ['./busca-id.page.scss'],
})
export class BuscaIdPage implements OnInit {
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
}
