package com;

import java.util.Scanner;

/**
 * 
 * @author kailas
 *
 */

class EmployeeException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmployeeException(String s) {
		super(s);
	}
}

public class E6 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Salary of Employee");
		double salary=sc.nextDouble();
		sc.close();
		try {
			if(salary<3000)
				throw new EmployeeException("Fine");
			else
				System.out.println("Salary : "+salary);
		}catch(EmployeeException e) {
			System.out.println("Salary is less than 3000.");
		}
	}

}
