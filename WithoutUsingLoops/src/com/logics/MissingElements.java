package com.logics;

public class MissingElements {
public static void main(String[] args) {
	int []arr = {1,2,3,5,6,7,8,10,11,13,15,16,18};
	
	int start=arr[0];
	
	for (int i = 1; i < arr.length; i++) {
		if(++start != arr[i]) {
			System.out.println(start);
			start++;
		
	}
	}
	
}
}
