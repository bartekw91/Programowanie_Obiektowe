import java.util.Scanner;
public class nr10 {
    public static void run()
    {
        Scanner myObj = new Scanner(System.in);

        System.out.print("Wpisz tytuł książki: ");
        String title = myObj.nextLine();
        System.out.print("Wpisz imię i nazwisko autora tej książki: ");
        String author = myObj.nextLine();

        System.out.printf("'%s' to najlepsza książka napisana przez '%s", title, author);
    }
}
