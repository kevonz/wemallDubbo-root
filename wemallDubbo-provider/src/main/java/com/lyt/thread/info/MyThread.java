package com.lyt.thread.info;
/**
 * Thread.currentThread() 获取当前线程对象
 * @author Administrator
 *
 */
public class MyThread implements Runnable{
	
	private boolean flag = true;
	private int num = 0;
	@Override
	public void run() {
		while(flag){
			System.out.println("获取当前线程对象:" + Thread.currentThread().getName() + "-->" + num++);
		}
	}
	//修改线程标识方法
	public void stop(){
		this.flag = !this.flag;
	}
}
