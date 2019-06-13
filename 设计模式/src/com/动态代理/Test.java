package com.动态代理;

import java.lang.reflect.Proxy;

/**
 * Proxy的作用: 能够在核心业务方法前后做一些你所想做的辅助工作，如log日志，安全机制
 *
 * @author Yang
 *
 */
public class Test {
	public static void main(String[] args) {
	  BusinessProcessorImpl bpimpl = new BusinessProcessorImpl();
	  BusinessProcessorImpl2 bpimpl2 = new BusinessProcessorImpl2();
	  
	  //bp 为 $Proxy0 对象
	  BusinessProcessor bp = (BusinessProcessor)Proxy.newProxyInstance(
			          bpimpl.getClass().getClassLoader(),     // 将刚生成的类加载到jvm中
					  bpimpl.getClass().getInterfaces(),      // 动态生成一个类，实现interfaces中的接口
					  
					  // 调用$Proxy0的$Proxy0(InvocationHandler)构造函数 创建$Proxy0的对象
					  // 并且用interfaces参数遍历其所有接口的方法，并生成Method对象初始化对象的几个Method成员变量
					  new BusinessProcessorHandler(bpimpl) ); 



	  bp.processBusiness();
	  // bp.processBusiness(); 实际上调用的是$Proxy0.processBusiness();
	  // 那么$Proxy0.processBusiness()的实现就是通过InvocationHandler去调用invoke方法啦!


	}
}

