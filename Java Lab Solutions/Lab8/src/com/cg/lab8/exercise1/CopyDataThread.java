package com.cg.lab8.exercise1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.LocalTime;

public class CopyDataThread {
	FileInputStream fip;
	FileOutputStream fout;
	
	public CopyDataThread(FileInputStream fip,FileOutputStream fout) {
		super();
		this.fip=fip;
		this.fout=fout;
	}
	public void run() {
		int a;
		int count=0;
		try {
			while(!((a=fip.read())<0)) {
				char c=(char) a;
				fout.write(c);
				count++;
				if(count==10) {
					System.out.println("10 characters are copied at time : " + LocalTime.now());
					//System.out.println(fout);
					count=0;
					//System.out.println();
					Thread.sleep(5000);
				}
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

