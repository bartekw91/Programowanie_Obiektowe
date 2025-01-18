package zadanie12;

import zadanie11.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
    List<Order> przedmioty = new ArrayList<>();
    przedmioty.add(new Order("Dumle", 100, 3.50));
    przedmioty.add(new Order("Manam", 50, 5.50));
    przedmioty.add(new Order("Malaga", 100, 5.50));
    przedmioty.add(new Order("Kasztanki", 200, 2.50));

        System.out.println("PRZED SORTOWANIEM");
        System.out.println();
        for (Order c : przedmioty)
        {
            System.out.println(c);
        }
        System.out.println();
        System.out.println("PO SORTOWANIU");
        Collections.sort(przedmioty);
        for (Order c : przedmioty)
        {
            System.out.println(c);
        }
    }
}
