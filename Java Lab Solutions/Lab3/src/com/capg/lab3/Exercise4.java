package com.capg.lab3;

import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter a Number:");
		n=sc.nextInt();
		int t=modifyNumber(n);
		System.out.println("New Digits are: "+ t);
		
	}

	private static int modifyNumber(int n) {
		// TODO Auto-generated method stub
		
		String str=Integer.toString(n);
		int l=str.length();
		char[] a=new char[l];
		for(int i=0;i<l;i++) {
			a[i]=str.charAt(i);
		}
		int[] b=new int[l];
		for(int i=0;i<l;i++) {
			b[i]=Integer.parseInt(String.valueOf(a[i]));
		}
		for(int i=0;i<b.length-1;i++) {
			b[i]=Math.abs(b[i]-b[i+1]);
		}
		StringBuilder sb=new StringBuilder();
		for(int j:b) {
			sb.append(j);
		}
		int  z=Integer.parseInt(sb.toString());
		
		return z;
	}

}
