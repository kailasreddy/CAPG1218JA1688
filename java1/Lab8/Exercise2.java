import java.util.*;
import java.time.LocalTime;
import java.util.Timer;
import java.util.TimerTask;
class A implements Runnable{
	public void run()
	{
		while(true)
		{
		System.out.println(LocalTime.now());
		try
		{
			Thread.sleep(10000);
		}
		catch(Exception e)
		{
			System.out.println("Exception ocuur");
		}
		
		}
	}
}
class B
{
public static void main(String args[])
{
	A a=new A();
	Thread t=new Thread(a);
	t.start();
}
}