package com.cg.eis.bean;

public class EmployeeScheme {

	public String find(String desg, double sal) {
		if((sal>5000 && sal<20000) && desg.equals("System Associate")) {
			return "Scheme C";
		}
		else if((sal>=20000 && sal<40000) && desg.equals("Programmer")) {
			return "Scheme B";
		}
		else if(sal>=40000 && desg.equals("Manager")) {
			return "Scheme A";
		}
		else if(sal<5000 && desg.equals("Clerk")) {
			return "No Scheme";
		}
		else
			return null;
		
		
	}
}
