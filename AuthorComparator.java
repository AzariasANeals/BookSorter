import java.util.Comparator;

/**
 * This is the AuthorComparator, it implements Comparator<Book>.
 * It will compare two books by the author.
 */
public class AuthorComparator implements Comparator<Book>
{
    
    public int compare(Book b1, Book b2){
        return b1.getAuthor().compareTo(b2.getAuthor());
    }
    
}
