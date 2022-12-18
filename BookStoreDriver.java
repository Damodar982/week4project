package com.gl.bookstore.driver;

import java.util.ArrayList;
import java.util.stream.Collectors;
import com.gl.utilities.Book;
public class BookStoreDriver {
	public static void main(String[] args) {
		//Create a list of books 
	  ArrayList<Book> books=new ArrayList<Book>();
	  Book book1=new Book(1,"To Kill a Mockingbird",200,"Classics");
	  Book book2=new Book(2,"Carrie",1000,"Horror");
	  Book book3=new Book(3,"The Savior",150,"Romance");
	  Book book4=new Book(4,"Wings of Fire",250,"Autobiography");
	  Book book5=new Book(5,"Gandhi",250,"Autobiography");
	  Book book6=new Book(6,"The Martian",1000,"Sci-Fi");
	  Book book7=new Book(7,"Animal Farm",200,"Political Satire");
	  Book book8=new Book(8,"Think and grow Rich ",500,"Self-Help");
	  Book book9=new Book(9,"Can't hurt me",2000,"Motivational");
	  Book book10=new Book(10,"Getting things done",350,"Self-Help");
	  //Add the books to list
	  books.add(book1);
	  books.add(book2);
	  books.add(book3);
	  books.add(book4);
	  books.add(book5);
	  books.add(book6);
	  books.add(book7);
	  books.add(book8);
	  books.add(book9);
	  books.add(book10);
	  // to display all the available books in bookstore 
	  System.out.println("following books are currently present in the bookStore :");
	  books.forEach((book)->System.out.println("id->"+book.getId()+" Name "+book.getName()+" Price "+
	                         "\033[32m" + book.getPrice()+ "\033[0m"+" Genre "+book.getGenre()));
	  // to display the average price of all books in the book store
	  System.out.println();
	  System.out.println("The average price of all the books in bookstore is :"+
                          books.stream().mapToDouble(Book::getPrice).average());
	  //to display the number of books available in book store
	  System.out.println();
	  System.out.println("The total number of books in the book store is :"+books.size());
	  //to display the books of autobiography genre type 
	  System.out.println();
	  try {
	  System.out.println("Autobiographies-> "+books.stream().filter(book->book.getGenre().
			            equals("Autobiography")).map(book->book.getName()).
			            collect(Collectors.toList()));
	  }
	  catch(NullPointerException e) {
		  e.printStackTrace();
	  }
	  //to display the count of different genre books  
		  System.out.println();
	  System.out.println("count of distinct genre is -->"+books.stream().
			              map(Book::getGenre).distinct().count());
	}

}
