/* 6.Using 2D graphics commands in an Applet, construct a house.On mouse click event, change the color of the door from 
blue to red*/


import java.awt.*;
import java.awt.event.*;

public class House extends Frame implements MouseListener, MouseMotionListener  
{
  Color color= new Color(0,0,255); //set as blue

public House() 
{
  addMouseListener(this);
  addMouseMotionListener(this);
  addWindowListener(new MyWindowAdapter());
}
// Handle mouse clicked

  public void mouseClicked(MouseEvent me) 
  {  
       color = new Color(255,0,0); //set as red
	repaint();  
   } 
 
    public void mouseEntered(MouseEvent me) {}  
    public void mouseExited(MouseEvent me) {}  
    public void mousePressed(MouseEvent me) {}  
    public void mouseReleased(MouseEvent me) {}
    public void mouseDragged(MouseEvent me) {}
    public void mouseMoved(MouseEvent me) {}

public void paint(Graphics g)
{

   g.setColor(Color.lightGray);
   g.fillRect(240, 200, 250, 250); 
   g.setColor(color);
   g.fillRect(330, 300, 70, 150);
   g.setColor(Color.lightGray);
   int x[]={350,190,540};
   int y[]={80,200,200};
   g.fillPolygon(x, y, 3); 

}
public static void main(String[] args) 
{
   House appwin = new House();
   appwin.setSize(new Dimension(700,700));
   appwin.setTitle("HOME");
   appwin.setVisible(true);
}
}

// When the close box in the frame is clicked,
// close the window and exit the program

class MyWindowAdapter extends WindowAdapter
{
public void windowClosing(WindowEvent we)
{
System.exit(0);
} 
}
Verified
