package com.sathya.prvt;

public class Father {
	private int money=10000;
	//public int money=10000;
	
}
class Child extends Father{
	void party() {
		System.out.println("Father money "+money);
	}
	public static void main(String[] args) {
		Child c=new Child();
		c.party();
	}
}