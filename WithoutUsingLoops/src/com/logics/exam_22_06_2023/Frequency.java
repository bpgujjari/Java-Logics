package com.logics.exam_22_06_2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Frequency {
public static void main(String[] args) {
	Integer arr[]= {1,2,3,4,5,6,7,8,8,8,8,8,8,8};
	List<Integer>nums=Arrays.asList(arr);
	
	List<Integer>list=List.of(1,2,3,4,5,6,6,6,7,7,7);
	
    System.out.println(Collections.frequency(list, 6));
    System.out.println(Collections.frequency(nums,8));
}
}
