package com.capg.lab1;

import java.util.Scanner;

public class Exercise8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to  check power of 2 or not:");
		int n=sc.nextInt();
		  System.out.println(powerOf2(n));
		 }
		 
		 private static boolean powerOf2(int number){
		  if(number<=0){
		   return false;
		  }
		   
		  while(number > 1){
		   if(number % 2 != 0){
		    return false;
		   }
		   number = number / 2;
		  }
		  return true;
		 }

}
