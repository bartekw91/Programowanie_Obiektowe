package zadanie21;

public class Main {
    public static void main(String[] args)
    {
        Animal zwierze = new Animal("Tygrys", 9);
        Dog piesek = new Dog(8, "Golden Retriever");
        System.out.println(Main.findMax(zwierze, piesek));
    }
    public static <T extends Animal> T findMax(T element1, T element2)
    {
        return (element1.getWiek() > element2.getWiek() ? element1 : element2);
    }
}
