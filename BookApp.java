import java.util.Scanner;

public class BookApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj autora ksiazki");
        String author = scanner.nextLine();

        System.out.println("Podaj tytu ksiazki");
        String title = scanner.nextLine();

        System.out.println("Podaj krotki opis ksiazki");
        String description = scanner.nextLine();

        System.out.println("Ile stron ma ksiazka");
        Integer pages = scanner.nextInt();

        Book firstBook = new Book(author, title, description, pages);
        System.out.println(firstBook.toString());

    }
}
