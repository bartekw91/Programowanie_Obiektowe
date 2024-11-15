import java.util.Scanner;

//public class nr7 {
//    public static int[] generujZakres(int n, int minWartosc, int maxWartosc)
//    {
//        int[] tablica = new int[n];
//
//        int random_number = (minWartosc + (int)(Math.random() * ((maxWartosc - minWartosc) + 1 )));
//
//        for(int i=0;i < n;i++)
//        {
//            if(i == 0) tablica[i] = random_number;
//            else tablica[i] = tablica[i-1]+random_number;
//        }
//        return tablica;
//    }
//}
public class nr7 {
    public static double[] generujZakres(int n, int minWartosc, int maxWartosc)
    {
        double[] tablica = new double[n];

//        if (minWartosc < 0) minWartosc*=-1;
//        if (maxWartosc < 0) maxWartosc*=-1;
        double zakres = (maxWartosc - minWartosc) / (double)(n-1);

        tablica[0] = minWartosc;

        for(int i=1;i < n;i++)
        {
            if(i < n-1) tablica[i] = tablica[i-1]+zakres;
            else tablica[i] = maxWartosc;
        }

        return tablica;
    }
}