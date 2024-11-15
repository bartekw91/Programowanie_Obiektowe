public class nr5 {
    public static void liczbyPodzielne(int m, int n)
    {
        if (m == 1)
        {
            for(int i = 0;i < 10;i++)
            {
                if(i%n == 0) System.out.println(i);
            }
        }
        else
        {
         m = (int)Math.pow(10, (double)m-1%10);
         for(int i = m ; i < m*10;i++)
         {
             if(i%n == 0) System.out.println(i);
         }
        }
    }
}
