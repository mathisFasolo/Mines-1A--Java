package TD1;

/**
 * Classe Losange
 * @author Alexis Jolin
 * @author Mathis Fasolo
 * @version 1.0
 */
public class Losange extends Parallelogramme
{
    public Losange (Point p5, Point p6, Point p7, Point p8)
    {
        super(p5, p6, p7, p8);
    }

    public String propriete()
    {
        return "Un losange est un quadrilatère qui a quatre côtés de même longueur";
    }

    public String type()
    {
        return "Je suis un Rectangle.";
    }

}
