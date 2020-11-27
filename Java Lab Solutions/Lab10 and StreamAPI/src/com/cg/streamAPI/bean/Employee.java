package com.cg.streamAPI.bean;

import java.time.LocalDate;

public class Employee {
private Integer Empid;
private String firstname;
private String lastname;
private String email;
private String phone;
private LocalDate hiredate;
private String designation;
private double salary;
private Integer Manager_Id;
private Department department;
public static final int INIT_ID=1;
private static int autogen;

static {
	autogen=INIT_ID;
}

public Employee( String firstname, String lastname, String email, String phone, LocalDate hiredate,
		String designation, double salary, Integer manager_Id, Department department) {
	super();
	Empid = autogen++;
	this.firstname = firstname;
	this.lastname = lastname;
	this.email = email;
	this.phone = phone;
	this.hiredate = hiredate;
	this.designation = designation;
	this.salary = salary;
	Manager_Id = manager_Id;
	this.department = department;
}
public Integer getEmpid() {
	return Empid;
}
public void setEmpid(Integer empid) {
	Empid = empid;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public LocalDate getHiredate() {
	return hiredate;
}
public void setHiredate(LocalDate hiredate) {
	this.hiredate = hiredate;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public Integer getManager_Id() {
	return Manager_Id;
}
public void setManagerId(Integer manager_Id) {
	Manager_Id = manager_Id;
}
public Department getDepartment() {
	return department;
}
public void setDepartment(Department department) {
	this.department = department;
}
@Override
public String toString() {
	return "Employee [Empid=" + Empid + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
			+ ", phone=" + phone + ", hiredate=" + hiredate + ", designation=" + designation + ", salary=" + salary
			+ ", Manager_Id=" + Manager_Id + ", department=" + department + "]";
}

}
