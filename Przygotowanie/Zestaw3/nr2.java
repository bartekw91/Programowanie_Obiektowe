public class nr2 {
    public static void funKwaRozwiazania(int n)
    {
        for(int a = -n;a <= n;a++)
        {
            if (a == 0) continue;
            for(int b = -n;b <= n;b++)
            {
                for(int c = -n;c <= n; c++)
                {
                    if(b * b - 4 * a * c >= 0)
                    {
                        System.out.printf("a = %d, b = %d, c = %d\n", a, b, c);
                    }
                }
            }
        }
    }
}
