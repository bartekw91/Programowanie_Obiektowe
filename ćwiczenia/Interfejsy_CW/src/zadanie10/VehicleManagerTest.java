package zadanie10;

public class VehicleManagerTest {
    public static void main(String[] args)
    {
        Car samochod = new Car();
        Motorcycle motor = new Motorcycle();
        System.out.println("Uruchamiam samochód...");
        System.out.println("*Click*");
        System.out.println(samochod.startEngine());
        System.out.println("Poziom paliwa wynosi: " + samochod.getFuelLevel());
        System.out.println();
        System.out.println("Uruchamiam motocykl...");
        System.out.println("*Click*");
        System.out.println(motor.startEngine());
        System.out.println("Poziom paliwa wynosi: " + motor.getFuelLevel());
    }
}
