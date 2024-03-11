package com.logics.exam_22_06_2023;

import java.util.Scanner;

public class ContainsOnlyDigits {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter your String ");
	String str=sc.next();
	char []arr=str.toCharArray();
	boolean flag=true;
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]<='9' && arr[i]>='0')
		{
			flag=true;
		}
		else
			flag=false;
	}
	System.out.println(flag);
}
}
