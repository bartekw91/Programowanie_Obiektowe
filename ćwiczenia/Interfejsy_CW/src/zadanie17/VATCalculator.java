package zadanie17;

public interface VATCalculator {
    final double vatRate = (double)23/100;
    static double calculateWithVAT(double price)
    {
        return price + (price*vatRate);
    }
}
