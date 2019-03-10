import java.util.*;
class Prime
{
public static void main(String args[])
{
int n;
boolean b=true;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(int i=2;i<=n/2;i++)
{
  if((n%i)==0)
  {
    b=false;
  }
}
if(b==true)
{ 
  System.out.println("Prime number");
}
else
{
  System.out.println("not a prime number");
}

}

}