class A
{
	int k;
//final int b=12;
public A(int k)
{
	System.out.println("parameterized constructor called");
	this.k=k;
}
}
class Test
{
int a;
public static void main(String args[])
{
//A obj=new A();   constructor A in class A cannot be applied to given types;
//obj.b=14; cannot assign a value to final variable b
A obj=new A(12);
}
}
