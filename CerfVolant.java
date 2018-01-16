package TD1;

/**
 * Classe CerfVolant
 * @author Alexis Jolin
 * @author Mathis Fasolo
 * @version 1.0
 */
public class CerfVolant extends Quadrilatere
{
    public CerfVolant(InterPoint p5, InterPoint p6, InterPoint p7, InterPoint p8)
    {
        super(p5,p6,p7,p8);
    }

    public String propriete()
    {
        return "Un Cerf-volant est un quadrilatère ayant deux paires de côtés adjacents qui ont la même longueur.";
    }

    public String type()
    {
        return "Je suis un CerfVolant.";
    }

    public float calculAire()
    {
        return (super.calculLargeur()*super.calculLongueur())/2;
    }

}
