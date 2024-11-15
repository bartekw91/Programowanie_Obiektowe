import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class nr12 {
    public static void run()
    {
        DateTimeFormatter formatowanie_d = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter formatowanie_c = DateTimeFormatter.ofPattern("hh:mm:ss");

        String date = LocalDate.now().format(formatowanie_d);
        String time = LocalTime.now().format(formatowanie_c);
        System.out.println("Dzisiaj jest " + date + " godzina " + time);
    }
}
