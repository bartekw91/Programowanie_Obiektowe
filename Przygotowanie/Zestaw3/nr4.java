public class nr4 {
    public static void liczbyPierwsze(int n)
    {
        if(n < 2)
        {
            System.out.println("Liczba musi być większa lub równa 2!");
        }
        else
        {
            for(int a = 2;a <= n;a++)
            {
                int count = 0;
                for(int x = 1;x <= a;x++)
                {
                    if(a % x == 0) count++;
                }
                if(count == 2)
                {
                    System.out.println(a);
                }
            }
        }
    }
}
