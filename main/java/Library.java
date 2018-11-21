import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Books> books;

    public Library(int capacity){
        this.capacity = capacity;
        this.books = new ArrayList<>();

    }

    public void addBook(Books books){
        this.books.add(books);
    }

    public int bookCount(){
        return this.books.size();
    }

    public boolean checkCapacity(){
        if (bookCount() < this.capacity){
            return true;
        }
        else {
            return false;
        }
    }

}
