package com.垃圾回收;

public class Test {
	
	public void finalize(){
		System.out.println(" 回收 ");
	}
	
	public static void main(String[] args) {
		Character a ;
		Integer ii = new Integer(0);
		
		
		for (int i=0 ;i<100;i++){
			new Test();
			System.gc();
		}
		System.out.println(" 程序执行结束！ ");
	}

}
 