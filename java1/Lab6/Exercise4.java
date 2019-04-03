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
		File f=new File("D:/java/capgemini/Lab6/Exercise4File.txt");
	    try{
     	f.createNewFile();
		FileInputStream fr=new FileInputStream(f);
		FileOutputStream fw=new FileOutputStream(f);
		String s="HII";
		fw.write(s.getBytes());
		int c;
		int result=0;
		if(f.exists())
		{
			System.out.println("File "+f.getPath()+" is existed");
			if(f.canRead())
			{
				System.out.println("File can be readable");
			}
			else
			{
				System.out.println("can not read the file");
			}
			if(f.canWrite())
			{
				System.out.println("File can be writable");
			}
			else
			{
				System.out.println("can not write into the file");
			}
     	    if(f.length()==0)
			{
				System.out.println("File is empty");
			}
			else
			{
				System.out.println("Length of the file in bytes is:"+f.length());
			}
		
		}
		else
		{
			System.out.println("File is not found");
		}
	}
	catch(Exception ex)
	{
		System.out.println(ex.getMessage());
	}
}
}