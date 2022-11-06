import { Component } from '@angular/core';
import { DomSanitizer, SafeResourceUrl } from '@angular/platform-browser';

import { Sanitizer } from '@angular/core';
import { Camera, CameraResultType, CameraSource } from '@capacitor/camera';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {

  public sanitazer: DomSanitizer;
  public foto: SafeResourceUrl;

  constructor(sanit: DomSanitizer) {
    this.sanitazer = sanit;
  }

  async fotografar(): Promise<void> {
    const imagem = await Camera.getPhoto({
      quality: 90,
      resultType: CameraResultType.Uri,
      source: CameraSource.Camera,
      allowEditing: false,
    });
    const imagemUrl = imagem.webPath;
    this.foto = this.sanitazer.bypassSecurityTrustResourceUrl(imagemUrl);
  }
}
