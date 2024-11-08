import java.util.ArrayList;
import java.util.Objects;

public class nr7 {
    public static ArrayList<ArrayList<Integer>> uniqueArrayList(ArrayList<Integer> tab)
    {
        ArrayList<ArrayList<Integer>> wynik = new ArrayList<>();

        for(int i = 0; i < tab.size();i++)
        {
            int count = 0;

            for(int j = 0;j < tab.size();j++)
            {
                int current_nr = tab.get(i);
                int compared_nr = tab.get(j);
                if (current_nr == compared_nr)
                {
                    count++;
                }
            }
            if (count == 1)
            {
                ArrayList<Integer> zliczone = new ArrayList<>();
                zliczone.add(tab.get(i));
                zliczone.add(0);
                wynik.add(zliczone);
            }
        }

        return wynik;
    }
}
