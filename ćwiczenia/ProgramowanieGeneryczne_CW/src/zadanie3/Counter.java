package zadanie3;

import java.util.ArrayList;

public class Counter<T> {
    ArrayList<T> table = new ArrayList<T>();

    public void add(T element)
    {
        this.table.add(element);
    }
    public int getCount()
    {
        return table.size();
    }
}
