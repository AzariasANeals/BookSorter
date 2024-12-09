
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class TitleComparatorTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TitleComparatorTest
{
    /**
     * Default constructor for test class TitleComparatorTest
     */
    Book b1;
    Book b2;
    Book b3;
    Book n1;
    Book n2;
    TitleComparator tester;
    private final String expectedTitleOne = "Catch-22";
    private final String expectedTitleTwo = "Crime and Punishment";
    private final String expectedTitleThree = "Animal Farm";
    private final String expectedAuthor = "Joseph Heller";
    private final int expectedYear = 1941;    
    public TitleComparatorTest()
    {
        b1 = new Book(expectedTitleOne, expectedAuthor, expectedYear);
        b2 = new Book(expectedTitleTwo, expectedAuthor, expectedYear);
        b3 = new Book(expectedTitleThree, expectedAuthor, expectedYear);
        n1 = new Book(null, expectedAuthor, expectedYear);
        n2 = new Book(null, expectedAuthor, expectedYear);
        tester = new TitleComparator();

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
        if(tester.compare(b1, b2) < 0){
            actual = true;
        }
        assertEquals(expected, actual);
    }

    @Test
    public void testCompareGreaterThan(){
        boolean expected = true;
        boolean actual = false;
        if(tester.compare(b1, b3) > 0){
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
