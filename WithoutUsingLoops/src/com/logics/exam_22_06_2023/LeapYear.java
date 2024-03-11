package com.logics.exam_22_06_2023;

public class LeapYear {
public static void main(String[] args) {
	int startyr=1899;
	int endyr=1920;
	
	
	for (int i = startyr; i <=endyr; i++) {
		
		if (i%400==0 || (i%4==0 && i%100!=0)) {
			System.out.println(i+"---is a leap year");
		}
		
	}
}
}
