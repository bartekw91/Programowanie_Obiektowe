package zadanie23;

public class Main {
    public static void main(String[] args)
    {
        Animal tygrys = new Animal("Tygrys", 5);
        Dog terrier = new Dog("Terrier", 2);
        Animal sowa = new Animal("Sowa", 6);
        Dog labrador = new Dog("Labrador", 1);
        Pair<Animal> zwierzeta = new Pair<>();
        zwierzeta.setObj1(tygrys);
        zwierzeta.setObj2(sowa);
        Pair<Dog> psy = new Pair<>();
        psy.setObj1(terrier);
        psy.setObj2(labrador);
        Pair wynik = new Pair(Main.findMax(zwierzeta), Main.findMax(psy));
        System.out.println(wynik.getObj1());
        System.out.println(wynik.getObj2());
    }
    public static <T extends Animal> T findMax(Pair<? extends T> para)
    {
        T jeden = para.getObj1();
        T dwa = para.getObj2();

        return jeden.getWiek() > dwa.getWiek() ? jeden : dwa;
    }
}
