public class nr1 {
    public static int[] generujTablice(int n, int minWartosc, int maxWartosc)
    {
        int[] tablica = new int[n];

        for(int i = 0; i < n;i++)
        {
            /* Można też użyć rand.nextInt(max - min + 1) + min)
            ale musisz uprzednio użyć Random rand = new Random() co wymaga importowania
            java.util.Random

            Prócz rand.nextInt można wykorzystać też rand.nextDouble
             */
            int rng = (int)(minWartosc + Math.random() *  ( (maxWartosc - minWartosc) + 1) );
            tablica[i] = rng;
        }

        return tablica;
    }
}
