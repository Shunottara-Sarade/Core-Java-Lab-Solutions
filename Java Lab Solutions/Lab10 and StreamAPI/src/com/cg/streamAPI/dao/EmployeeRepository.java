package com.cg.streamAPI.dao;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import com.cg.streamAPI.bean.Department;
import com.cg.streamAPI.bean.Employee;

public class EmployeeRepository {

	private static List<Employee> employeeList;

	static {
		prepareEmployeeList();
	}

	private static void prepareEmployeeList() {
		employeeList = new ArrayList<>();
		Department d1 = new Department(1, "Computer", 1);
		employeeList.add(
				new Employee("Tanmay", "Bhardwaj", "xyz", "744258", LocalDate.of(20, 02, 03), "CEO", 5000, 01, d1));
		Department d2 = new Department(2, "Entc", 2);
		employeeList.add(
				new Employee("Hutesh", "Mahajan", "abc", "12345", LocalDate.of(20, 03, 04), "Manager", 11000, 02, d2));
		Department d3 = new Department(3, "", 3);
		employeeList.add(
				new Employee("Anant", "Chansarkar", "edr", "65453", LocalDate.of(2020, 02, 07), "Peun", 4000, 03, d3));
		

	}
	
	public static List<Employee> getEmployeeList() {
		return employeeList;
	}
}
