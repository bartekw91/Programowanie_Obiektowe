package zadanie23;

public class Dog extends Animal{
    private String rasa;
    public Dog(String rasa, int wiek)
    {
        super("Pies", wiek);
        this.rasa = rasa;
    }
    @Override
    public String toString()
    {
        return "Gatunek: " + super.getGatunek() + ", Rasa: " + this.rasa + ", Wiek: " + super.getWiek();
    }
}
