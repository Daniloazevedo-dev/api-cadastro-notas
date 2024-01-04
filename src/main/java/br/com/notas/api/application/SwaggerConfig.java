package br.com.notas.api.application;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfig {

    private static final Contact DEFAULT_CONTACT = new Contact()
            .name("Api Cadastro Notas")
            .url("https://github.com/Daniloazevedo-dev/api-cadastro-notas");

    @Bean
    public OpenAPI javaSpringwebfluxOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Cadastro")
                        .contact(DEFAULT_CONTACT)
                        .description("Cadastro de notas")
                        .version(getClass().getPackage().getImplementationVersion())
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")));

    }
}
