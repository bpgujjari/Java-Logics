package com.logics;


public class Ascending {
public static void main(String[] args) {
	int [] arr= {7,8,12,34,65,98,9,6,5};
	
for (int i = 0; i < arr.length; i++) {
for (int j = i+1; j < arr.length; j++) {
	int temp=arr[i];
	
	if(arr[i]>arr[j])
	{
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
}
}
for (int i = 0; i < arr.length; i++) {
	System.out.println(arr[i]);
}
}
}