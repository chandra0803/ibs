package com.ibsplc.TailogIntegration;

import java.time.LocalDateTime;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.PersistJobDataAfterExecution;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.scheduling.quartz.SimpleTriggerFactoryBean;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.ibsplc.TailogIntegration.service.TailogService;
import com.ibsplc.TailogIntegration.service.impl.TailogServiceImpl;
import com.ibsplc.TailogIntegration.util.log.Log4j2Logger;
import com.ibsplc.TailogIntegration.util.log.Logger;

@Component
@PersistJobDataAfterExecution
@DisallowConcurrentExecution
public class QuartzJob extends QuartzJobBean {

	/*
	@Autowired
	TailogService tailogService;
	*/
	
	private static final Logger log = Log4j2Logger.create(QuartzJob.class);
	/*
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		//SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
		// TODO Auto-generated method stub
		log.info("Inside quartz job...");
		log.info("Calling Tailog service at "+LocalDateTime.now());
		//TailogService tailogService=new TailogServiceImpl();
		//TailogService tailogService=(TailogService) context.getJobDetail().getJobDataMap().get("tailogService");
		//if(tailogService!=null)
		//TailogService tailogService=new TailogServiceImpl();
		tailogService.retrieveTailogFlightObject();
		
	}*/
	

	@Override
	public void executeInternal(JobExecutionContext context) throws JobExecutionException {
		// TODO Auto-generated method stub
		log.debug("Inside quartz job...");
		log.debug("Calling Tailog service at "+LocalDateTime.now());
		TailogService tailogService=new TailogServiceImpl();
		tailogService.retrieveTailogFlightObject();
	}



	public QuartzJob() {
		super();
		// TODO Auto-generated constructor stub
	}

}
