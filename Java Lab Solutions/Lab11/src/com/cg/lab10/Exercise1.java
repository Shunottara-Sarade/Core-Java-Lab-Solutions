package com.cg.lab10;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Exercise1 {
	public static void main(String args[])throws IOException
    {
                int j=1;
                char ch;
                Scanner scr=new Scanner(System.in);
                
                FileInputStream f=new FileInputStream("D:\\source.txt");
                System.out.println("\nContents of the file are");
                int n=f.available();
                System.out.print(j+": ");
                for(int i=0;i<n;i++)
                {
                            ch=(char)f.read();
                            System.out.print(ch);
                            if(ch=='\n')
                            {
                                        System.out.print(++j+": ");
                                       
                            }
                                       
                }
    }

}
