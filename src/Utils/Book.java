package Utils;

public class Book {
    private static int counter = 1;
    private int id;
    private String title;
    private String author;
    private int year;
    private boolean isAvailable;

    public Book(String title, String author, int year) {
        this.id = counter++;
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "[" + id + "] " + title + " (" + author + ", " + year + ") - " + (isAvailable ? "Доступна" : "Выдана");
    }
}
