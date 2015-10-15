import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Rectangle;
import java.awt.Color;

/**
 * Write a description of class Tree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tree
{
    /** description of instance variable x (add comment for each instance variable) */
    private int width1;
    private int height1;
    private int x1;
    private int y1;
    
    private int width2;
    private int height2;
    private int x2;
    private int y2;

    /**
     * Default constructor for objects of class Tree
     */
    public Tree(int x1, int y1)
    {
        // initialise instance variables
        this.height1 = 55;
        this.width1 = 15;
        this.x1 = x1;
        this.y1 = y1;
        
        this.width2 = 25;
        this.height2 = 20;
        this.x2 = x1 - 15;
        this.y2 = y1 + 40;
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
        Rectangle trunk = new Rectangle(x1,y1,width1,height1);
        Ellipse2D.Double leaves = new Ellipse2D.Double(x2,y2,width2,height2);
        
        g2.setColor(Color.BLACK);
        g2.draw(trunk);
        g2.fill(trunk);
        g2.draw(leaves);
        g2.fill(leaves);
    }

}
