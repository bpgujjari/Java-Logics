package com.logics;

public class CountWords {

	public static void main(String[] args) {
		String str="pam jam kam lom";
		int count=1;
		char []cha=str.toCharArray();
		
		for (int i = 0; i < cha.length; i++) {
			if(cha[i]==' ')
			{
				count++;
			}
		}
		System.out.println("number pf wprds---"+count);
	}
	
}
