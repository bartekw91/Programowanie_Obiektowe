import java.util.Scanner;

public class nr3 {
    public static void run()
    {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Wpisz pierwsze słowo: ");
        String P_Slowo = myObj.nextLine();
        System.out.print("Wpisz drugie słowo: ");
        String D_Slowo = myObj.nextLine();
        System.out.println("Oto wynik: " + P_Slowo + " " + D_Slowo);
    }
}
