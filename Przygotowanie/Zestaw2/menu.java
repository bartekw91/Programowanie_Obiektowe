import java.util.Scanner;
public class menu {
    public static void main()
    {
        System.out.println("===== ZESTAW ZADAŃ NR 2 =====\n");
        System.out.println("1 - Określ jaki będzie typ danej wyniku operacji");
        System.out.println("2 - Wykonaj działania a następnie zrzutuj na int");
        System.out.println("3 - Napisz program, który będzie pobierał dwa słowa od użytkownika i wypisywał je na ekranie");
        System.out.println("4 - Napisz program, który będzie pobierał dwie liczby od użytkownika a następnie je +/-/*/:");
        System.out.println("5 - Napisz program, który będzie pobierał liczbę od użytkownika a następnie wykona poszczególne zadania");
        System.out.println("\nexit - Wyjdź z programu");
        System.out.print("\nWybierz nr zadania z tego zestawu a podam odpowiedź: ");

        Scanner myObj = new Scanner(System.in);
        String choice = myObj.nextLine();

        switch(choice){
            case "1":
                nr1.run();
                break;
            case "2":
                nr2.run();
                break;
            case "3":
                nr3.run();
                break;
            case "4":
                nr4.run();
                break;
            case "5":
                nr5.run();
                break;
            case "exit":
                System.out.println("Bye, bye....");
                break;
        }
    }
}
