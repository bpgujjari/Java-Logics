package com.arrays;


public class MissingElements {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,6,7,9};
	int start=arr[0];
	int end=arr[arr.length-1];
	for (int i =1; i <=arr.length-1; i++) {
		if(++start!=arr[i])
		{
			System.out.println(start);
			start++;
		}
	}
}
}
