import { CommonModule } from '@angular/common';
import {  Component } from '@angular/core';
import { RouterModule } from '@angular/router';
import { KeycloakAngularModule } from 'keycloak-angular';


@Component({
  standalone: true,
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss'],

  imports: [
    CommonModule,
    RouterModule,
    KeycloakAngularModule,
  
  ]
})
export class AppComponent {
  title = 'sistemas-mdmq';
}
