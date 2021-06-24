package org.veiga.prototype.randomnamesbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class RandomNamesBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(RandomNamesBackendApplication.class, args);
	}

	@Bean
	public Docket api() {
		ApiInfo info = (new ApiInfoBuilder())
										.title("Random Names - Backend")
										.description("Backend project for Random Names")
										.version("0.1")
										.build();

		return new Docket(DocumentationType.SWAGGER_2)
			.apiInfo(info)
			.select()
			.apis(RequestHandlerSelectors.basePackage("org.veiga.prototype.randomnamesbackend.controller"))
			.build();
	}
}
