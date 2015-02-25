import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.geom.Ellipse2D;

public class Dot
{
    private int xval;
    private int yval;

    public Dot(int x, int y)
    {
        xval = x;
        yval = y;
         
    }
    
    public void draw(Graphics2D g2)
    {
        Point2D p1 = new Point2D.Double(xval,yval);
        Ellipse2D dot = new Ellipse2D.Double(xval,yval,1,11);
        g2.draw(dot);
    }

    

}
