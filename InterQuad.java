package TD1;

/**
 * Interface InterQuad Bonus 2
 * @author Alexis Jolin
 * @author Mathis Fasolo
 * @version 1.0
 */
public interface InterQuad
{
    InterPoint getA();
    InterPoint getB();
    InterPoint getC();
    InterPoint getD();

    void setA(Point a);
    void setB(Point b);
    void setC(Point c);
    void setD(Point d);

    String coordonnees(InterPoint p);
    String type();
    String propriete();
}
