import java.util.Scanner;

public class nr4 {
    public static void run()
    {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Wpisz pierwszą liczbę całkowitą: ");
        int dz_1 = myObj.nextInt();
        System.out.print("Wpisz drugą liczbę całkowitą: ");
        int dz_2 = myObj.nextInt();
        System.out.println("Oto wyniki:");
        System.out.printf("%d + %d = %d", dz_1, dz_2, dz_1 + dz_2);
        System.out.printf("%d - %d = %d", dz_1, dz_2, dz_1 - dz_2);
        System.out.printf("%d * %d = %d", dz_1, dz_2, dz_1 * dz_2);
        System.out.printf("%d / %d = %d", dz_1, dz_2, dz_1 / dz_2);
    }
}
