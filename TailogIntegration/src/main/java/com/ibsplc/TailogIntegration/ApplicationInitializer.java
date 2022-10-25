package com.ibsplc.TailogIntegration;

import java.io.IOException;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.sql.DataSource;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.SimpleTrigger;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.scheduling.quartz.SimpleTriggerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.ibsplc.TailogIntegration.util.log.Log4j2Logger;
import com.ibsplc.TailogIntegration.util.log.Logger;


/**
 * Author - A-8986
 * Created on 26-Sep-2019
 */


public class ApplicationInitializer implements WebApplicationInitializer {

	private static final Logger log = Log4j2Logger.create(ApplicationInitializer.class);
	public void onStartup(ServletContext container) throws ServletException {
		
		 AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
	     ctx.register(ApplicationConfiguration.class);
	     ctx.setServletContext(container);
	 
	     ServletRegistration.Dynamic servlet = container.addServlet("dispatcher", new DispatcherServlet(ctx));
	         
	     servlet.setLoadOnStartup(1);
	     servlet.addMapping("/");        
	     container.addListener(new ContextLoaderListener(ctx));
	     log.debug("Tailog Application started...");
	     ctx.registerShutdownHook();
	     //ctx.close();
		
	}
	
	
	
}

