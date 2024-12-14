public class Main {
    public static void main(String[] args)
    {
        Produkt telewizor = new Produkt("Telewizor LG", 2600.00, 500);
        Produkt telewizor2 = new Produkt("Telewizor Sony", 5200.00, 500);
        KoszykZakupowy kosz = new KoszykZakupowy(telewizor, 50);
        kosz.wyswietlZawartoscKoszyka();
        Produkt.wyswietlInformacje(telewizor);
        kosz.dodajProdukt(telewizor2, 25);
        kosz.wyswietlZawartoscKoszyka();
        System.out.println(kosz.obliczCalkowitaWartosc());
    }
}