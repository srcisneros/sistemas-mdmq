import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { KeycloakAuthService } from 'src/app/shared/keycloak-auth.service';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent {
  constructor(private keycloakAuthService: KeycloakAuthService) {

  }
  login() {
    this.keycloakAuthService.login();
  }
}
