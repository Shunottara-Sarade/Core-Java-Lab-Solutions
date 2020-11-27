package com.capg.lab10;

import java.util.Scanner;
interface factorial{
	Integer calculateFactorial(int n);
}

public class Exercise5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		factorial fact =(n)->{
			int m=1;
			if(n==0) {
				return m;
				
			}
			else if(n>=1) {
				for(int i=n;i>0;i--) {
					m=m*i;
				}
			}
			return m;
			
		};
		System.out.println("Enter a Number:");
		int n=sc.nextInt();
		System.out.println("Factorial of " + n + " = " + fact.calculateFactorial(n));

	}

}
