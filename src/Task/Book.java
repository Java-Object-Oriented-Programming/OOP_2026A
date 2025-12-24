package Task;

public class Book {
    Page[] pages;
    int size;


    public Book(int size) {
        this.size = size;
        this.pages = new Page[size];
    }
}
