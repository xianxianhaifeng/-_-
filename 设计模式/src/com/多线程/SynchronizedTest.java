package com.多线程;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SynchronizedTest {
	
	private int j;
	private Lock lock = new ReentrantLock();
	
	public static void main(String[] args) { 
		SynchronizedTest tt = new SynchronizedTest();
		for(int i=0;i<2;i++)
		{
			new Thread(tt.new Adder()).start();
			new Thread(tt.new Subtractor()).start();
		}
	}

	private class Subtractor implements Runnable
	{
 
		public void run() { 
			while(j<100)
			{
				synchronized (SynchronizedTest.this) {	
					System.out.println("j1++=" + j++);
					//这里抛异常了，锁能释放吗？
				}
				 
			}
		}
		
	}
	
	private class Adder implements Runnable
	{
 
		public void run() {
			while(j<100)
			{
				synchronized (SynchronizedTest.this) {
				System.out.println("j2++=" + j++);	
				}
				 		
			}			
		}
		
	}

}
