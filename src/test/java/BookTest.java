import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book1;

    @Before
    public void before(){
        book1 = new Book("Peter pan", "James Matthew Barrie", "Fantasy");
    }

    @Test
    public void canGetTitle(){
        assertEquals("Peter pan", book1.getTitle());
    }

    @Test
    public void canGetAuthor(){
        assertEquals("James Matthew Barrie", book1.getAuthor());
    }

    @Test
    public void canGetGenre(){
        assertEquals("Fantasy", book1.getGenre());
    }




}
