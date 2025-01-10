import java.time.LocalDate;

public class Sklep {
    private Magazyn magazynSklepu;
    private String nazwaSklepu;
    private LocalDate dataPowstania;

    public Sklep (String nazwaSklepu, LocalDate data, Magazyn danyMagazyn)
    {
        this.nazwaSklepu = nazwaSklepu;
        this.magazynSklepu = danyMagazyn;
        if(data.isAfter(LocalDate.now()))
        {
            throw new IllegalArgumentException("Błąd! Data powstania nie może być późniejsza!");
        }
        else
            this.dataPowstania = data;
    }

    // GETTERY //
    public Magazyn getMagazynSklepu()
    {
        return magazynSklepu;
    }
    public String getNazwaSklepu()
    {
        return nazwaSklepu;
    }
    public LocalDate getDataPowstania()
    {
        return dataPowstania;
    }

    // SETTERY //
    public Magazyn setMagazynSklepu(Magazyn m)
    {
        if (m != null)
            this.magazynSklepu = m;
        else
            throw new IllegalArgumentException("Wartość nie może być pusta!");

        return magazynSklepu;
    }
    public String setNazwaSklepu(String s)
    {
        if (!s.isEmpty())
        {
            this.nazwaSklepu = s;

            return nazwaSklepu;
        }
        else
            throw new IllegalArgumentException("Wartość nie może być pusta!");
    }
    public LocalDate setDataPowstania(LocalDate d)
    {
        if(d != null) {
            this.dataPowstania = d;

            return dataPowstania;
        }
        else
            throw new IllegalArgumentException("Wartość nie może być pusta!");
    }

    // KOMENDY //
    public void dodajProdukt(Produkt p, Integer ilosc)
    {
        this.magazynSklepu.setProdukty(p, ilosc);
    }

    public static void wyswietlOferty(Sklep s)
    {
        System.out.println("PRODUKTY OFEROWANE PRZEZ DANY SKLEP");
        System.out.println("===================================");
        for(Produkt p : s.magazynSklepu.getProdukty().keySet())
        {
            System.out.println(p.getNazwa() + " | " + p.getCena() + " PLN | " + "x" + s.magazynSklepu.getProdukty(p));
        }
        System.out.println("===================================");
    }
    public static void wyszukajProduktu(Sklep s, String t)
    {
        int count = 0;
        for(Produkt p : s.magazynSklepu.getProdukty().keySet())
        {
            if(p.getNazwa().contains(t))
            {
                System.out.println(p.getNazwa() + " | " + p.getCena() + " PLN | " + "x" + s.magazynSklepu.getProdukty(p));
                count++;
            }
        }
        if (count == 0)
            System.out.println("Podany produkt nie jest dostępny w sklepie");
    }

    @Override
    public String toString()
    {
        return "Sklep: " + getNazwaSklepu() + ", " + "Data Powstania: " + getDataPowstania();
    }
}
