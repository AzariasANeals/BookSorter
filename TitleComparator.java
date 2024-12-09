import java.util.Comparator;

/**
 * This is the TitleComparator class. It implements Comparator<Book>.
 * It will compare the titles of two books.
 */
public class TitleComparator implements Comparator<Book>
{
    
    public int compare(Book b1, Book b2){
        return b1.compareTo(b2);
    }
    
    
}
