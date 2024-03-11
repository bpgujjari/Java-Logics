package com.logics;

public class WordCountWithLoops {
public static void main(String[] args) {
	String s= "im a java developer I love java";
	String[]arr=s.split(" ");
	for (int i = 0; i < arr.length; i++) {
		int count =1;
		
		for (int j = i+1; j < arr.length; j++) {
			if(arr[i].equals(arr[j]))
			{
						count++;
						arr[j]=null;
		}
		}
			
			if(arr[i]!=null)
			{
				System.out.println(arr[i]+":"+count);
			}
	
}
}
}