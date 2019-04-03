import java.io.*;
class A
{
/**
 * 
 * @author kailas
 *
 */
	public static void main(String args[])
	{
		File f=new File("D:/java/capgemini/Lab6/screen.txt");
		try
		{
			f.createNewFile();
			FileReader fr=new FileReader(f);
			int c=0;
			int count=1;
			System.out.print(count);
			while((c=fr.read())!=-1)
			{
				if((char)c=='\n')
				{
					count=count+1;
					System.out.println();
					System.out.print(count);
				}
				else
				{
				System.out.print((char)c);
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("exception occur");
		}
	}
}