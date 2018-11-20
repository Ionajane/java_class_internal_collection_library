import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class BookTest {

    Books book;

    @Before
    public void before() {

        book = new Books("A streetcat called Bob", "James Bowen", "Autobiography");
    }

    @Test
    public void hasTitle() {

        assertEquals("A streetcat called Bob", book.getTitle());
    }

    @Test
    public void hasAuthor(){

        assertEquals("James Bowen", book.getAuthor());
    }

    @Test
    public void hasGenre(){

        assertEquals("Autobiography", book.getGenre());
    }

}

//Books should have title, author and genre.
