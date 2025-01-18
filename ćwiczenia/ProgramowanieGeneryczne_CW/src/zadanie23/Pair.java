package zadanie23;

public class Pair<T>{
    private T obj1;
    private T obj2;

    public Pair()
    {
        this.obj1 = null;
        this.obj2 = null;
    }
    public Pair(T obiekt1,T obiekt2)
    {
        this.obj1 = obiekt1;
        this.obj2 = obiekt2;
    }
    public T getObj1()
    {
        return obj1;
    }
    public T getObj2()
    {
        return obj2;
    }
    public void setObj1(T obiekt)
    {
        this.obj1 = obiekt;
    }
    public void setObj2(T obiekt)
    {
        this.obj2 = obiekt;
    }
}
