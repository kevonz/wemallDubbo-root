package com.wemallDubbo.service.start;  
  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
/**
 * 这个是 模拟 启动服务的  开始 类  加载 spring-dubbo.xml文件 便于测试。
 * 启动之前要先启动本地的zookeeper服务器
 * @author Administrator
 *
 */
public class Provider {  
  
    public static void main(String[] args) throws Exception {  
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(  
                new String[] { "classpath:spring/spring-dubbo.xml" });  
        context.start();  
        System.in.read(); // 为保证服务一直开着，利用输入流的阻塞来模拟  
    }  
}