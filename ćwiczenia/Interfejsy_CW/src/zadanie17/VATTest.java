package zadanie17;

public class VATTest {
    public static void main(String[] args)
    {
        double cenaMleka = 3.99;
        System.out.println("Cena mleka bez VAT wynosi: "+cenaMleka);
        System.out.println("Cena mleka z VAT wynosi: "+
                String.format("%.2f",VATCalculator.calculateWithVAT(cenaMleka)));
    }
}
