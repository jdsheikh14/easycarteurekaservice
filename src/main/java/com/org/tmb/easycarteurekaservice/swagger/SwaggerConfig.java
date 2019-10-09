package com.org.tmb.easycarteurekaservice.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;
import static com.google.common.base.Predicates.or;

/**
 * @author Junaid Atta 08/October/2019
 * @version 1.0 SwaggerConfig holds the configuration to be used
 * for products documentation created by swagger.
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket postsApi() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("public-api")
                .apiInfo(apiInfo()).select().paths(postPaths()).build();
    }

    private Predicate<String> postPaths() {
        return or(regex("/easycart.*"), regex("/easycart.*"));
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("EasyCart Products API")
                .description("EasyCart Products API for developers")
                .termsOfServiceUrl("http://localhost:8761/")
                .contact("junaid.atta@telenorbank.pk").license("EasyCart License")
                .licenseUrl("easycart@telenorbank.pk").version("1.0").build();
    }

}