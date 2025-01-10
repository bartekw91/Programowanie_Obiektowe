import java.util.regex.Pattern;

public class KlientIndywidualny extends Klient {
    String pesel;

    public KlientIndywidualny(String imie, String nazwisko, Adres adres, String pesel)
    {
        super(imie, nazwisko, adres);
        if(pesel.length() == 11 && Pattern.matches("\\d", pesel))
            this.pesel = pesel;
    }
}
