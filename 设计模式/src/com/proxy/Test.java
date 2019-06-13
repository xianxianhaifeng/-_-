package com.proxy;

/**
 * 代理模式 
 */

public class Test {
	public static void main(String[] args){
		new Proxy(new Real()).browser();
	}
}
