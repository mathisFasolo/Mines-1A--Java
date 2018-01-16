package TD1;
/**
 * Classe Paralleligramme
 * @author Alexis Jolin
 * @author Mathis Fasolo
 * @version 1.0
 */

public class Point2{
    /* attributs */
    private float rayon;
    private float angle;

    /* Constructeur*/
    public Point2(float ray,float ang){
        this.rayon=ray;
        this.angle=ang;
    }

    /* getter & setter*/

    public float getRayon() {
        return rayon;
    }

    public void setRayon(float rayon) {
        this.rayon = rayon;
    }

    public float getAngle() {
        return angle;
    }

    public void setAngle(float angle) {
        this.angle = angle;
    }
}