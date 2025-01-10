interface ZamowienieI
{
    public Zamowienie finalizujZamowienie();
    public void zwrocProdukt(Produkt p, Integer ilosc);
}
public class Zamowienie {
    private KoszykZakupowy koszyk;
    private String status;
    private Platnosc oplata;
    public Zamowienie(KoszykZakupowy k)
    {
        this.koszyk = k;
        this.status = "Oczekiwanie opłaty";
    }

    // GETTERY //
    public KoszykZakupowy getKoszyk()
    {
        return koszyk;
    }

    public String getStatus()
    {
        return status;
    }

    public Platnosc getPlatnosc()
    {
        return oplata;
    }
    // SETTERY //

    public KoszykZakupowy setKoszyk(KoszykZakupowy k)
    {
        this.koszyk = k;

        return koszyk;
    }
    public String setStatus(String s)
    {
        if (!s.isEmpty())
        {
            this.status = s;
            return status;
        }
        else
            throw new IllegalArgumentException("Wartość nie może być pusta!");
    }
    public Platnosc setOplata(Platnosc p)
    {
        if(p != null) {
            this.oplata = p;
            return oplata;
        }
        else
            throw new IllegalArgumentException("Wartość nie może być pusta!");
    }
    // KOMENDY //
    public static String ustawStatusZamowienia(Zamowienie z, String status)
    {
        z.status = status;

        return z.status;
    }
    public static void wyswietlZamowienie(Zamowienie z)
    {
        KoszykZakupowy.wyswietlZawartoscKoszyka(z.koszyk);
        System.out.println("Status zamówienia: " + z.status);
        System.out.println();
    }
    public Zamowienie finalizujZamowienie()
    {
        if(oplata.getKwota() == 0.00 && oplata.getStatusPlatnosci().contains("Opłacone"))
        {
            this.status = "Gotowy do wysyłki";
        }
        return this;
    }
    public void zwrocProdukt(Produkt p, Integer ilosc)
    {
        Produkt.dodajDoMagazynu(p, ilosc);
        this.koszyk.setKoszyk(p, ilosc);
        oplata.setKwota(KoszykZakupowy.obliczCalkowitaWartosc(this.koszyk));
    }

    @Override
    public String toString()
    {
        return "Status zamówienia: " + this.status;
    }
}
