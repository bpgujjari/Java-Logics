package com.Sathya.FileHandling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.Buffer;

public class Ex6 {
	public static void main(String[] args) {
		try (BufferedInputStream ip=new BufferedInputStream(new FileInputStream("desert.jpg"));
			 BufferedOutputStream op=new BufferedOutputStream(new FileOutputStream("desert1.jpg")))
		{
			int c;
			while((c=ip.read())!=-1)
			{
				op.write(c);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Gujjari Bhavaniprasad");
	}

}
