package com.leveraon.springmvc.restful.config.security;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.leveraon.springmvc.restful.config.ApplicationConfiguration;

@Configuration
@ComponentScan
@Import({ SecurityConfiguration.class, ApplicationConfiguration.class })
public class RootConfiguration {

}
