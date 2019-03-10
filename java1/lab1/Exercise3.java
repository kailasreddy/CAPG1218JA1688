import java.util.*;
class Increase
{
static boolean checkNumber(int n)
{
	int k=0;
	int j=0;
	int l=n;
	for(int i=0;i<10;i++)
	{
		if(n==i)
		{
			return false;
		}
	}
	while(n!=0)
	{
		if(n==l)
		{
			k=n%10;
			n=n/10;
		}
		else
		{
			j=n%10;
			if(j>k)
			{
				return false;
			}
			n=n/10;
			k=j;
		}
		
		
	}
	return true;
}
public static void main(String args[])
{
 int n;
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
 if(checkNumber(n))
 {
	 System.out.println(n+" is an increasing number");
 }
 else
 {
	 System.out.println(n+" is not an increasing number");
 }
}
}