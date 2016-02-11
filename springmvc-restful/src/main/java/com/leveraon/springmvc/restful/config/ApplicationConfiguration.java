package com.leveraon.springmvc.restful.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.leveraon.springmvc.restful.config.interceptor.LoggingInterceptor;
import com.leveraon.springmvc.restful.config.interceptor.TransactionInterceptor;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.leveraon.springmvc.restful")
public class ApplicationConfiguration extends WebMvcConfigurerAdapter {
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
//		registry.addResourceHandler("/html/**").addResourceLocations("/html/");
//		registry.addResourceHandler("/css/**").addResourceLocations("/css/");
//		registry.addResourceHandler("/img/**").addResourceLocations("/img/");
//		registry.addResourceHandler("/js/**").addResourceLocations("/js/");
//		registry.addResourceHandler("/lib/**").addResourceLocations("/lib/");
	}
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
	    registry.addInterceptor(new LoggingInterceptor());
	    registry.addInterceptor(new TransactionInterceptor()).addPathPatterns("/user/*");
	}
	
}
