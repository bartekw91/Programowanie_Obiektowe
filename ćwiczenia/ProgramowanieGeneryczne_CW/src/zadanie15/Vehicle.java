package zadanie15;

public class Vehicle implements Comparable<Vehicle>{
    private String model;
    private int speed;

    public Vehicle(String modelS, int predkosc)
    {
        if(!modelS.isEmpty())
            this.model = modelS;
        else
            throw new IllegalArgumentException("Pole nie może być puste!");
        if(predkosc > 0)
            this.speed = predkosc;
        else
            throw new IllegalArgumentException("Prędkośc musi byc większa niż 0!");
    }
    public int compareTo(Vehicle v)
    {
        return Integer.compare(this.speed, v.speed);
    }
    @Override
    public String toString()
    {
        return "Model: " + this.model + ", Prędkość: " + this.speed + " KM/H";
    }
}
