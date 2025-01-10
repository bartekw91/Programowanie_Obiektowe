import java.util.Objects;

interface ProduktI
{

}
public class Produkt {
    private String nazwa;
    private Double cena;
    private int iloscNaMagazynie;

    public Produkt(String name, Double price, Integer count)
    {
        this.nazwa = name;
        this.cena = price;
        this.iloscNaMagazynie = count;
    }

    // GETTERY //
    public String getNazwa()
    {
        return nazwa;
    }

    public Double getCena()
    {
        return cena;
    }

    public Integer getIlosc()
    {
        return iloscNaMagazynie;
    }

    // SETTERY //
    public void setNazwa(String s)
    {
        if(!s.isEmpty() || !s.equals(" "))
        {
            this.nazwa = s;
        }
        else
            throw new IllegalArgumentException("Błąd! Pole nie może być puste!");
    }

    public void setCena(Double c)
    {
        if(c == null)
        {
            throw new IllegalArgumentException("Błąd! Pole nie może być puste!");
        }
        else
         this.cena = c;
    }

    public void setIlosc(Integer i)
    {
        if (i != null || i >= 0)
            this.iloscNaMagazynie = i;
        else
            throw new IllegalArgumentException("Błąd! Niepoprawna wartość!");
    }

    // KOMENDY //
    public static void wyswietlInformacje(Produkt p)
    {
        System.out.println("Nazwa produktu: " + p.nazwa);
        System.out.println("Cena: " + String.format("%.02f", p.cena));
        System.out.println("Ilość na magazynie: " + p.iloscNaMagazynie);
    }
    public static Produkt dodajDoMagazynu(Produkt p, Integer count)
    {
        p.iloscNaMagazynie += count;
        return p;
    }
    public static Produkt usunZMagazynu(Produkt p, Integer count)
    {
        if(p.iloscNaMagazynie - count < 0)
        {
            throw new IllegalArgumentException("Ilość produktu do usuwania jest większa niż ilość w magazynie!");
        }
        else
        {
            p.iloscNaMagazynie -= count;
            return p;
        }
    }

    @Override
    public String toString()
    {
        return "Nazwa: " + this.nazwa + " | " + this.cena + " | " + this.iloscNaMagazynie + " szt.";
    }
    @Override
    public int hashCode()
    {
        return Objects.hash(this.nazwa, this.cena);
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (!(obj instanceof Produkt))
            return false;
        Produkt temp = (Produkt) obj;
        return this.nazwa.equals((temp.getNazwa())) && this.cena == temp.getCena();
    }
}
