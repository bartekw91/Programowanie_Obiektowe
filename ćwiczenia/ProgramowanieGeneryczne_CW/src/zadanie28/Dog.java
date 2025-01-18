package zadanie28;

public class Dog extends Animal
{
    private int age;
    public Dog(String gat, int wiek)
    {
        super(gat);
        this.age = wiek;
    }
    public int getAge()
    {
        return age;
    }
    @Override
    public String toString()
    {
        return "Rasa: " + super.getGatunek() + ", Wiek: " + this.age;
    }
}
