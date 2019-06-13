package com.ThreadLocal;


public class ThreadLocalTest
{
	//解决线程安全,ThreadLocal比直接使用synchronized同步机制解决线程安全问题更简单，更方便，且结果程序拥有更高的并发性。
	private static ThreadLocal<ThreadLocalTest> context = new ThreadLocal<ThreadLocalTest>();

	
	/** context  singleton共享*/
	public static ThreadLocalTest getContext()
	{
		ThreadLocalTest threadlocal = context.get();
		if( null==threadlocal)
		{
			threadlocal = new ThreadLocalTest();//返回当前线程所对应的线程局部变量
			context.set(threadlocal);           //设置当前线程的线程局部变量的值
		}
		return threadlocal;
	}

	
	
	public static void main(String args[])
	{
		for(int i = 0;i<10;i++)// 启用10个线程：
		{
			new Thread("线程" + i +" : "){
				public void run()
				{
					int loopout=3;// 单个线程共享的资源
					while(loopout>0)
					{
						System.out.println(this.getName() + " -> " + ThreadLocalTest.getContext());
						try
						{
							Thread.sleep(2000);
						}
						catch (InterruptedException e)
						{
							e.printStackTrace();
						}
						loopout--;
					}
				}
			}.start();
		}
	}

}
