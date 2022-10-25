package com.ibsplc.flightsearch.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.resource.GzipResourceResolver;
import org.springframework.web.servlet.resource.PathResourceResolver;

@Configuration @EnableWebMvc
public class SpringBootWelcomePageConfiguration extends WebMvcConfigurerAdapter implements WebMvcConfigurer {
	
    /**
     * redirect a user to the welcome page when he visits tha app without a
     * destination url.
     */ 
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
         
     /*   registry
            //.addResourceHandler("/**")  
           .addResourceHandler("/darksite/**")  
            .addResourceLocations("classpath:/public/homepage/")  
            .setCachePeriod( 3600 )
            .resourceChain(true)  
            .addResolver(new GzipResourceResolver())  
            .addResolver(new PathResourceResolver()); */      
        registry
            .addResourceHandler("/templates/**")  
            .addResourceLocations("classpath:/templates/homepage/"); 
        registry
            .addResourceHandler("/homepage/**")  
            .addResourceLocations("classpath:/static/homepage/")
            .setCachePeriod( 3600 )
            .resourceChain(true)  
            .addResolver(new GzipResourceResolver())  
            .addResolver(new PathResourceResolver());    
    }
}
 
