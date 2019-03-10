import java.util.*;
class Power
{
static boolean checkNumber(int k)
{
	if(k==0)
	  return false;
    while(k!=1)
	{
		if(k%2!=0)
		{
			return false;
		}
		k=k/2;
	}
	return true;
}
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
boolean b=checkNumber(n);
if(b==true)
{
	System.out.println(n+" is a power of 2");
}
else
{
	System.out.println(n+" is not a power of 2");
}

}
}