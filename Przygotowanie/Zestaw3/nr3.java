public class nr3 {
    public static void funKwaDelta(int n)
    {
        for(int a = 1;a <= n;a++)
        {
            if (a == 0) continue;
            for(int b = 1;b <= n;b++)
            {
                for(int c = 1;c <= n; c++)
                {
                    int delta = b * b - 4 * a * c;
                    int spr = (int) (Math.floor(Math.sqrt(delta)) * Math.floor(Math.sqrt(delta)));
                    if(delta >= 0 && spr == delta)
                    {
                        System.out.printf("a = %d, b = %d, c = %d, delta = %d\n", a, b, c, delta);
                    }
                }
            }
        }
    }
}
