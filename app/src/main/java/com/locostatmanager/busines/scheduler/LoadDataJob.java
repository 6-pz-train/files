package com.locostatmanager.busines.scheduler;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 *
 * @author dmitry
 */
public class LoadDataJob extends QuartzJobBean {
    
    @Override
    protected void executeInternal(JobExecutionContext jec) throws JobExecutionException {
        System.out.println("LA-LA-LA");
    }
    
}
