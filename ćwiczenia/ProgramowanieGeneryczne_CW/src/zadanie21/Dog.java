package zadanie21;

public class Dog extends Animal{
    private String rasa;
    public Dog(int wiek, String race)
    {
        super("Pies", wiek);
        this.rasa = race;
    }
    public String getRasa()
    {
        return rasa;
    }
    @Override
    public String toString()
    {
        return "Gatunek: " + super.getGatunek() + ", Rasa: " + this.rasa + ", Wiek: " + super.getWiek();
    }
}
