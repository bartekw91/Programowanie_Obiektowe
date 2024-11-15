import java.util.Arrays;

public class nr6 {

    public static void najdluzszyCiagDodatni(int[] tab)
    {
        int max_ciag = 0;
        int temp_ciag = 0;
        for(int i = 0 ; i < tab.length;i++)
        {
            if(tab[i] > 0)
            {
                temp_ciag++;
            }
            else
            {
                max_ciag = Math.max(max_ciag, temp_ciag);
                temp_ciag = 0;
            }
        }
        max_ciag = Math.max(max_ciag, temp_ciag);
        System.out.println("Najdłuższy ciąg liczb dodatnich wynosi " + max_ciag);
    }
    public static void najdluzszyCiagUjemnych(int[] tab)
    {
        int max_ciag = 0;
        int temp_ciag = 0;
        for(int i = 0 ; i < tab.length;i++)
        {
            if(tab[i] < 0)
            {
                temp_ciag++;
            }
            else
            {
                max_ciag = Math.max(max_ciag, temp_ciag);
                temp_ciag = 0;
            }
        }
        max_ciag = Math.max(max_ciag, temp_ciag);
        System.out.println("Najdłuższy ciąg liczb ujemnych wynosi " + max_ciag);
    }

    public static void odwrocTablice(int[] tab)
    {
        int temp=0;
        int dl = tab.length-1;
        for(int i = 0; i< Math.floor((double) tab.length /2);i++)
        {
            temp = tab[i];
            tab[i] = tab[dl-i];
            tab[dl-i] = temp;
        }
        System.out.println("Oto odwrócona tablica:\n" + Arrays.toString(tab));
    }
    public static void odwrocTabliceIndex(int[] tab, int indeksStart, int indeksStop)
    {
        if (indeksStart > indeksStop)
        {
            System.out.println("Wartość początkowa nie może być większa niż końcowa");
        }
        else
        {

            for(int i = 0;i < indeksStop - indeksStart;i++)
            {
                if(indeksStop-i >= indeksStart+i)
                {
                    int temp = 0;
                    temp = tab[indeksStart + i];
                    tab[indeksStart + i] = tab[indeksStop - i];
                    tab[indeksStop - i] = temp;
                }
            }
            System.out.println("Oto odwrócona tablica:\n" + Arrays.toString(tab));
        }
    }
}
