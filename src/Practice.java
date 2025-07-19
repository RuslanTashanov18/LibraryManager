import Characters.Admin;
import Characters.Librarian;
import Characters.Student;
import Characters.Supplier;
import Service.LibraryManager;
import Utils.Book;

public class Practice {
    public static void main(String[] args) {
        LibraryManager manager = new LibraryManager();

        Admin admin = new Admin(1, "Damir");
        Librarian librarian = new Librarian(2, "Petya");
        Student student = new Student(3, "Miron");
        Supplier supplier = new Supplier(4, "Mansur");

        manager.addUser(admin);
        manager.addUser(librarian);
        manager.addUser(student);
        manager.addUser(supplier);

        Book book1 = new Book("Война и мир", "Л.Н. Толстой", 1869);
        Book book2 = new Book("Қара сөздер", "Абай Кунанбаев", 1898);

        // Поставщик добавляет книгу
        supplier.deliverBook(book1, manager);
        supplier.deliverBook(book2, manager);

        System.out.println();

        // Библиотекарь выдает книгу студенту
        librarian.giveBook(book1, student);
        librarian.giveBook(book2, student);
        System.out.println(student.getName() + " взял книгу: " + book1.getTitle());
        System.out.println(student.getName() + " взял книгу: " + book2.getTitle());

        System.out.println();

        // Библиотекарь принимает книгу обратно
        librarian.receiveBook(book1, student);
        librarian.receiveBook(book2, student);
        System.out.println(student.getName() + " вернул книгу: " + book1.getTitle());
        System.out.println(student.getName() + " вернул книгу: " + book2.getTitle());

        System.out.println();

        // Администратор просматривает список пользователей и книг
        admin.printUsers(manager);
        admin.printBooks(manager);
    }
}

