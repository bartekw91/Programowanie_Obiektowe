import java.util.ArrayList;
public class nr1 {
    public static ArrayList<Integer> append(ArrayList<Integer> tab1, ArrayList<Integer> tab2)
    {
        ArrayList<Integer> tablica = new ArrayList<>();
        tablica.addAll(tab1);
        tablica.addAll(tab2);

        return tablica;
    }
}
