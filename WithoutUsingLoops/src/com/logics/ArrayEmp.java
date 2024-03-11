package com.logics;

public class ArrayEmp {
public static void main(String[] args) {
	Emp emps[]= {new Emp(1, "bhavani"),new Emp(2,"gujjari")};
	for (int i = 0; i < emps.length; i++) {
		System.out.println(emps[i]);
	}
}
}
