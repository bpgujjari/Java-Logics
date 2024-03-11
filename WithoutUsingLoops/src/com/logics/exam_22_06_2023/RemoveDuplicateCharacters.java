package com.logics.exam_22_06_2023;

import java.util.Scanner;

public class RemoveDuplicateCharacters {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter your string..");
	String str=sc.next();
	char[]arr=str.toCharArray();
	String str1="";
	for (int i = 0; i < arr.length; i++) {
		for (int j =i+1; j < arr.length; j++) {
			
			if(arr[i]==arr[j])
			{
				arr[j]='1';
			}
		}
		if(arr[i]!='1')
		{
			str1=str1+arr[i];
		}
	}
	System.out.println(str1);
}
}
