import java.util.*;
/**
 * This is the Book class, it implements Comparable. It allows you to create Books (title, author,
 * and year). There are getter functions that allow you to retrieve the title, author and year of each
 * individual book entry. You can also use a compareTo() method to compare books.
 */
public class Book implements Comparable
{
    private String title;
    private String author;
    private int year;
    public static final int INVALID_YEAR = -1;

    public Book(String title, String author, int year){
        this.title = title;
        this.author = author;

        if(year >= 1500 && year <= 2025){
            this.year = year;
        }
        else{
            this.year = INVALID_YEAR;    
        }

    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getBookYear(){
        return year;
    }

    public int compareTo(Book other){
        return this.title.compareTo(other.title);
    }

    public int compareTo(Object other){
        if(other instanceof Book){
            return this.title.compareTo(((Book)other).title);
        }
        else{
            return this.title.compareTo(other.toString());
        }
    }

    public String toString(){
        return "Title: " + title
        + "\nAuthor: " + author + "\nYear: " + year + "\n";    
    }

}
