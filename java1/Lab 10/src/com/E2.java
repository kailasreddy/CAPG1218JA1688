package com;

import java.util.Scanner;
/**
 * @author kailas
 */
interface SplitString{
	public void sstring(String str);
}
public class E2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String input=sc.next();
		SplitString ss=(str)->{
		String[] s=str.split("");
		String result="";
		String a=" ";
		for(int i=0;i<s.length;i++) {
			result+=s[i]+a;
		}
		System.out.println(result);};
		ss.sstring(input);
		sc.close();

	}

}
