package com.capg.lab1;

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
	       boolean flag = false;
	        
	       //2
	       Scanner scanner = new Scanner(System.in);
	        
	       //3
	       System.out.println("Enter a number : ");
	       num = scanner.nextInt();
	        
	       //4
	       int currentDigit = num % 10;
	       num = num/10;
	        
	       //5
	       while(num>0){
	           //6
	           if(currentDigit <= num % 10){
	               flag = true;
	               break;
	           }

	           currentDigit = num % 10;
	           num = num/10;
	       }
	        
	       //7
	       if(flag){
	           System.out.println("Digits are not in increasing order.");
	       }else{
	           System.out.println("Digits are in increasing order.");
	       }

	}

}
