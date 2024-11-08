import java.util.ArrayList;
public class nr2 {
    public static ArrayList<Integer> merge(ArrayList<Integer> tab1, ArrayList<Integer> tab2)
    {
        ArrayList<Integer> wynik = new ArrayList<>();

        int i = 0;
        int j = 0;
        while(i+j != tab1.size()+tab2.size())
        {
            if(i < tab1.size())
            {
                wynik.add(tab1.get(i));
                i++;
            }
            if(j < tab2.size())
            {
                wynik.add(tab2.get(j));
                j++;
            }
        }
        return wynik;
    }
}
