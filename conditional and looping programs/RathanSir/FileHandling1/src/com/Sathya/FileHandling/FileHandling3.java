package com.Sathya.FileHandling;
import java.io.*;

public class FileHandling3 {
public static void main(String[] args)throws IOException
{
	FileInputStream ip = new FileInputStream("desert.jpg");
	FileOutputStream op=new FileOutputStream("desertcp.jpg");
	System.out.println("Channel Created Successfully");
	int b;
	while((b=ip.read())!=-1)
	{
		op.write(b);
	}
	ip.close();
	op.close();
	System.out.println("Channel closed successfully");
}
}
