package com.capg.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i,j,n;
		System.out.println("Enter the No. Elements:");
		n=sc.nextInt();
		int[] a=new int[n];
		for(i=0;i<n;i++) {
			System.out.println("Enter Elements:");
			a[i]=sc.nextInt();
		}
		int t=removeDuplicates(a,a.length);
		
		System.out.println("After removing duplicates:");
		for(i=0;i<t;i++) {
			System.out.println(a[i]);
		}
		for(i=0;i<t;i++) {
			for(j=i+1;j<t;j++) {
				if(a[i]<a[j]) {
					int k = a[i];
					a[i]=a[j];
					a[j]=k;
				}
			}
		}
		System.out.println("Descending order:");
		for(i=0;i<t;i++) {
			System.out.println(a[i]);
		}
		

	}


	private static int removeDuplicates(int[] a, int n) {
		int i,j,k;
		//j=0;
		int[] b=new int[n];
		j=0;
		Arrays.sort(a);
		for(i=0;i<n-1;i++) {
			if(a[i]!=a[i+1]) {
				b[j++]=a[i];
			}
		}
		b[j++]=a[n-1];
		// changing original array
		for(i=0;i<j;i++) {
			a[i]=b[i];
		}
		return j;
		
		
	}
}

