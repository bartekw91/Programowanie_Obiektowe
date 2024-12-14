import java.util.HashMap;

public class KoszykZakupowy {
    HashMap<Produkt, Integer> koszyk = new HashMap<Produkt, Integer>();

    public KoszykZakupowy(Produkt p, int ilosc)
    {
        Produkt.usunZMagazynu(p, ilosc);
        this.koszyk.put(p, ilosc);
    }
    public KoszykZakupowy dodajProdukt(Produkt p, int ilosc)
    {
        if(!this.koszyk.containsKey(p))
        {
            Produkt.usunZMagazynu(p, ilosc);
            this.koszyk.put(p, ilosc);
        }
        else
        {
            Produkt.usunZMagazynu(p, ilosc);
            this.koszyk.put(p, (this.koszyk.get(p) + ilosc));
        }
        return this;
    }
    public KoszykZakupowy wyswietlZawartoscKoszyka()
    {
        for(Produkt p : this.koszyk.keySet())
        {
            System.out.println("Nazwa: " + p.nazwa + " | " + "x" + this.koszyk.get(p));
        }

        return this;
    }
    public double obliczCalkowitaWartosc()
    {
        double wynik = 0.00;
        for(Produkt p : this.koszyk.keySet())
        {
            wynik += (this.koszyk.get(p) * p.cena);
        }
        return wynik;
    }
}
