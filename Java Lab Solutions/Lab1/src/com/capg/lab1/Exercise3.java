package com.capg.lab1;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);

        int n, t1 = 0, t2 = 1;
        System.out.println("Enter the range:");
        n=sc.nextInt();
        
        System.out.print("First " + n + " terms: ");

        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1+" ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}


