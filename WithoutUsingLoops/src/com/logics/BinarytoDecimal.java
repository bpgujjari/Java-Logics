package com.logics;
public class BinarytoDecimal{
	public static void main(String[] args) {
		int n=1100;
		double decNum=0;
		int power=0;
		while(n>0)
		{
			int rem=n%10;
			decNum=decNum+rem*Math.pow(2,power);
			power++;
			n=n/10;		
		}
		System.out.println(decNum);
		
	}
}