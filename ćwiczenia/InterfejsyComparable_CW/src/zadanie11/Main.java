package zadanie11;

import zadanie7.Car;

import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
    Student[] studenci = new Student[4];
    studenci[0] = new Student("Jarek", 5.00, 1999);
    studenci[1] = new Student("Dorota", 3.50, 2005);
    studenci[2] = new Student("Maria", 5.00, 1998);
    studenci[3] = new Student("Kamila", 3.50, 1995);
        System.out.println("PRZED SORTOWANIEM");
        System.out.println();
        for (Student c : studenci)
        {
            System.out.println(c);
        }
        System.out.println();
        System.out.println("PO SORTOWANIU");
        Arrays.sort(studenci);
        for (Student c : studenci)
        {
            System.out.println(c);
        }
    }
}
