package com.capg.lab10;

import java.util.Scanner;

@FunctionalInterface
interface MyInterface{
	int power(int x,int y);
	
}
public class Exercise1 {
	
	public static void main(String[] args) {
		MyInterface ref = (x,y) -> {
			int mul=1;
			if(y<1) {
				return mul;
			}
			else if(y>=1) {
			for(int i=1;i<=y;i++) {
				mul=mul*x;
			}
			}
			return mul;
			
		
		};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first value:");
		int x=sc.nextInt();
		System.out.println("Enter second value:");
		int y=sc.nextInt();
		System.out.println(y + "power of" + x + "=" + ref.power(x,y));
		

	}

}
