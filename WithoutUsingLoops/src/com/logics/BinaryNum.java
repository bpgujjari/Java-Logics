package com.logics;

import java.util.Scanner;

public class BinaryNum {
	
	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number");
			int m=sc.nextInt();
			int[]arr=new int [50];
			for(int k=1;k<=m;k++)
			{
			
			int j=0;
			int x=k;
			 while(x>0)
			 {
				 int rem=x%2;
				 arr[j]=rem;
				 x=x/2;
				 j++;
			 }
			 
			
			for(int i=j-1;i>=0;i--)
				 System.out.print(arr[i]+" ");
			 	System.out.println();
			}
		}
	}



