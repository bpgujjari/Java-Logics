package com.Sathya.FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling5 {
public static void main(String[] args)throws IOException
{
	File dir=new File("Rathan");
	dir.mkdir();
	File f1=new File("Rathan","Anu");
	f1.createNewFile();
	FileWriter writer =new FileWriter(f1);
	writer.write("Rathan Sir is hero....\n");
	writer.write("Anu is heroine....\n");
	writer.close();
	System.out.println("completed");
}
}
