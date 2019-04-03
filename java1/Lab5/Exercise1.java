package com;

import java.util.Scanner;

/**
 * 
 * @author kailas
 *
 */

class E1 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Red or Yellow or Green to check Signal");
		String str=sc.nextLine();
		sc.close();
		switch(str) {
		case "Red": 
			System.out.println("Stop");
		    break;
		case "Yellow":
			System.out.println("Ready");
            break;
		case "Green":
			System.out.println("Go");
            break;
        default: 
        	System.out.println("Wrong Choice");
		}
		
	}

}
