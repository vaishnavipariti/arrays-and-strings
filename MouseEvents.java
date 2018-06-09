/*<applet code="MouseEvents" width=300 height=100>
 
 */
package mouseevents;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/**
 *
 * @author hp
 */
public class MouseEvents extends Applet implements MouseListener,MouseMotionListener
{
    String msg="";
    int mouseX=0,mouseY=0;// intiate coordinates of mouse
    public void init()
    {
        addMouseListener(this);
        addMouseMotionListener(this);
        
    }
    //handle mouse clicked
    public void mouseEntered(MouseEvent me)
    {
        //save coordinates
        mouseX=0;
        mouseY=10;
        msg="mouse entered";
        repaint();
        
    }
    // handle mouse clicked
    public void mouseClicked(MouseEvent me)
    {
        //save coordinates
        mouseX=0;
        mouseY=10;
        msg="mouse clicked";
        repaint();}
    //handle mouse exited
    public void mouseExited(MouseEvent me)
    {
        //save coordinates
        mouseX=0;
        mouseY=10;
        msg="mouse exited";
        repaint();}
    //handle button pressed
    public void mousePressed(MouseEvent me)
    {
        //save coordinates
        mouseX=me.getX();
        mouseY=me.getY();
        msg="DOWN";
        repaint();}
    //handle button released
    public void mouseReleased(MouseEvent me)
    {
        //save coordinates
        mouseX=me.getX();
        mouseY=me.getY();
        msg="up";
        repaint();}
    // handle mouse dragged
    public void mouseDragged(MouseEvent me)
    {
        //save coordinates
        mouseX=me.getX();
        mouseY=me.getY();
        msg="*";
        showStatus("Dragging mouse at"+mouseX+","+mouseY);
        repaint();}
    //handle mouse moved
    public void mouseMoved(MouseEvent me)
    {
        //show status
        showStatus("moving mouse at"+me.getX()+","+me.getY());
        repaint();
    }
    public void paint(Graphics g){
        g.drawString(msg, mouseX, mouseY);
    }
    
        
    
        
        
    

}
