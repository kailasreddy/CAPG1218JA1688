import java.util.*;
class A
{
/**
 * 
 * @author kailas
 *
 */
	public boolean check(String str){
		boolean b=true;
		for(int i=0;i<str.length()-1;i++)
		{
			if((int)str.charAt(i)<=(int)str.charAt(i+1))
			{
				b=true;
			}
			else
			{
				return false;
			}
	   }
	   return true;
	}
	
	public static void main(String args[])
	{
		System.out.println("Enter the String:");
		Scanner sc=new Scanner(System.in);
         String s=sc.next();
		 A a=new A();
         boolean b=a.check(s);	
         if(b)
		 {
			 System.out.println(s+" is a positive string");
		 }			 
		 else
		 {
			 System.out.println(s+" is a non-positive string");
		 }
		 
	}
}