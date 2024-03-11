package com.logics.exam_22_06_2023;

import java.util.Scanner;

public class FindHighestFrequency {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter your string..");
	String str=sc.next();
	int highest_count=0;
	char highest_freq='-';
	char[]arr=str.toCharArray();
	for (int i = 0; i < arr.length; i++) {
		int count=1;
		for (int j = i+1; j < arr.length; j++) {
		
			if(arr[i]==arr[j])
			{
				count++;
				arr[j]='1';
			}
		}
		
		if(count>highest_count)
		{
			highest_count=count;
			highest_freq=arr[i];
		}

	}
	System.out.println(highest_freq);
}
}
