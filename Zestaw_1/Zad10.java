public class Zad10 {
    public static void main(String[] args){
        String zdanie = "%s to najlepsza książka napisana przez %s";
        String zmiana = String.format(zdanie, "Władca Pierścieni", "J. R. R. Tolkien'a");
        System.out.println(zmiana);
    }
}
