package com.logics.exam_22_06_2023;

import java.util.Scanner;

public class PrintOnlyDuplicates {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter your string..");
	String str=sc.next();
	char[]arr=str.toCharArray();
	for (int i = 0; i < arr.length; i++) {
		int count=1;
		for (int j = i+1; j < arr.length; j++) {
			if(arr[i]==arr[j])
			{
				count++;
			}
		}
		if(count>1)
		{
			System.out.println(arr[i]);
		}
	}
}
}
