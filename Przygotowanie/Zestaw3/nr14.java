public class nr14 {
    private static int silnia(int n)
    {
        if (n==0) return 1;
        int wynik = 1;
        while(n>0)
        {
            wynik *= n;
            n--;
        }
        return wynik;
    }
    private static int dwumianNewtona(int n, int k)
    {
        return silnia(n) / (silnia(k) * silnia(n-k));
    }
    public static void trojkatPascala(int n)
    {
        for(int y=0;y<n;y++)
        {
            for(int x=0;x<n*2;x++)
            {
                if(x >= n-y && x<=n) System.out.print(" "+dwumianNewtona(y, n-x));
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
