import java.util.ArrayList;

/** 
    This is my Main class.
 
    In order to run this program first create a selection of 
    books. Then create a new BookCatelogue and add those books to it. You will then use 
    System.out.println and choose to display the catelogue either by the title order, author order,
    or by the year order. If you do not specify it will always display the list in its current order.
 */
public class Main
{
    public static void main(String[] args){
        Book b1 = new Book("Oliver Twist", "Charles Dickens", 1838);
        Book b2 = new Book("Catch-22", "Joseph Heller", 1961);
        Book b3 = new Book("1984", "George Orwell", 1949);
        Book b4 = new Book("Charlie Brown", "Charles Schulz", 1950);
        Book b5 = new Book("Winnie the Pooh", "A.A. Milne", 1926);

        BookCatelogue cat = new BookCatelogue();
        cat.addBook(b1);
        cat.addBook(b2);
        cat.addBook(b3);
        cat.addBook(b4);
        cat.addBook(b5);

        System.out.println("Displaying in current order\n");
        System.out.println(cat);

        System.out.println("Displaying in title order\n");
        System.out.println(cat.displayTitleOrder());

        System.out.println("Displaying in author order\n");
        System.out.println(cat.displayAuthorOrder());

        System.out.println("Displaying in year order\n");
        System.out.println(cat.displayYearOrder());

        System.out.println("Displaying in current order\n");
        System.out.println(cat);

    }

}
