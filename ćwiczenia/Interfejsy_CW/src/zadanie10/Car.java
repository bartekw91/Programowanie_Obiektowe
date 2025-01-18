package zadanie10;

public class Car implements VehicleManager{
    //GENTLEMEN, START YOUR ENGINE
    @Override
    public String startEngine() {
        return "Silnik samochodu uruchomiony";
    }

    @Override
    public int getFuelLevel() {
        return 50;
    }
}
