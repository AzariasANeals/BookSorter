

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class AuthorComparatorTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class AuthorComparatorTest
{
    Book b1;
    Book b2;
    Book b3;
    Book n1;
    Book n2;
    AuthorComparator tester;
    private final String expectedTitleOne = "Catch-22";
    private final String expectedTitleTwo = "Crime and Punishment";
    private final String expectedTitleThree = "Animal Farm";
    private final String expectedAuthorOne = "Joseph Heller";
    private final String expectedAuthorTwo = "Fyodor Dostoevsky";
    private final String expectedAuthorThree = "George Orwell";
    private final int expectedYear = 1941;  
    /**
     * Default constructor for test class AuthorComparatorTest
     */
    public AuthorComparatorTest()
    {
        b1 = new Book(expectedTitleOne, expectedAuthorOne, expectedYear);
        b2 = new Book(expectedTitleTwo, expectedAuthorTwo, expectedYear);
        b3 = new Book(expectedTitleThree, expectedAuthorThree, expectedYear);
        n1 = new Book(expectedTitleOne, null, expectedYear);
        n2 = new Book(expectedTitleOne, null, expectedYear);
        tester = new AuthorComparator();
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
    public void testCompareEqual(){
        int expected = 0;
        int actual = tester.compare(b1, b1);
        assertEquals(expected, actual);
    }

    @Test
    public void testCompareLessThan(){
        boolean expected = true;
        boolean actual = false;
        if(tester.compare(b2, b1) < 0){
            actual = true;
        }
        assertEquals(expected, actual);
    }

    @Test
    public void testCompareGreaterThan(){
        boolean expected = true;
        boolean actual = false;
        if(tester.compare(b1, b2) > 0){
            actual = true;
        }
        assertEquals(expected, actual);
    }

    // 3 Edge Test Cases
    @Test
    public void testCompareBothNullTitles(){
        boolean expected = true;
        boolean actual = false;
        try{
            tester.compare(n1, n2);
        }
        catch(NullPointerException n){
            actual = true;
        }
        
        assertEquals(expected, actual);
    }

    @Test
    public void testCompareLeftNullTitle(){
        boolean expected = true;
        boolean actual = false;
        try{
            tester.compare(n1, b2);
        }
        catch(NullPointerException n){
            actual = true;
        }
        
        assertEquals(expected, actual);    
    }

    @Test
    public void testCompareRightNullTitle(){
        boolean expected = true;
        boolean actual = false;
        try{
            tester.compare(b1, n2);
        }
        catch(NullPointerException n){
            actual = true;
        }
        
        assertEquals(expected, actual);
    }
}
