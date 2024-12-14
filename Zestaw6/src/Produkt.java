public class Produkt {
    String nazwa;
    double cena;
    int iloscNaMagazynie;

    public Produkt(String name, double price, int count)
    {
        this.nazwa = name;
        if(price < 0.00) throw new IllegalArgumentException("Błąd! Cena nie może być ujemna");
        this.cena = price;
        if(count < 0) throw new IllegalArgumentException("Błąd! Ilość sztuk nie może być ujemna!");
        this.iloscNaMagazynie = count;
    }
    public static void wyswietlInformacje(Produkt p)
    {
        System.out.println("Nazwa Produktu: "+ p.nazwa);
        System.out.println("Cena: "+ p.cena + " PLN");
        System.out.println("Ilość: "+ p.iloscNaMagazynie);
    }
    public static void dodajProdukt(Produkt p, int ilosc)
    {
        p.iloscNaMagazynie += ilosc;
    }
    public static void usunZMagazynu(Produkt p, int ilosc)
    {
        if(p.iloscNaMagazynie - ilosc < 0) throw new IllegalArgumentException("Błąd! Ilość towaru do usuwania jest "+
                "większa niż ilość w magazynie!");
        else p.iloscNaMagazynie -= ilosc;
    }
}
