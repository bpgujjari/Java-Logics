package com.logics;

import java.util.Scanner;

public class Strong {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int org=n;
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			int fact=1;
			for(int i=2;i<=rem;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			
			n=n/10;
		}
		if(sum==org)
		{
			System.out.println(sum+" is a strong number");
		}
		else
			System.out.println(org+" is not a strong number");
		
	}

}
