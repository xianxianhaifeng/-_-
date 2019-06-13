package com.门面.nodes;

import com.门面.InterfaceImp;

/**
 * 最后请求节点  
 */
public class Last extends InterfaceImp
{

	@Override
	public boolean execute(){
		System.out.println("最后请求节点");
		return true;
	}

	
}
