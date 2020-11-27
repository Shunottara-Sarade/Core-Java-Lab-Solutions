package com.cg.lab9;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String userName;
		System.out.println("Enter Your UserName end with Job: ");
		userName=sc.next();
		String[] name=userName.split("Job");
		Boolean b=validateUser(name,userName);
		
		if(b==true) {
			System.out.println("Valid User : " + userName);
		}
		else {
			System.out.println("Invalid : Write proper userName");
		}
		

	}

	private static boolean validateUser(String[] name, String userName) {
		String n=name[0];
		if(n.length()>=8 &&  userName.endsWith("Job") ) {
			return true;
		}
		return false;
		
		
		
	}

}
