package com.Sathya.FileHandling;

import java.io.File;
import java.io.IOException;

public class FileHandling4 {
public static void main(String[] args)throws IOException
{
	File f1=new File("sisindri");
	f1.createNewFile();
	System.out.println("file created successfully");
	File dir=new File("nagarguna");
	dir.mkdir();
}
}
