package com.logics;

public class JavaQuiz {
	private static int count;
	private static String[] stops=new String[] {"washington","Moneroe","jackson","lasalle"};
public static void main(String[] args) {
	while(count<stops.length) {
		if(stops[count++].length()<8)
		{
			break;
		}
	}
	System.out.println(count);
	
}
}
