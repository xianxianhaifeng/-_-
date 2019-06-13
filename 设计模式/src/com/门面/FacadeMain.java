package com.门面;
 
import com.门面.nodes.First;
import com.门面.nodes.Fourth;
import com.门面.nodes.Last;
import com.门面.nodes.Second;
import com.门面.nodes.Third;

public class FacadeMain {
	private static FacadeMain facadeMain = new FacadeMain();
	// 起始节点
	private Inteface inteface;

	private FacadeMain()
	{
		// 建立节点流程
		// 1. 接入权限验证节点
		inteface = new First();
		
		// 2. 设置 流量控制验证节点
		Inteface inter = inteface.setNext(new Second());
		
		// 3. 设置接口调用权限验证节点
		inter = inter.setNext(new Third());
		
		// 4. 自定义
		inter = inter.setNext(new Fourth());
		
		// 5. 设置最终请求节点
		inter.setNext(new Last());
	}

	/**
	 * 单例
	 */
	public static FacadeMain getInstance()
	{
		return facadeMain;
	}

	/**
	 * 执行入口
	 */
	public static void main (String args[])
	{
		FacadeMain.getInstance().inteface.run();
	}
}
