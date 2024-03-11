package com.logics;

public class Fibonacci {

	
	
		public static void main(String[] args) 
		{
			int firstnum=0;
			int secondnum=1;
			int next;
			System.out.print(firstnum+" ");
			System.out.print(secondnum+" ");
			for (int i=2;i<=7 ;i++ )
			{
				next=firstnum+secondnum;
				System.out.print(next+" ");
				firstnum=secondnum;
				secondnum=next;
			}
		}
	}


