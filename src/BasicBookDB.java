import java.util.ArrayList;


public class BasicBookDB {
	private ArrayList<Book> books;
	
	public BasicBookDB()
	{
		books=new ArrayList<>();
		Book b;
		b=new Book("Java1001","Head First Java","Kathy Sierra and Bert Bates","Easy to read Java workbook",47.50);
		books.add(b);
		b=new Book("Java1002","Thinking in Java","Bruce Eckel","Details about Java under the hood", 20.00);
		books.add(b);
		b=new Book("Orcl1003","OCP:Oracle Certified Professional Java SE","Jeanne Boyarsky","Everything you need to know in one place",45.00);
		books.add(b);
		b=new Book("Python1004","Automate the Boring Stuff with Python","Al Sweigart", "Fun with Python", 10.50);
		books.add(b);
		b=new Book("Zombie1005","The Maker's Guide to the Zombie Apocalypse","Simon Monk","Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi", 16.50);
		books.add(b);
		b=new Book("Rasp1006","Raspberry Pi Projects for the Evil Genius","Donald Norris","A dozen fiendishly fun projects for the Raspberry Pi",14.75);
		books.add(b);
	}

	
		
	
	
	public void findBook(String sku)
	{
		boolean check=true;
		int find=0;
		for(int i=0; i<books.size();i++)
		{ 
				if(sku.equals(books.get(i).getSku()))
				{
					check=false;
					find=i;
					break;
				}
				
			
		}
		if(!check)
		{
			books.get(find).getDisplayText();
			
			
			
		}
		else
		{
			System.out.println("This sku does not correspond to a book in our database");
		}
	}

}
