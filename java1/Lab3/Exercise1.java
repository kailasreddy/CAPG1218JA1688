import java.util.*;
class A
{
public static int getSecondSmallest(int ar[])
{
	int l=ar.length;
	int k=0,small=0;
	for(int i=0;i<l-2;i++)
	{
		 small=ar[i];
	      k=i;
		for(int j=i+1;j<l;j++)
		{
			if(small>ar[j])
			{
				small=ar[j];
			  k=j; 
			}
		}
		int temp=0;
		temp=ar[i];
		ar[i]=ar[k];
		ar[k]=temp;
	}
	int count=1;
	int min=0;
	for(int i=0;i<10;i++)
	{
	   if(count==2)
	   {
		  min=ar[i];
	   }
	   count++;
	}
	return min;
}
public static void main(String args[])
{
int[] ar=new int[10];
Scanner sc=new Scanner(System.in);
for(int i=0;i<10;i++)
{
	ar[i]=sc.nextInt();
}
int sm=getSecondSmallest(ar);
System.out.println("Second smallest element in the array is:"+sm);
}
}