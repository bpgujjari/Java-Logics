package com.sathya.prot;

public class A {
	protected static int num=100;
	public static void main(String[] args) {
	System.out.println(num);
}
}
class B {
	
	System.out.println(A.num);
}
