public class nr15 {
    public static boolean czyPalindrom(int n)
    {
        int n_copy = n;
        int wynik = 0;
        int ile_cyfr = -1;
        for(int i = 0;n_copy > 0;ile_cyfr++)
        {
            n_copy /= 10;
        }

        n_copy = n;

        for(int i=ile_cyfr;n_copy > 0;i--)
        {
            int multi = (int)Math.pow(10, i);
            int cyfra = n_copy % 10;
            wynik += cyfra * multi;
            n_copy -= cyfra;
            n_copy /= 10;
        }
        return (wynik == n);
    }
}
