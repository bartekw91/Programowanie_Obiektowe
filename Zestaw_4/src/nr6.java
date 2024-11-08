public class nr6 {
    public static int najdluzszyCiagDodatni(int[] tab)
    {
        int dlugosc = 0;
        for(int i=0;i < tab.length;i++)
        {
            if (tab[i] >= 0) dlugosc++;
        }
        return dlugosc;
    }
    public static int najdluzszyCiagUjemny(int[] tab)
    {
        int dlugosc = 0;
        for(int i=0;i < tab.length;i++)
        {
            if (tab[i] < 0) dlugosc++;
        }
        return dlugosc;
    }
    public static int[] odwrocTablice(int[] tab)
    {
        for(int i=0;i < tab.length/2;i++)
        {
           int tmp = tab[(tab.length-1)-i];
           tab[(tab.length-1)-i] = tab[i];
           tab[i] = tmp;
        }
        return tab;
    }
    public static int[] odwrocTabliceAlt(int[] tab, int indexStart, int indexStop)
    {
        if(indexStart > indexStop)
        {
            throw new ArrayIndexOutOfBoundsException("Indeks początkowy musi być mniejszy od końcowego!");
        }
        else if (indexStart < 0 || indexStop > tab.length-1)
        {
            throw new ArrayIndexOutOfBoundsException("Indeks początkowy/końcowy nie może wyjść poza długości tablicy");
        }
        else
        {
            int i=0;
            while(i < (indexStop - indexStart)/2)
            {
                int temp=tab[indexStart+i];
                tab[indexStart+i]=tab[indexStop-i];
                tab[indexStop-i]=temp;
                i++;
            }
            return tab;
        }
    }
}
