package com.capg.lab10;
import java.util.Scanner;
@FunctionalInterface
interface MyInterfaces{
	void display();
}

public class EmployeeEx4 {
	Integer emp_id;
	String ename;
	

	
	public EmployeeEx4(Integer emp_id, String ename) {
		super();
		this.emp_id = emp_id;
		this.ename = ename;
	}


	public Integer getEmp_id() {
		return emp_id;
	}


	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}
	public void myMethod() {
		System.out.println("Employee id :"+this.emp_id);
		System.out.println("Employee Name:"+this.ename);
	}


	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter emp id:");
		int id=sc.nextInt();
		System.out.println("Enter emp name:");
		String ename=sc.next();
		EmployeeEx4 obj=new EmployeeEx4(id,ename);
		MyInterfaces ref=obj :: myMethod;
		ref.display();
		
		
		
		
		
		

	}

}
