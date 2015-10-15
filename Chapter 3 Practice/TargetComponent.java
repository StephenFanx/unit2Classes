import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Creates a target
 * 
 * @author Alex Komar 
 * @version 9/22/15
 */
public class TargetComponent extends JComponent
{
    /**
     * Draws a target
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        
        int radius1 = 100;
        Target target1 = new Target(radius1,0);
        target1.draw(g2);
    }

}
