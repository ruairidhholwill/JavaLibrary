import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> borrowerCollection;

    public Borrower(){
        this.borrowerCollection = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        this.borrowerCollection.add(book);
    }

    public int bookCount() {
        return this.borrowerCollection.size();
    }
}
