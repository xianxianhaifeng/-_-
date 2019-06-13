package com.多线程;

public class Test implements Runnable{
	private int timeOut = 50000; // 时间
	private int ticket  = 5; // 车票
	private String threadName;
	
	public Test(){
		 
	}
	public Test(String threadName){
		this.threadName = threadName;
	}
	
//	public void run() {
//		for (int i=0;i<timeOut; i++){
//			System.out.println("线程 "+threadName+" 计时"+i+"秒");
//		}
//	}
	
	public void run() {
		for (int i=0;i<timeOut; i++){//某一段时间内
			/**同步代码块*/
			synchronized(this){
				if(ticket>0){
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) { 
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+" 正在卖票 "+(ticket--));
				}
			}
		}
	}
	
	/***
	 * synchronized(this)里的this 是指当前class的实例这个当前class是 Thread1，
	 * 所以Thread1的实例在main方法里是Thread1 t1 = new Thread1();
	 * 也就是t1，所以当ta和tb运行起来的时候，锁了同一个对象t1，自然就会引发阻塞
	 *  
	 */
	public static void main(String[] args) {
//		Test t1 = new Test("A");
//		Thread th1 = new Thread(t1);
//		th1.start();
//		
//		Test t2 = new Test("B");
//		Thread th2 = new Thread(t2);
//		th2.start();
//		
//		Test t3 = new Test("C");
//		
//		Thread th3 = new Thread(t3);
//		th3.start();
		
		Test th = new Test();
		new Thread(th,"1号窗口").start();
		new Thread(th,"2号窗口").start();
		new Thread(th,"3号窗口").start();
		new Thread(th,"4号窗口").start();
		for(int i=0;i<1000;i++){
			new Thread(th,"T号窗口").start();
		}
//		new Thread(th).start();
	}

}
