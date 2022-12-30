import { KeycloakService } from 'keycloak-angular';
import { environment } from 'src/environments/environment';

export function initializeKeycloak(keycloak: KeycloakService): () => Promise<any> {
    return (): Promise<any> => {
        return new Promise(async (res,rej) => {
            try {
                await keycloak.init({
                    config: environment.keycloakConfig,
                    initOptions: {
                        onLoad: 'check-sso',
                        redirectUri: environment.page
                        //silentCheckSsoRedirectUri: window.location.origin + 'assets/static/silent-check-sso.html',
                    },
                    bearerExcludedUrls:['https://api.ipify.org/','/assets'],
                    loadUserProfileAtStartUp: true
                 }).catch(err=>{
                    res(err)
                 })
              res('')
            }
            catch (error) {
            }
        });
    };
}