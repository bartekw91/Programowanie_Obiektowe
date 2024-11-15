public class nr4 {

    public static int sumaDodatnich(int[] tab)
    {
        int wynik = 0;
        for(int i: tab)
        {
            if(i >= 0) wynik+= i;
        }
        return wynik;
    }

    public static int sumaUjemnych(int[] tab)
    {
        int wynik = 0;
        for(int i: tab)
        {
            if(i < 0) wynik+= i;
        }
        return wynik;
    }

    public static double sumaOdwrotnosci(int[] tab)
    {
        double wynik = 0;
        for(double i: tab)
        {
           wynik+= 1/i;
        }
        return wynik;
    }

    public static double sredniaArytmetyczna(int[] tab)
    {
        double wynik = 0;
        for(int i: tab)
        {
            wynik += i;

        }
        return wynik/tab.length;
    }

    public static double sredniaGeometryczna(int[] tab)
    {
        double wynik = 1;
        for(int i=0;i < tab.length;i++)
        {
            wynik *= tab[i];
        }
        wynik = Math.pow(wynik, 1.0/ tab.length);
        return wynik;
    }

    public static double sredniaHarmoniczna(int[] tab)
    {
        double mianownik = sumaOdwrotnosci(tab);
        double wynik = tab.length/mianownik;
        return wynik;
    }
}
