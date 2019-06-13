package com.继承;

public class Son extends Father{

//	public void eat(Father fa){
//		super.eat(fa);
//		System.out.println("儿子在吃饭！");
//	}
//	
//	public static void main(String[] args) {
//		Father fa = new Son();
//		fa.eat(fa); 
//	}
 
	public static void main(String[] args) {
		Son fa = new Son();
		fa.eat(fa); 
	}

}
