public class nr17 {
    public static boolean czyPierwsza(int n)
    {
        int l_pierwsza=2;
        int count=0;
        for(int i=1;i <= n;i++)
        {
            if(n%i == 0)
            {
                    count++;
            }
            if (count == 2)
            {
                l_pierwsza=i;
            }
        }
        return n == l_pierwsza;
    }
}
