package com.Sathya.FileHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling1 {
	public static void main(String[] args) throws IOException
	{
		FileReader reader=new FileReader("abc.txt");
		FileWriter writer=new FileWriter("xyz.txt");
		System.out.println("Channel Created successfully");
		int c;
		while((c=reader.read())!=-1)
		{
			writer.write(c);
		}
		System.out.println("Read and Write Operations successfully");
		writer.write("New data added");
			
		reader.close();
		writer.close();
		System.out.println("Channel closed Successfully");
	}

}
