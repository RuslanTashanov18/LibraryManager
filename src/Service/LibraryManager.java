package Service;

import Utils.Book;
import Utils.User;

import java.util.*;

public class LibraryManager {
    private List<Book> books = new ArrayList<>();
    private Map<Integer, User> users = new HashMap<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void addUser(User user) {
        users.put(user.getId(), user);
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<User> getUsers() {
        return new ArrayList<>(users.values());
    }
}
