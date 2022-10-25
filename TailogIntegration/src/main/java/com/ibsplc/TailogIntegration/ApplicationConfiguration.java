package com.ibsplc.TailogIntegration;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

import javax.sql.DataSource;
import org.quartz.SimpleTrigger;
import org.quartz.Trigger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.scheduling.quartz.SimpleTriggerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.ibsplc.TailogIntegration.util.log.Log4j2Logger;
import com.ibsplc.TailogIntegration.util.log.Logger;
import com.zaxxer.hikari.HikariDataSource;

import net.javacrumbs.shedlock.core.LockProvider;
import net.javacrumbs.shedlock.provider.jdbctemplate.JdbcTemplateLockProvider;
import net.javacrumbs.shedlock.spring.ScheduledLockConfiguration;
import net.javacrumbs.shedlock.spring.ScheduledLockConfigurationBuilder;



/**
 * Author - A-8986
 * Created on 26-Sep-2019
 */

@Configuration
@ComponentScan(basePackages = "com.ibsplc")
@EnableWebMvc
@EnableScheduling
@EnableTransactionManagement
@PropertySources({
	@PropertySource(value = "classpath:configuration.properties" , ignoreResourceNotFound=true)
})

public class ApplicationConfiguration extends WebMvcConfigurerAdapter {
	
	@Autowired
    private Environment env;
	
	
	 @Autowired
	 private ApplicationContext applicationContext;
	 
	 
	 //private static final String scheduler_name="spring-tailog-quartz-scheduler";
	    
	    
	 private static final Logger log = Log4j2Logger.create(ApplicationConfiguration.class);
		
	 private static final String CONFIGURATION_PROPERTIES = "/configuration.properties";
		
		
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	//Shedlock configuration
	
	 @Bean
	    public ScheduledLockConfiguration taskScheduler(LockProvider lockProvider) {
		 log.info("Inside ScheduledLockConfiguration method");
		 
	       // return ScheduledLockConfigurationBuilder
	              //  .withLockProvider(lockProvider)
	              //  .withPoolSize(5)
	               // .withDefaultLockAtMostFor(Duration.ofMinutes(1))
	               // .build();
	                
		 DataSource dataSource=dataSource();
		 
		 LockProvider lock=lockProvider(dataSource);
		 
		 
		 ScheduledLockConfiguration shedLockConf= ScheduledLockConfigurationBuilder
	                .withLockProvider(lock)
	                .withPoolSize(5)
	                .withDefaultLockAtMostFor(Duration.ofMinutes(1))
	                .build();
		 
		 if(shedLockConf!=null)
		 log.info("ScheduledLockConfiguration is not null");
		 
		 return shedLockConf;
		
	    }
	 
	 @Bean
	    public LockProvider lockProvider(DataSource dataSource) {
		 log.info("Inside LockProvider method");
	       // return new JdbcTemplateLockProvider(dataSource, "airlinkdatabase.shedlock_dcs_prod");
		 LockProvider lockProvider=new JdbcTemplateLockProvider(dataSource, "airlinkdatabase.shedlock_dcs_prod");
		 return lockProvider;
	    }
	 
	 @Bean
	    public DataSource dataSource() {
		 
		 Properties prop = new Properties();
			InputStream inputStream;
			try {
			inputStream = getClass().getClassLoader().getResourceAsStream(CONFIGURATION_PROPERTIES);

			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("property file " + CONFIGURATION_PROPERTIES + " not found in the classpath");
			}

			}catch(Exception e) {
				log.info("Exception occured while reading config.properties"+e);
			}
		 
	    	HikariDataSource datasource = new HikariDataSource();
	    	
	    	log.info("jdbc.driverClassName:"+prop.getProperty("jdbc.driverClassName"));
	    	
	    datasource.setDriverClassName(prop.getProperty("jdbc.driverClassName"));
	    	datasource.setJdbcUrl(prop.getProperty("jdbc.url"));
	    	datasource.setUsername(prop.getProperty("jdbc.username"));
	    	datasource.setPassword(prop.getProperty("jdbc.password"));
	      log.info("JDBC Properties:URL:"+datasource.getJdbcUrl()+
	  			",username:"+datasource.getUsername()+",password:"+datasource.getPassword());
	      return datasource;
	    }
	 
	 

}

