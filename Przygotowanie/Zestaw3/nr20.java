public class nr20 {
    static void podzbiory(int[] tab)
    {
          // Pętla dla początku indeksu
      for (int i = 0; i < tab.length; i++)

      // Pętla dla końca indeksu
      for (int j = i; j < tab.length; j++) {

         // Pętla dla podzbiorów
         for (int k = i; k <=j; k++)
            System.out.print(tab[k] + " ");
            System.out.println("");
      }
   }
}
