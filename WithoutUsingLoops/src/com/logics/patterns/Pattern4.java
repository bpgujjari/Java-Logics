package com.logics.patterns;

public class Pattern4 {
public static void main(String[] args) {
//	for(int i=1;i<=7;i++)
//	{
//		for(int j=1;j<=7;j++)
//		{
//			if(j==4 || i==7 ||(i==2&&j==3)||(i==3&&j==4) )
//				System.out.print("+");
//			else
//				System.out.print(" ");
//		}
//		System.out.println();
//		}
	
	for (int i=1 ; i<=7 ; i++) {
		for (int j=1 ; j<=5 ; j++){
		if(j==4-i || j==3 || i==7)
		System.out.print("+");
		else
		System.out.print(" ");
		}
		System.out.println();
}
}
}
