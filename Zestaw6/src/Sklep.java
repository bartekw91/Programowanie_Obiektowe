import java.util.HashMap;

public class Sklep {
    HashMap<Produkt, Integer> produkty = new HashMap<>();

    public Sklep (Produkt p, int ilosc)
    {
        Produkt.usunZMagazynu(p, ilosc);
        this.produkty.put(p, ilosc);
    }
    public Sklep dodajProdukt(Produkt p, int ilosc)
    {
        Produkt.usunZMagazynu(p, ilosc);
        if (!this.produkty.containsKey(p))
        {
            Produkt.usunZMagazynu(p, ilosc);
            this.produkty.put(p, ilosc);
        }
        else
        {
            Produkt.usunZMagazynu(p, ilosc);
            this.produkty.put(p, (this.produkty.get(p) + ilosc));
        }
        return this;
    }
    public Sklep wyswietlOferty()
    {
        System.out.println("=== DOSTĘPNE PRODUKTY DANEGO SKLEPU ===\n");
        for(Produkt p: this.produkty.keySet())
        {
            System.out.println("Nazwa: " + p.nazwa + " | " + p.cena + " PLN" + " | " + this.produkty.get(p) + " szt.");
        }
        return this;
    }

    public Sklep wyszukajProduktu(String s)
    {
        for(Produkt p: this.produkty.keySet())
        {
            if(p.nazwa.contains(s))
            {
                System.out.println(p.nazwa + " | " + p.cena + " PLN" + " | " + this.produkty.get(p) + " szt.");
            }
        }
        return this;
    }
}
