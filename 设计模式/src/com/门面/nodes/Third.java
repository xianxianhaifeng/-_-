package com.门面.nodes;

import com.门面.InterfaceImp;

/**
 * 接口权限节点 
 */
public class Third extends InterfaceImp
{

	// 执行判断
	@Override
	public boolean execute()
	{

		System.out.println("接口权限节点");
		return true;
	}

	
}
