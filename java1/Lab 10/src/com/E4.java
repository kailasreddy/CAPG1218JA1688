package com;
/**
 * @author kailas
 */
interface Sum1{
	public int add(int a, int b);
}
public class E4 {

	public int sum(int a,int b) {
		return a+b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum1 s=new E4()::sum;
		int a=10;
		int b=20;
		System.out.println(s.add(a, b));
		
	}

}
