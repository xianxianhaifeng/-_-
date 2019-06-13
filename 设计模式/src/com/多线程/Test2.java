package com.多线程;

public class Test2 extends Thread{
	private int timeOut = 50000; // 时间
	private int ticket  = 5; // 车票
	private String threadName;
	
	public Test2(){	 
	}
	public Test2(String threadName){
		this.threadName = threadName;
	}
	
	public void run() {
		for (int i=0;i<timeOut; i++){//某一段时间内
				if(ticket>0){
					System.out.println(Thread.currentThread().getName()+" 正在卖票 "+(ticket--));
				}
		}
	}
	
	public static void main(String[] args) {
		Test2 th = new Test2();
		new Thread(th,"1号窗口").start();
		new Thread(th,"2号窗口").start();
		new Thread(th,"3号窗口").start();
		new Thread(th,"4号窗口").start();
	}

}
