package com.sathya.jstl;

public class Student {
int id;
String name;
String addr;
double height;


public Student(int id, String name, String addr, double height) {
	this.id = id;
	this.name = name;
	this.addr = addr;
	this.height = height;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddr() {
	return addr;
}
public void setAddr(String addr) {
	this.addr = addr;
}
public double getHeight() {
	return height;
}
public void setHeight(double height) {
	this.height = height;
}

}
