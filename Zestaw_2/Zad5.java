import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Napisz daną liczbę typu Int:");
        int liczba = myObj.nextInt();

        System.out.printf("Dodawanie:%d\n", liczba+=140);
        System.out.printf("Odejmowanie:%d\n", liczba-=31);
        System.out.printf("Mnożenie:%d\n", liczba*=7);
        System.out.printf("Dzielenie:%d\n", liczba/=13.0);
        System.out.printf("Modulo:%d\n", liczba%=7);
        System.out.printf("Dzielenie całkowite:%d\n", liczba/=4);
        System.out.printf("Potęgowanie:%d\n", (int)Math.pow(liczba, 45));
        System.out.printf("Iloczyn bitowy:%d\n", liczba&=67);
        System.out.printf("Suma bitowa:%d\n", liczba|=59);
        System.out.printf("XOR:%d\n", liczba^=23);
        System.out.printf("Przesunięcie w lewo:%d\n", liczba>>=5);
        System.out.printf("Przesunięcie w prawo:%d\n", liczba<<=6);
    }
}
