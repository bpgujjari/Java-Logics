package com.logics;

import java.util.Scanner;

public class DigitsSumFromString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string ");
		String s=sc.next();
		int sum=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			
			if(ch>= '0'&&ch<='9')
			{
				sum=sum+(int)(ch-48);
			}
		
	}
		System.out.println(sum);
	
}
}
