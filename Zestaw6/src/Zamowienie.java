public class Zamowienie {
    KoszykZakupowy koszykZakupowy;
    String statusZamowienia;

    public Zamowienie(KoszykZakupowy k)
    {
        this.koszykZakupowy = k;
        this.statusZamowienia = "Niepołacony";
    }

    public void ustawStatusZamowienia(Zamowienie z, int set)
    {
        switch(set)
        {
            case 0:
                z.statusZamowienia = "Niepołacony";
                break;
            case 1:
                z.statusZamowienia = "Opłacony";
                break;
            default:
                throw new IllegalArgumentException("Błąd! Niepoprawny argument!");
        }
    }
    public Zamowienie wyswietlZamowienie()
    {
        this.koszykZakupowy.wyswietlZawartoscKoszyka();
        System.out.println("\nStatus zamówienia: " + this.statusZamowienia);

        return this;
    }
}
