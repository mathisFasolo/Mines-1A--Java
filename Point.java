package TD1;

public class Point
{
    /* ATTRIBUTS */
    private int x;
    private int y;

    /* CONSTRUCTEURS */
    public Point (int x_pos, int y_pos)
    {
        this.x = x_pos;
        this.y = y_pos;
    }

    /* GETTERS */
    public int getX ()
    {
        return this.x;
    }

    public int getY ()
    {
        return this.y;
    }

    /* SETTERS */
    public void setX (int x_pos)
    {
        this.x = x_pos;
    }

    public void setY (int y_pos)
    {
        this.y = y_pos;
    }
}
