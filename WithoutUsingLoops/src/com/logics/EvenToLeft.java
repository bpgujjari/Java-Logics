package com.logics;

public class EvenToLeft {

	
	
	
		public static void main(String[] args) 
		{
			int[]arr={2,3,5,6,8,9,7};
			int count=0;
			for (int i =0;i<arr.length ;i++ )
			{
				if (arr[i]%2==0)
				{arr[count]=arr[i];
				count++;
				}
			}
			for (int i =0;i<arr.length ;i++ )
			{
				if (arr[i]%2!=0)
				{arr[count]=arr[i];
				count++;
				}
			}
			for (int i=0;i<arr.length ;i++ )
			System.out.println(arr[i]);
		}
	}


