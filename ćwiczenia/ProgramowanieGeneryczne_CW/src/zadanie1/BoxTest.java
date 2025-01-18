package zadanie1;

public class BoxTest {
    public static void main(String[] args)
    {
        String tekst = "Test";
        Integer numer = 12345;
        Double numerd = 0.12345;
        Box<String> tekstB = new Box<>(tekst);
        Box<Integer> numerB = new Box<>(numer);
        Box<Double> numerdB = new Box<>(numerd);

        System.out.println(tekstB.getData());
        System.out.println(numerB.getData());
        System.out.println(numerdB.getData());
        tekstB.setData("Kolejny test");
        numerB.setData(54321);
        numerdB.setData(0.54321);
        System.out.println(tekstB.getData());
        System.out.println(numerB.getData());
        System.out.println(numerdB.getData());
    }
}
