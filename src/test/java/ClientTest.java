import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClientTest {

    private Client client;
    private Book book;
    private Library library;

    @Before
    public void before(){
        client = new Client("Bobby");
        book = new Book("Peter pan", "James Matthew Barrie", "Fantasy");
        library = new Library("Mondadori", 20);
    }

    @Test
    public void canGetName(){
        assertEquals("Bobby", client.getName());
    }

    @Test
    public void canCheckBag(){
        assertEquals(0, client.checkBag());
    }

    @Test
    public void CanGetBook(){
        client.getBook(book);
        assertEquals(1, client.checkBag());
    }

    @Test
    public void CanGetBookFromLibrary(){
        library.addBook(book);
        assertEquals(1, library.getNumberOfBooksInCollection());
        client.getBookFromLibrary(library);
        assertEquals(0, library.getNumberOfBooksInCollection());
        assertEquals(1, client.checkBag());
    }





}
