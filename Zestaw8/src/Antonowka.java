public class Antonowka extends Owoc{

    public Antonowka(String nazwa, Double cena, Integer ilosc)
        {
            super(nazwa, cena, ilosc);
        }

        public void smak()
        {
            System.out.println("Kwaśny");
        }
        public void zjedz()
        {
            System.out.println("Bleh");
        }
        public void umyj()
        {
            System.out.println("Umyty");
        }
}
