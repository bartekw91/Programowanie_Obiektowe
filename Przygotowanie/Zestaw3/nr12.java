public class nr12 {
    public static int sumaNaturalnych(int n)
    {
        int wynik = 0;
        for(int i=n; i > 0;i--)
        {
            wynik += i;
        }
        return wynik;
    }

    public static int sumaParzystych(int n)
    {
        int wynik = 0;
        for(int i=n; i > 0;i--)
        {
            if(i % 2 == 0) wynik += i;
        }
        return wynik;
    }

    public static int sumaNieparzystych(int n)
    {
        int wynik = 0;
        for(int i=n; i > 0;i--)
        {
            if(i % 2 != 0) wynik += i;
        }
        return wynik;
    }

    public static int sumaKwaNaturalnych(int n)
    {
        int wynik = 0;
        for(int i=n; i > 0;i--)
        {
            wynik += i*i;
        }
        return wynik;
    }

    public static int sumaSzeNaturalnych(int n)
    {
        int wynik = 0;
        for(int i=n; i > 0;i--)
        {
            wynik += i*i*i;
        }
        return wynik;
    }

    public static double sumaOdwNaturalnych(int n)
    {
        double wynik = 0;
        for(int i=n; i > 0;i--)
        {
            wynik += (double)1/n;
        }
        return wynik;
    }
}
