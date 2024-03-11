package com.logics;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class SetEx1 {
public static void main(String[] args) 
{
	HashMap<Integer, String>hm=new HashMap<>();
	
	hm.put(1, "aaa");
	hm.put(2, "bbb");
	hm.put(7, "ccc");
	hm.put(3, "ddd");
	
	System.out.println(hm);
	
	LinkedHashMap<Integer, String>lhm=new LinkedHashMap<>();
	lhm.put(8, "aaa");
	lhm.put(2, "bbb");
	lhm.put(6, "ccc");
	lhm.put(4, "ddd");
	lhm.put(1, "eee");
	lhm.put(8, "zzz");
	
	System.out.println(lhm);
	
	
	}
}
