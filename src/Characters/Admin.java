package Characters;
import Utils.User;
import Utils.Book;
import Service.LibraryManager;

public class Admin extends User {
    public Admin(int id, String name) {
        super(id, name);
    }

    public void printUsers(LibraryManager manager) {
        System.out.println("Пользователи:");
        for (User user : manager.getUsers()) {
            System.out.println(user.getId() + ": " + user.getName() + " (" + user.getClass().getSimpleName() + ")");
        }
    }

    public void printBooks(LibraryManager manager) {
        System.out.println("Книги в библиотеке");
        for (Book book : manager.getBooks()) {
            System.out.println(book);
        }
    }
}
