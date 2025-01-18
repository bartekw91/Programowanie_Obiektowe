package zadanie17;

import zadanie12.Order;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        List<Employee> pracownicy = new ArrayList<>();
        pracownicy.add(new Employee("Jan", "Kowalski", "Kierownik"));
        pracownicy.add(new Employee("Grzegorz", "Brzęczyszczykiewicz", "Dyrektor"));
        pracownicy.add(new Employee("Tomasz", "Kochanowski", "Pracownik"));
        pracownicy.add(new Employee("Elżbieta", "Matysiak", "Pracownik"));
        System.out.println("PRZED SORTOWANIEM");
        System.out.println();
        for (Employee c : pracownicy)
        {
            System.out.println(c);
        }
        System.out.println();
        System.out.println("PO SORTOWANIU");
        Collections.sort(pracownicy);
        for (Employee c : pracownicy)
        {
            System.out.println(c);
        }
    }
}
