package zadanie28;

public class Pair<T>{
    private T obj1;
    private T obj2;

    public Pair(){}
    public Pair(T ob1, T ob2)
    {
        this.obj1 = ob1;
        this.obj2 = ob2;
    }

    public T getObj1()
    {
        return obj1;
    }
    public T getObj2()
    {
        return obj2;
    }
    public void setObj1(T ob1)
    {
        this.obj1 = ob1;
    }
    public void setObj2(T ob2)
    {
        this.obj2 = ob2;
    }
    @Override
    public String toString()
    {
        return this.obj1 + " | " + this.obj2;
    }
}
