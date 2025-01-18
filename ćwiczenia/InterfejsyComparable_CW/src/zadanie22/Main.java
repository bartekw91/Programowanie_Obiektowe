package zadanie22;

import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal("Słoń", 10));
        animalList.add(new Animal("Goryl", 10));
        animalList.add(new Animal("Jaszczurka", 3));
        animalList.add(new Dog("Pies", 3, "Terrier"));
        animalList.add(new Dog("Pies", 3, "Doberman"));
        animalList.add(new Dog("Pies", 5, "Labrador"));
        System.out.println("PRZED SORTOWANIEM");
        System.out.println();
        for(Animal d : animalList)
        {
            System.out.println(d);
        }
        System.out.println();
        System.out.println("PO SORTOWANIU");
        Collections.sort(animalList);

        for(Animal d : animalList)
        {
            System.out.println(d);
        }
    }
}
