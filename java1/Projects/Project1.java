import java.util.*;
class A
{
int Emp_No;
String Emp_Name;
String Join_Date;
char Desig_Code;
String Dept;
int Basic;
int HRA;
int IT;
public A(int Emp_No,String Emp_Name,String Join_Date,char Desig_Code,String Dept,int Basic,int HRA,int IT)
{
	this.Emp_No=Emp_No;
	this.Emp_Name=Emp_Name;
	this.Join_Date=Join_Date;
	this.Desig_Code=Desig_Code;
	this.Dept=Dept;
	this.Basic=Basic;
	this.HRA=HRA;
	this.IT=IT;
}
public String Desig(char l)
{
String s="";
switch(l)
{
	case 'e':
	  s="Engineer";
	  break;
	case 'c':
	    s="Consultant";
		break;
	case 'k':
	    s="Clerk";
		break;
	case 'r':
	     s="Receptionist";
		 break;
	case 'm':
	     s="Manager";
		 break;
}
return s;
}
public int DA(char s)
{
	int k=0;
switch(s)
{
	case 'e':
	   k=20000;
	   break;
	case 'c':
	    k=32000;
		break;
	case 'k':
	    k=12000;
		break;
	case 'r':
	     k=15000;
		 break;
	case 'm':
	     k=40000;
		 break;
}
return k;
}
}
class Project1
{
public static void main(String args[])
{
int n;
System.out.println("Enter number of Employers to store their data in database:");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
A ar[]=new A[n];
for(int i=0;i<n;i++)
{
	  ar[i]=new A(sc.nextInt(),sc.next(),sc.next(),sc.next().charAt(0),sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt());
}
System.out.println("Enter Employee number:");
int k=sc.nextInt();
for(int i=0;i<n;i++)
{
	if(ar[i].Emp_No==k)
	{
		System.out.println(ar[i].Emp_No+" ");
		System.out.println(ar[i].Emp_Name+" ");
		System.out.println(ar[i].Dept+" ");
		System.out.println(ar[i].Desig(ar[i].Desig_Code));
		int DA=ar[i].DA(ar[i].Desig_Code);
		int salary=ar[i].Basic+ar[i].HRA+DA-ar[i].IT;
		System.out.print(salary);
		
		
	}
}
}
}