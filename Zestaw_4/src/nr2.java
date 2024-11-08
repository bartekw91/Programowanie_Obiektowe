public class nr2 {
    public static void macierz(int tab[], int n, int m)
    {
        int w=1;
        int k=1;
        int count=0;
        while(w <= n)
        {
            while(k <= m)
            {
                if (k < m) System.out.print(tab[count] + ", ");
                else if (k == m) System.out.print(tab[count]);
                count++;
                k++;
            }
            w++;
            k=1;
            System.out.print("\n");
        }
    }
}
