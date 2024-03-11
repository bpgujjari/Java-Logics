package com.arrays;

public class LederalElement {
public static void main(String[] args) {
	int arr[]= {11,8,7 ,9,3 ,5 ,4 ,6, 2, 1,10};
	int count=0;
	
	for (int i = 0; i < arr.length-1; i++) {
			boolean isLederal=true;
		for (int j = i+1; j < arr.length; j++) {
			
			if(arr[i]<arr[j])
			{
				isLederal=false;
			}
			
		}
		
		if(isLederal)
		{
			System.out.println(arr[i]);
			count++;
		}
	}
	System.out.println(count);
	
}
}
