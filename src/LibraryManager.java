import java.util.Scanner;
import java.util.ArrayList;
public class LibraryManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> customerList = new ArrayList<>();
        while (true){
            printMenu();
            int command = scanner.nextInt();
        }
    }
    public static void printMenu(){
        System.out.println("1 - Посмотреть наличие книг.");
        System.out.println("2 - Добавить в корзину книгу.");
        System.out.println("3 - Выбрать дату сдачи книги.");
        System.out.println("0 - выход из библиотечного менеджера");
    }
}
