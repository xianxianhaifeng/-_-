package com.多线程同步;

public class TestMain {

	public static void main(String[] args) {
        Info info = new Info();
        
        /**生产者*/
        Producer pro = new Producer(info);
        /**消费者*/
        Consumer con = new Consumer(info);
        
        
        new Thread(con,"A").start();
        new Thread(con,"B").start();
        new Thread(pro,"AA").start();
        new Thread(pro,"BB").start();
	}

}
