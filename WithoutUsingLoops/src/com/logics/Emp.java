package com.logics;

public class Emp {
public int eid;
public String name;
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Emp(int eid, String name) {
	super();
	this.eid = eid;
	this.name = name;
}
@Override
public String toString() {
	return "Emp [eid=" + eid + ", name=" + name + "]";
}



}
