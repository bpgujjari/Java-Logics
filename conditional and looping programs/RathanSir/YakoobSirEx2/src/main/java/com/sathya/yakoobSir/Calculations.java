package com.sathya.yakoobSir;

public class Calculations {

	public static double total(double icost, int iquan )
	{
		double total = icost*iquan;
		return total;
	}
	
	public static double discount(double total)
	{	double disc;
		if(total<1000)
		{
			disc=(total*10)/100;
			return disc;
		}
		else if(total>=1000&&total<2000)
		{
			disc=(total*15)/100;
			return disc;
		}
		else if(total>=2000)
		{
			disc=(total*25)/100;
			return disc;
		}
		
		else 
			return 0.0;
	}
	
	public static double famt(double total, double disc)
	{
		double famt=total-disc;
		return famt;
		
	}	
}
