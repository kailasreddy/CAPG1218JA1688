import java.util.*;
class A
{
/**
 * 
 * @author kailas
 *
 */
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int a=sc.nextInt();
		boolean b=false;
		for(int i=2;i<=a;i++)
		{
			b=true;
			for(int j=2;j<i/2;j++)
			{
				if(i%j==0)
				{
					b=false;
				}
			}
			if(b==true)
			{
				System.out.println(i);
			}
		}
		
	}
}