package com.sathya.test;

public class Test {
public static void main(String[] args){
	try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	System.out.println("Success");
	}
	catch (Exception e) {
		System.out.println(e);
	}
}
}

