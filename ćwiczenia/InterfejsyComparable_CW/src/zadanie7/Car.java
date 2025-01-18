package zadanie7;

public class Car implements Comparable<Car> {
    private String brand;
    private int mileage;
    private int yearOfProduction;

    public Car(){}
    public Car(String firma, int przebieg, int rok)
    {
        this.brand = firma;
        this.mileage = przebieg;
        this.yearOfProduction = rok;
    }

    public String getBrand()
    {
        return brand;
    }
    public int getMileage()
    {
        return mileage;
    }
    public int getYearOfProduction()
    {
        return yearOfProduction;
    }

    @Override
    public int compareTo(Car c)
    {
        return c.mileage - this.mileage;
    }

    @Override
    public String toString()
    {
        return "Firma: " + this.brand + ", Przebieg: " + this.mileage + ", Rok Produkcji: " + this.yearOfProduction;
    }
}
