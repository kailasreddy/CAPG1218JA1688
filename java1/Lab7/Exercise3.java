import java.util.*;
class Kailas
{
/**
 * 
 * @author kailas
 *
 */
 public static HashMap<Integer,Integer>  getSquares(int a[])
 {
	 HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
	 int sq=0;
    for(int i=0;i<10;i++)		
	{
		sq=0;
		sq=a[i]*a[i];
		h.put(a[i],sq);
		
	}	
   return h;	
 }
 public static void main(String args[])
 {
	 int ar[]=new int[10];
	 ar[0]=1;
	 ar[1]=2;
	 ar[2]=3;
	 ar[3]=4;
	 ar[4]=5;
	 ar[5]=6;
	 ar[6]=7;
	 ar[7]=8;
	 ar[8]=9;
	 ar[9]=10;
	  Map<Integer,Integer> c=getSquares(ar);
	  Set<Integer> s=c.keySet();
	  for(Integer s1:s)
	  {
		  System.out.print(s1);
		  System.out.print(c.get(s1));
		  System.out.println();
	  }
 }
}