package com.tcs.java.corejava;
public class LinearSearch {
	public int linearSearch(int[]arr,int target) {
		for(int i=0;i<arr.length;i++)
		if(arr[i]==target)
			return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[]arr= {1,2,3,4,6,5};
		int target=5;
		int res=LinearSearch.linearSearch(arr,target);
		if(res==-1)
			System.out.println("Element found at index -"res);

	}
	}

