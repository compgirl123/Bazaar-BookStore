// No child parent relationship, is-a relationship
package models;// No child parent relationship, is-a relationship
// Book functionalities will exist here
import java.util.ArrayList;
import java.util.List;
public class Book {
  // Object Book will be created
  private String title;
  private String author;
  private String ISBN;
  private double price;
  private int quantity;

  // TODO: Generate ID for each book (Elena's idea)
  // TODO: Elena finish the getters and setters

  public Book(String title,String author, String ISBN, double price, int quantity){
    // constructor
    this.title = title;
  }
  // Getter = Access the information since it is private.
  public String getTitle(){
    return title;
  }

  // Setter = Set the private information.
  public void setTitle(String title){
    this.title = title;
  }


}
