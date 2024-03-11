package com.arrays;

public class MinumumAndMaximum {
public static void main(String[] args) {
	int arr[]= {110,20,30,40,50,70};
	int minimum=arr[0];
	int maximum=arr[0];
	for (int i = 0; i < arr.length; i++) {
		
			if(arr[i]>maximum)
			{
				maximum=arr[i];
			}
			else if(arr[i]<minimum) {
				minimum=arr[i];
			}
	}
	System.out.println(maximum+"---------->"+minimum);
	
}
}
