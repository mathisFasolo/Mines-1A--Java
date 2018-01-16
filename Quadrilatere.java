package TD1;

/**
 * Classe Quadrilatère
 * @author Alexis Jolin
 * @author Mathis Fasolo
 * @version 1.0
 */
public class Quadrilatere implements InterQuad
{
    /* ATTRIBUTS */
    private InterPoint A;
    private InterPoint B;
    private InterPoint C;
    private InterPoint D;

    /* CONSTRUCTEURS */
    public Quadrilatere (InterPoint p5, InterPoint p6, InterPoint p7, InterPoint p8)
    {
        this.A = p5;
        this.B = p6;
        this.C = p7;
        this.D = p8;
    }

    /* GETTERS */
    public InterPoint getA()
    {
        return A;
    }

    public InterPoint getB()
    {
        return B;
    }

    public InterPoint getC()
    {
        return C;
    }

    public InterPoint getD()
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
    public String coordonnees(InterPoint p)
    {
        return "(" + p.getX()+","+p.getY()+")";
    }

    /**
     * Retourne le type de la figure
     * @return String
     */
    public String type()
    {
        return "Je suis un quadrilatère quelconque.";
    }

    /**
     * Retourne les propriétés géomètrique de la figure
     * @return String
     */
    public String propriete()
    {
        return "Je n'est aucune propriété particulière.";
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
        return type() + propriete() + "Mes sommets ont pour coordonnées " + coordonnees(A) +","+coordonnees(B)+","+coordonnees(C)+" et " + coordonnees(D)+".";
    }

    /**
     * Calcule la largeur du quadrilatère (yD - yA)
     * @return Int
     */
    public double calculLargeur()
    {
        return this.D.getY() - this.A.getY();
    }

    /**
     * Calcule la longueur du quadrilatère (xB - xA)
     * @return Int
     * */
    public double calculLongueur()
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
