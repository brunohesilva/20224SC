import { Injectable } from '@angular/core';

import IPessoa from './interfaces/ipessoa';

import { Storage } from '@ionic/storage-angular'

@Injectable({
  providedIn: 'root'
})
export class DadosService {

  public pessoas: IPessoa[] = [

    { id: 1, nome: 'Bruno Henrique', telefone: '(11) 96415-6503', detalhes: 'celular' },
    { id: 2, nome: 'José Netto', telefone: '(11) 11111-1111', detalhes: 'telefone' },
    { id: 3, nome: 'Yuri', telefone: '(11) 33333-3333', detalhes: 'escola' },

  ];

  private storage: Storage

  constructor(storage: Storage) {
    this.storage = storage
    this.storage.create().then(() => console.log('Armazenamento Criado'))
    this.storage.get('contatos')
      .then(contatos => this.pessoas.push(...contatos))
      .catch(() => this.storage.set('contatos', this.pessoas));
  }

  buscarDados(): IPessoa[] {
    return this.pessoas;
  }

  salvar(pessoa: IPessoa): void {
    pessoa.id = this.pessoas.length + 1;
    this.pessoas.push(pessoa)
    this.storage.set('contatos', this.pessoas)
  }
  
  deletar(indice: number): void {
    this.pessoas.splice(indice - 1, 1)
    this.atualizarId()
    this.storage.set('contatos', this.pessoas)
  }
  atualizarId(): void {
    this.pessoas.forEach(pessoa => pessoa.id = this.pessoas.indexOf(pessoa) + 1);
  }
}
