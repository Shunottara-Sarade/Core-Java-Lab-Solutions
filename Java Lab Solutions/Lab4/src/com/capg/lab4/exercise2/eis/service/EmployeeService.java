package com.capg.lab4.exercise2.eis.service;

import com.capg.lab4.exercise2.eis.bean.Employee;

public interface EmployeeService {
	
	public abstract void getEmployeeDetails(Employee emp);
	public abstract String findInsuranceScheme(Employee emp);
	public abstract void showEmployeeDetails(Employee emp);
	
}
