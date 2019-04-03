import java.util.*;
class CharacterCount
{
	public void  convert(char[] ar)
	{
		int length=ar.length;
		Outer:
		for(int i=0;i<length;i++)
		{
           for(int k=0;k<i;k++)
		   {
			   if(ar[k]==ar[i])
			   {
				   continue Outer;
			   }
		   }
		   int count=0;
		   for(int j=0;j<10;j++)
		   {
			   if(ar[i]==ar[j])
			   {
				 count++;
			   }
		   }
		   System.out.println(ar[i]+" "+count+" times repeated");
		}
	}
	public static void main(String args[])
	{
		char[] a={'A','B','D','A','A','E','D','D','B','A'};
		CharacterCount c=new CharacterCount();
		c.convert(a);
		
	}
}