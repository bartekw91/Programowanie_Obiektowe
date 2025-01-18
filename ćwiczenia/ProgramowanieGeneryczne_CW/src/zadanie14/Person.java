package zadanie14;

public class Person implements Comparable<Person>{
    private String name;
    private int age;
    public Person(String imie, int wiek)
    {
        if(!imie.isEmpty())
            this.name = imie;
        else
            throw new IllegalArgumentException("Imię nie może byc puste!");
        if(wiek >= 0)
            this.age = wiek;
        else
            throw new IllegalArgumentException("Wiek nie może być ujemny!");
    }

    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public int compareTo(Person p)
    {
        return Integer.compare(this.age, p.age);
    }
    @Override
    public String toString()
    {
        return "Imię: " + this.name + ", Wiek: " + this.age;
    }
}
