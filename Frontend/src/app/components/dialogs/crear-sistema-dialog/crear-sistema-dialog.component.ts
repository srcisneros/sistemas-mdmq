import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
//import {Component, Inject} from '@angular/core';
import {MatDialog, MAT_DIALOG_DATA, MatDialogRef} from '@angular/material/dialog';

@Component({
  selector: 'app-crear-sistema-dialog',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './crear-sistema-dialog.component.html',
  styleUrls: ['./crear-sistema-dialog.component.scss']
})
export class CrearSistemaDialogComponent {

}
