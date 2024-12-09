

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class YearComparatorTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class YearComparatorTest
{
    Book b1;
    Book b2;
    Book b3;
    Book n1;
    Book n2;
    YearComparator tester;
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
     * Default constructor for test class YearComparatorTest
     */
    public YearComparatorTest()
    {
        b1 = new Book(expectedTitleOne, expectedAuthorOne, expectedYearOne);
        b2 = new Book(expectedTitleTwo, expectedAuthorTwo, expectedYearTwo);
        b3 = new Book(expectedTitleThree, expectedAuthorThree, expectedYearThree);
        n1 = new Book(expectedTitleOne, expectedAuthorOne, invalidYear);
        n2 = new Book(expectedTitleTwo, expectedAuthorTwo, invalidYear);
        tester = new YearComparator();
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
        int expected = 0;
        int actual = tester.compare(n1, n2);
        
        assertEquals(expected, actual);
    }

    @Test
    public void testCompareLeftNullTitle(){
        int expected = -1;
        int actual = tester.compare(n1, b1);

        assertEquals(expected, actual);    
    }

    @Test
    public void testCompareRightNullTitle(){
        int expected = 1;
        int actual = tester.compare(b1, n1);

        
        assertEquals(expected, actual);
    }
}
