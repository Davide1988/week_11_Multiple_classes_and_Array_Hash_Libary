import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Library library2;
    private Book book1;
    private Book book2;
    private Client client;

    @Before
    public void before(){
        library = new Library("Libro", 20);
        library2 = new Library("Mondadori", 1);
        book1 = new Book("Peter pan", "James Matthew Barrie", "Fantasy");
        book2 = new Book("Frankenstein", "Mary Shell", "Horror");
        client = new Client("Booby");
    }

    @Test
    public void canGetName(){
        assertEquals("Libro", library.getName());
    }

    @Test
    public void canCountTheBookInCollection(){
        assertEquals(0, library.getNumberOfBooksInCollection());
    }

    @Test
    public void shouldBeAbleToAddABook(){
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.getNumberOfBooksInCollection());
        library2.addBook(book1);
        library2.addBook(book2);
        assertEquals(1, library2.getNumberOfBooksInCollection());
    }

    @Test
    public void shouldGiveAbook(){
        library.addBook(book1);
        library.addBook(book2);
        library.giveBook();
        assertEquals(1, library.getNumberOfBooksInCollection());
    }

    @Test
    public void shouldHaveCatalogue(){
        library.addBook(book1);
        library.addBook(book2);
        library.makeCatalogue(book1,book2);
        assertEquals(3, library.getCatalogue());
    }




}
