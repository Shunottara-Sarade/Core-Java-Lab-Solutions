package com.capg.lab6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter an array size:");
		n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter an Elements:");
			a[i]=sc.nextInt();
		}
		
		HashMap<Integer,Integer> hm=getSquares(a);

		Iterator<Integer> it=hm.keySet().iterator();
		while(it.hasNext()) {
			Integer key=it.next();
			System.out.println(key + " : "+hm.get(key));
		}
	}

	private static HashMap<Integer, Integer> getSquares(int[] a) {
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int j :a) {
			map.put(j,j*j);
		}
		return map;
	}

	

}
