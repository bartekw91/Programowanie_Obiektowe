import java.util.HashMap;

interface MagazynI
{

}
public class Magazyn {
    private HashMap<Produkt, Integer> produkty;

    public Magazyn()
    {
        this.produkty = new HashMap<>();
    }
    public Magazyn(Produkt p, Integer ilosc)
    {
        this.produkty = new HashMap<>();
        this.produkty.put(p, ilosc);
    }

    // GETTERY //
    public HashMap<Produkt, Integer> getProdukty()
    {
        return produkty;
    }
    public Integer getProdukty(Produkt p)
    {
        return produkty.get(p);
    }
    // SETTERY //
    public HashMap<Produkt, Integer> setProdukty(Produkt p, Integer i)
    {
        if(p != null || (i != null && i >= 0))
        {
            this.produkty.put(p, i);
            return produkty;
        }
        else
            throw new IllegalArgumentException("Niepoprawna wartość!");
    }

    @Override
    public String toString()
    {
     return "Magazyn zawiera " + getProdukty().size() + " produktów";
    }
}