package com;

import java.util.Scanner;

/**
 * @author kailas
 */
interface Sum{
	public int add(int a,int b);
}

public class E1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a=sc.nextInt();
		System.out.println("Enter another number: ");
		int b=sc.nextInt();
		Sum c=(x,y)->x+y;
		System.out.println(c.add(a, b));
		sc.close();
	}

}
