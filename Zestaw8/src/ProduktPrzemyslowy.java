public class ProduktPrzemyslowy extends Produkt{
    public ProduktPrzemyslowy(String nazwa, Double cena, Integer ilosc)
    {
        super(nazwa, cena, ilosc);
    }
    // GETTERY //

    @Override
    public String getNazwa() {
        return super.getNazwa();
    }
    @Override
    public Double getCena()
    {
        return super.getCena();
    }
    @Override
    public Integer getIlosc()
    {
        return super.getIlosc();
    }
    // SETTERY //

    @Override
    public void setNazwa(String s)
    {
        if(!s.isEmpty() || !s.equals(" "))
        {
            super.setNazwa(s);
        }
        else
            throw new IllegalArgumentException("Błąd! Pole nie może być puste!");
    }
    @Override
    public void setCena(Double c)
    {
        if(c == null)
        {
            throw new IllegalArgumentException("Błąd! Pole nie może być puste!");
        }
        else
            super.setCena(c);
    }
    @Override
    public void setIlosc(Integer i)
    {
        if(i != null)
            super.setIlosc(i);
        else
            throw new IllegalArgumentException("Błąd! Pole nie może być puste!");
    }
}
