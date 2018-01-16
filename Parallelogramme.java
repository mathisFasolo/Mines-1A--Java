package TD1;

/**
 * Classe Paralleligramme
 * @author Alexis Jolin
 * @author Mathis Fasolo
 * @version 1.0
 */
public class Parallelogramme extends Quadrilatere
{
    public Parallelogramme (InterPoint p5, InterPoint p6, InterPoint p7, InterPoint p8)
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
