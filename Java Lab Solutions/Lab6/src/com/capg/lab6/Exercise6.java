package com.capg.lab6;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Exercise6 {

	public static void main(String[] args) throws ParseException {
		HashMap<Integer,Integer> people=new HashMap<>();
		Exercise6 ex=new Exercise6();
//		people.put(101, "12-10-1990");
//		people.put(102, "17-02-2012");
//		people.put(103, "20-01-2000");
//		people.put(104, "01-01-1988");
//		people.put(105, "30-04-1999");
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter No. of Voters:");
		n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter id:");
			Integer id=sc.nextInt();
			System.out.println("Enter Date of Birth:");
			System.out.println("Enter Day:");
			int day=sc.nextInt();
			System.out.println("Enter Month:");
			int mon=sc.nextInt();
			System.out.println("Enter Year:");
			int yr=sc.nextInt();
			LocalDate birthday = LocalDate.of(yr, mon, day);
			LocalDate today = LocalDate.now();
			Period p = Period.between(birthday, today);
			int year=p.getYears();
			people.put(id, year);
		}
		
		 System.out.println("Eligible Voters id are:");
		System.out.println(ex.getVoterList(people));
		
	}
	
	public List<Integer> getVoterList(HashMap<Integer, Integer> people){
		 List<Integer> list=new ArrayList<>() ;
		 Set<Integer> set=people.keySet();
		 for(Integer m:set) {
			 Integer age=people.get(m);
			 if(age>=18) {
				 list.add(m); 
			 }
			 
		 }
		 
		
		
		 
		return list;
		
		
	}

	
}
