// 1.Program to draw Circle,Rectangle,Line

import java.awt.*;
import java.awt.event.*;
public class Draw extends Frame 
{
  public Draw() 
  {
	addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
             });
   }

  public void paint(Graphics g)
  {
     
    //drawing circle

    g.setColor(Color.green);
    g.drawOval(150,150,100,100);
   
    //drawing rectangle

    g.setColor(Color.red);
    g.drawRect(50,150,70,60);

    //drawing line

    g.setColor(Color.blue);
    g.drawLine(30,50,120,120);  
    
  }


public static void main(String[] args)
{
  Draw appwin =new Draw();

  appwin.setSize(new Dimension(340, 260));
  appwin.setTitle("Shapes");
  appwin.setVisible(true);
}
}