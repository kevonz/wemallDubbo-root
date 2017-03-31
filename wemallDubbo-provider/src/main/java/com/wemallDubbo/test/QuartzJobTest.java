package com.wemallDubbo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试任务调度
 * @author Administrator
 *
 */
public class QuartzJobTest {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring-base.xml");
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/spring-task.xml");
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/spring-quartz.xml");
	/*	String[] names = ctx.getBeanDefinitionNames();
		for (String string : names) {
			System.out.println("获取beanNames： " + string + ", ");
		}*/
//		ctx.getBean("quartzJob");
		
		
	}
	
}
