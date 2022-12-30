import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { KeycloakService } from 'keycloak-angular';
import { KeycloakLoginOptions } from 'keycloak-js';
import { environment } from 'src/environments/environment';
@Injectable({
  providedIn: 'root'
})
export class KeycloakAuthService {

  keycloakLoginOptions: KeycloakLoginOptions = {
    redirectUri: environment.page
  }
  constructor(
    private keycloakService: KeycloakService,
    private route: Router,
  ) { }

  getLoggedUser() {
    try {
      let userDetails = this.keycloakService.getKeycloakInstance().idTokenParsed;
      return userDetails;
    } catch (e) {
      return undefined
    }
  }
  logout() {
    this.keycloakService.logout();
  }
  login() {
    this.keycloakService.login(this.keycloakLoginOptions);
  }
  redirectToProfile() {
    this.keycloakService.getKeycloakInstance().accountManagement();
  }
  getRoles() {
    let roles = this.keycloakService.getKeycloakInstance().resourceAccess
    if (roles!['remetfu-angular']) {
      return roles!['remetfu-angular'].roles;
    }
    return []
  }

  redirectToMenu() {
    if (this.keycloakService.getKeycloakInstance().authenticated) {
      this.route.navigate(['']);
    }
  }
  public isLoggedIn(): Promise<boolean> {
    return this.keycloakService.isLoggedIn();
  }

  IsAuthenticated() {
    return this.keycloakService.getKeycloakInstance().authenticated;
  }

  getToken() {
    return this.keycloakService.getToken();
  }

  keycloakEvents() {
    return this.keycloakService.keycloakEvents$.asObservable();
  }

  actualizarToken(time: number) {
    return this.keycloakService.updateToken(time);
  }

  setSesionExpirada() {
    localStorage.setItem('session_expired', 'true');
  }
  getSesionExpirada() {
    let sesion: any = localStorage.getItem('session_expired');
    return JSON.parse(sesion);
  }

}