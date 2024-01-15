package models;// No child parent relationship, is-a relationship
// Book functionalities will exist here
import java.util.ArrayList;
import java.util.List;

// TODO: Elena finish this file

public class BookInventory {
  // This is the object that contains all of the book information
  private List<Book> books;

  public BookInventory() {
    this.books = new ArrayList<Book>();
  }

  public void addBook(Book book) {
    books.add(book);
    // Additional logic for adding a book to the inventory...
  }

  public void removeBook(Book book) {
    books.remove(book);
    // Additional logic for removing a book from the inventory...
  }

}
