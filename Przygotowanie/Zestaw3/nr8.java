public class nr8 {
    public static int silniaPodwojna(int n)
    {
        int wynik = 1;
        for(;n > 0; n-=2) wynik *= n;
        return wynik;
    }
}
