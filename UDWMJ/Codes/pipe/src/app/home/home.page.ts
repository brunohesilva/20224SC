import { Component } from '@angular/core';

interface IProduto {
  nome: string;
  preco: number;
}

interface IEntrega {
  status: Status;
}

interface ITarefa {
  nome: string;
  concluido: boolean;
}


type Status = "preparando" | "em rota" | "finalizado";

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {

  public nota = 5

  public produtos: IProduto[] = [
    { nome: 'Playstation 4', preco: 2000 },
    { nome: 'Xbox One', preco: 1800 },
    { nome: 'Nintendo Switch', preco: 2400 },
    { nome: 'Nintendo Switch oled', preco: 3000 }
  ];

  public entrega: IEntrega = {
    status: "preparando"
  };

  public isBlue = false;

  public isRed = true;

  public lista: ITarefa[] = []

  public input = '';

  public tarefasConcluidas = 0;

  public tarefasTotais = 0;

  inserir(tarefa: string): void {
    if (tarefa === '') {
      return;
    }

    const novaTarefa: ITarefa = {
      nome: tarefa,
      concluido: false
    };

    this.lista.push(novaTarefa)

    this.input = '';

    this.tarefasTotais = this.lista.length;
  }

  concluir(): void {

    const concluidas = this.lista.filter(t => t.concluido === true);
    this.tarefasConcluidas = concluidas.length;
  }

  limpar_tarfas() : void {
    this.lista = []
  }

  public meuTexto = 'texto para texto'

  public dinheiro = 5000

}
