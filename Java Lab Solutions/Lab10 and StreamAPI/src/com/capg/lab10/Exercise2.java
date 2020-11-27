package com.capg.lab10;

import java.util.Scanner;

@FunctionalInterface
interface addSpace{
	String space(String s);
}
public class Exercise2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		addSpace sp= (s)->{
			 s=s.replaceAll(".", "$0 ");
			 return s;
		};
		System.out.println("Enter a string:");
		String s=sc.next();
		System.out.println("After adding Space string is :" +  sp.space(s));

	}

}
