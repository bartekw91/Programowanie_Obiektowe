package zadanie12;

import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        Integer[] liczby = {2, 3, 4, 5, 6};
        String[] zdania = {"Ala", "ma", "kota"};
        Double[] liczbyd = {3.14, 2.50, 7.77, 2.23, 6.0};
        System.out.println("PRZED ZAMIANĄ:");
        System.out.println(Arrays.toString(liczby));
        System.out.println(Arrays.toString(zdania));
        System.out.println(Arrays.toString(liczbyd));
        System.out.println();
        Main.swap(liczby, 1, 3);
        Main.swap(zdania, 0, 2);
        Main.swap(liczbyd, 2, 4);
        System.out.println("PO ZAMIANIE:");
        System.out.println(Arrays.toString(liczby));
        System.out.println(Arrays.toString(zdania));
        System.out.println(Arrays.toString(liczbyd));
    }
    public static <T> void swap(T[] tablica, int arg1, int arg2)
    {
        if(arg1 < tablica.length && arg2 < tablica.length)
        {
            T temp = tablica[arg2];
            tablica[arg2] = tablica[arg1];
            tablica[arg1] = temp;
        }
        else
            throw new IllegalArgumentException("Numer indeksu przekracza rozmiar tablicy");
    }
}
