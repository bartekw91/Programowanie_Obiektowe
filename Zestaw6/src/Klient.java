import java.util.ArrayList;

public class Klient {
    String imie;
    String nazwisko;
    ArrayList<Zamowienie> listaZamowien = new ArrayList<Zamowienie>();

    public Klient (String name, String surname)
    {
        this.imie = name;
        this.nazwisko = surname;
    }

    public Klient dodajZamowienie(Zamowienie z)
    {
        listaZamowien.add(z);
        return this;
    }

    public Klient wyswietlHistorieZamowien()
    {
        int i = 1;
        for(Zamowienie z : this.listaZamowien)
        {
            System.out.println("#" + ++i);
            z.wyswietlZamowienie();
        }
        return this;
    }
    public double obliczLacznyKoszt(Klient c)
    {
        double suma = 0.00;
        for(Zamowienie z: c.listaZamowien)
        {
                suma += z.koszykZakupowy.obliczCalkowitaWartosc();
        }
        return suma;
    }
}
