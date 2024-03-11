package com.logics.exam_22_06_2023;

import java.util.Scanner;

public class CharacterAccurance {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your string");
	String s=sc.next();
	
	char [] arr=s.toCharArray();
	
	for (int i = 0; i < arr.length; i++) {
		int count=1;
		for (int j =i+1; j < arr.length; j++) {
			if(arr[i]==arr[j])
			{
				count++;
				arr[j]='1';
				
			}
		}
			if(arr[i]!='1')
			{
				System.out.println(arr[i]+"------>"+count);
			}
			
		
	}
}
}
