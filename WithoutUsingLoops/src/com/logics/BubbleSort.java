package com.logics;

public class BubbleSort {

	
		public static void main(String[] args) 
		{
			int [] arr={1,2,3,4,5,90};
			int largest=arr[0];
			for (int i=1;i<arr.length ;i++ )
			{if (arr[i]>largest)
			{largest=arr[i];
			}
			}
			System.out.println(largest);
		
	}
}
