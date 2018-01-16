package TD1;

/**
 * Classe Trapeze
 * @author Alexis Jolin
 * @author Mathis Fasolo
 * @version 1.0
 */
public class Trapeze extends Quadrilatere implements InterQuad
{
    public Trapeze (InterPoint p5, InterPoint p6, InterPoint p7, InterPoint p8)
    {
        super(p5, p6, p7, p8);
    }

    public String propriete()
    {
        return  "Un trapèze est un quadrilatère, possédant deux côtés opposés parallèles.";
    }

    public String type()
    {
        return "Je suis un Trapéze.";
    }
}
