package TD1;

/**
 * Classe Rectangle
 * @author Alexis Jolin
 * @author Mathis Fasolo
 * @version 1.0
 */
public class Rectangle extends Parallelogramme
{
    public Rectangle(Point p5, Point p6, Point p7, Point p8)
    {
        super(p5,p6,p7,p8);
    }

    public String propriete()
    {
        return "Un rectangle est un quadrilatère dont les 4 angles sont droits.";
    }

    public String type()
    {
        return "Je suis un Rectangle.";
    }

    public int calculAire()
    {
        return super.calculLargeur() * super.calculLongueur();
    }
}
