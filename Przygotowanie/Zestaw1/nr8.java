import java.util.ArrayList;

public class nr8 {
    public static void run()
    {
        ArrayList<Integer> small = new ArrayList<Integer>();
        ArrayList<Integer> large = new ArrayList<Integer>();
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for(int i=0;i<26;i++)
        {
            small.add(97+i);
        }
        for(int i=0;i<26;i++)
        {
            large.add(65+i);
        }
        for(int i=0;i<10;i++)
        {
            numbers.add(48+i);
        }
        System.out.printf("Małe litery znajdują się w przedziale: %d - %d\n", small.getFirst(), small.getLast());
        System.out.printf("Duże litery znajdują się w przedziale: %d - %d\n", large.getFirst(), large.getLast());
        System.out.printf("Cyfry znajdują się w przedziale: %d - %d\n", numbers.getFirst(), numbers.getLast());
    }
}
