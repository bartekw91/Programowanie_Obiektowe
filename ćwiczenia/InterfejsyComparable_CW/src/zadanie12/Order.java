package zadanie12;

import java.time.LocalDate;

public class Order implements Comparable<Order>{
    private String productName;
    private int quantity;
    private double unitPrice;

    public Order(String nazwa, int ilosc, double cena)
    {
        this.productName = nazwa;
        this.quantity = ilosc;
        this.unitPrice = cena;
    }

    public String getProductName()
    {
        return productName;
    }
    public int getQuantity()
    {
        return quantity;
    }
    public double getUnitPrice()
    {
        return unitPrice;
    }

    @Override
    public int compareTo(Order o)
    {
        if(Double.compare(this.unitPrice, o.unitPrice) == 0)
            return this.quantity - o.quantity;
        else
            return Double.compare(o.unitPrice, this.unitPrice);
    }
    @Override
    public String toString()
    {
        return "Nazwa: " + this.productName + ", Cena: " + this.unitPrice + " PLN, Ilość: " + this.quantity;
    }
}
