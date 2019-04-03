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
		int a=0;
		int noOfLines=1;
		int noOfChars=0;
		int noOfWords=0;
		File f=new File("D:/java/capgemini/Lab6/Exercise3File.txt");
		try
		{
			f.createNewFile();
		     FileReader fr=new FileReader(f);
			 while((a=fr.read())!=-1)
			 {
				 if((char)a==' ')
				 {
					 noOfWords=noOfWords+1;
				 }
				 if((char)a=='\n')
				 {
					 noOfLines=noOfLines+1;
					 noOfWords=noOfWords+1;
				 }
				 noOfChars=noOfChars+1;
			 }
			 System.out.println("number of lines: "+noOfLines);
			 System.out.println("number of character:"+noOfChars);
			 System.out.println("number of words:"+noOfWords);
		}
		catch(Exception e)
		{
			System.out.println("Exception occur");
		}
	}
}