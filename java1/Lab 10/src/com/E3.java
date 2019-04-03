package com;

import java.util.Scanner;

/**
 * @author kailas
 */
interface auth{
	public boolean accept();
}
public class E3 {

	public static void main(String[] args) {
		
		String uname="Laxman";
		String pass="1234";
		auth a=()->{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter username: ");
			String name=sc.next();
			System.out.println("Enter password: ");
			String pass1=sc.next();
			sc.close();
			if(name.equals(uname))
				if(pass1.equals(pass))
					return true;
				else
					return false;
			else
				return false;
		};
		System.out.println(a.accept());

	}


}
