package com.wemallDubbo.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/***
 * 这个是干什么的不知道
 * @author Administrator
 *
 */
public class SpringTest {

	private static Logger log = LoggerFactory.getLogger(SpringTest.class);
	
	public static void main(String[] args) {
		 ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-common.xml");
		 ThreadPoolTaskExecutor poolTaskExecutor = (ThreadPoolTaskExecutor) ctx.getBean("taskExecutor");
		 Thread udpThread = new Thread("udp");
		 poolTaskExecutor.execute(udpThread);
		 //获取当前线程池活动的线程数：
		 int count = poolTaskExecutor.getActiveCount();
//		 log.debug("[x] - now threadpool active threads totalNum : " +count);
		 log.info("线程池中 【活动】的线程总数 : " + count + ", 线程名：" + Thread.currentThread().getName());
	 }
}
