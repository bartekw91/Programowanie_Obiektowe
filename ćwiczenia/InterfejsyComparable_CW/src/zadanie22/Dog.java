package zadanie22;

public class Dog extends Animal{
    private String breed;
    
    public Dog(String gatunek, int wiek, String rasa) {
        super(gatunek, wiek);
        this.breed = rasa;
    }
    public String getBreed()
    {
        return breed;
    }

    @Override
    public int compareTo(Animal d)
    {
        int wynik = super.compareTo(d);
        if (wynik == 0 && d instanceof Dog)
        {
            Dog piesek = (Dog) d;
            return this.breed.compareTo(piesek.getBreed());
        }
        return wynik;
    }
    @Override
    public String toString()
    {
        return "Gatunek: " + super.getSpecies() + ", Rasa: " + this.breed + ", Wiek: " + super.getAge();
    }
}
