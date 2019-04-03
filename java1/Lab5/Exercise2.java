import java.util.*;
class A
{
/**
 * 
 * @author kailas
 *
 */
	public static int nonRec(int k)
	{
		int a=0;
		int b=1;
		int c=0;
		int count=2;
		while(count<=k)
		{
		   c=a+b;
		  if(count==k)
		  {
			  return c;
		  }
           a=b;
		   b=c;
		  count=count+1;
		}
		return 0;
	}
	public static int rec(int k,int a,int b,int c,int count)
	{
		while(count<=k)
		{
			c=a+b;
			if(count==k)
			{
				return c;
			}
			a=b;
			b=c;
			count=count+1;
			return rec(k,a,b,c,count);
		}
		return 0;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int k=sc.nextInt();
		System.out.println("1.Non Recursive Method 2.Recursive Method:");
		int j=sc.nextInt();
		if(j==1)
		{
			int fi=nonRec(k);
			System.out.println(fi);
		}
		if(j==2)
		{
			int a=0, b=1, c=0,count=2;
			int fi=rec(k,a,b,c,count);
			System.out.println(fi);
		}
	}
}