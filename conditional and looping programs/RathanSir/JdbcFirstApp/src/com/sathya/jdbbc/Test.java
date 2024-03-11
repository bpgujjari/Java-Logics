package com.sathya.jdbbc;

public class Test {
public static void main(String[] args) throws ClassNotFoundException {
	// Load the driver
	Class.forName("oracle.jdbc.driver.OracleDriver");
	System.out.println("Driver loaded successfully...");
}
}
