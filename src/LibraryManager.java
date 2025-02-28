import java.util.Scanner;
import java.util.ArrayList;
public class LibraryManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> customerList = new ArrayList<>();
        ArrayList<Books> listBooks = new ArrayList<>();
        listBooks.add(Books.HarryPotter);
        listBooks.add(Books.LordOfRings);
        listBooks.add(Books.HungerGames);
        listBooks.add(Books.GameOfThrones);
        listBooks.add(Books.RichMan);
        while (true){
            printMenu();
            int command = scanner.nextInt();
            if (command == 1){
                System.out.println("Список доступных книг:");
                for (Books books : listBooks){
                    System.out.println(books);
                }
            }
            else if (command == 2){
                System.out.println("Какую книгу вы хотите добавить в корзину?");
                String customerBook = scanner.next();
                customerList.add(customerBook);
                System.out.println("Книга было успешно добавлено в корзину!");
            }
            else if (command == 3){
                System.out.println("Можно взять книгу на 10,20,30 дней!");
                System.out.println("Выбрать срок сдачи:");
                int customerDeadline = scanner.nextInt();
                if (customerDeadline < 30){
                    System.out.println("Вы взяли книгу на " + customerDeadline + " дней!");
                } else {
                    System.out.println("Можно взять книгу только до 30 дней!");
                }
            }
            else if (command == 4){
                System.out.println("Ваша корзина: ");
                for (String customerBook : customerList){
                    System.out.println(customerBook);
                }
            }
            else if (command == 0){
                System.out.println("Вы вышли из Библиотечного менеджера!");
                break;
            }
        }
    }
    public static void printMenu(){
        System.out.println("1 - Посмотреть наличие книг.");
        System.out.println("2 - Добавить в корзину книгу.");
        System.out.println("3 - Выбрать срок сдачи книги.");
        System.out.println("4 - Посмотреть свою корзину.");
        System.out.println("0 - выход из библиотечного менеджера");
    }
}
