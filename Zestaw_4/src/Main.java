public class Main {
    public static void main(String[] args)
    {
        int[] tablica = nr1.generujTablice(16, -100, 100);
        int[] signum = nr5.funkcjaSignum(tablica);
        int[] fline = nr5.funkcjaLiniowa(tablica, 5, 2);
        int[] fsqr = nr5.funkcjaKwadratowa(tablica, 2, 3, 1);
        int[] tab_z = nr7.generujZakres(5, 1, 20);

        System.out.println("Oto wygenerowana tablica:");
        table.show_int(tablica);
//        System.out.println("\nOto jego odwrotność:");
//        table.show_int(nr6.odwrocTablice(tablica));
        System.out.println("\nOto alternatywna odwrotność:");
        table.show_int(nr6.odwrocTabliceAlt(tablica, 2, 14));
//        System.out.println("\nOto macierz:");
//        nr2.macierz(tablica, 5, 4);
//        System.out.println("\nOto wygenerowana tablica signum:");
//        table.show_int(signum);
//        System.out.println("\nOto wygenerowana tablica f. liniowej:");
//        table.show_int(fline);
//        System.out.println("\nOto wygenerowana tablica f. kwadratowej:");
//        table.show_int(fsqr);
    }
}