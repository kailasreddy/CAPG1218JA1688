import java.io.*;
class CopyDataThread extends Thread
{
	File f=new File("D:/java/capgemini/Lab8/two.txt");
	File fs;
	int count=1;
	int  ch=0;
	char c;
	public CopyDataThread(File f)
	{
		this.fs=f;
	}
	public void run()
	{
	     try
		 {
			 FileReader fb=new FileReader(fs);
    FileWriter fw=new FileWriter(f,true);
			while(count<=10&&(ch=fb.read())!=-1)
			{
		     	if(count==10)
		     	{
				fw.write((char)ch);
				System.out.println("10 characters are copied");
				count=1;
			    } 
			else
			{
			fw.write((char)ch);
			/*System.out.println(count);*/
			count=count+1;
			 }

			 }
			 
			fw.flush();
		 }
		 catch(Exception e)
		 {
			 System.out.println("Exception occured");
		 }
	}
}
class FileProgram
{
	public static void main(String args[])
	{
	File f=new File("D:/java/capgemini/Lab8/one.txt");
     //f.createNewFile();
	try
	{
		FileWriter fw=new FileWriter(f,true);
		fw.write("abcdefghij");
	    fw.flush();
		}
	catch(Exception e)
    {
		System.out.println("File can't be write");
	}
	CopyDataThread t1=new CopyDataThread(f);
		t1.start();
		
	}
}