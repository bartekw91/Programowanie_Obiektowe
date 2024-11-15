public class nr18 {
    public static int NWD(int a, int b)
    {
        int wynik = a%b;
        for(int wynik2 = wynik;wynik2 > 0;wynik2=a%b)
        {
            a = b;
            b = wynik2;
            if (wynik2 > 0) wynik = wynik2;
        }
        return wynik;
    }
}
