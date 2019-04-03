import java.util.*;
class A
{
public static void main(String args[])
{
	System.out.println("Enter number:");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int sum=0,temp=0;
	while(num!=0)
	{
		temp=num%10;
		System.out.println(temp);
		sum=sum+temp*temp*temp;
		num=num/10;
	}
	System.out.println("sum of the cubes of the number is:"+sum);
}
}