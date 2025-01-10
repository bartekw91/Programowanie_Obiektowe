abstract class Ubranie extends ProduktPrzemyslowy {
    public abstract void wypierz();
    public abstract void zaloz();
    public abstract void wyprasuj();
    public abstract void wysusz();
    public abstract void zniszcz();

    public Ubranie(String nazwa, Double cena, Integer ilosc)
    {
        super(nazwa, cena, ilosc);
    }
}
