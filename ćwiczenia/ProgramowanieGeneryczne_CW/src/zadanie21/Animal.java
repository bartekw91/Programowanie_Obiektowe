package zadanie21;

public class Animal implements Comparable<Animal>{
    private String gatunek;
    private int wiek;

    public Animal(String gat, int age)
    {
        this.gatunek = gat;
        this.wiek = age;
    }
    public String getGatunek()
    {
        return gatunek;
    }
    public int getWiek()
    {
        return wiek;
    }
    @Override
    public int compareTo(Animal a)
    {
        return Integer.compare(this.wiek, a.wiek);
    }
    @Override
    public String toString()
    {
        return "Gatunek: " + this.gatunek + ", Wiek: " + this.wiek;
    }
}
