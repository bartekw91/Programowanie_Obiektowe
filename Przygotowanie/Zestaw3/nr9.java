public class nr9 {
    public static int silnia(int m, int n)
    {
        if(m > n)
        {
            System.out.println("Liczba musi być mniejsza od n!");
            return 0;
        }
        else
        {
            int wynik = 1;
            for (; m > 0; m--) wynik *= m;
            return wynik;
        }
    }
}
