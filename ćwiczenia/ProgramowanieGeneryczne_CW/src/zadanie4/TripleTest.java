package zadanie4;

public class TripleTest {
    public static void main(String[] args)
    {
        Triple<String, Integer, Double> jeden = new Triple<>("Jeden", 1, 1.0);
        Triple<Integer, String, Double> dwa = new Triple<>(2, "Dwa", 2.0);
        Triple<Integer, Double, String> trzy = new Triple<>(3, 3.0, "Trzy");
        System.out.println();
        System.out.println(jeden.getFirst());
        System.out.println(jeden.getSecond());
        System.out.println(jeden.getThird());
        System.out.println();
        System.out.println(dwa.getFirst());
        System.out.println(dwa.getSecond());
        System.out.println(dwa.getThird());
        System.out.println();
        System.out.println(trzy.getFirst());
        System.out.println(trzy.getSecond());
        System.out.println(trzy.getThird());
    }
}
