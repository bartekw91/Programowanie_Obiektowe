public class nr2 {
    public static void run()
    {
        double dzialanie_1 = ((Math.sqrt(7) - 1) / 2) + Math.pow(3, 3) % 2;
        double dzialanie_2 = 1991.0 / (6 * 10);
        double dzialanie_3 = (3 + Math.sqrt(3) / ((Math.sqrt(5)/2) / 3)) + 1;
        double dzialanie_4 = 312 % 5 % 6;
        double dzialanie_5 = (7 % 10 + 1) / Math.sqrt(Math.sqrt(2));
        int dz1 = (int)(dzialanie_1);
        int dz2 = (int)(dzialanie_2);
        int dz3 = (int)(dzialanie_3);
        int dz4 = (int)(dzialanie_4);
        int dz5 = (int)(dzialanie_5);

        System.out.printf("Wynikiem 1 działania jest: %f a w typie int jest to %d\n",dzialanie_1, dz1);
        System.out.printf("Wynikiem 2 działania jest: %f a w typie int jest to %d\n",dzialanie_2, dz2);
        System.out.printf("Wynikiem 3 działania jest: %f a w typie int jest to %d\n",dzialanie_3, dz3);
        System.out.printf("Wynikiem 4 działania jest: %f a w typie int jest to %d\n",dzialanie_4, dz4);
        System.out.printf("Wynikiem 5 działania jest: %f a w typie int jest to %d\n",dzialanie_5, dz5);
    }
}
