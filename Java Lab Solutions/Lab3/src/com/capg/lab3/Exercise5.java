package com.capg.lab3;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a paragraph or sentences:");
		String str=sc.nextLine();
		int lineCount = 0;
		int wordCount = 0;
		int charCount = 0;
		while(sc.hasNextLine()) {
		  // read a line from the input file
		  //String line = sc.nextLine();

		  // increment line count
		  lineCount++;

		  // split line into words and increment word count
		  String str1 [] = str.split((" "));
		  for ( int i = 0; i <str1.length ; i ++) {
		    if (str1 [i].length() > 0) {
		      wordCount ++; 
		    }
		  }

		  // increment char count
		  charCount += (str.length());
		}
		System.out.println("Line Count:"+ lineCount );
		System.out.println("Character Count:"+ charCount);
		System.out.println("Word Count:"+ wordCount);
	}

}
