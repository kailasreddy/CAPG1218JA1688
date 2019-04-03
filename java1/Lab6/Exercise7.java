import java.util.*;
class Jobseeker
{
/**
 * 
 * @author kailas
 *
 */
	public static boolean pass(String s)
	{
	  int l=s.length();
	  String str=s.substring(l-4);
      if(str.equals("_job"))
	  {
		  String str1=s.substring(0,l-4);
		  if(str1.length()>=8)
		  {
			  return true;
		  }
		  else
		  {
			  return false;
		  }
		  
	  }
	  else
	  {
		  return false;
	  }
	}
 public static void main(String args[])
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter your username:");
	 String str=sc.next();
	 if(pass(str))
	 {
		 System.out.println("valid username");
	 }
	 else
	 {
		 System.out.println("invalid username");
	 }
 }
}