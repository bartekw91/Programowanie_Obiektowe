package zadanie4;

import java.util.ArrayList;

public class Triple<T,U,V>{
    T first;
    U second;
    V third;
    public Triple(T arg1, U arg2, V arg3)
    {
        this.first = arg1;
        this.second = arg2;
        this.third = arg3;
    }
    public T getFirst()
    {
        return first;
    }
    public U getSecond()
    {
        return second;
    }
    public V getThird()
    {
        return third;
    }
}
