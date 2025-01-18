package zadanie1;

public class Box<T> {
    private T data;

    public Box(){}
    public Box(T dane)
    {
        this.data = dane;
    }
    public T getData()
    {
        return data;
    }
    public void setData(T set)
    {
        this.data = set;
    }
}
