public class nr5 {

    public static double[] funkcjaLiniowa(int[] tab, int a, int b)
    {
        double[] wynik = new double[tab.length];

        for(int i = 0; i < wynik.length;i++)
        {
            wynik[i] = a * tab[i] + b;
        }

        return wynik;
    }

    public static double[] funkcjaKwadratowa(int[] tab, int a, int b, int c)
    {
        double[] wynik = new double[tab.length];

        for(int i = 0; i < wynik.length;i++)
        {
            wynik[i] = a * (tab[i] * tab[i]) + b * tab[i] + c;
        }

        return wynik;
    }

    public static double[] funkcjaWykladnicza(int[] tab, int a)
    {
        double[] wynik = new double[tab.length];

        for(int i = 0; i < wynik.length;i++)
        {
            wynik[i] = Math.pow(a, tab[i]);
        }

        return wynik;
    }
    public static int[] funkcjaSignum(int[] tab)
    {
        int[] signum = new int[tab.length];
        for(int i=0;i < tab.length;i++)
        {
            if(tab[i] < 0) signum[i] = -1;
            else if(tab[i] > 0) signum[i] = 1;
            else signum[i] = 0;
        }
        return signum;
    }
}
