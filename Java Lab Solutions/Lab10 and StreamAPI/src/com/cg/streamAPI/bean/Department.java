package com.cg.streamAPI.bean;
public class Department {
private Integer Dept_id;
private String Dept_name;
private Integer Manager_id;
public Department(Integer dept_id, String dept_name, Integer manager_id) {
	super();
	Dept_id = dept_id;
	Dept_name = dept_name;
	Manager_id = manager_id;
}
public Integer getDept_id() {
	return Dept_id;
}
public void setDept_id(Integer dept_id) {
	Dept_id = dept_id;
}
public String getDept_name() {
	return Dept_name;
}
public void setDept_name(String dept_name) {
	Dept_name = dept_name;
}
public Integer getManager_id() {
	return Manager_id;
}
public void setManager_id(Integer manager_id) {
	Manager_id = manager_id;
}

}
