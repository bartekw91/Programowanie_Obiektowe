package zadanie17;

public class Employee implements Comparable<Employee>{
    private String firstName;
    private String lastName;
    private String position;

    public Employee(String imie, String nazwisko, String pozycja)
    {
        this.firstName = imie;
        this.lastName = nazwisko;
        this.position = pozycja;
    }

    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public String getPosition()
    {
        return position;
    }

    @Override
    public int compareTo(Employee e)
    {
        return this.lastName.length() - e.lastName.length();
    }
    @Override
    public String toString()
    {
        return "Imię: " + this.firstName + ", Nazwisko: " + this.lastName + ", Pozycja: " + this.position;
    }
}
