import java.util.Scanner;
public class Zad3 {
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Wpisz pierwsze słowo:");
        String slowo1 = myObj.nextLine();
        System.out.println("Wpisz drugie słowo:");
        String slowo2 = myObj.nextLine();

        System.out.println("Oto co napisałeś:" + " " + slowo1 + " " + slowo2);
    }
}
