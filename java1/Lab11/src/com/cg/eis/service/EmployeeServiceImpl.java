package com.cg.eis.service;

import java.util.ArrayList;
import java.util.List;

import com.cg.eis.bean.Employee;
import com.cg.eis.bean.EmployeeScheme;

public class EmployeeServiceImpl implements EmployeeService {

	List<Employee> l=new ArrayList<Employee>();
	@Override
	public String addEmployee(Employee e) {
		l.add(e);
		return "Employee added";
	}

	@Override
	public String findScheme(String Desg, double sal) {
		EmployeeScheme es=new EmployeeScheme();
		return es.find(Desg, sal);
	}

	@Override
	public Employee getEmployee(int id) {
		for(Employee i:l) {
			if(i.getId()==id) {
				return i;
			}
		}
		return null;
	}

}
