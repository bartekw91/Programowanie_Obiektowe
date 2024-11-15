import java.util.Scanner;

public class nr5 {
    public static void run()
    {
        Scanner myObj = new Scanner(System.in);

        String zdanie = "Ala ma kota";
        System.out.println(zdanie);

        System.out.print("Wprowadź literę a zamienię zdanie: ");
        String arg = myObj.nextLine();
        zdanie = zdanie.replace("A", arg.toUpperCase());
        zdanie = zdanie.replace("a", arg);
        System.out.println(zdanie);
    }
}
