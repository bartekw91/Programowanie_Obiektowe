public class Zad8 {
    public static void main(String[] args){
        System.out.println("W tablicy znaków ASCII można znaleźć w poszczególnych przedziałach podane znaki:");
        System.out.println("* Od 97 do 122 znajduja się małe litery");
        System.out.println("* Od 65 do 90 znajduja się duże litery");
        System.out.println("* Od 48 do 57 znajduja się cyfry\n");

        System.out.println("PRZYKŁADY");
        System.out.println("\nMałe litery:");
        for(int i = 97; i < 123;i++){
            char t = (char) i;
            System.out.println(t + " - " + i);
        }
        System.out.println("\nDuże litery:");
        for(int i = 65; i < 91;i++){
            char t = (char) i;
            System.out.println(t + " - " + i);
        }
        System.out.println("\nCyfry:");
        for(int i = 48; i < 58;i++){
            char t = (char) i;
            System.out.println(t + " - " + i);
        }
    }
}
