// 7.Develop a program to handle all mouse events and window events

import java.awt.*;
import java.awt.event.*;
public class Events extends Frame implements MouseListener, MouseMotionListener
{
  String msg="";
  int mX=0,mY=0; //coordinates of mouse
  public Events()
  {
    addMouseListener(this);
    addMouseMotionListener(this);
    addWindowListener(new MyWindowAdapter());
  }

// Handle mouse clicked

public void mouseClicked(MouseEvent me)
{ 
 msg = msg + " -- click received"; 
 repaint(); 
 
}
// Handle mouse entered
 
public void mouseEntered(MouseEvent me)
{ 
  setBackground(Color.RED);
}
// Handle mouse exited

public void mouseExited(MouseEvent  me)
{
   mX = 100; 
   mY = 100; 
   msg = "Mouse exited."; 
   repaint(); 
}  
// Handle button pressed

public void mousePressed(MouseEvent me)
{
 mX = me.getX(); 
 mY = me.getY(); 
 msg = "Button down"; 
 repaint();
}  
// Handle button released
 
public void mouseReleased(MouseEvent me)
{ 
   mX = me.getX(); 
   mY = me.getY(); 
   msg = "Button Released"; 
  repaint(); 
  
}  
// Handle mouse dragged

public void mouseDragged(MouseEvent me)
{
   Graphics g=getGraphics(); 
    g.drawOval(80, 70, 150, 150);
    g.setColor(Color.BLACK);
    g.fillOval(120, 120, 15, 15);
    g.fillOval(170, 120, 15, 15);
    g.drawArc(130, 180, 50, 20, 180, 180); 
} 
// Handle mouse moved. 
public void mouseMoved(MouseEvent me)
{
  msg = "Moving mouse at " + me.getX() + ", " + me.getY(); 
  repaint();
} 
// Display msg in the window at current X,Y location. 
public void paint(Graphics g) { 
g.drawString(msg, mX, mY); 
}    

public static void main(String[] args)
{
 Events appwin = new Events();
 appwin.setSize(new Dimension(1000, 1000));
 appwin.setTitle("MouseEvent");
 appwin.setVisible(true);
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
} 
Verified.
