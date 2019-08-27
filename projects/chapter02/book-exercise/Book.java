/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
public class Book
{
    //The fields:
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private boolean courseText;
    /**
     * Set the author and title fields when this object is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean bookCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        borrowed = 0;
        courseText = bookCourseText;
    }
    // Add methods here...
    /**
     * Prints name of author to terminal.
     */
    public void printAuthor()
    {
        System.out.println(author);
    }

    /**
     * Prints title of book to terminal.
     */
    public void printTitle()
    {
        System.out.println(title);
    }
    
    /**
     * Returns number of pages in book.
     */
    public int getPages()
    {
        return pages;
    }
    
    /**
     * Set the reference number of a book.
     */
    public void setRefNumber(String bookRef)
    {
        if (bookRef.length() > 2){
            refNumber = bookRef;
    }
        else {
            System.out.println("+++ OUT OF CHEESE ERROR. REDO FROM START. +++");
            System.out.println("Book reference number must be at least 3 characters.");
        }
    }
    
    /**
     * Returns the reference number of a book.
     */    
    public String getRefNumber()
    {
        return refNumber;
    }
    
    /**
     * Increments the borrowed field, which tracks the 
     * number of times a book has been borrowed. 
     */
    public void incrementBorrowed()
    {
        borrowed += 1;
    }
    
    /**
     * Returns int count of times book has been borrowed.
     */
    public int getBorrowed()
    {
        return borrowed;
    }
    
    /**
     * Is the book used as a text book in a course?
     */
    public boolean isCourseText()
    {
        return courseText;
    
    }
    
    /**
     * Print the title, author name and page count to the terminal.
     */
    public void printDetails()
    {
        System.out.println("Book title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Numer of pages: " + pages);
        
        if (courseText){
            System.out.println("This book is used as a text book in a course");
        }
        
        if (refNumber.length() > 0){
            System.out.println("Reference number: " + refNumber);
        }
        else {
            System.out.println("Reference number: " + "No reference number set.");
        }
        
        System.out.println("This book has been borrowed " + borrowed + " times.");
    }
}