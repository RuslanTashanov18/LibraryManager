package Characters;
import Utils.Book;
import Utils.User;
import java.util.ArrayList;
import java.util.List;

public class Student extends User {
    private List<Book> borrowedBooks = new ArrayList<>();

    public Student(int id, String name) {
        super(id, name);
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
}

