package com.capg.lab1;
import java.util.Scanner;
public class Exercise5 {
	private static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		long sum=calculateSum(n);
		System.out.println("Sum="+sum);
		

	}

	private static long calculateSum(int n) {
		// TODO Auto-generated method stub
		long sum=0;
		int i;
		for(i=0;i<n;i++) {
			if(i%3==0 || i%5==0) {
				sum=sum+i;
			}
		}
		return sum;
	}

}
