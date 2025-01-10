public class Adres {
    private String ulica;
    private Integer numerDomu;
    private Integer numerMieszkania;
    private String miasto;
    private String kodPocztowy;

    public Adres(String ulica, Integer numerDomu, String miasto, String kodPocztowy)
    {
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.numerMieszkania = null;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
    }
    public Adres(String ulica, Integer numerDomu, Integer numerMieszkania, String miasto, String kodPocztowy)
    {
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.numerMieszkania = numerMieszkania;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
    }
    // GETTERY //
    public String getUlica()
    {
        return ulica;
    }
    public Integer getNumerDomu()
    {
        return numerDomu;
    }
    public Integer getNumerMieszkania()
    {
        return numerMieszkania;
    }
    public String getMiasto()
    {
        return miasto;
    }
    public String getKodPocztowy()
    {
        return kodPocztowy;
    }

    // SETTERY //
    public String setUlica(String s)
    {
        this.ulica = s;
        return ulica;
    }
    public Integer setNumerDomu(Integer n)
    {
        this.numerDomu = n;
        return numerDomu;
    }
    public Integer setNumerMieszkania(Integer n)
    {
        this.numerMieszkania = n;
        return numerMieszkania;
    }
    public String setMiasto(String s)
    {
        this.miasto = s;
        return miasto;
    }
    public String setKodPocztowy(String s)
    {
        this.kodPocztowy = s;
        return kodPocztowy;
    }
    // KOMENDY //
    public void pokaz()
    {
        System.out.println(this.kodPocztowy + ", " + this.miasto);
        if(this.numerMieszkania == null)
            System.out.println(this.ulica + " " + this.numerDomu);
        else
            System.out.println(this.ulica + " " + this.numerDomu + "/" + this.numerMieszkania);
    }

    public boolean przed(Adres innyAdres)
    {
        return this.kodPocztowy.equals(innyAdres.kodPocztowy);
    }

    @Override
    public String toString()
    {
        if (getNumerMieszkania() == null)
            return getUlica() + " " + getNumerDomu() + ", " + getKodPocztowy() + " " + getMiasto();
        else
            return getUlica() + " " + getNumerDomu() + "/" + getNumerMieszkania() + ", " + getKodPocztowy() + " " + getMiasto();
    }

}
