import java.util.ArrayList;

public class nr8 {
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
                ArrayList<Integer> zliczone = new ArrayList<>();
                zliczone.add(tab.get(i));
                zliczone.add(count);
                wynik.add(zliczone);
        }
        //Usuwamy duplikaty
        ArrayList<ArrayList<Integer>> koniec = new ArrayList<>();

        for(ArrayList<Integer> element: wynik){
            if(!koniec.contains(element))
            {
                koniec.add(element);
            }
        }
        return koniec;
    }
}
