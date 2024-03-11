package com.logics;

public class MultipleSpaces {
public static void main(String[] args) {
	String s="gujjari     bhavani      prasad";
	char[]arr=s.toCharArray();
	int count=0;
	for (int i = 0; i < arr.length; i++) {
		char ch=arr[i];
		if(ch==' ')
		{
			count++;
			if(count>1)
			{arr[i]='1';}
		}
		else
			count=0;
		
	}
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]!='1')
		System.out.print(arr[i]);
	}
}
}
