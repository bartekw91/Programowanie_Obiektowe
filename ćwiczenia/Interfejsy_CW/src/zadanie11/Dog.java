package zadanie11;

public class Dog implements DomesticAnimalSound{
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }

    @Override
    public void makeHappySound() {
        System.out.println("*Wag tail*");
    }
}
