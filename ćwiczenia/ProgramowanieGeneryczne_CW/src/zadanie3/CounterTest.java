package zadanie3;

public class CounterTest {
    public static void main(String[] args)
    {
        Counter tabliczka = new Counter();
        tabliczka.add("Test");
        tabliczka.add(123);
        tabliczka.add(0.123);
        System.out.println(tabliczka.getCount());
    }
}
