package com.logics;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	String s="every one listen demo class silent and drink tea and eat food";
	String [] arr=s.split(" ");
	
	for (int i = 0; i < arr.length; i++) {
		for (int j = i+1; j < arr.length; j++) {
			char [] arr1= arr[i].toCharArray();
			char[]arr2=arr[j].toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			if(arr1.length==arr2.length && !(arr1.equals(arr2)))
			{
				boolean anagram=true;	
				for (int k = 0; k < arr2.length; k++) {
					if(arr1[k]!=arr2[k])
					{
						anagram=false;
						break;
					}
				}
				if(anagram)
				{
					System.out.println(arr[i]+" ---- "+arr[j]);
				}			
			}			
		}
	}	
  }
}
