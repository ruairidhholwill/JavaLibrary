import org.junit.Before;
import org.junit.Test;

public class BookTest {

    Book book;

    @Before
    public void before() {
        book = new Book("Harry Potter", "JK Rowling", "Fantasy");
    }

}
