package TD1;
import java.lang.Exception;

/**
 * Classe FabriquePointOriginel d-
 * @author Alexis Jolin
 * @author Mathis Fasolo
 * @version 1.0
 */
public abstract class FabriquePointOriginel
{
    public static InterPoint create (String typePoint, double arg1, double arg2) throws Exception
    {
        if(typePoint == "Point")
        {
            Point p1 = new Point(arg1, arg2);
            return p1;
        }
        else if (typePoint == "Point2")
        {
            Point2 p2 = new Point2(arg1,arg2);
            return p2;
        }
        else
        {
            throw new Exception("Mauvais argument dans la fabrique a point");
        }
    }
}
