import { APP_INITIALIZER, enableProdMode, importProvidersFrom } from '@angular/core';
import { bootstrapApplication } from '@angular/platform-browser';
import { AppComponent } from './app/app.component';
import { environment } from './environments/environment';
import { RouterModule } from '@angular/router';
import { ROUTES_SIS } from './app/routes/routes';
import { initializeKeycloak } from './app/core/keycloak/keycloak-init';
import { KeycloakService } from 'keycloak-angular';
import { KeycloakGuard } from './app/core/guards/keycloak-auth.guard';
import { KeycloakAuthService } from './app/shared/keycloak-auth.service';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

if (environment.production) {
  enableProdMode();
}

bootstrapApplication(AppComponent, {
    providers: [
      importProvidersFrom(RouterModule.forRoot(ROUTES_SIS), BrowserAnimationsModule),
      KeycloakService,
      {
        provide: APP_INITIALIZER,
        useFactory: initializeKeycloak,
        multi: true,
        deps: [KeycloakService]
      },
      KeycloakGuard,
      KeycloakAuthService,
    ]
  }).catch(err => console.error(err));