package com.lyt.quartz;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QuartzJob {
	private static Logger log = LoggerFactory.getLogger(QuartzJob.class);
	
	public void execute() {  
		Long times = System.currentTimeMillis();
		log.info("Quartz的任务调度----开始时间：" + new Date(times));
    } 
	
	
	
}
