package newPractice;

import java.util.*;

class Book {
    private String bName;

   
    public Book(String bookName) {
        this.bName = bookName;
    }

    
    public String getBookName() {
        return bName;
    }

   
    public void setBookName(String bookName) {
        this.bName = bookName;
    }

    @Override
    public String toString() {
        return "Book Name: " + bName;
    }
}


class Author {
    private Book book;
    private String aName;

  
    public Author(Book book, String authorName) {
        this.book = book;
        this.aName = authorName;
    }

    
    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

  
    public String getAuthorName() {
        return aName;
    }

   
    public void setAuthorName(String authorName) {
        this.aName = authorName;
    }

    @Override
    public String toString() {
        return book + ", Author: " + aName;
    }
}

public class HasA {

    public static void main(String[] args) {
      
    	Book b1=new Book("mahabharat");
        Author aut1 = new Author(b1, "ved vyas");
        Book b2=new Book("ramayan");
        Author aut2 = new Author(b2, "valmiki");

        List<Author> list = new ArrayList<>();
        list.add(aut1);
        list.add(aut2);


        System.out.println("Printing List:");
        ListIterator<Author> li = list.listIterator();
        while (li.hasNext()) {
            System.out.println(li.next());
        }

       
        System.out.println("\nPrinting List (Reverse Order):");
        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }
    }
}
