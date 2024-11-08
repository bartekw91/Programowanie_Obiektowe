import java.util.Scanner;

public class nr7 {
    public static int[] generujZakres(int n, int minWartosc, int maxWartosc)
    {
        int[] tablica = new int[n];

        int random_number = (minWartosc + (int)(Math.random() * ((maxWartosc - minWartosc) + 1 )));

        for(int i=0;i < n;i++)
        {
            if(i == 0) tablica[i] = random_number;
            else tablica[i] = tablica[i-1]+random_number;
        }
        return tablica;
    }
}
