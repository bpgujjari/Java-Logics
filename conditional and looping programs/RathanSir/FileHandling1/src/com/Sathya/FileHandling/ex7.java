package com.Sathya.FileHandling;

import java.io.*;


public class ex7 {
	public static void main(String[] args)
	{
		try(BufferedReader reader= new BufferedReader(new FileReader("xyz.txt"));
			BufferedWriter writer=new BufferedWriter(new FileWriter("xyz2.txt")))
		{
			String line;
			while((line=reader.readLine())!=null)
			{
				writer.write(line);
				writer.newLine();
				writer.write("King is king until the king becomes king");
			}
		}
		catch(IOException e)
		{
			e.getStackTrace();
		}
		System.out.println("Rathan Sir is hero...");
	}

}
