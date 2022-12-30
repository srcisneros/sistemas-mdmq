import { Component } from '@angular/core';
import { KeycloakAuthService } from 'src/app/shared/keycloak-auth.service';
import { MatButtonModule } from '@angular/material/button';
import { MatTableModule } from '@angular/material/table';
import {MatDialog} from '@angular/material/dialog';
import { CrearSistemaDialogComponent } from '../../dialogs/crear-sistema-dialog/crear-sistema-dialog.component';
import { CommonModule } from '@angular/common';
import {MatDialogModule} from '@angular/material/dialog';
import {MatToolbarModule} from '@angular/material/toolbar';
import { MatIconModule } from '@angular/material/icon';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatSelectModule} from '@angular/material/select';
import {MatInputModule} from '@angular/material/input';

@Component({
  standalone: true,
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss'],
  imports: [
    CommonModule,
    MatButtonModule,
    MatTableModule,
    MatDialogModule,
    MatToolbarModule,
    MatIconModule,
    FormsModule,
    ReactiveFormsModule,
    MatFormFieldModule,
    MatSelectModule,
    MatInputModule
  ]
})


export class HomeComponent {

  constructor(
    private keycloakAuthService: KeycloakAuthService,
    public dialog: MatDialog) {

  }

  crearSistema(){
    this.dialog.open(CrearSistemaDialogComponent)
  }

  logout(){
    this.keycloakAuthService.logout();
  }
}
