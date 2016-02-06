package com.leveraon.springmvc.restful.config.security;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.leveraon.springmvc.restful.config.HelloWorldConfiguration;

@Configuration
@ComponentScan
@Import({ SecurityConfiguration.class, HelloWorldConfiguration.class })
public class RootConfiguration {

}
