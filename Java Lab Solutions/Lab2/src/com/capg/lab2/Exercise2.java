package com.capg.lab2;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j,n;
		System.out.println("Enter the size:");
		n=sc.nextInt();
		sc.nextLine();
		String s[]=new String[n];
		for(i=0;i<s.length;i++) {
			System.out.println("Enter the Name:");
			s[i]=sc.nextLine();
		}
		Exercise2 obj=new Exercise2();
		obj.sortString(s);
		for(i=0;i<n;i++) {
			System.out.println(s[i]);
		}
		

	}

	private void sortString(String[] str) {
		// TODO Auto-generated method stub
		Arrays.sort(str);
		int mid;
		if(str.length%2!=0) {
			mid=(str.length/2)+1;
			
		}else {
			mid=str.length/2;
		}
		for(int i=0;i<str.length;i++) {
			if(i<mid) {
				str[i]=str[i].toUpperCase();
			}else {
				str[i]=str[i].toLowerCase();
			}
		}
		
		//return "0";
		
	}

}