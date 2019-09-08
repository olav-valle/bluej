import java.util.ArrayList;
/**
 * Write a description of class Library here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Library
{
    // instance variables - replace the example below with your own
    private ArrayList<Book> library;

    /**
     * Constructor for objects of class Library
     */
    public Library()
    {
        // initialise instance variables
        library = new ArrayList<Book>();
    }

    public void addBook(String bookAuthor, String bookTitle, int bookPages, boolean bookCourseText)
    {
        Book newBook = new Book(bookAuthor, bookTitle, bookPages, bookCourseText);
        library.add(newBook);
    }
    
    public void listAllBooks()
    {
        int index = 0;
        for (Book listThis : library) {
            System.out.println(index + ":" + listThis);
            index++;
        }
    }
}
