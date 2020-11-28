package com.cg.lab10;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise2 {
	public static void p(String str)
    {
           System.out.println(str);
    }
    public static void analyze(String s)
    {
           File f=new File(s);
           if(f.exists())
           {
           p(f.getName()+" is a file");
           p(f.canRead()?" is readable":" is not readable");
           p(f.canWrite()?" is writable":" is not writable");
           p("Filesize:"+f.length()+" bytes");
           p("File last mdified:"+f.lastModified());
           }
           if(f.isDirectory())
           {
           p(f.getName()+" is directory");
            p("List of files");
            String dir[]=f.list();
           for(int i=0;i<dir.length;i++)
           p(dir[i]);
           }
    }
    
    public static void main(String rr[])throws IOException
    {
           Exercise2 ex=new Exercise2();
           BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
           System.out.println("Enter file name");
           String s=br.readLine();
           ex.analyze(s);
    }
}



