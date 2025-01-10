abstract class Warzywo extends ProduktSpozywczy {
    public abstract void smak();
    public abstract void umyj();
    public abstract void zjedz();

    public Warzywo(String nazwa, Double cena, Integer ilosc)
    {
        super(nazwa, cena, ilosc);
    }
}
