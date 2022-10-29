import { Component, OnInit } from '@angular/core';

interface IGames {
  id?: number;
  name: string;
  rating: number;
}


@Component({
  selector: 'app-deleta',
  templateUrl: './deleta.page.html',
  styleUrls: ['./deleta.page.scss'],
})
export class DeletaPage implements OnInit {
  public url = 'http://localhost:3333/games';
  public games: IGames[] = [];
  public id: number;
  public name: string
  public rating: number;

  constructor() { }

  ngOnInit() {
    this.buscar();

  }
  
  async buscar(): Promise<void> {
    const resposta = await fetch(this.url);
    this.games = await resposta.json();
  }

  async remover(id: number): Promise<void> {
    await fetch(`${this.url}/${id}`, { method: 'DELETE' });
    this.buscar();
  }
}
