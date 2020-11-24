package com.capg.lab6;
import java.util.Scanner;
public class Exercise5 {
	


		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n,i;
			System.out.println("Enter the size of array");
			n=sc.nextInt();
			int a[]=new int[n];
			for(i=0;i<n;i++) {
				System.out.println("Enter the no.=");
				a[i]=sc.nextInt();
				
			}
			int x=getSecondSmallest(a);
			System.out.println("Second Smallest No.=" + x);

		}

		private static int getSecondSmallest(int[] arr) {
			int i,j,t,small;
			for(i=0;i<arr.length;i++) {
				for(j=i+1;j<arr.length;j++) {
					if(arr[i]>arr[j]) {
						t=arr[i];
						arr[i]=arr[j];
						arr[j]=t;				}
				}
			}
			small=arr[1];
			return small;
		}

	}

