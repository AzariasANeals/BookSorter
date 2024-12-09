

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class BookTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BookTest
{
    private final String expectedTitle = "Catch-22";
    private final String expectedAuthor = "Joseph Heller";
    private final int expectedYear = 1941;
    private final int invalidYear = 2052;
    private Book tester;
    private Book nullTester;
    /**
     * Default constructor for test class BookTest
     */
    public BookTest()
    {
        tester = new Book(expectedTitle, expectedAuthor, expectedYear);
        nullTester = new Book(null, null, invalidYear);
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
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
    public void testGetTitle(){
        String actualTitle = tester.getTitle();
        assertEquals(expectedTitle, actualTitle);
    }
    
    @Test
    public void testGetAuthor(){
        String actualAuthor = tester.getAuthor();
        assertEquals(expectedAuthor, actualAuthor);
    }
    
    @Test
    public void testGetBookYear(){
        int actualYear = tester.getBookYear();
        assertEquals(expectedYear, actualYear);
    }
    
    // 3 Edge Test Cases
    @Test
    public void testGetNullTitle(){
        String actualTitle = nullTester.getTitle();
        // assertEquals(null, actualTitle);
        assertNull(actualTitle);
    }
    
    @Test
    public void testGetNullAuthor(){
        String actualAuthor = nullTester.getAuthor();
        assertNull(actualAuthor);
    }
    
    @Test
    public void testInvalidBookYear(){
        int actualYear = nullTester.getBookYear();
        assertEquals(Book.INVALID_YEAR, actualYear);
    }
}
