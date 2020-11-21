package com.capg.lab1;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a choice ");
		System.out.println("---------------");
		System.out.println("1. red");
		System.out.println("2. yellow");
		System.out.println("3. Green");
		
		String ch;
		ch=sc.next();
		//ig=ch.equalsIgnoreCase();
		
		switch(ch) {
		case "red" :
			System.out.println("Stop");
			break;
		case "yellow" :
			System.out.println("Ready");
			break;
		case "green" :
			System.out.println("Go");
			break;
		default:
			System.out.println("Enter a valid choice:");
		
		}

	}

}
