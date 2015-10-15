import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;


/**
 * Write a description of class Target here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AlexTarget
{
    /** description of instance variable x (add comment for each instance variable) */
    private int radius1;
    private int radius2;
    private int radius3;
    private int radius4;
    private int radius5;
    private int x1;
    private int x2;
    private int x3;
    private int x4;
    private int x5;
    

    /**
     * Default constructor for objects of class Target
     */
    public AlexTarget(int radius1, int x1)
    {
        // initialise instance variables
        this.radius1= radius1;
        this.radius2 = ((radius1)/5)*4;
        this.radius3 = ((radius2)/4)*3;
        this.radius4 = ((radius3)/3)*2;
        this.radius5 = (radius4)/2;
        this.x1=x1;
        this.x2 =x1+(radius1-radius2)/2;
        this.x3 =x1+(radius1-radius3)/2;
        this.x4 =x1+(radius1-radius4)/2;
        this.x5 =x1+(radius1-radius5)/2;
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
        Ellipse2D.Double outerCircle = new Ellipse2D.Double(x1,x1,radius1,radius1);
        Ellipse2D.Double innerCircle4 = new Ellipse2D.Double(x2,x2,radius2,radius2);
        Ellipse2D.Double innerCircle3 = new Ellipse2D.Double(x3,x3,radius3,radius3);
        Ellipse2D.Double innerCircle2 = new Ellipse2D.Double(x4,x4,radius4,radius4);
        Ellipse2D.Double innerCircle1 = new Ellipse2D.Double(x5,x5,radius5,radius5);
        
        g2.setColor(Color.BLACK);
        g2.draw(outerCircle);
        g2.fill(outerCircle);
        g2.setColor(Color.WHITE);
        g2.draw(innerCircle4);
        g2.fill(innerCircle4);
        g2.setColor(Color.BLACK);
        g2.draw(innerCircle3);
        g2.fill(innerCircle3);
        g2.setColor(Color.WHITE);
        g2.draw(innerCircle2);
        g2.fill(innerCircle2);
        g2.setColor(Color.BLACK);
        g2.draw(innerCircle1);
        g2.fill(innerCircle1);
    }

}

