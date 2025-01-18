package zadanie22;

public class Animal implements Comparable<Animal>{
    private String species;
    private int age;

    public Animal(String gatunek, int wiek)
    {
        this.species = gatunek;
        this.age = wiek;
    }

    public String getSpecies()
    {
        return species;
    }
    public int getAge()
    {
        return age;
    }

    @Override
    public int compareTo(Animal a)
    {
    if(this.age - a.age == 0)
        return species.compareToIgnoreCase(a.species);
    else
        return this.age - a.age;
    }

    @Override
    public String toString()
    {
        return "Gatunek: " + this.species + ", Wiek: " + this.age;
    }
}
