package zadanie15;

public class Main {
    public static void main(String[] args)
    {
    Vehicle[] samochody =
            {new Vehicle("Fiat", 100),
            new Vehicle("Opel", 150),
            new Vehicle("Porsche", 300),
            new Vehicle("Maluch", 90)};
    System.out.println(Main.maxValue(samochody));
    }
    public static <T extends Comparable<T>> T maxValue(T[] tablica)
    {
        if(tablica == null || tablica.length == 0)
            throw new IllegalArgumentException("Tablica nie może być pusta!");
        else
        {
            T max = tablica[0];
            for(T a : tablica)
            {
                if(a.compareTo(max) > 0)
                    max = a;
            }
            return max;
        }
    }
}
