package com.门面.nodes;

import com.门面.InterfaceImp;

/**
 * 接入权限验证
 */
public class First extends InterfaceImp
{

	// 执行判断
	@Override
	public boolean execute()
	{
		System.out.println("接入权限验证");
		return true;
	}

 

}
