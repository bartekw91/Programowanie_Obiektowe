import java.util.Scanner;

public class nr1 {
    public static int[] generujTablice(int n, int minWartosc, int maxWartosc)
    {
        int[] tablica = new int[n];

        for(int i=0;i < n;i++)
        {
            tablica[i] = (minWartosc + (int)(Math.random() * ((maxWartosc - minWartosc) + 1 )));
        }
        return tablica;
    }
}
