import java.util.*;
class MyException extends Exception
{
	public MyException(String s)
	{
	super(s);
	}
}
class ABC
{
	public static void main(String args[])
	{
/**
 * 
 * @author kailas
 *
 */

		Scanner sc=new Scanner(System.in);
		try
		{
		  int age=sc.nextInt();
		  if(age<15)
		  {
			  throw new MyException("age of a person should be above 15");
		  }
		  else
		  {
			  System.out.println("valid age");
		  }
		}
		catch(MyException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}