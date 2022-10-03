import { Component, OnInit } from '@angular/core';

import { DadosService } from '../dados.service';

@Component({
  selector: 'app-formulario',
  templateUrl: './formulario.component.html',
  styleUrls: ['./formulario.component.scss'],
})
export class FormularioComponent implements OnInit {
  public nome: string;
  public telefone: string;
  public detalhes: string;
  public servico: DadosService;

  constructor(servico: DadosService){
    this.servico = servico
  }

  ngOnInit(): void{

  }

  voltar(): void {
    window.history.back()
  }

  inserir(): void{
    this.servico.salvar({
      nome: this.nome,
      telefone: this.telefone,
      detalhes: this.detalhes
    })

    this.voltar()

    console.log(this.servico.pessoas)
  }
}
