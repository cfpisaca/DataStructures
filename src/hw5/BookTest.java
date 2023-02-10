package hw5;

import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.Date;


public class BookTest {

    /** A single test for book. **/
    @Test public void testBook() {
    
        String title = "Starting Out With Java";
        String author = "Tony Gaddis";
        String isbn = "978-0-13-395705-1";
        int year = 2016;
        int pages = 1188;
        
        //Test constructor and getters method
        Book book1 = new Book(title, author, isbn, year, pages);
        assertEquals("Book: getTitle check ", title, book1.getTitle());
        assertEquals("Book: getAuthor check ", author, book1.getAuthor());
        assertEquals("Book: getIsbn check ",  isbn, book1.getIsbn());
        assertEquals("Book: getYear check ", year, book1.getYear());
        assertEquals("Book: getPages check ", pages, book1.getPages());
        assertEquals("Book: getStatus check ", book1.AVAILABLE, book1.getStatus());
        assertEquals("Book: getDue ", null, book1.getDue());
        assertEquals("Book: getPatron ", null, book1.getPatron());
        
        String title2 = "Starting Out With Java Edition 4";
        String author2 = "T. Gaddis";
        String isbn2 = "978-0-13-608020-6";
        int year2 = 2008;
        int pages2 = 977;
        
        // Test equals method
        Book book2 = new Book(title2, author2, isbn2, year2, pages2);
        Book book3 = new Book(title, author, isbn, year, pages);
        assertFalse("Book: book1 != book2", book1.equals(book2));
        assertTrue("Book: book1 == book3", book1.equals(book3));
        assertFalse("Book: string not equal test", 
                     book1.equals(book2.getIsbn()));
        assertTrue("Book: string equal test", book1.equals(book3.getIsbn()));
        
        
        // Test toString method
        assertEquals("Book: toString", book1.toString(),
                     "Title: Starting Out With Java, Author: Tony Gaddis, "
                     + "ISBN: 978-0-13-395705-1, Year: 2016, Pages: 1188.");
                     
        // Test checkout method
        Patron aPatron = new Patron("Dee A. B. Weikle", "weikleda@jmu.edu", 
                                    2, 1.50);
        Patron ePatron = new Patron("Dee A. B. Weikle", "weikleda@jmu.edu", 
                                    2, 1.50);
        Date dueDate = new Date();
        book1.checkout(ePatron, dueDate);
        assertTrue("Book: checkout", ePatron.equals(book1.getPatron()));
        
        assertEquals("Book: checkout date", dueDate, book1.getDue());
        assertEquals("Book: checkout status", book1.UNAVAILABLE, book1.getStatus());
        
        // Test checkin method
        book1.checkin();
        assertEquals("Book: checkin", null, book1.getPatron());
        
        assertEquals("Book: checkout date", null, book1.getDue());
        assertEquals("Book: checkout status", book1.AVAILABLE, book1.getStatus());       
        
    }
   
}
