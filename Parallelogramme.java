package TD1;

/**
 * Classe Paralleligramme
 * @author Alexis Jolin
 * @author Mathis Fasolo
 * @version 1.0
 */
public class Parallelogramme extends Quadrilatere
{
    public Parallelogramme (Point p5, Point p6, Point p7, Point p8)
    {
        super(p5, p6, p7, p8);
    }

    public String propriete()
    {
        return "Un parallélogramme est un quadrilatère dans lequel : les côtés opposés sont parallèles et ont la même longueur deux à deux, les diagonales se coupent en leur milieu.";
    }

    public String type()
    {
        return "Je suis un Parallelogramme.";
    }

}
