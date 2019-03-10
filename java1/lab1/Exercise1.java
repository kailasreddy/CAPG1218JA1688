import java.util.*;
class Divisible
{
static int calculateSum(int n)
{
	int sum=0;
	for(int i=1;i<=n;i++)
	{
	   if(i%3==0||i%5==0){
		   sum=sum+i;
	   }		   
	}
	return sum;
}
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int k=calculateSum(n);
System.out.println("sum of firse "+n+" natural numbers which are divisible 3 or 5 is: "+k);
}
}