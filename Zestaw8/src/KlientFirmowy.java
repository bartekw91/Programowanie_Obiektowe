import java.util.regex.Pattern;

public class KlientFirmowy extends Klient {
    String nip;
    String regon;

    public KlientFirmowy(String imie, String nazwisko, Adres adres, String nip, String regon)
    {
        super(imie, nazwisko, adres);
        if(nip.length() == 10 && Pattern.matches("\\d", nip))
            this.nip = nip;
        else if (nip.length() == 10 && Pattern.matches("\\D", nip))
            throw new IllegalArgumentException("Nie mogą występować litery w NIP!");
        else
            throw new IllegalArgumentException("Ilość cyfr NIP jest niepoprawna!");
        if(regon.length() == 9 && Pattern.matches("\\d", regon))
            this.regon = regon;
        else if (regon.length() == 9 && Pattern.matches("\\D", regon))
            throw new IllegalArgumentException("Nie mogą występować litery w REGON!");
        else
            throw new IllegalArgumentException("Ilość cyfr REGON jest niepoprawna!");
    }
}
