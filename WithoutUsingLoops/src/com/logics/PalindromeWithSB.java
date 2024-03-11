package com.logics;

public class PalindromeWithSB {
	public static StringBuffer reversed(String str) {
		StringBuffer sb=new StringBuffer();
		for (int i = str.length()-1; i>=0; i--) {
			sb=sb.append(str.charAt(i));
			
		}
		
		
		return sb;
		
	}
public static void main(String[] args) {
	String str="madam";
	String s= PalindromeWithSB.reversed(str).toString();
	
	
	if(str.equals(s))
	{
		System.out.println(str+"----is a palindrome");
	}
	else
	{
		System.out.println("not a palindrome");
		System.out.println(str);
		System.out.println(s);
	}
}
}
