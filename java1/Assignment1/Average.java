import java.util.*;
class Average
{
static double average(int ar[],int b)
{
	double sum=0;
	double average=0;
  for(int i=0;i<b;i++)
  {
	  sum=sum+ar[i];
  }
  average=sum/b;
  return average;
  
}
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int ar[]=new int[n];
for(int i=0;i<n;i++)
{
	ar[i]=sc.nextInt();
}
System.out.println(average(ar,n));
}
}