package com.logics;

public class BinaryToDecimalArray {

	
		public static void main(String[] args) {
			int[] arr= {1100,11001,1110,11101};
			for(int i=0;i<arr.length;i++)
			{
			int n=arr[i];
			int decNum=0;
			int base=1;
			while(n>0)
			{
				int rem=n%10;
				decNum=decNum+rem*base;
				base=base*2;
				n=n/10;
			}
			System.out.println(arr[i]+"-->Decimal number is-->"+decNum);
			
		}
		}
	}

