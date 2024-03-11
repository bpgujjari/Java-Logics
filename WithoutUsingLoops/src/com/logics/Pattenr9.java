package com.logics;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Pattenr9 {

	
	    public static void main(String[] args) {
	      
	    		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7);
	    		
	    		ListIterator<Integer> lst= numbers.listIterator();
	    		while(lst.hasNext())
	    		{
	    			int i= lst.next();
	    			if(i==4)
	    			{
	    				lst.set(10);
	    			}
	    			System.out.print(i+"  ");
	    		}
	}
}
