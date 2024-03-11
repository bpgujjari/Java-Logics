package com.logics;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.RandomAccess;

public  class CustomList extends java.util.AbstractList<Integer> implements RandomAccess,Cloneable,Serializable  {


@Override
public int size() {
	// TODO Auto-generated method stub
	return 10;
}

@Override
public boolean addAll(Collection<? extends Integer> c) {
	return false;
}

@Override
public Integer get(int index) {
	// TODO Auto-generated method stub
	return 10;
}

public static void main(String[] args) {
	CustomList c= new CustomList();
	System.out.println(c.size());
	c.add(0, 10);
	c.add(1, 20);
	Iterator<Integer>itr= c.iterator();
	while(itr.hasNext())
	{
		Integer i=itr.next();
		System.out.println(i);
	}
	
}


}