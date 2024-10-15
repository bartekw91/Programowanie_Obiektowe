import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Zad12 {
    public static void main(String[] args){
        LocalTime czas = LocalTime.now();
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("HH:mm:ss");
        String zdanie = "Dzisiaj jest " + LocalDate.now() + " godzina " + czas.format(format1);
        System.out.println(zdanie);
    }
}
