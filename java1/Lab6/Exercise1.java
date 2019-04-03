import java.util.StringTokenizer;
class A
{
/**
 * 
 * @author kailas
 *
 */
public static void main(String args[])
{
StringTokenizer str=new StringTokenizer("1 2 3 4 5 6 7 8 9 10"," ");
String s=null;
int sum=0;
int a=0;
while(str.hasMoreTokens())
{
	s=str.nextToken();
	 a=Integer.parseInt(s);
	System.out.print(a);
	 /*for(int i=0;i<s.length();i++)
	 {
      System.out.print(s.charAt(i));
	 }*/
	 System.out.println();
      sum=sum+a;	  
}
System.out.println(sum);


}
}