package com.门面;
 

/**
 * 控制接口
 * 
 * @author maofw
 * 
 */
public interface Inteface
{
	// 设置下一个节点内容
	public Inteface setNext(Inteface flowControl);

	// 模板方法
	public void run();
}
