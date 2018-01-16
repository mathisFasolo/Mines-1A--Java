package TD1;

/**
 * Classe Carre
 * @author Alexis Jolin
 * @author Mathis Fasolo
 * @version 1.0
 */
public class Carre extends Rectangle
{
    public Carre (Point p5, Point p6, Point p7, Point p8)
    {
        super(p5, p6, p7, p8);
    }

    public String propriete()
    {
        return  "Un carré est un quadrilatère qui a quatre côtés de même longueur et quatre angles droits.";
    }

    public String type()
    {
        return "Je suis un Carre.";
    }

    @Override
    public int calculAire()
    {
        return super.calculLargeur() * super.calculLargeur();
    }

    //@Override
    public boolean verifTypeQuad()
    {
        return super.calculLargeur() == super.calculLongueur();
    }
}
