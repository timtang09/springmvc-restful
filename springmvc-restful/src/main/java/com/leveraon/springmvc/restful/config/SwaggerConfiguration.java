package com.leveraon.springmvc.restful.config;

import static com.google.common.base.Predicates.containsPattern;
import static com.google.common.base.Predicates.or;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.google.common.base.Predicate;
import com.google.common.base.Predicate;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@PropertySource("classpath:swagger.properties")
public class SwaggerConfiguration {
	@Bean
	public Docket document() {
		return new Docket(DocumentationType.SWAGGER_2).select().paths(paths()).build().apiInfo(apiInfo());
	}

	@SuppressWarnings("unchecked")
	private Predicate<String> paths() {
		return or(containsPattern("/user/*"));
	}

	private ApiInfo apiInfo() {
		ApiInfo apiInfo = new ApiInfo("Sample API", "", "terms of service", "", "", "", "");
		return apiInfo;
	}
}
