package com.ibsplc.framework.configuration;



import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import com.ibsplc.common.service.CommonService;
import com.ibsplc.corporate.service.PayLaterQueService;
import com.ibsplc.framework.util.log.Log4j2Logger;
import com.ibsplc.framework.util.log.Logger;

/**
 * @author a-5316
 *
 */
@Configuration
//@EnableScheduling
public class JobConfiguration {
	
	@Autowired
	private CommonService commonService;
	
//	@Autowired
	//private TaxInvoiceService taxInvoiceService;
	
	@Autowired
	private PayLaterQueService payLaterQueService;
	
	@Value("${tax.invoice.job.toggle}")
	private String taxInvoiceScheduleJobToggle;
	
	private static final Logger LOGGER = Log4j2Logger.create(JobConfiguration.class);
	
/*	@Scheduled(fixedDelayString = "${sessionDeleteDelay.in.milliseconds}")
	public void deleteSessionIdJob() {
		LOGGER.info("deleteSessionIdJob ::");
		commonService.deleteSessionDtl();
	}
	
	@Scheduled(fixedDelayString = "${taxInvoiceJobDelay.in.milliseconds}")
	public void updateOfficeIdList() {
		LOGGER.info("Updating Office ID List ::");
		commonService.updateOfficeIDList();
	}
	*/
	/*@Scheduled(fixedDelayString = "${taxInvoiceJobDelay.in.milliseconds}")
	public void executeTaxInvoiceJob() {
		LOGGER.info("executeTaxInvoiceJob ::");
		if(taxInvoiceScheduleJobToggle.equalsIgnoreCase("ON")) {
			taxInvoiceService.executeTaxInvoiceJob();
		} else {
			LOGGER.info("Tax Invoice Schedule Job - "+taxInvoiceScheduleJobToggle);
		}
		
	}*/
	
	//@Scheduled(fixedDelayString = "1800000")
	//@SchedulerLock(name = "foaScheduler",  lockAtLeastForString = "PT1439M", lockAtMostForString = "PT1440M")
	/*public void listFlightsJob() {
		LOGGER.info("Inside FOA PayLater processing scheduler");
		LOGGER.info("Calling FOA PayLater processing scheduler service at "+LocalDateTime.now());
		payLaterQueService.callListOfPNR();
	}*/
	
	/*
	 * Added on 12 June 2020 by A-8986 to automatically call flight search method
	 * should be used in test environment only
	 *//*
	@Scheduled(fixedDelayString = "3600000")
	public void automatedFlightSearchCall() {
		LOGGER.info("Calling flight search method ::");
		new AutomatedFlightSearchServiceImpl().callFlightSearch();
	}*/

}
