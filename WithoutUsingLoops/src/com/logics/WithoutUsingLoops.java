package com.logics;

import java.util.stream.IntStream;

public class WithoutUsingLoops {

	public static void main(String[] args) {
	
		//WithoutUsingLoops.printNum(1);
		IntStream.range(1, 101).forEach(i->System.out.println(i));
		
	}
	public static void printNum(int num)
	{
		if(num<=100)
		{
			System.out.println(num);
			num++;
			printNum(num);
		}
	}
}