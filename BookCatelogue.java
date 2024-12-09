import java.util.*;
/**
 * This is the BookCatelogue class. It stores a library ArrayList. You can add Books to your
 * library and store them together. You are able to display and sort the library in different ways.
 * You can sort them by title, author, or the year order.
 */
public class BookCatelogue
{
    ArrayList<Book> library;

    public BookCatelogue(){
        library = new ArrayList<Book>();
    }

    public void addBook(Book book){
        library.add(book);
    }

    public ArrayList<Book> getBooks(){
        return library;
    }

    public String displayTitleOrder(){
        StringBuilder buf = new StringBuilder();
        Collections.sort(library, new TitleComparator());
        for(Book book : library){
            buf.append(book);
            buf.append("\n");
        }
        buf.append("\n");
        return buf.toString();
    }

    public String displayAuthorOrder(){
        StringBuilder buf = new StringBuilder();
        Collections.sort(library, new AuthorComparator());
        for(Book book: library){
            buf.append(book);
            buf.append("\n");
        }
        buf.append("\n");
        return buf.toString();
    }

    public String displayYearOrder(){
        StringBuilder buf = new StringBuilder();
        Collections.sort(library, new YearComparator());
        for(Book book: library){
            buf.append(book);
            buf.append("\n");
        }
        buf.append("\n");
        return buf.toString();
    }

    // This is for unit-testing. It will return the entire catelogue 
    // based on the last sort order.
    public ArrayList<Book> getCatelogue(){
        return library;
    }
    
    public String toString(){
        StringBuilder buf = new StringBuilder();
        for(Book book: library){
            buf.append(book);
            buf.append("\n");
        }
        buf.append("\n");
        return buf.toString();
    }
}
