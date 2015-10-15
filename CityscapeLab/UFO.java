import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.awt.Graphics2D;

/**
 * Write a description of class UFO here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UFO
{
    /** description of instance variable x (add comment for each instance variable) */
    private int cradius;
    private int ewidth;
    private int eheight;
    
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    /**
     * Default constructor for objects of class UFO
     */
    public UFO(int x1,int y1)
    {
        // initialise instance variables
        this.x1 = x1;
        this.y1 = y1;
        this.cradius = 20;
        
        this.x2 = x1 - 10;
        this.y2 = y2 - 10;
        this.eheight = 10;
        this.ewidth = 40;
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void draw(Graphics2D g2)
    {
        // put your code here
        Ellipse2D.Double window = new Ellipse2D.Double(x1,y1,cradius,cradius);
        Ellipse2D.Double body = new Ellipse2D.Double(x2,y2,ewidth,eheight);
    }

}
