public class nr16 {
    public static boolean czyDoskonala(int n)
    {
        int wynik=0;
        for(int i=1;i < n;i++)
        {
            if(n % i == 0)
            {
                wynik+=i;
            }
        }
        return wynik == n;
    }
}
