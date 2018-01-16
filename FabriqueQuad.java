package TD1;

/**
 * Classe FabriqueQuad Bonus-2
 * @author Alexis Jolin
 * @author Mathis Fasolo
 * @version 1.0
 */
public abstract class FabriqueQuad
{
    public static InterQuad create (String typeQuad, InterPoint p1, InterPoint p2, InterPoint p3, InterPoint p4) throws Exception
    {
        try
        {
            if(typeQuad == "Quadrilatere" || typeQuad == "Parallelogramme" || typeQuad == "Trapeze"|| typeQuad == "Losange" || typeQuad == "Rectangle" || typeQuad == "CerfVolant"|| typeQuad == "Carre")
            {
                return (InterQuad) Class.forName("TD1."+typeQuad).getConstructor(InterPoint.class, InterPoint.class, InterPoint.class, InterPoint.class ).newInstance(p1,p2,p3,p4);
            }
            else
            {
                // On veut qu'on ne puisse pas créer d'autre classe que celle de Point et Point2
                throw new IllegalArgumentException("Mauvais argument dans la fabrique a quadrilatère");
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
