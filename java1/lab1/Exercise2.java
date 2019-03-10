import java.util.*;
import java.lang.*;
class Sum
{
static int calculateDifference(int n){
	int sumOfSquares=0;
	int squaresOfSum=0;
	int difference=0;
	for(int i=1;i<=n;i++)
	{
		sumOfSquares=(int)(sumOfSquares+Math.pow(i,2));
		squaresOfSum=squaresOfSum+i;
	}
	difference=(int)(sumOfSquares-Math.pow(squaresOfSum,2));
	return difference;
	
	
}
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int k=calculateDifference(n);
System.out.println("difference is:"+ k);
}
}