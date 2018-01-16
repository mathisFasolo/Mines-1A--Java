package TD1;

public class Main
{
    public static void main(String[] args)
    {
        Point p1 = new Point(0,7);
        Point p2 = new Point(3,6);
        Point p3 = new Point(2,8);
        Point p4 = new Point(6,10);

        Quadrilatere q1 = new Quadrilatere(p1, p2, p3, p4);
        Parallelogramme pl1 = new Parallelogramme(p1,p2,p3,p4);
        Losange l1 = new Losange(p1,p2,p3,p4);
        Rectangle r1 = new Rectangle(p1,p2,p3,p4);
        Carre c1 = new Carre(p1,p2,p3,p4);
        Trapeze t1 = new Trapeze(p1,p2,p3,p4);

        System.out.println(q1.toString());
        System.out.println(pl1.toString());
        System.out.println(l1.toString());
        System.out.println(r1.toString());
        System.out.println(c1.toString());
        System.out.println(t1.toString());

    }
}