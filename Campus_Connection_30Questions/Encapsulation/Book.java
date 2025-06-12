//2. Write a Book class with private attributes title, author. Use constructors and getter/setter methods.

package Encapsulation;

public class Book {
    private String title;
    private String author;
    Book(String booktitle , String bookauthor ){
        this.title = booktitle;
        this.author = bookauthor;
    }
    public String gettitle(){
        return title;
    }
    public String getauthor(){
        return author;
    }
    public void display(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
    public static void main(String[] args) {
        Book book = new Book("Java OOPs" , "John");
        book.display();
    }
}
