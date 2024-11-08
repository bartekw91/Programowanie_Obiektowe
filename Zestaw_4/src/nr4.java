public class nr4 {
    public static double sumaDodatnich(int[] tab)
    {
        double wynik=0;

        for(int i=0;i < tab.length;i++)
            if(tab[i] > 0) wynik+=tab[i];

        return wynik;
    }
    public static double sumaUjemnych(int[] tab)
    {
        double wynik=0;

        for(int i=0;i < tab.length;i++)
            if(tab[i] < 0) wynik+=tab[i];

        return wynik;
    }
    public static double sumaOdwrotnosci(int[] tab)
    {
        double wynik=0;

        for(int i=0;i < tab.length;i++)
            wynik+=Math.pow(tab[i], -1);

        return wynik;
    }
    public static double sredniaArytmetyczna(int[] tab)
    {
        double wynik=0;

        for(int i=0;i < tab.length;i++)
            wynik+=tab[i];

        return wynik/tab.length;
    }
    public static double sredniaGeometryczna(int[] tab)
    {
        double wynik=tab[0];

        for(int i=1;i < tab.length;i++)
            wynik*=tab[i];

        return Math.pow(wynik, (double)1/tab.length);
    }
    public static double sredniaHarmoniczna(int[] tab)
    {
        double wynik=0;

        for(int i=0;i < tab.length;i++)
            wynik+=Math.pow(tab[i], -1);

        return tab.length/wynik;
    }
}
