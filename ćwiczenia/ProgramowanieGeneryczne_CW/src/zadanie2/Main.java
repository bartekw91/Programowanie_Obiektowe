package zadanie2;

public class Main {
    public static void main(String[] args)
    {
    Check spr = new Check();

    String test = "Test2";
    String test2 = "Test";
    System.out.println(spr.isEqual(test, test2));
    Integer testint = 12345;
    Integer testint2 = 12345;
    System.out.println(spr.isEqual(testint, testint2));
    System.out.println(spr.isEqual(test, testint2));
    }
}
