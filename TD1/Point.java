package TD1;

/**
 * Classe Point
 * @author Alexis Jolin
 * @author Mathis Fasolo
 * @version 1.0
 */
public class Point implements InterPoint
{
    /* ATTRIBUTS */
    private double x;
    private double y;

    /* CONSTRUCTEURS */
    public Point (int x_pos, int y_pos)
    {
        this.x = x_pos;
        this.y = y_pos;
    }

    /* GETTERS */
    public double getX ()
    {
        return this.x;
    }

    public double getY ()
    {
        return this.y;
    }

    /* SETTERS */
    public void setX (double x_pos)
    {
        this.x = x_pos;
    }

    public void setY (double y_pos)
    {
        this.y = y_pos;
    }
}
