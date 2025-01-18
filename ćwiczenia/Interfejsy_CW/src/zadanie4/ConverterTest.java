package zadanie4;

public class ConverterTest {
    public static void main(String[] args)
    {
        CurrencyConverter konwerterWalut = new CurrencyConverter();
        UnitConverter konwerterJednostek = new UnitConverter();
        System.out.println("5 Euro w dolarach wynosi: " + konwerterWalut.convertToUSD(5));
        System.out.println("23 dolarów w Euro wynosi: " + konwerterWalut.convertToEuro(23));
        System.out.println("Konwersja Euro na dolar wynosi: " + konwerterWalut.getConversionRate("usd"));
        System.out.println("Konwersja dolara na euro wynosi: " + konwerterWalut.getConversionRate("eur"));
        konwerterJednostek.convertToEuro(5);
        konwerterJednostek.convertToUSD(23);
        System.out.println("1 metr na kilometr wynosi:" + konwerterJednostek.getConversionRate("km") + " km");
        System.out.println("1 lit na militrów wynosi:"
                + String.format("%.0f",konwerterJednostek.getConversionRate("ml")) + " ml");
    }
}
