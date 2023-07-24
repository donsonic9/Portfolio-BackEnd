package com.portfolioYoProgramoAR.BackEndDS9;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BackEndDs9Application {

	public static void main(String[] args) {
		SpringApplication.run(BackEndDs9Application.class, args);
	}
        
        //Creamos este Bean para ponerle titlo y descripcion a la documentacion con Swagger
        @Bean
        public OpenAPI CustomOpenAPI() {
            return new OpenAPI()
                    .info(new Info()
                            .title("#ArgentinaPrograma API BackEnd DS9")
                            .version("0.11")
                            .description("Esta API fue la primer API realizada por mi (Alexander Repollo) "
                                    + "en el marco de las exigencias del programa #ArgentinaPrograma para"
                                    + " desarrolladores Full Stack. Esta API esta hecha con Java, JPA, "
                                    + "Hibernate, y Spring Boot. El método utilizado para "
                                    + "documentarla es la implementación de la dependencia SpringDoc, con el modelo"
                                    + "OpenAPI. "
                                    + "Esta API consta de 11 endpoints y cada uno es capaz de realizar CRUD")
                            
                    );
        }

}
