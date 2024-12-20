package com.ibsplc.TailogIntegration;

import org.quartz.spi.TriggerFiredBundle;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.scheduling.quartz.SpringBeanJobFactory;

public final class AutowiringSpringBeanJobFactory extends SpringBeanJobFactory 
implements ApplicationContextAware {

private AutowireCapableBeanFactory beanFactory;

@Override
public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
	// TODO Auto-generated method stub
	 beanFactory = applicationContext.getAutowireCapableBeanFactory();
}


@Override
protected Object createJobInstance(final TriggerFiredBundle bundle) 
    throws Exception {
    final Object job = super.createJobInstance(bundle);
    beanFactory.autowireBean(job);
    return job;
}


}
