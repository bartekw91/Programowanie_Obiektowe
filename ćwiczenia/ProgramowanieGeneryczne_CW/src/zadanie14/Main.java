package zadanie14;

public class Main {
    public static void main(String[] args)
    {
//        Integer[] liczby = {5, 0, 2, -3, 4};
//        String[] zdania = {"Ala", "ma", "kota"};
//        Double[] liczbyd = {3.14, -2.23, 5.0, 7.77};
//        System.out.println("Najmniejszą liczbą jest: " + Main.minValue(liczby));
//        System.out.println("Najmniejszą liczbą dziesiętną jest: " + Main.minValue(liczbyd));
//        System.out.println("Najmniejszym wyrazem jest: " + Main.minValue(zdania));
        Person[] ludzie = {new Person("Ala", 5),
                           new Person("Ela", 10),
                           new Person("Marek", 2),
                           new Person("Kamil", 1),
                           new Person("Ola", 12)};
        System.out.println(Main.minValue(ludzie));
    }
    public static <T extends Comparable<T>> T minValue(T[] tablica)
    {
        if (tablica == null || tablica.length == 0)
            throw new IllegalArgumentException("Tablica jest pusta!");
        else
        {
            T minimum = tablica[0];
            for(T a : tablica)
            {
                if(a.compareTo(minimum) < 0)
                    minimum = a;
            }
            return minimum;
        }
    }
}
