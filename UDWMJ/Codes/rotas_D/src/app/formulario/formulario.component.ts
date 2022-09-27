import { Component, OnInit } from '@angular/core';

import { ModalController } from '@ionic/angular';

@Component({
  selector: 'app-formulario',
  templateUrl: './formulario.component.html',
  styleUrls: ['./formulario.component.scss'],
})
export class FormularioComponent implements OnInit {

  public modalController: ModalController;

  constructor(controller: ModalController) { 
    this.modalController = controller;
  }

  async fecharModal(): Promise<void>{
    this.modalController.dismiss();
  }

  ngOnInit() {}

}
