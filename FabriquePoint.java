package TD1;
import java.lang.Exception;

/**
 * Classe FabriquePoint Bonus-1
 * @author Alexis Jolin
 * @author Mathis Fasolo
 * @version 1.0
 */
public abstract class FabriquePoint
{
    public static InterPoint create (String typePoint, double arg1, double arg2) throws Exception
    {
        try
        {
            if(typePoint == "Point" || typePoint == "Point2")
            {
                return (InterPoint) Class.forName("TD1."+typePoint).getConstructor(double.class, double.class).newInstance(arg1,arg2);
            }
            else
            {
                // On veut qu'on ne puisse pas créer d'autre classe que celle de Point et Point2
                throw new IllegalArgumentException("Mauvais argument dans la fabrique a point");
            }
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
            return null;
        }
        catch (InstantiationException e)
        {
            e.printStackTrace();
            return null;
        }
        catch (IllegalAccessException e)
        {
            e.printStackTrace();
            return null;
        }
        catch (IllegalArgumentException e)
        {
            throw new Exception(e.getMessage());
        }

    }
}
