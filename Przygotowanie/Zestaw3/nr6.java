public class nr6 {
    public static void piramida(int n, int wariant)
    {
        switch(wariant)
        {
            case 1:
                for (int y = 0; y < n; y++)
                {
                    for (int x = 0; x < n * 2; x++)
                    {
                        if (x >= n - y && x <= n + y) System.out.print("*");
                        else System.out.print(" ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for (int y = 0; y < n; y++)
                {
                    for (int x = 0; x <= y; x++)
                    {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Proszę podać 1 lub 2 wariant");
            }
        }
}
