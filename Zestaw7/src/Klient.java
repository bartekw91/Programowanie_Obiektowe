import java.util.ArrayList;
import java.util.Objects;

public class Klient {
    private String imie;
    private String nazwisko;
    private Adres adresKlienta;
    private ArrayList<Zamowienie> listaZamowien = new ArrayList<>();

    public Klient (String name, String surname, Adres adresKlienta)
    {
        this.imie = name;
        this.nazwisko = surname;
        this.adresKlienta = adresKlienta;
    }
    public Klient (String name, String surname, Adres adresKlienta, Zamowienie z)
    {
        this.imie = name;
        this.nazwisko = surname;
        this.adresKlienta = adresKlienta;
        this.listaZamowien.add(z);
    }

    // GETTERY //
    public String getImie()
    {
        return imie;
    }
    public String getNazwisko()
    {
        return nazwisko;
    }
    public Adres getAdresKlienta()
    {
        return adresKlienta;
    }
    public ArrayList<Zamowienie> getListaZamowien()
    {
        return listaZamowien;
    }

    // SETTERY //
    public String setImie(String s)
    {
        if (!s.isEmpty() || !s.equals(" "))
        {
            this.imie = s;
            return imie;
        }
        else
        {
            throw new IllegalArgumentException("Wartość nie może być pusta");
        }
    }
    public String setNazwisko(String s)
    {
        if (!s.isEmpty() || !s.equals(" "))
        {
            this.nazwisko = s;
            return nazwisko;
        }
        else
        {
            throw new IllegalArgumentException("Wartość nie może być pusta");
        }
    }
    public Adres setAdresKlienta(Adres a)
    {
        if (a != null)
        {
            this.adresKlienta = a;
            return adresKlienta;
        }
        else
        {
            throw new IllegalArgumentException("Wartość nie może być pusta");
        }
    }

    public ArrayList<Zamowienie> setListaZamowien(ArrayList<Zamowienie> z)
    {
        if (z != null) {
            this.listaZamowien = z;
            return listaZamowien;
        }
        else
            throw new IllegalArgumentException("Wartość nie może być pusta!");
    }

    // KOMENDY //
    public void dodajZamowienie(Zamowienie z)
    {
            this.listaZamowien.add(z);
    }
    public void wyswietlHistorieZamowien()
    {
        for(Zamowienie z : this.listaZamowien)
        {
            Zamowienie.wyswietlZamowienie(z);
        }
    }
    public double obliczLacznyKosztZamowien()
    {
        double wynik = 0.00;
        for(Zamowienie z: this.listaZamowien)
        {
            wynik += KoszykZakupowy.obliczCalkowitaWartosc(z.getKoszyk());
        }
        System.out.println("\nŁączny koszy zamówień:" + String.format("%.02f", wynik) + " PLN");
        return wynik;
    }
    @Override
    public int hashCode()
    {
        return Objects.hash(this.imie, this.nazwisko, this.adresKlienta);
    }
    @Override
    public String toString()
    {
        return getImie() + " " + getNazwisko() + ", " + getAdresKlienta() + ", Ilość zamówień: " + getListaZamowien().size();
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if(!(obj instanceof Klient))
            return false;
        Klient temp = (Klient) obj;

        return this.imie.equals(temp.getImie()) && this.nazwisko.equals(temp.getNazwisko()) && this.adresKlienta == temp.getAdresKlienta();
    }
}
