package zadanie28;

public class Main {
    public static void main(String[] args)
    {
    Dog[] pieski = {new Dog("Terrier", 5),
                    new Dog("Labrador", 10),
                    new Dog("Golden Retriever", 2),
                    new Dog("Doberman", 3),
                    new Dog("Huskey", 1)};
    Pair<Dog> wynik = new Pair<>();
    Main.findMinMaxAge(pieski, wynik);
    System.out.println(wynik);
    }
    public static <T> void findMinMaxAge(Dog[] tablica, Pair<? super Dog> result)
    {
        Dog min = tablica[0];
        Dog max = tablica[0];
        for(Dog a: tablica)
        {
            if(min.getAge() > a.getAge())
                min = a;
            else if(max.getAge() < a.getAge())
                max = a;
        }
        result.setObj1(min);
        result.setObj2(max);
    }
}
