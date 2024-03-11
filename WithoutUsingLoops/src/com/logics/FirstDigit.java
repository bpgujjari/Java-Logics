package com.logics;

import java.util.Scanner;

public class FirstDigit {
public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
	System.out.println("enter a number");
	int n=sc.nextInt();
	
	int first=0;
	

	
	while(n>=10)
	{
		n=n/10;
	}
	first=n%10;
	System.out.println("first digit---"+first);
	
}
}
