package com.Sathya.FileHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
	public static void main(String[] args) throws IOException{
		FileReader reader = new FileReader("abc.txt");
		FileWriter writer = new FileWriter("xyz.txt");
		FileWriter writer1 = new FileWriter("abc1.txt");
		System.out.println("Channel created successfully");
		int c;
		while((c=reader.read())!=-1)
		{
			writer.write(c);
		}
		System.out.println("Read and Write blocks completed");
		writer1.write("Rathan sir is Hero....[[][]");
		reader.close();
		writer.close();
		writer1.close();
		System.out.println("Channel closed Successfully");
	}
}
