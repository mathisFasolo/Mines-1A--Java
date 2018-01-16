package TD1;

public class Point implements InterPoint
{
    /* ATTRIBUTS */
    private float x;
    private float y;

    /* CONSTRUCTEURS */
    public Point (int x_pos, int y_pos)
    {
        this.x = x_pos;
        this.y = y_pos;
    }

    /* GETTERS */
    public float getX ()
    {
        return this.x;
    }

    public float getY ()
    {
        return this.y;
    }

    /* SETTERS */
    public void setX (float x_pos)
    {
        this.x = x_pos;
    }

    public void setY (float y_pos)
    {
        this.y = y_pos;
    }
}
