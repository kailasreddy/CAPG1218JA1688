import java.util.*;
class C
{
	public static int[] convert(int[] ar)
	{
		int length=ar.length;
		StringBuilder[] b=new StringBuilder[length];
		String s="";
		for(int i=0;i<length;i++)
		{
			s=Integer.toString(ar[i]);
              b[i]=new StringBuilder(s);
			 b[i].reverse();
			ar[i]=Integer.valueOf(b[i].toString());
		}
		
		int k=0;
		int min=0;
		for(int i=0;i<length-1;i++)
		{
		    min=ar[i];
			k=i;
			for(int j=i+1;j<length;j++)
			{
				if(min>ar[j])
				{
					min=ar[j];
					k=j;
				}
			}
			int temp=ar[i];
			ar[i]=ar[k];
			ar[k]=temp;
		}
		return ar;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=10;
		int[] ar=new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		int[] a=convert(ar);
		System.out.println();
		for(int i=0;i<10;i++)
		{
			System.out.println(a[i]);
		}
	}
}