package com.logics.exam_22_06_2023;

import java.util.Date;
import java.util.Scanner;


class InvalidAgeExcepiton extends RuntimeException{
	public InvalidAgeExcepiton(String s) {
		super(s);
	}
}

public class CustomException {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your date of birth");
	System.out.println("DD-MM-YYYY");
	
	
	String[] splitted=sc.next().split("-");
	int year = Integer.parseInt(splitted[splitted.length-1]);
	
	String [] current=new Date().toString().split(" ");
	int current_year=Integer.parseInt(current[current.length-1]);
	
	int age = current_year-year;
	
	if(age>18) {
		System.out.println("eligible for vote");
	}
	else
		throw new InvalidAgeExcepiton("you are not eligible for vote...");
	
}
}
