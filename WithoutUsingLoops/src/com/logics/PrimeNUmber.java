package com.logics;

import java.util.Scanner;

public class PrimeNUmber {

	
public static void main(String args[])
{
System.out.println("enter a number");
Scanner sc= new Scanner(System.in);
int n= sc.nextInt();

for(int i=1;i<=n;i++)
{
int z=i;
boolean prime=true;
for(int j=2;j<z;j++)
{
if(z%j==0)
{
prime=false;
break;
}


}
if(prime==true)
{
	
System.out.println(z);}
}}}

	
