package zadanie1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args)
    {
    Student daria = new Student("Daria", 3.50, 1999);
    Student arek = new Student("Arek", 4.25, 1993);
    Student maciej = new Student("Maciej", 2.30, 1992);
    Student emilka = new Student("Emilka", 5.50, 1994);
    Student andrzej = new Student("Andrzej", 4.00, 1991);
        List<Student> studenci = new ArrayList<>();
        studenci.add(daria);
        studenci.add(arek);
        studenci.add(maciej);
        studenci.add(emilka);
        studenci.add(andrzej);
        System.out.println("PRZED SORTOWANIEM");
        System.out.println();
        for(Student s: studenci)
        {
            System.out.println(s);
        }
        System.out.println();
        System.out.println("PO SORTOWANIU");
        System.out.println();
//        studenci.sort((s1, s2) -> Double.compare(s1.getAverageGrade(), s2.getAverageGrade())); // dla ArrayList
        Collections.sort(studenci);
        for(Student s: studenci)
        {
            System.out.println(s);
        }
    }
}