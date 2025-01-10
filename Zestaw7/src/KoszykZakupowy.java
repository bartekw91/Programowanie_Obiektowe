import java.util.ArrayList;
import java.util.HashMap;

public class KoszykZakupowy {
    private ArrayList<Produkt> produkty = new ArrayList<Produkt>();
    private ArrayList<Integer> ilosc = new ArrayList<Integer>();
    private HashMap<Produkt, Integer> koszyk = new HashMap<Produkt, Integer>();

    public KoszykZakupowy(Produkt p, Integer count)
    {
        Produkt.usunZMagazynu(p, count);
        this.produkty.add(p);
        this.ilosc.add(count);
        this.koszyk.put(p, count);
    }
    public KoszykZakupowy(){}
    // GETTERY //
    public HashMap<Produkt, Integer> getKoszyk()
    {
        return koszyk;
    }
    // SETTERY //
    public void setKoszyk(Produkt p, Integer count)
    {
        if (p == null || count == null)
        {
            throw new IllegalArgumentException("Wartość nie może być pusta!");
        }
        else {
            int indeksProduktu = this.produkty.indexOf(p);
            Integer iloscWKoszyku = this.ilosc.get(indeksProduktu);
            if (iloscWKoszyku - count <= 0)
            {
                this.produkty.remove(indeksProduktu);
                this.ilosc.remove(indeksProduktu);
                this.koszyk.remove(p);
            }
            else if (iloscWKoszyku < count)
            {
                this.ilosc.set(indeksProduktu, count);
                this.koszyk.put(p, count);
            }
            else
            {
                this.ilosc.set(indeksProduktu, iloscWKoszyku - count);
                this.koszyk.put(p, iloscWKoszyku - count);
            }
        }
    }
    // KOMENDY //
    public void dodajDoKoszyka(Produkt p, Integer count)
    {
        if(count > 0)
        {
            if(!this.produkty.contains(p))
            {
                Produkt.usunZMagazynu(p, count);
                this.produkty.add(p);
                this.ilosc.add(count);
                this.koszyk.putIfAbsent(p, count);
            }
            else
            {
                int miejsceProduktu = this.produkty.indexOf(p);
                int iloscDanegoProduktu = this.ilosc.get(miejsceProduktu);
                Produkt.usunZMagazynu(p, count);
                this.ilosc.set(miejsceProduktu, iloscDanegoProduktu + count);
                this.koszyk.put(p, iloscDanegoProduktu + count);
            }
        }
    }

    public static void wyswietlZawartoscKoszyka(KoszykZakupowy k)
    {
     System.out.println("Zawartość koszyka:");
     int dlKoszyka = k.produkty.size();
     for(int i = 0; i < dlKoszyka; i++)
     {
         String nazwa = k.produkty.get(i).getNazwa();
         String cena = String.format("%.2f", k.produkty.get(i).getCena());
         Integer ilosc = k.ilosc.get(i);
         System.out.println("Nazwa: " + nazwa + " | " + cena + " PLN " + "x" + ilosc);
     }
    }
    public static double obliczCalkowitaWartosc(KoszykZakupowy k)
    {
        double wynik = 0.00;
        int dlKoszyka = k.produkty.size();

        for(int i = 0; i < dlKoszyka; i++)
        {
            Integer ilosc = k.ilosc.get(i);
            Double cenaProduktu = k.produkty.get(i).getCena();
            wynik += cenaProduktu * ilosc;
        }
        System.out.println("Całkowity koszt: " + String.format("%.02f", wynik) + " zł");

        return wynik;
    }
    @Override
    public String toString()
    {
        return "Koszyk zawiera " + this.produkty.size() + " produktów";
    }
}
