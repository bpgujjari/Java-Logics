package com.logics.exam_22_06_2023;

import java.util.Scanner;

public class LargestWordFinder {
    public static void main(String []args) 
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("-enter your string ");
    	String s="hello macha m doingraa";
    	
    	String [] arr=s.split(" ");
    	System.out.println(arr.length);
    	
    	
    	
    	String longest=arr[0];
    	int longLength=longest.length();
    	
    	
    	for (int i = 1; i < arr.length; i++) {
			if(longLength<arr[i].length())
			{
				longLength=arr[i].length();
				longest=arr[i];
			}
		}
    	
    	System.out.println(longest);
    }
}

