import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        ArrayList<Integer> tabliczka = new ArrayList<>();
        ArrayList<Integer> tabliczka2 = new ArrayList<>();
        tabliczka.add(3);
        tabliczka.add(5);
        tabliczka.add(7);
        tabliczka2.add(2);
        tabliczka2.add(4);
        tabliczka2.add(8);
        ArrayList<Integer> zad1 = nr1.append(tabliczka, tabliczka2);
        ArrayList<Integer> zad2 = nr2.merge(tabliczka, tabliczka2);
        System.out.println(tabliczka.toString());
        System.out.println(tabliczka2.toString());
//        System.out.println(zad1.toString());
        System.out.println(zad2.toString());
//        ArrayList<Integer> dzialanie = new ArrayList<Integer>();
//        dzialanie.add(3);
//        dzialanie.add(5);
//        dzialanie.add(3);
//        dzialanie.add(2);
//        dzialanie.add(6);
//        dzialanie.add(6);
//
//        ArrayList<ArrayList<Integer>> wynik = nr8.uniqueArrayList(dzialanie);
//
//        System.out.println(wynik.toString());
    }
}