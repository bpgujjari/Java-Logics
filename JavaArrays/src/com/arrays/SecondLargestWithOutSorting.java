package com.arrays;

public class SecondLargestWithOutSorting {
public static void main(String[] args) {
	int arr[]= {10,29,39,4,509,709,1090};
	int first=arr[0];
	int second=arr[1];
	for (int i = 2; i < arr.length; i++) {
		if(arr[i]>second && arr[i]<first)
		{
			second=arr[i];
		}
		
		else if(arr[i]>first) 
		{
			second=first;
			first=arr[i];
		}
		
	}
	System.out.println(second);
}
}
