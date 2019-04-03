import java.util.*;
class B
{
	public static StringBuilder[] convert(String str[],int n)
	{
		StringBuilder[] s=new StringBuilder[n];
		int mn=0;
		String sb="";
		if(n%2==0)
		{
		for(int i=0;i<n/2;i++)
		{   
			sb=str[i].toString().toUpperCase();
			s[mn]=new StringBuilder(sb);
			mn++;
		}
		for(int i=n/2;i<n;i++)
		{   sb=str[i].toString().toLowerCase();
			s[mn]=new StringBuilder(sb);
			mn++;
		}
		}
		else
		{
		 mn=0;
		for(int i=0;i<n/2+1;i++)
		{
			sb=str[i].toString().toUpperCase();
			s[mn]=new StringBuilder(sb);
			mn++;
		}
		for(int i=n/2+1;i<n;i++)
		{
			sb=str[i].toString().toLowerCase();
			s[mn]=new StringBuilder(sb);
			mn++;
		}
		}
		return s;
	}
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of string array:");
		n=sc.nextInt();
		String[] str=new String[n];
		for(int i=0;i<n;i++)
		{
			str[i]=sc.next();
		}
		 StringBuilder[] s1=convert(str,n);
		 for(int i=0;i<n;i++)
		 {
			 System.out.println(s1[i]);
		 }
	}
}