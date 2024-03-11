package com.Sathya.FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileHandling2 {
	public static void main(String[] args) throws IOException {
		FileWriter writer=new FileWriter("xyz1.txt");
		System.out.println("Append method used");
		writer.append("New data added");
		writer.close();
	}

}
