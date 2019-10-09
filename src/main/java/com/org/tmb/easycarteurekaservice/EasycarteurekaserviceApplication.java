package com.org.tmb.easycarteurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Junaid Atta 08/October/2019
 */

@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
public class EasycarteurekaserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasycarteurekaserviceApplication.class, args);
    }

}
