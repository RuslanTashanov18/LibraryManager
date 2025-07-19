package Characters;
import Utils.User;
import Utils.Book;

public class Librarian extends User {
    public Librarian(int id, String name) {
        super(id, name);
    }

    public void giveBook(Book book, Student student) {
        if (book.isAvailable()) {
            student.getBorrowedBooks().add(book);
            book.setAvailable(false);
            System.out.println("Книга '" + book.getTitle() + "' выдана студенту " + student.getName() );
        } else {
            System.out.println("Книга недоступна для выдачи");
        }
    }

    public void receiveBook(Book book, Student student) {
        if (student.getBorrowedBooks().remove(book)) {
            book.setAvailable(true);
            System.out.println("Книга '" + book.getTitle() + "' возвращена в библиотеку");
        } else {
            System.out.println("У студента нет этой книги");
        }
    }
}
