import java.util.Objects;

public class Platnosc {
    private Double kwota;
    private String statusPlatnosci = "Nieopłacone";

    public Platnosc(Zamowienie z)
    {
        this.kwota = KoszykZakupowy.obliczCalkowitaWartosc(z.getKoszyk());
    }

    // GETTERY //
    public Double getKwota()
    {
        return kwota;
    }

    public String getStatusPlatnosci()
    {
        return statusPlatnosci;
    }

    // SETTERY //
    public Double setKwota(Double d)
    {
        this.kwota = d;
        return kwota;
    }

    public String setStatusPlatnosci(String s)
    {
        if (!s.isEmpty()) {
            this.statusPlatnosci = s;
            return statusPlatnosci;
        }
        else
            throw new IllegalArgumentException("Pole nie może być puste!");
    }
    // KOMENDY //
    public void zaplac()
    {
        this.kwota = 0.00;
        this.statusPlatnosci = "Opłacone";
    }
    @Override
    public String toString()
    {
        if(this.kwota != 0)
            return "Do zapłaty: " + this.kwota + "\nStatus zamówienia: " + this.statusPlatnosci;
        else
            return "Status zamówienia: " + this.statusPlatnosci;
    }
    @Override
    public int hashCode()
    {
        return Objects.hash(this.kwota, this.statusPlatnosci);
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (!(obj instanceof Platnosc))
            return false;
        Platnosc temp = (Platnosc) obj;
        return this.kwota == temp.getKwota() && this.statusPlatnosci.equals(temp.getStatusPlatnosci());
    }
}
