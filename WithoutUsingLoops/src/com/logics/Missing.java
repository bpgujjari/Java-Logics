package com.logics;

public class Missing {
public static void main(String[] args) {
	int[]arr= {1,2,3,4,5,6,7,9};
	int largest=arr[0];int smallest=arr[0];
	int sum1=0;int sum2=0;
	
	for(int i=1;i<arr.length;i++)
	{
		if(smallest>arr[i])
		{
			smallest=arr[i];
			
		}
		if(largest<arr[i])
		{
			largest=arr[i];
			
		}
	}
	//System.out.println(smallest+"  "+largest);
	
	
	for(int i=0;i<arr.length;i++) 
		sum1=sum1+arr[i];
	
	
	for(int i=smallest;i<=largest;i++)
		sum2=sum2+i;
	
	int missing=sum1-sum2;
	
	System.out.println("missing element is--->"+missing);
}
}
