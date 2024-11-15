import java.util.Arrays;

public class nr3 {

    static int count = 0;

    public static void ileNieparzystych(int[] tab)
    {
        for(int i=0;i < tab.length;i++)
        {
            if (tab[i] % 2 != 0) count++;
        }
        System.out.println("W tablicy jest " + count + " liczb nieparzystych");
    }

    public static void ileParzystych(int[] tab)
    {
        for(int i=0;i < tab.length;i++)
        {
            if (tab[i] % 2 == 0) count++;
        }
        System.out.println("W tablicy jest " + count + " liczb parzystych");
    }

    public static void ileDodatnich(int[] tab)
    {
        for(int i=0;i < tab.length;i++)
        {
            if (tab[i] > 0) count++;
        }
        System.out.println("W tablicy jest " + count + " liczb dodatnich");
    }

    public static void ileUjemnych(int[] tab)
    {
        for(int i=0;i < tab.length;i++)
        {
            if (tab[i] < 0) count++;
        }
        System.out.println("W tablicy jest " + count + " liczb ujemnych");
    }

    public static void ileZerowych(int[] tab)
    {
        for(int i=0;i < tab.length;i++)
        {
            if (tab[i] == 0) count++;
        }
        System.out.println("W tablicy jest " + count + " liczb zerowy");
    }

    public static void ileMaxymalnych(int[] tab)
    {
        int point = tab[0];
        for(int i=0;i < tab.length;i++)
        {
            if (tab[i] > point) point=tab[i];
        }
        for(int j=0;j < tab.length;j++) {
            if (tab[j] == point) count++;
        }
        System.out.println("W tablicy jest " + count + " liczb maksymalnych");
    }

    public static void ileMinimalnych(int[] tab)
    {
        int point = tab[0];
        for(int i=0;i < tab.length;i++)
        {
            if (tab[i] < point) point=tab[i];
        }
        for (int j : tab) {
            if (j == point) count++;
        }
        System.out.println("W tablicy jest " + count + " liczb minimalnych");
    }

    public static void ileUnikalnych(int[] tab)
    {
        for(int i=0;i < tab.length;i++)
        {
            int n_dupes = 0;
            for(int j=0;j < tab.length;j++)
            {
                if (tab[j] == tab[i]) n_dupes++;
            }
            if(n_dupes == 1) count++;
        }
        System.out.println("W tablicy jest " + count + " liczb unikalnych");
    }
}
