import java.util.Arrays;

public class nr3 {
    public static int ileNieparzystych(int[] tab)
    {
        int nieparzystych = 0;

        for(int i = 0; i < tab.length; i++)
        {
            if (tab[i] % 2 != 0) nieparzystych++;
        }
        return nieparzystych;
    }
    public static int ileParzystych(int[] tab)
    {
        int parzystych = 0;

        for(int i = 0; i < tab.length; i++)
        {
            if (tab[i] % 2 == 0) parzystych++;
        }
        return parzystych;
    }
    public static int ileDodatnich(int[] tab)
    {
        int dodatnich = 0;

        for(int i = 0; i < tab.length; i++)
        {
            if (tab[i] > 0) dodatnich++;
        }
        return dodatnich;
    }
    public static int ileUjemnych(int[] tab)
    {
        int ujemnych = 0;

        for(int i = 0; i < tab.length; i++)
        {
            if (tab[i] < 0) ujemnych++;
        }
        return ujemnych;
    }
    public static int ileZerowych(int[] tab)
    {
        int zerowych = 0;

        for(int i = 0; i < tab.length; i++)
        {
            if (tab[i] == 0) zerowych++;
        }
        return zerowych;
    }
    public static int ileMaksymalnych(int[] tab)
    {
        int max_n = tab[0];
        int max = 0;

        for(int i = 0;i < tab.length; i++)
        {
            if(tab[i] > max_n) max_n = tab[i];
        }

        for(int i = 0; i < tab.length; i++)
        {
            if (tab[i] == max_n) max++;
        }
        return max;
    }
    public static int ileMinimalnych(int[] tab)
    {
        int min_n = tab[0];
        int min = 0;

        for(int i = 0;i < tab.length; i++)
        {
            if(tab[i] < min_n) min_n = tab[i];
        }

        for(int i = 0; i < tab.length; i++)
        {
            if (tab[i] == min_n) min++;
        }
        return min;
    }
    public static int ileUnikalnych(int[] tab)
    {
        int unique = 0;

        for(int i=0;i<tab.length;i++)
        {
            int unique_c = 0;
            for(int j=0;j< tab.length;j++)
            {
                if(tab[i] == tab[j])
                {
                    unique_c++;
                }
            }
            if(unique_c == 1)
            {
                unique++;
            }
        }

        return unique;
    }
}
