import java.util.*;
class Bubble
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  int n;
  n=sc.nextInt();
  int ar[]=new int[n];
  for(int i=0;i<n;i++)
  {
	  ar[i]=sc.nextInt();
  }
  for(int i=0;i<n-1;i++)
  {
	  for(int j=0;j<n-i-1;j++)
      {
		  if(ar[j]>ar[j+1])
		  {
			  int temp=ar[j];
			  ar[j]=ar[j+1];
			  ar[j+1]=temp;
		  }
	  }
  }
   for(int i=0;i<n;i++)
   {
	   System.out.println(ar[i]);
   }
  
  
  
}
}