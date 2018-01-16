package TD1;

/**
 * Classe Quadrilatère
 * @author Alexis Jolin
 * @author Mathis Fasolo
 * @version 1.0
 */
public class Quadrilatere
{
    /* ATTRIBUTS */
    private Point A;
    private Point B;
    private Point C;
    private Point D;

    /* CONSTRUCTEURS */
    public Quadrilatere (Point p5, Point p6, Point p7, Point p8)
    {
        this.A = p5;
        this.B = p6;
        this.C = p7;
        this.D = p8;
    }

    /* GETTERS */
    public Point getA()
    {
        return A;
    }

    public Point getB()
    {
        return B;
    }

    public Point getC()
    {
        return C;
    }

    public Point getD()
    {
        return D;
    }

    /* SETTERS */
    public void setA(Point a)
    {
        this.A = a;
    }

    public void setB(Point b)
    {
        this.B = b;
    }

    public void setC(Point c)
    {
        this.C = c;
    }

    public void setD(Point d)
    {
        this.D = d;
    }

    /* METHODES */

    /**
        Affiche les coordonnées d'un point passé en paramètre
        @param  p Point : le point
        @return String : une chaine de caractère contenant les coordonnées du point formatés
     */
    public String coordonnees(Point p)
    {
        return "(" + p.getX()+","+p.getY()+")";
    }

    /**
     * Affiche les propriétés géométriques de la figure
     * @return String
     */
    public String propriete()
    {
        return "Je suis un quadrilatère quelconque.";
    }

    /**
     * Affiche le type du quadrilatère
     */
    public void affiche()
    {
        System.out.println(this.toString());
    }

    /**
     * Affiche les informations géométrique de la figure et ses coordonnées
     * @return String
     */
    public String toString()
    {
        return propriete() + "Mes sommets ont pour coordonnées " + coordonnees(A) +","+coordonnees(B)+","+coordonnees(C)+" et " + coordonnees(D)+".";
    }

    /**
     * Calcule la largeur du quadrilatère (yD - yA)
     * @return Int
     */
    public int calculLargeur()
    {
        return this.D.getY() - this.A.getY();
    }

    /**
     * Calcule la longueur du quadrilatère (xB - xA)
     * @return Int
     * */
    public int calculLongueur()
    {
        return this.B.getX() - this.A.getX();
    }

    /**
     * Calcule la hauteur du quadrilatère (xB - xA)
     * @return Int
     */
    //public abstract int calculHauteur();

    /**
     * Calcule l'aire du quadrilatère (xB - xA)
     * @return Int
     */
    //public abstract int calculAire();
    //public abstract boolean verifTypeQuad();
}
