package com.logics;

public class Palindrom {

	public static void main(String[] args) {
		String str="madam arora teaches malayalam and cjssjc";
		
			String [] spt=str.split(" ");
			
			 
			 
			 
			
			for(int i=0;i<spt.length;i++)
			{
				
				String spp=spt[i];
				String spp1="";
				
				for(int j=spp.length()-1;j>=0;j--)
				{
					spp1=spp1+spp.charAt(j);
				}
				if(spp.equals(spp1))

				{
					System.out.println(spp1);
				}
			}
	}
}