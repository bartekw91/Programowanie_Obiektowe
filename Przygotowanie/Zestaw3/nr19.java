import java.util.Scanner;

public class nr19 {
    public static int[] wczytajTablice(int n)
    {
        int[] tablica  = new int[n];
        Scanner input = new Scanner(System.in);
        System.out.printf("Wprowadź liczbę i zatwierdź by wstawić go do tablicy (Max. %d liczb do wstawienia)\n", n);
        for(int i = 0;i < n;i++)
        {
            int input_i = input.nextInt();
            tablica[i] = input_i;
        }
        return tablica;
    }
}
