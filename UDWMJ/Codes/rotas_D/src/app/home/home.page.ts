import { Component } from '@angular/core';
import IPessoa from '../interfaces/ipessoa';
import { DadosService } from '../dados.service';
import { FormularioComponent } from '../formulario/formulario.component';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {

  public dados: IPessoa[];
  private servico: DadosService;


  constructor(dadosServico: DadosService) {
    this.servico = dadosServico;
    this.dados = this.servico.buscarDados();
  }

  remover(indice: number): void{
    this.servico.deletar(indice)
    console.log(this.servico.pessoas)
  }
}
