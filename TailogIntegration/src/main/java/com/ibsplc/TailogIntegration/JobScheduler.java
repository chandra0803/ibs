package com.ibsplc.TailogIntegration;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Properties;
import java.util.UUID;

import javax.annotation.PreDestroy;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.JobKey;
import org.quartz.ScheduleBuilder;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.ClassPathResource;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.stereotype.Component;

import com.ibsplc.TailogIntegration.service.FRMSService;
import com.ibsplc.TailogIntegration.service.SageProxyService;
import com.ibsplc.TailogIntegration.service.SageSARProxyService;
import com.ibsplc.TailogIntegration.service.TailogIflightService;
import com.ibsplc.TailogIntegration.service.TailogService;
import com.ibsplc.TailogIntegration.util.log.Log4j2Logger;
import com.ibsplc.TailogIntegration.util.log.Logger;

import net.javacrumbs.shedlock.core.SchedulerLock;




@Component
public class JobScheduler {

	private static final Logger log = Log4j2Logger.create(JobScheduler.class);
	
	@Autowired
    private ApplicationConfiguration config;
	
	@Autowired
	TailogService tailogService;
	
	@Autowired
	TailogIflightService tailogIflightService;
	
	@Autowired
	SageProxyService sageProxyService;
	
	@Autowired
	SageSARProxyService sageSARProxyService;
	
	@Autowired
	FRMSService frmsService;
	
	 // this data source points to the database that contains Quartz tables
	/*
    

   

    @Bean
    public JobDetail processMyJob() {
    	log.info("Inside processMyJob()");
    	return JobBuilder.newJob(QuartzJob.class)
                .withIdentity(UUID.randomUUID().toString(), "quartz-job-taillog")
                .withDescription("Retrieve taillog data")
                .storeDurably()
                .build();
    }
 */
    
  
  /*
  
	
	@Scheduled(fixedRate = 1800000, initialDelay = 60000)
	public void listFlightsJob() {
		log.info("Inside JobScheduler class for Tailog");
		log.info("Calling Tailog service at "+LocalDateTime.now());
		tailogService.retrieveTailogFlightObject();
	}
		
	
	  
	    public void createSchedule() throws SchedulerException
	    {
	    	Scheduler scheduler = null;
			try {
				scheduler = config.schedulerFactoryBean().getObject();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				log.info("IOException during scheduler instantiation");
				e.printStackTrace();
			}
	        log.info("Scheduling job and trigger");
	        scheduler.scheduleJob(processMyJob().getObject(), processMyJobTrigger().getObject());
	        //scheduler.start();
	    }
	    /*
	    @PreDestroy
	    public void preDestroy() throws SchedulerException
	    {
	    	log.info("Predestroying scheduler...");
	        scheduler.shutdown(true);
	    }
	    */
	
	/*
	@Scheduled(cron = "0 0 2 * * ?")
	@SchedulerLock(name = "taillogScheduler",  lockAtLeastForString = "PT119M", lockAtMostForString = "PT120M")
	public void listFlightsJob() {
		log.info("Inside JobScheduler class for Tailog");
		log.info("Calling Tailog service at "+LocalDateTime.now());
		tailogService.retrieveTailogFlightObject();
	}
	*/
	
	@Scheduled(cron = "0 0 6 * * ?")
	//@SchedulerLock(name = "taillogScheduler",  lockAtLeastForString = "PT1439M", lockAtMostForString = "PT1440M")
	public void listFlightsJob() {
		log.info("Inside JobScheduler class for Tailog");
		log.info("Calling Tailog service at "+LocalDateTime.now());
		tailogService.retrieveTailogFlightObject();
	}
	
	@Scheduled(fixedRate = 7200000, initialDelay = 60000)
	//@SchedulerLock(name = "taillogFlightScheduler",  lockAtLeastForString = "PT119M", lockAtMostForString = "PT120M")
	public void listFlightsJobForiFlight() {
		log.info("Inside JobScheduler class for iFlight Tailog");
		log.info("Calling Tailog service for iFlight at "+LocalDateTime.now());
		tailogIflightService.retrieveTailogIFlightObject();
	}
	
	@Scheduled(cron = "0 10 8 * * ?")
	//@Scheduled(fixedRate = 7200000, initialDelay = 60000)
	public void retrieveSageFileJob() {
		log.info("Inside JobScheduler class for Sage");
		log.info("Calling Sage service at "+LocalDateTime.now());
		sageProxyService.retrieveSageFile();
	}
	
	@Scheduled(cron = "0 10 8 * * ?")
	//@Scheduled(fixedRate = 7200000, initialDelay = 80000)
	public void retrieveSageSARFileJob() {
		log.info("Inside JobScheduler class for SageSAR");
		log.info("Calling SageSAR service at "+LocalDateTime.now());
		sageSARProxyService.retrieveSageSARFile();
	}
	
	@Scheduled(cron = "0 40 6 * * ?")
	//@Scheduled(fixedRate = 7200000, initialDelay = 80000)
	public void retrieveFRMSFileJob() {
		log.info("Inside JobScheduler class for FRMS");
		log.info("Calling FRMS service at "+LocalDateTime.now());
		frmsService.retrieveFRMSFile();
	}
	
	    
  
}
