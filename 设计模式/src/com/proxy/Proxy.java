package com.proxy;

public class Proxy implements Network{
	private Network netWork;
	
	Proxy(Network netWork){
        this.netWork = netWork;
    }
	
    public void browser(){
        checkName();
        this.netWork.browser();
    }

    private void checkName(){
    	System.out.println("do browser before ...");
    }
	
}
