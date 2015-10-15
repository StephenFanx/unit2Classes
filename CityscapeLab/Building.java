import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;

/**
 * Write a description of class Cityscape here.
 * 
 * @author Stephen Fan
 * @version 10/6/2015
 */
public class Building
{
    /** description of instance variable x (add comment for each instance variable) */
    private int width;
    private int height;
    private int x;
    private int y;

    /**
     * Default constructor for objects of class Cityscape
     */
    public Building(int width,int height,int x, int y)
    {
        // initialise instance variables
        this.height = height;
        this.width = width;
        this.x = x;
        this.y = y;
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
        Rectangle building = new Rectangle(x,y,width,height);
        
        g2.setColor(Color.BLACK);
        g2.draw(building);
        g2.fill(building);
    }

}
