public abstract class Owoc extends ProduktSpozywczy {
    public abstract void smak();
    abstract void umyj();
    abstract void zjedz();

    public Owoc(String nazwa, Double cena, Integer ilosc)
    {
        super(nazwa, cena, ilosc);
    }
}
