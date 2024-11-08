public class nr5 {
    public static int[] funkcjaLiniowa(int[] tab,int a,int b)
    {
        int[] wynik = new int[tab.length];

        for(int i = 0;i < tab.length;i++)
        {
            wynik[i] = a * tab[i] + b;
        }

        return wynik;
    }

    public static int[] funkcjaKwadratowa(int[] tab,int a,int b, int c)
    {
        int[] wynik = new int[tab.length];

        for(int i = 0;i < tab.length;i++)
        {
            wynik[i] = (int)(a * Math.pow(tab[i], 2) + b * tab[i] + c);
        }

        return wynik;
    }

    public static int[] funkcjaWykladnicza(int[] tab,int a)
    {
        int[] wynik = new int[tab.length];

        for(int i = 0;i < tab.length;i++)
        {
            wynik[i] = (int)Math.pow(a, tab[i]);
        }

        return wynik;
    }

    public static int[] funkcjaSignum(int[] tab)
    {
        int[] wynik = new int[tab.length];

        for(int i = 0;i < tab.length;i++)
        {
            if (tab[i] > 0) wynik[i] = 1;
            else if (tab[i] < 0) wynik[i] = -1;
            else wynik[i] = 0;
        }

        return wynik;
    }
}
