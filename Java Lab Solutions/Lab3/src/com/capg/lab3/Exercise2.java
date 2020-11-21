package com.capg.lab3;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j;
		String original;
		System.out.println("Enter a String");
		original=sc.next();
		StringBuilder rev=getImage(original);
		System.out.println("Original and Mirror Image:");
		System.out.println(original + "|" + rev);

	}

	private static StringBuilder getImage(String original) {
		// TODO Auto-generated method stub
		StringBuilder input=new StringBuilder();
		input.append(original);
		input=input.reverse();
		return input;
	}

}
