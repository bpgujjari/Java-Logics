package com.logics;

import java.util.Scanner;

public class LargestDigit {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n =sc.nextInt();
	
	
	int largest=0;
	
	while(n>0)
	{
		int rem=n%10;
		if(largest<rem)
		{
			largest=rem;
		}
		n=n/10;
	}
	
	System.out.println(largest);
	
}
}
