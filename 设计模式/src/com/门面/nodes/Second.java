package com.门面.nodes;
 
import com.门面.InterfaceImp;

/**
 * 流量控制节点 
 */
public class Second extends InterfaceImp
{
	// 执行判断
	@Override
	public boolean execute()
	{
		System.out.println("流量控制节点");
		return true;
	}

	
}
