package javaPackage;

//class BookTest
public class BookTest 
{
	public static void main(String[] args) 
	{
		Author author1 = new Author("Marcus Laurence", "milaurenceneu.edu.ph", "SheMale");
		Author.print1();
		Author.print2();
		System.out.println();
		
		Book bk1 = new Book("Java Book", author1, -1499, -10);
		bk1.print1();
		System.out.println();
		System.out.println();
		bk1.print2();
		
		System.out.println();
		Author.setEmail("cuscusgmail.com");
		Author.print2();
		
		System.out.println();
		bk1.print2();
		
		bk1.getAuthor();
		System.out.println();
		Author.setEmail("Laurence.marcusgmail.com");
		bk1.print2();
	}

}

//class Author
class Author
{
	private static String author;
	public static String email;
	public static String gender;
	 
	public Author(String author, String email, String gender) 
	{
		Author.author = author;
		Author.email = email;
		Author.gender = gender;
	}
	
	public String getAuthor() 
	{
		return author;
	}

	public String getEmail() 
	{
		return email;
	}
	public static void setEmail(String email) 
	{
		if (email == "milaurence@neu.edu.ph") 
		{
			Author.email = email;
		} 
		else if(email == "cuscus@gmail.com" )
		{
			Author.email = email;
		}
		else if(email == "Laurence.marcus@gmail.com" )
		{
			Author.email = email;
		}
		else 
		{
			System.out.println("Invalid email! Set to empty string.");
			Author.email = "";
		}
	}

	public String getGender() 
	{
		return gender;
	}
	public static void setGender(String gender) 
	{
		if (gender == "Male") 
		{
			Author.gender = gender;
		} 
		else 
		{
			System.out.println("Invalid gender! Set to Unknown.");
			Author.gender = "Unknown";
		}
	}
		
	public static void print1()
	{
		setEmail(email);
		setGender(gender);
	}

	public static void print2()
	{
		System.out.println("AUTHOR: " + author);
		System.out.println("GENDER: " + gender);
		System.out.println("E-MAIL: " + email);
	}
	
}

//class Book
class Book
{
	private String bookTitle;
	private Author author;
	private double price;
	private int stock = 0;
	private String name;
	
	public Book(String bookTitle, Author author, double price, int stock) 
	{
		this.bookTitle = bookTitle;
		this.author = author;
		this.price = price;
		this.stock = stock;
	}
	
	public String getbookTitle() 
	{
        return bookTitle;
    }

    public Author getAuthor() 
    {
        return author;
    }

    public double getPrice() 
    {
        return price;
    }
    public void setPrice(double price) 
    {
        if (price > 0) 
        {
            this.price = price;
        } 
        else 
        {
            System.out.println("Note: Price should be positive! Set to 0");
            this.price = 0.0;
        }
    }
    
    public double getStock() 
    {
        return stock;
    }
    
    public void setStock(int stock) 
    {
        if (stock >= 0) 
        {
            this.stock = stock;
        } 
        else 
        {
            System.out.println("Book stocks cannot be negative! Set to 0");
            this.stock = 0;
        }
    }
    
    public void print1()
    {
		setPrice(price);
		setStock(stock);
    }
    
	public void print2()
	{
    	System.out.println("Book Title: " + getbookTitle());
    	Author.print2();
    }
    
    public String getAuthorName()
    {
    	return name;
    }

}
