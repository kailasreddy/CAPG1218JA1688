import java.util.*;
class MyException extends Exception
{
	public MyException(String s)
	{
		super(s);
	}
	
}
class A
{
/**
 * 
 * @author kailas
 *
 */
	public static void main(String args[])
	{
		String fname="reddy";
		String lname=null;
		/*Scanner sc=new Scanner(System.in);
		fname=sc.next();
		lname=sc.next();*/
		try
		{
		if(fname==null)
		{
			throw new MyException("first name should not be blank");
		}
		if(lname==null)
		{
			throw new MyException("last name should not be blank");
		}
		}
		catch(MyException ex)
		{
			System.out.println(ex.getMessage());
		}
		
		
		
	}
}