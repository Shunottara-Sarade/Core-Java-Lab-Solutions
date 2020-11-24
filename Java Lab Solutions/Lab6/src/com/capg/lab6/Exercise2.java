package com.capg.lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=sc.next();
		countChars(str);

	}

	private static void countChars(String inputString) {
		// TODO Auto-generated method stub
		  HashMap<Character, Integer> charCountMap 
          = new HashMap<Character, Integer>(); 

      // Converting given string to char array 

      char[] strArray = inputString.toCharArray(); 

      // checking each char of strArray 
      for (char c : strArray) { 
          if (charCountMap.containsKey(c)) { 

              // If char is present in charCountMap, 
              // incrementing it's count by 1 
              charCountMap.put(c, charCountMap.get(c) + 1); 
          } 
          else { 

              // If char is not present in charCountMap, 
              // putting this char to charCountMap with 1 as it's value 
              charCountMap.put(c, 1); 
          } 
      } 

      // Printing the charCountMap 
      for (Map.Entry entry : charCountMap.entrySet()) { 
          System.out.println(entry.getKey() + " " + entry.getValue()); 
      } 
	}

}
