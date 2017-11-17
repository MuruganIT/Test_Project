package com.org.test;

import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadWrite {
public static void main(String args[]) throws IOException{
	
	FileOutputStream fos = new FileOutputStream("D:\\ReadWrite\\Book1.xls");
	String s = "Hai Murugan";
	byte[] b = s.getBytes();
	fos.write(b);
	System.out.println("Writing done");
	
	FileInputStream fis = new FileInputStream("D:\\ReadWrite\\Book1.xls");
	int i;
	while((i=fis.read())!=-1){
	System.out.println((char)i);
	}
}
}
