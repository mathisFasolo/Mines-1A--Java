package TD1;

/**
 * Classe Carre
 * @author Alexis Jolin
 * @author Mathis Fasolo
 * @version 1.0
 */
public class Carre extends Rectangle
{
    public Carre (InterPoint p5, InterPoint p6, InterPoint p7, InterPoint p8)
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
    public float calculAire()
    {
        return super.calculLargeur() * super.calculLargeur();
    }

    //@Override
    public boolean verifTypeQuad()
    {
        return super.calculLargeur() == super.calculLongueur();
    }
}
