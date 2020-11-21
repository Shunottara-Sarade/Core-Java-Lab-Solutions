package com.capg.lab1;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the first n number");
		n=sc.nextInt();
		long diff=calcultateDifference(n);
		System.out.println(diff);

	}

	private static long calcultateDifference(int n) {
		// TODO Auto-generated method stub
		int sq=0,sum=0,i,t=0;
		long total;
		for(i=1;i<=n;i++) {
			sum=sum+(i*i);
		}
		for(i=1;i<=n;i++) {
			sq=(sq+i);
			t=sq*sq;
			
		}
		total=t-sum;
		
		return total;
	}

}
