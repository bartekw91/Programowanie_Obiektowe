public class nr2 {
    public static void wypiszMacierz(int[] tab, int n, int m)
    {
        // tab = [ 2,  3,  4,  5,  6,  7,  8,  9,  2 ]
        //        0x0 0x1 0x2 1x0 1x1 1x2 2x0 2x1 2x2
        int count = 0;
        for(int w=0;w < n;w++)
        {
            for(int k=0;k < m;k++)
            {
                if(count <= tab.length-1)
                {
                    System.out.printf(" %d ", tab[count]);
                    count++;
                }
                else System.out.print(" , ");
            }
            System.out.println();
        }
    }
}
