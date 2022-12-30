import { KeycloakConfig } from "keycloak-js";

const keycloakConfig: KeycloakConfig = {
  url: 'https://sso-poc.quito.gob.ec:8443/auth/',
  realm: 'Municipales',
  clientId: 'remetfu-angular',
};

export const environment = {
  production: false,
  page: 'http://localhost:4200/',
  url_api: 'http://localhost:8282/api',
  url_pam: 'http://d-srv11web51/PAM/Inicio.aspx',
  keycloakConfig
};

