/**
 * Created by Junaid on 2/6/2025
 */
package com.mjk.spring6resttemplate.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.web.client.RestTemplateBuilderConfigurer;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.client.AuthorizedClientServiceOAuth2AuthorizedClientManager;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientManager;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientProviderBuilder;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.web.util.DefaultUriBuilderFactory;

@Configuration
public class RestTemplateBuilderConfig {

    @Value("${rest.template.rootUrl}")
    String rootUrl;
    //private final ClientRegistrationRepository clientRegistrationRepository;
    //private final OAuth2AuthorizedClientService oAuth2AuthorizedClientService;


   /* @Value("${rest.template.username}")
    String username;

    @Value("${rest.template.password}")
    String password;*/

    /*@Bean
    RestTemplateBuilder restTemplateBuilder(RestTemplateBuilderConfigurer configurer){

        assert rootUrl != null;

        RestTemplateBuilder builder = configurer.configure(new RestTemplateBuilder());
        DefaultUriBuilderFactory uriBuilderFactory = new
                DefaultUriBuilderFactory(rootUrl);

        RestTemplateBuilder builderWithAuth = builder.basicAuthentication(username,password);

        return builderWithAuth.uriTemplateHandler(uriBuilderFactory);
    }*/


    /*public RestTemplateBuilderConfig(ClientRegistrationRepository clientRegistrationRepository, OAuth2AuthorizedClientService oAuth2AuthorizedClientService) {
        this.clientRegistrationRepository = clientRegistrationRepository;
        this.oAuth2AuthorizedClientService = oAuth2AuthorizedClientService;
    }*/

    @Bean
    OAuth2AuthorizedClientManager auth2AuthorizedClientManager(ClientRegistrationRepository clientRegistrationRepository,
                                                               OAuth2AuthorizedClientService oAuth2AuthorizedClientService ){
        var authorizedClientProvider = OAuth2AuthorizedClientProviderBuilder.builder()
                .clientCredentials()
                .build();

        var authorizedClientManager = new AuthorizedClientServiceOAuth2AuthorizedClientManager
                (clientRegistrationRepository, oAuth2AuthorizedClientService);
        authorizedClientManager.setAuthorizedClientProvider(authorizedClientProvider);
        return authorizedClientManager;
    }

    @Bean
    RestTemplateBuilder restTemplateBuilder(RestTemplateBuilderConfigurer configurer,
                                            OAuthClientInterceptor interceptor){

        assert rootUrl != null;

        return configurer.configure(new RestTemplateBuilder())
                .additionalInterceptors(interceptor)
                .uriTemplateHandler(new DefaultUriBuilderFactory(rootUrl));
    }
}