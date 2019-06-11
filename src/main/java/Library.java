import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> booksList;

    public Library(int capacity){
        this.capacity = capacity;
        this.booksList = new ArrayList<Book>();
    }

    public int bookCount() {
        return this.booksList.size();
    }


    public void addBookToList(Book book) {
        this.booksList.add(book);
    }


    public boolean checkCapacityIsFullOrNot() {
        if (this.bookCount() >= this.capacity){
            return true;
        } else {
            return false;
        }
    }
}
