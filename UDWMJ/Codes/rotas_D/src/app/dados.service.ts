import { Injectable } from '@angular/core';

import IPessoa from './interfaces/ipessoa';

@Injectable({
  providedIn: 'root'
})
export class DadosService {

  public pessoas: IPessoa[] = [

    { id: 1, nome: 'Bruno Henrique', telefone: '(11) 96415-6503', detalhes: 'celular' },
    { id: 2, nome: 'José Netto', telefone: '(11) 11111-1111', detalhes: 'telefone' },
    { id: 3, nome: 'Yuri', telefone: '(11) 33333-3333', detalhes: 'escola' },

  ]

  constructor() { }

  buscarDados(): IPessoa[] {
    return this.pessoas;
  }
}
