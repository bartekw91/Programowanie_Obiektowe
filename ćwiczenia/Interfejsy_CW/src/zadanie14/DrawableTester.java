package zadanie14;

public class DrawableTester {
    public static void main(String[] args)
    {
        Circle kolo = new Circle();
        Rectangle kwadrat = new Rectangle();
        kolo.draw();
        kolo.display();
        kwadrat.draw();
        kwadrat.display();
        System.out.println(Drawable.getType());
    }
}
