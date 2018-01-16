package TD1;

/**
 * Classe CerfVolant
 * @author Alexis Jolin
 * @author Mathis Fasolo
 * @version 1.0
 */
public class CerfVolant extends Quadrilatere
{
    public CerfVolant(Point p5, Point p6, Point p7, Point p8)
    {
        super(p5,p6,p7,p8);
    }

    public String propriete()
    {
        return "Un Cerf-volant est un quadrilatère ayant deux paires de côtés adjacents qui ont la même longueur.";
    }

    public int calculAire()
    {
        return (super.calculLargeur()*super.calculLongueur())/2;
    }

}
