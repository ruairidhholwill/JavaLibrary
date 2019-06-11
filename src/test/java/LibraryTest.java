import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Book book;
    Library library;

    @Before
    public void before(){
        library = new Library(5);
    }

    @Test
    public void countBooks() {
        assertEquals(0, library.bookCount());
    }

    @Test
    public void addBook(){
        library.addBookToList(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void checkCapacityWhenStockNotFull(){
        assertEquals(false, library.checkCapacityIsFullOrNot());
    }

    @Test
    public void checkCapacityWhenStockFull(){
        library.addBookToList(book);
        library.addBookToList(book);
        library.addBookToList(book);
        library.addBookToList(book);
        library.addBookToList(book);
        assertEquals(true, library.checkCapacityIsFullOrNot());
    }
}
