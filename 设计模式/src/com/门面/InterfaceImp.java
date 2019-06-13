package com.门面;

/**
 * 抽象控制类
 * 
 * @author maofw
 * 
 */
public abstract class InterfaceImp implements Inteface
{ 
	private Inteface flowControl;

	// 设置下一个节点内容 返回下一个节点对象
	public Inteface setNext(Inteface flowControl)
	{
		this.flowControl = flowControl;
		return flowControl;
	}

	// 子类实现 执行方法
	public abstract boolean execute();
	

	/**
	 * 模板方法
	 */
	public final void run()
	{ 
		this.execute();
		if (  flowControl != null )
		{
			// 执行下一个判断内容
			flowControl.run();
		}
	}
}
