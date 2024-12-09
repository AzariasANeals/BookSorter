import java.util.Comparator;

/**
 * This is the YearComparator, it implements Comparator<Book>. It will compare
 * the publication year of two books.
 */
public class YearComparator implements Comparator<Book>
{
    public int compare(Book b1, Book b2){
        /* Here we are boxing an int variable as a Integer object, to use the compareTo() method
           in the Integer object. valueOf() boxes the int, compareTo() does the comparison between
           the two int values.
           int x, y...
           if(x < y)
           {
             return -1
           }
           else if(x == y)
           {
             return 0;
           }
           else
           {
             return -1;
           }
           */
        return Integer.valueOf(b1.getBookYear()).compareTo(Integer.valueOf(b2.getBookYear()));
    }
}
