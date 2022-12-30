import { Route } from "@angular/router";
import { HomeComponent } from "../components/pages/home/home.component";
import { LoginComponent } from "../components/pages/login/login.component";
import { KeycloakGuard } from "../core/guards/keycloak-auth.guard";

export const ROUTES_SIS: Route[] = [
    {
        path: '',
        component: HomeComponent,
        canActivate: [KeycloakGuard]
    },
    {
        path: 'auth',
        component: LoginComponent
    }
];