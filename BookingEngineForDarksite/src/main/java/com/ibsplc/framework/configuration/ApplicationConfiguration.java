package com.ibsplc.framework.configuration;

import java.io.IOException;
import java.util.Properties;

import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.exception.VelocityException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.core.task.TaskExecutor;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.ui.velocity.VelocityEngineFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author a-5316
 *
 */
@SuppressWarnings("deprecation")
@Configuration
@EnableAsync
@ComponentScan(basePackages = "com.ibsplc")
@EnableWebMvc
@PropertySources({
	@PropertySource(value = "classpath:configuration.properties", ignoreResourceNotFound = true),
	@PropertySource(value = "classpath:message.properties" , ignoreResourceNotFound=true),
	@PropertySource(value = "classpath:mail.properties", ignoreResourceNotFound=true),
	@PropertySource(value = "classpath:masterdata.properties", ignoreResourceNotFound=true)
})
public class ApplicationConfiguration extends WebMvcConfigurerAdapter {
	
	@Autowired
	private Environment environment;
	
	@Bean
    public JavaMailSender mailSender() {
		final JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
		mailSender.setHost(environment.getRequiredProperty("booking.engine.mail.smtp.host"));
		mailSender.setPort(Integer.parseInt(environment.getRequiredProperty("booking.engine.mail.smtp.port")));
		mailSender.setUsername(environment.getRequiredProperty("booking.engine.mail.user"));
		mailSender.setPassword(environment.getRequiredProperty("booking.engine.mail.password"));
		
		return mailSender;
	}
	
	@Bean
    public TaskExecutor threadPoolTaskExecutor() {
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(4);
        executor.setMaxPoolSize(4);
        executor.setThreadNamePrefix("TaxInvoiceEmail");
        executor.initialize();
		
		return executor;
	}
	/*
     * Velocity configuration.
     */
    @Bean(name = "velocityEngine")
    public VelocityEngine getVelocityEngine() throws VelocityException, IOException {
    	VelocityEngineFactoryBean factory = new VelocityEngineFactoryBean();
        Properties props = new Properties();
        props.put("resource.loader", "class");
        props.put("class.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
 
        factory.setVelocityProperties(props);
        return factory.createVelocityEngine();
    }
}
