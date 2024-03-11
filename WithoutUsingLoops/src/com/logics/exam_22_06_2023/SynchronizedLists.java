package com.logics.exam_22_06_2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class SynchronizedLists {
public static void main(String[] args) {
	List<Integer> list=new ArrayList<Integer>();
	list.add(100);
	list.add(200);
	list.add(300);
	list.add(400);
	list.add(500);
	list.add(600);
	
	Map<String,Integer> hm=new HashMap<>();
	hm.put("aaa", 1);
	hm.put("bbb", 2);
	hm.put("ccc", 3);
	hm.put("ddd", 4);

	ArrayList<Integer> arl=new ArrayList<>(hm.values());
	Vector<Integer>vctr=new Vector<>(arl);
	Collections.synchronizedCollection(list);
	Collections.synchronizedMap(hm);
	Collections.synchronizedList(arl);
	
	Set<String>set=hm.keySet();
	
System.out.println(vctr);

   Enumeration<Integer> emtr= vctr.elements();
	
   while(emtr.hasMoreElements())
   {
	   int i= emtr.nextElement();
	   System.out.println(i);
   }
	

}
}
