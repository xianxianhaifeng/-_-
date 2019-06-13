package com.多线程同步;

class Info {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public synchronized void set(String name, int age) {
		if (flag) {
			try {
				super.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		this.name = name;
		try {
			Thread.sleep(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.age = age;
		flag = true; 
		System.out.println( "    p :"+(p++));
		super.notify();
	}

	public synchronized void get() {
		if (!flag) {
			try {
				super.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(this.getName() + " 年纪为: " + this.getAge()+"    p :"+(p++));
		flag = false;
		super.notify();
	}

	private String name = "test" ;
	private int age = 0;
	private boolean flag = false;
	
    int p=0;
}