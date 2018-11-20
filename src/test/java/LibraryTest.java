import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Books book;

    @Before
    public void before() {
        library = new Library(3);
        book = new Books("A streetcat called Bob", "James Bowen", "Autobiography");
    }

    @Test
    public void hasBooksInLibrary() {
        assertEquals(3, library.countBooks());
    }


    @Test
    public void libraryHasBooks() {
        assertEquals(0, library.checkLibarayHasBooks());
    }


    @Test
    public void addBookToLibrary() {
        library.add(book);
        assertEquals(1, library.checkLibarayHasBooks());
    }

    @Test
    public void StockFull() {
        library = new Library(1);
        library.add(book);
        library.add(book);
        assertEquals(1, library.checkStockCapacity());
    }


}

//Write a method to count the number of books in the library.
//Write a method to add a book to the library stock.
//Add a capacity to the library and write a method to check if stock is full before adding a book.