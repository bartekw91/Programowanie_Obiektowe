public class nr1 {
    public static void trojkiPitagorejskie(int n)
    {
        for(int a = 1; a <= n-2;a++)
            for(int b= a+1; b <=n-1;b++)
                for(int c = b+1; c <= n;c++)
                {
                    if(a*a + b*b == c*c) System.out.printf("%d, %d, %d\n", a, b, c);
                }
    }
}
