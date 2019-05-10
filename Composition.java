import java.io.*;
import java.util.*;
import java.util.ArrayList;

class Book
{
	String title;
	String author;
	
	Book(String title, String author)
	{
		this.title = title;
		this.author = author;
	}
}

class Library
{
	private final List<Book> books;
	
	Library(List<Book> books)
	{
		this.books = books;
	}
	public List<Book> getTotalBooksInLibrary()
	{
	 return books;
	}
}

class Composition
{
	public static void main(String args[])
	{
		Book b1 = new Book("Oracle", "Sun MS");
		Book b2 =  new Book("Java", "Xyz");
		
		List<Book> book =  new ArrayList<Book>();
		book.add(b1);
		book.add(b2);
		
		Library l = new Library(book);
		
		List<Book> bks = l.getTotalBooksInLibrary();
		
		for(Book bk : bks)
		{
		System.out.println("Title : " + bk.title + " and " + "Author : " +bk.author );
		}
	}
}