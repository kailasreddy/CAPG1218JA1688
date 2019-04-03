import java.util.*;
class Kailas
{
/**
 * 
 * @author kailas
 *
 */
	public static HashMap<Character,Integer> countCharacter(char B[])
	{
		HashMap<Character,Integer> h=new HashMap<Character,Integer>();
		int count=0;
		for(int i=0;i<10;i++)
		{
			count=0;
		for(int j=0;j<10;j++)
		{
			if(B[i]==B[j])
			{
				count=count+1;
			}
		}
		h.put(B[i],count);
		}
		return h;
	}
	public static void main(String args[])
	{
		char[] A=new char[10];
		A[0]='A';
		A[1]='D';
		A[2]='D';
		A[3]='A';
		A[4]='A';
		A[5]='C';
		A[6]='E';
		A[7]='C';
		A[8]='C';
		A[9]='C';
		Map<Character,Integer> a=countCharacter(A);
		Set<Character> s=a.keySet();
		for(Character s1:s)
		{
			System.out.print(s1+" : ");
			System.out.print(a.get(s1));
			System.out.println();
		}
	}
}