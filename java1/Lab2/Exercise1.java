abstract class Item
{
	private int id;
	private String title;
	private int noofcopies;
    abstract public void checkIn();
	abstract public void checkOut();
	abstract public void addItem();
	public Item(int id,String title,int noofcopies)
	{
		this.id=id;
		this.title=title;
		this.noofcopies=noofcopies;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public void setTitle(String title)
    {
		this.title=title;
	}
	public void setNoOfCopies(int noofcopies)
	{
		this.noofcopies=noofcopies;
	}
	/*public Item(int id,String title,int noofcopies)
	{
		this.id=id;
		this.title=title;
		this.noofcopies=noofcopies;
	}*/
}
abstract class WrittenItem extends Item
{
	private String name;
	private String country;
	public WrittenItem(int id,String title,int noofcopies,String name,String country)
	{
		super(id,title,noofcopies);
		this.name=name;
		this.country=country;
	}
	public void  setName()
	{
		System.out.println("name set");
	}
	public void setCountry()
	{
		System.out.println("set country");
	}
}
class Book extends WrittenItem
{
	public Book(int id,String title,int noofcopies,String name,String country)
	{
		super(id,title,noofcopies,name,country);
	}
	public void checkIn()
	{
		System.out.println("checked in");
	}
	public void checkOut(){
		System.out.println("checked out");
	}
	public void addItem()
	{
		System.out.println("Item added successfully");
	}
}
class JournalPaper extends WrittenItem
{
	public JournalPaper(int id,String title,int noofcopies,String name,String country)
	{
		super(id,title,noofcopies,name,country);
	}
	private int year;
	
    public void setYear()
	{
       System.out.println("year setted successfully");
	}
	public void checkIn()
	{
		System.out.println("checked in");
	}
	public void checkOut(){
		System.out.println("checked out");
	}
	public void addItem()
	{
		System.out.println("Item added successfully");
	}
}
abstract class MediaItem extends Item
{
public MediaItem(int id,String title,int noofcopies)
{
	super(id,title,noofcopies);
}

}
class Video extends MediaItem
{
	private String directorname;
	private String genre;
	private int releaseyear;
	public Video(int id,String title,int noofcopies,String directorname,String genre,int releaseyear)
	{
		super(id,title,noofcopies);
		this.directorname=directorname;
		this.genre=genre;
		this.releaseyear=releaseyear;
	}
	public void setName()
	{
	   	System.out.println("Danial");
	}
	public void setGenre()
	{
		System.out.println("Drama");
	}
	public void releaseyear()
	{
		System.out.println("releaseyear is 2015");
	}
	public void checkIn()
	{
		System.out.println("checked in");
	}
	public void checkOut()
	{
		System.out.println("checked Out");
	}
	public void addItem()
	{
		System.out.println("Vedio added successfully");
	}
}
class CD extends MediaItem
{
	private String artist;
	private String genre;
	public CD(int id,String title,int noofcopies,String artist,String genre)
	{
		super(id,title,noofcopies);
		this.artist=artist;
		this.genre=genre;
		
	}
	public void setArtist()
	{
	   	System.out.println("Kohly");
	}
	public void setGenre()
	{
		System.out.println("Thriller");
	}
	public void checkIn()
	{
		System.out.println("checked in");
	}
	public void checkOut()
	{
		System.out.println("checked Out");
	}
	public void addItem()
	{
		System.out.println("Vedio added successfully");
	}
}
class Main
{
	public static void main(String args[])
	{
       JournalPaper a=new JournalPaper(101,"ABC",12,"Ravi","INDIA");
	   Book b=new Book(101,"ABC",12,"Ravi","INDIA");
	   Video c=new Video(101,"ABC",12,"Ravi","Horror",2015);
	   CD d=new CD(101,"ABC",12,"kohli","Thriller");
	}
}

