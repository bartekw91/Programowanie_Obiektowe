import java.util.Scanner;
public class Zad4 {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        System.out.println("Wpisz pierwszą liczbę:");
        Integer P_liczba = myObj.nextInt();
        System.out.println("Wpisz drugą liczbę:");
        Integer D_liczba = myObj.nextInt();

        System.out.printf("Dodawanie: %d\n", P_liczba+D_liczba);
        System.out.printf("Odejmowanie: %d\n", P_liczba-D_liczba);
        System.out.printf("Mnożenie: %d\n", P_liczba*D_liczba);
        System.out.printf("Dzielenie: %d\n", P_liczba/D_liczba);
    }
}