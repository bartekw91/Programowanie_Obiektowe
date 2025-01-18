package zadanie4;

public class CurrencyConverter implements Converter
{
    private final double eurToUsd = 1.03;
    private final double usdToEur = 0.97;
    @Override
    public double convertToEuro(double amount)
    {
        return amount * usdToEur;
    }
    @Override
    public double convertToUSD(double amount)
    {
        return amount * eurToUsd;
    }

    @Override
    public double getConversionRate(String currency)
    {
        switch(currency.toUpperCase())
        {
            case "USD":
                return eurToUsd;
            case "EUR":
                return usdToEur;
            default:
                throw new IllegalArgumentException("Niewspierana waluta!");
        }
    }
}
