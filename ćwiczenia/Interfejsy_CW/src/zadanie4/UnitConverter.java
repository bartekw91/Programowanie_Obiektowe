package zadanie4;

public class UnitConverter implements Converter{
    private final double mToKm = 0.001;
    private final double lToMl = 1000;
    @Override
    public double convertToEuro(double amount) {
        System.out.println("Niewspierana opcja");
        return 0;
    }

    @Override
    public double convertToUSD(double amount) {
        System.out.println("Niewspierana opcja");
        return 0;
    }

    @Override
    public double getConversionRate(String currency) {
        switch(currency.toUpperCase())
        {
            case "USD":
                throw new IllegalArgumentException("Nie wspieramy waluty");
            case "EUR":
                throw new IllegalArgumentException("Nie wspieramy waluty");
            case "KM":
                return mToKm;
            case "ML":
                return lToMl;
            default:
                throw new IllegalArgumentException("Niewspierana jednostka");
        }
    }
}
