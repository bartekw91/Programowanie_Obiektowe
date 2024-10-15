public class Zad2 {
    public static void main(String[] args)
    {
    double dzialanie = (Math.sqrt(7)-1)/2+Math.pow(3, 3)%2;
    double dzialanie2 = 1991/(6*10);
    double dzialanie3 = ((3+Math.sqrt(3))/((Math.sqrt(5)/2)/3))+1;
    double dzialanie4 = 157%8%3;

    String imie = "Bartłomiej";
    String nazwisko = "Wasyluk";
    int i_length = imie.length();
    int n_length = nazwisko.length();

    double dzialanie5 = (n_length+i_length+1)/Math.sqrt(Math.sqrt(2));
    System.out.printf("Wynik działania jest %f, a po zmianie w int jest %d\n", dzialanie, (int)dzialanie);
    System.out.printf("Wynik działania jest %f, a po zmianie w int jest %d\n", dzialanie2, (int)dzialanie2);
    System.out.printf("Wynik działania jest %f, a po zmianie w int jest %d\n", dzialanie3, (int)dzialanie3);
    System.out.printf("Wynik działania jest %f, a po zmianie w int jest %d\n", dzialanie4, (int)dzialanie4);
    System.out.printf("Wynik działania jest %f, a po zmianie w int jest %d\n", dzialanie5, (int)dzialanie5);
    }
}
