public class nr10 {
    public static int dwumianNewtona(int n, int k)
    {
        return nr7.silnia(n)/(nr7.silnia(k) * (nr7.silnia(n-k)));
    }

}
