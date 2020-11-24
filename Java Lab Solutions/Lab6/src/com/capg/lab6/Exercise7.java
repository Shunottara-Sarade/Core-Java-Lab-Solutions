package com.capg.lab6;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter an array size:");
		n=sc.nextInt();
		Integer[] list=new Integer[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter an Element No.  "+ i);
			list[i]=sc.nextInt();
		}
		getSorted(list);
		System.out.println("Sorted elements after reversing:");
		
		for(Integer m :list) {
			System.out.println(m);
		}
		
	}

	private static void getSorted(Integer[] list) {
		String[] revNumbers=new String[list.length];
		for(int i=0;i<list.length;i++) {
			
			revNumbers[i]= list[i].toString();
			StringBuffer sb=new StringBuffer(revNumbers[i]);
			revNumbers[i]=sb.reverse().toString();
			list[i]=Integer.parseInt(revNumbers[i]);
			
		}
		Arrays.sort(list);
		
		
	}

}
