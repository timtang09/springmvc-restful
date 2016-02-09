package com.leveraon.springmvc.restful.config.security;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.leveraon.springmvc.restful.config.RESTServiceConfiguration;

@Configuration
@ComponentScan
@Import({ SecurityConfiguration.class, RESTServiceConfiguration.class })
public class RootConfiguration {

}
