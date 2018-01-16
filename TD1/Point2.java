package TD1;
import java.lang.Math;
/**
 * Classe Point2
 * @author Alexis Jolin
 * @author Mathis Fasolo
 * @version 1.0
 */

public class Point2 implements InterPoint {
    /* attributs */
    private double rayon;
    private double angle;

    /* Constructeur*/
    public Point2(float ray,float ang){
        this.rayon=ray;
        this.angle=ang;
    }

    /* getter & setter*/

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public double getX(){
        return this.rayon*Math.cos(this.angle);
    }

    public double getY(){
        return this.rayon*Math.sin(this.angle);
    }
}