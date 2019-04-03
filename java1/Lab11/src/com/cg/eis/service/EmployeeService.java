package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public interface EmployeeService {

	public String addEmployee(Employee e);
	public String findScheme(String Desg, double sal);
	public Employee getEmployee(int id);
}
