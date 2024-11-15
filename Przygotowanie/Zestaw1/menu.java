import java.util.Scanner;
public class menu {
    public static void main()
    {
        System.out.println("===== ZESTAW ZADAŃ NR 1 =====\n");
        System.out.println("1 - Wypisz swoje imię i nazwisko na ekranie");
        System.out.println("2 - Wypisz długość imienia i nazwiska");
        System.out.println("3 - Połącz 3 wyrazy ('Ala', 'ma', 'kota') w jeden i wyświetl go na ekranie");
        System.out.println("4 - Wypisz obrazek strzałki i diamentu na ekranie");
        System.out.println("5 - W zdaniu 'Ala ma kota' zastąp wszystkie litery 'a' inną literą");
        System.out.println("6 - Zamień wszystkie litery w zdaniu 'Ala ma kota' na wielkie i odwrotnie");
        System.out.println("7 - Jaki kod ASCII mają znaki: A, !, @, >, ~, \\n, \\b");
        System.out.println("8 - W jakich przedziałach w tablicy znaków ASCII znajdują się małe/duże litery i cyfry");
        System.out.println("9 - W podanym zdaniu wstaw w miejscu kropek dowolne słowa");
        System.out.println("10 - W podanym zdaniu wstaw tytuł swojej ulubionej książki i jej autora");
        System.out.println("11 - Wypisz obok siebie 'wodrze' 5 razy.");
        System.out.println("12 - W podanym zdaniu wstaw odpowiednie dane");
        System.out.println("13 - Sprawdź jakie znaki kryją się w numerze: 54, 103, 241, 67, 9999, [im i nazw],[ nr alb]");
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
                nr4.Typ.Arrow();
                nr4.Typ.Diamond();
                break;
            case "5":
                nr5.run();
                break;
            case "6":
                nr6.run();
                break;
            case "7":
                nr7.run();
                break;
            case "8":
                nr8.run();
                break;
            case "9":
                nr9.run();
                break;
            case "10":
                nr10.run();
                break;
            case "11":
                nr11.run();
                break;
            case "12":
                nr12.run();
                break;
            case "13":
                nr13.run();
                break;
            case "exit":
                System.out.println("Bye, bye....");
                break;
        }
    }
}
