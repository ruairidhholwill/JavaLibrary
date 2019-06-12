import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class BorrowerTest {

        Borrower borrower;
        Book book;
        Library library;

        @Before
        public void before() {
            borrower = new Borrower();
            book = new Book("HP", "JK", "Fantasy");
            library = new Library(2);
        }

        @Test
        public void canAddBookToCollection() {
            borrower.addBook(book);
            assertEquals(1, borrower.bookCount());
        }


}
