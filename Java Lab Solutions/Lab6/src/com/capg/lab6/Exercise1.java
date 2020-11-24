package com.capg.lab6;

//import java.awt.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		HashMap<Integer,String> hm = new HashMap<Integer,String>(); 
		int n;
		//int i=1;
		String str = null;
		System.out.println("Enter size of map:");
		n=sc.nextInt();
		for(int i=1;i<=n;i++ ) {
			System.out.println("Enter the value of index :"+ i);
			str=sc.next();
			hm.put(i,str);
		}
		Map<Integer,String> hm1 = sortByValue(hm); 
		
		// print the sorted hashmap 
        for (Map.Entry<Integer,String> en : hm1.entrySet()) { 
            System.out.println("Key = " + en.getKey() +  
                          ", Value = " + en.getValue()); 
        } 
		
		
	}


	private static HashMap<Integer, String> sortByValue(HashMap<Integer, String> hm) 
	{
		
		List <Map.Entry <Integer,String> > list = 
	               new LinkedList<Map.Entry<Integer,String> >(hm.entrySet()); 
	  
	        // Sort the list 
	        Collections.sort(list, new Comparator<Map.Entry<Integer,String > >() { 
	            public int compare(Map.Entry<Integer,String> o1,  
	                               Map.Entry<Integer,String> o2) 
	            { 
	                return (o1.getValue()).compareTo(o2.getValue()); 
	            } 
	        }); 
	          
	        // put data from sorted list to hashmap  
	        HashMap<Integer,String> temp = new LinkedHashMap<Integer,String>(); 
	        for (Map.Entry<Integer,String> aa : list) { 
	            temp.put(aa.getKey(),aa.getValue()); 
	        } 
	        return temp; 
	}

}
