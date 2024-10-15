public class Zad1 {
    public static void main(String[] args)
    {
        Object a = 23.0+76;
        Object b = 41*2.0+3;
        Object c = 5-33;
        Object d = 109%3;
        Object e = 50/2;
        Object f = 4|2;
        Object g = 3^5;
        Object h = 7&9;
        System.out.printf("Typ wyniku dla 23.0+76 jest %s\n", a.getClass().getTypeName());
        System.out.printf("Typ wyniku dla 41*2.0+3 jest %s\n", b.getClass().getTypeName());
        System.out.printf("Typ wyniku dla 5-33 jest %s\n", c.getClass().getTypeName());
        System.out.printf("Typ wyniku dla 109%%3 jest %s\n", d.getClass().getTypeName());
        System.out.printf("Typ wyniku dla 50/2 jest %s\n", e.getClass().getTypeName());
        System.out.printf("Typ wyniku dla 4|2 jest %s\n", f.getClass().getTypeName());
        System.out.printf("Typ wyniku dla 3^5 jest %s\n", g.getClass().getTypeName());
        System.out.printf("Typ wyniku dla 7&9 jest %s\n", h.getClass().getTypeName());
    }
}
