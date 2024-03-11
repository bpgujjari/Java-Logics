package com.logics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test11 {
public static void main(String[] args) {
	LinkedList<Integer>list=new LinkedList<>();	
	list.add(null);
	list.add(null);
	System.out.println(list);
	list.forEach(System.out::print);
	System.out.println();
	
	
	HashMap<String, Integer>hm=new HashMap<>();
	
	hm.put("aaa", 1);
	hm.put("bbb", 2);
	
	Map<String, Integer> m=Map.copyOf(hm);
	
	Set<Map.Entry<String, Integer>>hm1=m.entrySet();
	Set<Entry<String,Integer>>entries=m.entrySet();
	for(Entry<String,Integer>entry:entries)
	{
		System.out.println(entry.getKey()+" : "+entry.getValue());
	}
	

	ArrayList<Integer>list1=new ArrayList<>(10);
	list1.add(10);
	list1.add(20);
	
	list1.ensureCapacity(29);
    ArrayList<String> myList = new ArrayList<>();

    // Add some elements to the ArrayList
    myList.add("Apple");
    myList.add("Banana");
    myList.add("Orange");
    Integer[] arr= {1,2,4,5,6,7};

   ArrayList<Integer>arrl1=new ArrayList<>();
   arrl1.add(10);
   arrl1.add(20);
   arrl1.add(30);
   arrl1.add(40);
   arrl1.add(50);

   System.out.println(arrl1);
   
   LinkedList<Integer>lnk=new LinkedList<>();
   lnk.add(100);
   lnk.add(200);
   lnk.add(300);
   lnk.add(400);
   lnk.add(500);
   lnk.add(50);
System.out.println(lnk);
   
    LinkedHashSet<Integer>set=new LinkedHashSet();
    set.add(100);
    set.add(200);
    set.add(300);
    set.add(400);
    set.add(500);
System.out.println(set);
   
	
	}
}
