package com.capg.lab3;
//import com.google.common.primitives.Booleans; 

import java.util.Scanner;
import java.util.Arrays;

public class Exercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=sc.next();
		int count=0;
		int l=str.length();
		char[] a=new char[l];
		int[] ascii=new int[l];
		String[] b=new String[l];
		for(int i=0;i<l;i++) {
			a[i]=str.charAt(i);
		}
		for(int i=0;i<a.length;i++) {
			ascii[i]=(int) a[i];
		}
		for(int i=0;i<l-1;i++) {
			if(ascii[i]<ascii[i+1]) {
				b[i]="true";
			}
			else {
				b[i]="false";
			}
			}
		for(int i=0;i<l-1;i++) {
			if(b[i].contains("false")) {
				count++;
			}
			
		}
		if(count>0) {
			System.out.println("Not Positive String");
		}
		else {
			System.out.println("Positive String");
		}
		

}
}
