import java.util.*;
class A
{
/**
 * 
 * @author kailas
 *
 */
	public static ArrayList<String> getValues(HashMap<String,String> obj)
	{
		ArrayList<String> li=new ArrayList<String>(obj.values());
		Collections.sort(li);
		return li;
		
		
	}
	public static void main(String args[])
	{
		HashMap<String,String> m=new HashMap<String,String>();
		m.put("b","kailas");
		m.put("c","abhishek");
		m.put("a","Akshay");
		m.put("e","pushpak");
		m.put("d","Lakshman");
		System.out.println(getValues(m));
		
}
}