package com.capg.training.lab5;

import java.util.Scanner;

class EmployeeSalaryException extends Exception{

    public EmployeeSalaryException(String messgge)
    {
        super(messgge);
        System.out.println(messgge);
    }
    
}
public class EmployeeSalaryTester {
    private static double minimumSalary=3000;
    public static boolean checkSalary(double salary) throws EmployeeSalaryException
    {
        if(salary<minimumSalary)
        {
        throw new EmployeeSalaryException("Salary is below minimum limit");
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter name and salary ");
        String name=sc.nextLine();
        double salary=sc.nextDouble();
        try{
        System.out.println("Employee name: "+name+" and salary: "+checkSalary(salary));
        }
        catch(EmployeeSalaryException ex)
        {
            ex.printStackTrace();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
}