public class Zad9 {
    public static void main(String[] args){
    String zdanie = "Grzesiek nie wiedział dlaczego %s jest tak drapieżnym %s mimo, że jego %s na to nie wskazuje";
    String zmiana = String.format(zdanie, "Marek", "kotem", "zachowanie");
    System.out.println(zmiana);
    }
}
