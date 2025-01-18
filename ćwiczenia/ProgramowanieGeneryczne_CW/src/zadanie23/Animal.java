package zadanie23;

public class Animal {
    private String gatunek;
    private int wiek;

    public Animal(String nazwa, int wiek)
    {
        this.gatunek = nazwa;
        this.wiek = wiek;
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
    public String toString()
    {
        return "Gatunek: " + this.gatunek + ", Wiek: " + this.wiek;
    }
}
