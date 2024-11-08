public class zadania {
    public static void trojkiPitagorejskie(int n)
    {
        for(int a=3;a <= n - 2;a++)
        {
            for(int b=a+1;b <= n - 1;b++)
            {
                for(int c=b+1;c <= n;c++)
                {
                    if(a*a + b*b == c*c)
                    {
                        System.out.printf("%d, %d, %d\n", a, b, c);
                    }
                }
            }
        }
    }
    public static void liczbyPierwsze(int n)
    {

        for(int i=2;i <= n; i++)
        {
            int dzielnik=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j == 0)
                {
                    dzielnik++;
                }
            }
            if (dzielnik == 2)
            {
                System.out.printf("%d\n", i);
            }
        }
    }
    public static int silnia(int n)
    {
        if (n == 0 || n == 1)
        {
            return 1;
        }
        int wynik=n;
        for(int i=n-1;i>1;i--)
        {
            wynik*=i;
        }
        return wynik;
    }
    public static void silniaPodwojna(int n)
    {
        int wynik=n;
        for(int i=n-2;i>1;i-=2)
        {
            wynik*=i;
        }
        System.out.printf("%d", wynik);
    }
    public static void DwumianNewtona(int n, int k)
    {
        int wynik=0;
        for(int i=0;i <=k;i++)
        {
            wynik+=(silnia(n)/(silnia(i)*silnia(n-i)));
        }
    }
    public static void ciagFibonacchiego(int n)
    {
            int n0 = 0;
            int n1 = 1;
            int wynik=0;
            for(int i=0;i<n;i++)
            {
                if(i == 0)
                {
                    System.out.printf("0 ");
                }
                if(i == 1)
                {
                    System.out.printf("1 ");
                }
                else
                {
                    wynik=n1+n0;
                    n0=n1;
                    n1=wynik;
                    System.out.printf("%d ", wynik);
                }
        }
    }

}
