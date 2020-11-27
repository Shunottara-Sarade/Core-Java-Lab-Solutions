package com.cg.streamAPI.pl;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.cg.streamAPI.bean.Employee;
import com.cg.streamAPI.dao.EmployeeRepository;

public class EmployeeTester {

	public static void main(String[] args) {
		
		//Find out the sum of salary of all employees. 
		
		Double totalSal=EmployeeRepository.getEmployeeList()
				.stream()
				.collect(Collectors.summingDouble(Employee::getSalary));
		System.out.println("Total Salary = " + totalSal);
		
	//List employee name and duration of their service in months and days. 
		System.out.println("--------------------------------------");
		System.out.println("employee name and duration of their service in months and days");
		List<Employee> e1=EmployeeRepository.getEmployeeList();
		for (Employee employee : e1) {
			System.out.println(employee.getFirstname() + " : " + ChronoUnit.MONTHS.between(employee.getHiredate(), LocalDate.now()));
		}
		
		//Find departments with highest count of employees.
		System.out.println("-------------------------------------");
		System.out.println("departments with highest count of employees");
		Map<String, List<Employee>> map = EmployeeRepository.getEmployeeList()
				.stream()
				.collect(Collectors.groupingBy((employee)->employee
						.getDepartment().getDept_name()));
		int max = 0;
		String department ="";
		for (String string : map.keySet())
			if(map.get(string).size() > max) {
				max = map.get(string).size();
				department = string;
			}
		System.out.println(max);
		
		//List out department names and count of employees in each department.
		System.out.println("-----------------------------------");
		System.out.println("department names and count of employees in each department");
		Map<String, List<Employee>> list = EmployeeRepository.getEmployeeList()
				.stream()
				.collect(Collectors.groupingBy((t)->t.getDepartment().getDept_name()));
		for (String string : list.keySet()) {
			System.out.println(string + " : " + list.get(string).size());
		}
		
		//Find out the senior most employee of an organization. 
		System.out.println("-----------------------------------");
		System.out.println("the senior most employee of an organization.");
		Optional<Employee> old = EmployeeRepository.getEmployeeList()
				.stream()
				.collect(Collectors.minBy(Comparator.comparing(Employee::getHiredate)));
		System.out.println(old.get().getFirstname());
		
		//Find out employees without department.
		System.out.println("-----------------------------------");
		System.out.println("employees without department.");
		System.out.println("Employee without department");
		 EmployeeRepository.getEmployeeList()
		 .stream()
		 .filter((employee)->employee.getDepartment()
				 .getDept_name().equals(""))
		 .collect(Collectors.toList()).forEach(System.out::println);
		 
		 //Find out department without employees.
		 System.out.println("-----------------------------------");
		 System.out.println("department without employees.");
		 List<Employee> e = EmployeeRepository.getEmployeeList()
				 .stream()
				 .filter((employee)->employee.getDepartment()
						 .equals(null)).collect(Collectors.toList());
			System.out.println(e.size());
			
		//List employee name, hire date and day of week on which employee has started. 
			System.out.println("-----------------------------------");
			System.out.println("employee name, hire date and day of week on which employee has started.");
			List<Employee> people= EmployeeRepository.getEmployeeList();
			for (Employee employee : people) {
				System.out.print(employee.getFirstname() + " ");
				System.out.print(employee.getLastname() + " ");
				System.out.print(employee.getHiredate() + " ");
				System.out.print(employee.getHiredate().getDayOfWeek() + " ");
				System.out.println();
			}
			
			//List employee name, hire date and day of week for employee started on Friday.
			System.out.println("-----------------------------------");
			System.out.println("employee name, hire date and day of week for employee started on Friday.");
			List<Employee> listupdate=  EmployeeRepository.getEmployeeList().stream().filter((employee)->employee.getHiredate().getDayOfWeek().toString().equals("FRIDAY")).collect(Collectors.toList());

			
			System.out.println(listupdate.size());
			for (Employee employee : listupdate) {
				System.out.println(employee.getFirstname());
			}
			
			//List employee name, salary and salary increased by 15%.
			System.out.println("-----------------------------------");
			System.out.println("employee name, salary and salary increased by 15%.");
			List<Employee> emp=EmployeeRepository.getEmployeeList().stream().collect(Collectors.toList());
			for ( Employee employee : emp) {
				System.out.println("Name:"+employee.getFirstname()+" Salary hiked:"+employee.getSalary()*1.15);
			}
	}

}
