package com.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 业务代理类
 * @author Yang
 *
 */
public class BusinessProcessorHandler implements InvocationHandler {

	private Object target = null; 
	BusinessProcessorHandler(Object target){
		this.target = target;
	}
	
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("核心业务开始前，要做些什么工作？？？  ");
		 
//		Object result = null;
//		if(!method.getName().equals("processBusiness")){
//             result = method.invoke(target, args);
//         }else{
//           //
//         }
		
		
		Object result = method.invoke(target, args);
		System.out.println("核心业务结束后，要做些什么工作？？？  ");
		return result;
	}
	


}
