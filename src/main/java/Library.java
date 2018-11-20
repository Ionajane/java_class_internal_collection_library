import java.util.ArrayList;

public class Library {

    private ArrayList<Books> books;
    private int capacity;

    public Library(int capacity) {
        this.capacity = capacity;
        this.books = new ArrayList<>();
    }


    public int countBooks() {
    return this.capacity;
    }

    public int checkLibarayHasBooks() {
        return this.books.size();
    }

    public void add(Books book) {
    if (this.books.size() < this.capacity) {
        this.books.add(book);
    }

    public void checkStockCapacity() {
        
        }

}
