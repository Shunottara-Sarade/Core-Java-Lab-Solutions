package com.capg.lab4.exercise2.eis.pl;

import com.capg.lab4.exercise2.eis.bean.Employee;
import com.capg.lab4.exercise2.eis.service.EmployeeService;
import com.capg.lab4.exercise2.eis.service.EmployeeServiceImpl;

public class EISDemo {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		EmployeeService emp = new EmployeeServiceImpl(); 
		emp.getEmployeeDetails(e1);
		System.out.println("Insurance Scheme : "+emp.findInsuranceScheme(e1));
		emp.showEmployeeDetails(e1);
	}

}
