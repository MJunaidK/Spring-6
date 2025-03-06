package org.openapitools.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
public class SpringDocConfiguration {

    @Bean(name = "org.openapitools.configuration.SpringDocConfiguration.apiInfo")
    OpenAPI apiInfo() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Products API")
                                .description("This a sample specification part of a YT tutorial showcasing how to design a RESTful API contract using OpenAPI.  We are going to create an API to manage products with the the following operations: * List all Products * Create a Product * Get Product details * Update Product * Delete Product  We will cover also the following topics: * Result pagination * Security (Auth'n / Auth'z)  We will use a simple **Product** resource representation with the following properties: * ID * Name * Price * Description (optional) * Last updated date-time ")
                                .version("v1")
                )
                .components(
                        new Components()
                                .addSecuritySchemes("OAuthClientCredentials", new SecurityScheme()
                                        .type(SecurityScheme.Type.OAUTH2)
                                )
                )
        ;
    }
}