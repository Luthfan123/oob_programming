// 8.Develop a program to handle Key events

import java.awt.*;
import java.awt.event.*;
public class Key extends Frame implements KeyListener 
{
 String msg = "";
 String keyState = "";
public Key() 
{
  addKeyListener(this);
  addWindowListener(new MyWindowAdapter());
}

// Handle a key press

public void keyPressed(KeyEvent ke)
{ 
   
   keyState = "KEY DOWN";
   setBackground(Color.red);
   repaint();
}
// Handle a key release

public void keyReleased(KeyEvent ke)
{
  keyState = "KEY UP";
   setBackground(Color.blue);
  repaint();
}
// Handle key typed

public void keyTyped(KeyEvent ke) 
{
  keyState="KEY TYPED";
   setBackground(Color.red);
  msg += ke.getKeyChar();
  repaint();
}
// Display keystrokes

public void paint(Graphics g) 
{
  g.drawString(msg, 20, 100);
  g.drawString(keyState, 20, 50);
} 
public static void main(String[] args) 
{
   Key appwin = new Key();
   appwin.setSize(new Dimension(500,500));
   appwin.setTitle("Key");
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
