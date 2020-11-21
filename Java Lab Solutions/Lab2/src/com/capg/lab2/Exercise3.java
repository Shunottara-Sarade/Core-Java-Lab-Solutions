package com.capg.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i,j,n;
		System.out.println("Enter No. of Elements:");
		n=sc.nextInt();
		int[] arr=new int[n];
		for(i=0;i<n;i++) {
			System.out.println("Enter Numbers:");
			arr[i]=sc.nextInt();
			
		}
		reverse(arr,arr.length);
		

	}

	private static void reverse(int[] arr, int n) {
		// TODO Auto-generated method stub
		int[] b=new int[n];
		int j=n;
		for(int i=0;i<n;i++) {
			b[j-1]=arr[i];
			j=j-1;
		}
		System.out.println("Reversed Array:");
		for(int i=0;i<n;i++) {
			System.out.println(b[i]);
		}
		
		Arrays.sort(b);
		System.out.println("Sorted Array after Reversing:");
		for(int i=0;i<n;i++) {
			System.out.println(b[i]);
		}
		
	}

}
