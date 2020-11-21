package com.capg.lab3;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("Enter a string:");
		str=sc.next();
		String t=alterString(str.toCharArray());
		System.out.println("Original String: " + str);
		System.out.println("Alter String: "+ t);
		

	}
	static Boolean isVowel(char ch) {
		if(ch!='a' && ch!='A' && ch!='e' && ch!='E'
				&& ch!='i' && ch!='I' && ch!='o' && ch!='O'
				&& ch!='u' && ch!='U') {
			return false;
		}
		return true;
	}

	private static String alterString(char[] s) {
		// TODO Auto-generated method stub
		for(int i=0;i<s.length;i++) {
			if(!isVowel(s[i])){
				if(s[i]=='z') {
					s[i]='b';
				}
				else if(s[i]=='Z') {
					s[i]='Z';
				}
				
			
			else {
				s[i]=(char)(s[i]+1);
				if(isVowel(s[i])) {
					s[i]=(char)(s[i]+1);
				}
			
			}
			
		}
		}
		
		
		return String.valueOf(s);
	}

}
