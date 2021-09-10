/* 2.Develop a program that has a Choice component which contains the names of shapes such as rectangle, triangle, square 
and circle. Draw the corresponding shapes for given parameters as per user’s choice*/

import java.awt.*;
import java.awt.event.*;
public class ChoiceDemo extends Frame implements ItemListener
{
 Choice s; 
 String msg;
 int select;

public ChoiceDemo() { 
setLayout(new FlowLayout());   // use a flow layout


s = new Choice(); 

s.add("Select the shape");
s.add("Square"); 
s.add("Rectangle"); 
s.add("Circle");
s.add("Triangle");

add(s);  // adding choice list to window

s.addItemListener(this); // adding item listener 

addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent we) {
System.exit(0);
}
});
} 
public void itemStateChanged(ItemEvent ie)
{
    select= s.getSelectedIndex();
    repaint(); 
}

 public void paint(Graphics g)
 {

    if (select==1)
    {       
      msg="Selected shape is: ";
      g.setColor(Color.red);
      g.drawString(msg, 50, 120);
      g.drawRect(150,150,300,300);
    }
    if (select==2)
    {   
      msg="Selected shape is: ";
      g.setColor(Color.red);
      g.drawString(msg, 50, 50);
      g.drawRect(50, 100, 300, 100);
     }
     if (select== 3)
     {
       msg="Selected shape is: ";
       g.setColor(Color.blue);
       g.drawString(msg, 50, 120);
       g.drawOval(50, 300, 100, 100);
      }
      if (select== 4)
      {
         msg="Selected shape is: ";
         g.setColor(Color.blue);
         g.drawString(msg,50,50);
         g.drawLine(120, 130, 280, 130);
         g.drawLine(120, 130, 200, 65);
         g.drawLine(200, 65, 280, 130);
                  
      }
}

public static void main(String[] args)
{
  ChoiceDemo appwin = new ChoiceDemo();
  appwin.setSize(new Dimension(1000,1000));
  appwin.setTitle("ChoiceDemo");
  appwin.setVisible(true);
} 
}