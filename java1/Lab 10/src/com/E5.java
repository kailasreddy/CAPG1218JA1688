package com;

import java.util.Scanner;

/**
 * @author kailas
 */
interface Fact{
	public int cal(int num);
}
public class E5 {

	public int factorial(int num) {
		int temp=1;
		while(num>0) {
			temp=temp*num;
			num--;
		}
		return temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fact f=new E5()::factorial;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int num=sc.nextInt();
		System.out.println(f.cal(num));
		sc.close();
	}

}
