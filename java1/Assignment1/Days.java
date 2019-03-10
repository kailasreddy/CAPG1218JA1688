import java.util.*;
class Days
{
public static void main(String args[])
{
String s="";
int year;
Scanner sc=new Scanner(System.in);
s=sc.next();
year=sc.nextInt();
switch(s)
{
case "January":
    System.out.println("31 days");
	break;
case "February":
     if(year%4==0)
     {
		 System.out.println("28 days");
	 }
	 else
	 {
		 System.out.println("29 days");
	 }
	 break;
case "March":
     System.out.println("31 days");
	 break;
case "April":
      System.out.println("30 days");
     break;
case "May":
      System.out.println("31 days");
     break;
case "June":
      System.out.println("30 days");
     break;
case "July":
      System.out.println("31 days");
      break;
case "August":
      System.out.println("31 days");
     break;
case "September":
       System.out.println("30 days");
	   break;
case "October":
       System.out.println("31 days");
	   break; 
case "November":
       System.out.println("30 days");
	   break;
case "December":
       System.out.println("31 days");
	   break;
	 
}

}
}