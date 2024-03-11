package com.logics;

public class Frequency {
public static void main(String[] args) {
	String s="gujjaribhvaniprasadgg";
	char[]arr=s.toCharArray();
	String str="";
	
	for (int i = 0; i < arr.length; i++) {
		int freq=1;
		for (int j = i+1; j < arr.length; j++) {
			if(arr[i]==arr[j])
			{
				freq++;
				arr[j]='1';
			}
		}
		if(arr[i]!='1')
		{System.out.println(arr[i]+" frequncy---"+freq);
		str=str+arr[i];
		}
	}
	System.out.println(str);
}
}
