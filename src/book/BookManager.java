package book;
import java.util.*;
public class BookManager{
	private int n;
	
	public BookManager(int n) {
		// TODO Auto-generated constructor stub
		this.n=n;
	}
	
	public Book[] createBooks()
	{
		Book[] bookArray=new Book[n];
		Scanner sc=new Scanner(System.in);
//		System.out.println(bookArray.length);
		for(int i=0;i<bookArray.length;i++)
		{
			System.out.println("Enter book name");
			String book_title=sc.nextLine();
			System.out.println("Enter book price");
			int book_price=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter book author");
			String book_author=sc.nextLine();
			System.out.println("Enter book publication");
			String book_publication=sc.nextLine();
			Book b=new Book(book_title,book_price,book_author,book_publication);
			bookArray[i]=b;
		}
		return bookArray;
	}
	public void showBooks()
	{
		Book[] bookArray=createBooks();
		for(Book b:bookArray)
		{
			System.out.println(b.getBook_title());
			System.out.println(b.getBook_price());
			System.out.println(" ");
		}
	}
	
}
