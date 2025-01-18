package zadanie7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        Car[] samochody = new Car[5];
        samochody[0] = new Car("Opel", 5000, 1999);
        samochody[1] = new Car("Audi", 1234, 2003);
        samochody[2] = new Car("Seat", 9873, 2000);
        samochody[3] = new Car("BMW", 3434, 1998);
        samochody[4] = new Car("Fiat", 5554, 2010);
        System.out.println("PRZED SORTOWANIEM");
        System.out.println();
        for (Car c : samochody)
        {
            System.out.println(c);
        }
        System.out.println();
        System.out.println("PO SORTOWANIU");
        Arrays.sort(samochody);
        for (Car c : samochody)
        {
            System.out.println(c);
        }
    }
}
