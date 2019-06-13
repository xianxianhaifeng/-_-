package com.反射;

import java.lang.reflect.Constructor;

public class Test2 {

	/**
	 * 1:Class cl=A.class; JVM将使用类A的类装载器,
	 * 将类A装入内存(前提是:类A还没有装入内存),不对类A做类的初始化工作.返回类A的Class的对象。 
	 * 2：Classcl=对象引用o.getClass();
	 * 返回引用o运行时真正所指的对象(因为:子对象的引用可能会赋给父对象的引用变量中)所属的类的Class的对象 。
	 * 3：Class.forName("类名"); .装入类A,并做类的初始化 .getClass()是动态的，其余是静态的。
	 * .class和class.forName()只能返回类内field的默认值，getClass可以返回当前对象中field的最新值
	 * Class.forName() 返回的是一个类,.newInstance()
	 * 后才创建一个对象，Class.forName()的作用是要求JVM查找并加载指定的类，也就是说JVM会执行该类的
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			// 获得指定字符串类对象
			Class cla = Class.forName("com.反射.Employee");
			// 设置Class对象数组，用于指定构造方法类型
			Class[] cl = new Class[] { int.class, String.class };

			// 获得Constructor构造器对象。并指定构造方法类型
			Constructor con = cla.getConstructor(cl);

			// 给传入参数赋初值
			Object[] x = { new Integer(33), new String("yang") };

			// 得到实例
			Object obj = con.newInstance(x);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
