package com.反射;

import java.lang.reflect.Method;

public class Test {

	public static void main(String[] args) {
		Employee emp = new Employee();
		Class<? extends Employee> cl = emp.getClass();// 是Class，而不是class
		
		// emp.getClass 返回这个对象真实的Class对象　　　　　　　　　　
		// Class是专门用来描述类的类，比如描述某个类有那些字段，方法，构造器等等
		
		try {
			// getMethod方法第一个参数指定一个需要调用的方法名称
			// 这里是Employee类的setAge方法，第二个参数是需要调用　
			// 方法的参数类型列表，是参数类型！如无参数可以指定null　
			// 该方法返回一个方法对象　
			Method sAge  = cl.getMethod("setAge",   new Class[] { int.class });// 参数必须和方法中一样int和Integer，double和Double被视为不同的类型
			Method gAge  = cl.getMethod("getAge",   null);
			Method pName = cl.getMethod("printName",new Class[] { String.class });

			
//			Method sAge  = null;// 参数必须和方法中一样int和Integer，double和Double被视为不同的类型
//			Method gAge  = null;
//			Method pName = null;
			
			Object[] args1 = { new Integer(25) };
			// 参数列表
			// emp为隐式参数该方法不是静态方法必须指定
			sAge.invoke(emp, args1); 
			System.out.println("The Employee Age is: " + gAge.invoke(emp, null) );
			
			
			Object[] args3 = { new String("Jack") };
			pName.invoke(emp, args3); 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.exit(0);// 0 正常结束程序, 1 异常关闭程序

	}

}
