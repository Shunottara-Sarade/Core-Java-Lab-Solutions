package com.cg.lab8.exercise1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileProgram {

	public static void main(String[] args) throws FileNotFoundException{
		File fin=new File("D:\\source.txt");
		File fot=new  File("D:\\target.txt");
		FileInputStream fip=new FileInputStream(fin);
		FileOutputStream fout=new FileOutputStream(fot);
		CopyDataThread cp=new CopyDataThread(fip,fout);
		cp.run();
		System.out.println("Copied Successfully");
		
	}

}
