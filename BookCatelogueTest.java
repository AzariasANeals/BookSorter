
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

/**
 * The test class BookCatelogueTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BookCatelogueTest
{
    Book b1;
    Book b2;
    Book b3;
    Book n1;
    Book n2;
    BookCatelogue tester;
    private final String expectedTitleOne = "Catch-22";
    private final String expectedTitleTwo = "Crime and Punishment";
    private final String expectedTitleThree = "Animal Farm";
    private final String expectedAuthorOne = "Joseph Heller";
    private final String expectedAuthorTwo = "Fyodor Dostoevsky";
    private final String expectedAuthorThree = "George Orwell";
    private final int expectedYearOne = 1961;
    private final int expectedYearTwo = 1866;
    private final int expectedYearThree = 1945;
    private final int invalidYear = 2045;
    /**
     * Default constructor for test class BookCatelogueTest
     */
    public BookCatelogueTest()
    {
        b1 = new Book(expectedTitleOne, expectedAuthorOne, expectedYearOne);
        b2 = new Book(expectedTitleTwo, expectedAuthorTwo, expectedYearTwo);
        b3 = new Book(expectedTitleThree, expectedAuthorThree, expectedYearThree);
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        tester = new BookCatelogue();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    // 3 Normal Test Cases
    @Test
    public void testGetBooks(){
        int expected = 2;
        tester.addBook(b1);
        tester.addBook(b2);
        ArrayList<Book> library = tester.getBooks();
        int actual = library.size();
        assertEquals(expected, actual);
    }
    @Test
    public void testAddBooks(){
        int expected = 2;
        int actual = 0;
        tester.addBook(b1);
        tester.addBook(b2);
        ArrayList<Book> library = tester.getBooks();
        actual = library.size();
        assertEquals(expected, actual);    
    }
    @Test
    public void testDisplayTitleOrder(){
        String expected = b3.toString() + "\n" + b1.toString() + "\n\n";
        tester.addBook(b1);
        tester.addBook(b3);
        String actual = tester.displayTitleOrder();
        assertEquals(expected, actual);
    }
    @Test
    public void testDisplayAuthorOrder(){
        String expected = b3.toString() + "\n" + b1.toString() + "\n\n";
        tester.addBook(b1);
        tester.addBook(b3);
        String actual = tester.displayAuthorOrder();
        assertEquals(expected, actual);
    }
        
    // 3 Edge Test Cases
    @Test
    public void testGetBooksEmptyCatelogue(){
        int expected = 0;
        ArrayList<Book> library = tester.getBooks();
        int actual = library.size();
        assertEquals(expected, actual);
    }
    @Test
    public void testDisplayAuthorOrderEmptyCatelogue(){
        String expected = "\n";
        String actual = tester.displayAuthorOrder();
        assertEquals(expected, actual);
    }
    @Test
    public void testDisplayTitleOrderEmptyCatelogue(){
        String expected = "\n";
        String actual = tester.displayTitleOrder();
        assertEquals(expected, actual);
    }
}
