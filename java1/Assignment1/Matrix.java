class Matrix
{
 public static void main(String args[])
 {
   int ar[][]=new int[4][4];
   int k=1;
   for(int i=0;i<4;i++)
   {
     for(int j=0;j<4;j++)
	 {
		ar[i][j]=k;
		k=k+1;
	 }
   }
   
   for(int i=0;i<4;i++)
   {
     for(int j=0;j<4;j++)
	 {
		System.out.print(ar[i][j]+ " ");
		
	 }
	 System.out.println();
   }
   
 }
}