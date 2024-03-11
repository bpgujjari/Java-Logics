package com.logics;

public class MaxSum {
public static void main(String[] args) {
	int []arr= {-1,-2,-4,4,1,2,4};
	int sum=0;
	for (int i = 0; i < arr.length; i++) {
		for (int j = i+1; j < arr.length; j++) {
			if(arr[i]<arr[j])
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	sum=arr[0];
	for (int i = 1; i < arr.length; i++) {
		if(arr[i]!=arr[0])
		{
			sum=sum+arr[i];
			break;
		}
	}
	System.out.println(sum);
	System.out.println(arr[0]);
		
}
}
