/* 4.Find the percentage of marks obtained by a student in 5 subjects.Display a happy face if he secures above 50% or a 
sad face if otherwise*/

import java.awt.*;
import java.awt.event.*;
public class StudMark extends Frame implements ActionListener
{
  TextField m1,m2,m3,m4,m5;
  Double total,minmark,percentage;
  Button calculate;
  
  public StudMark()
  {
    
    setLayout(new FlowLayout());
    Label a = new Label("Enter mark of English out of 80: ", Label.RIGHT); 
    Label b = new Label("Enter mark of Maths out of 80: ", Label.RIGHT); 
    Label c = new Label("Enter mark of Science out of 80: ", Label.RIGHT); 
    Label d = new Label("Enter mark of Social out of 80: ", Label.RIGHT); 
    Label e = new Label("Enter mark of Computer out of 80: ", Label.RIGHT);  

    m1 = new TextField(8); 
    m2 = new TextField(8); 
    m3 = new TextField(8);
    m4 = new TextField(8);
    m5 = new TextField(8);
    calculate=new Button("CALCULATE");

  // Adding the controls to the frame    
    
    add(a);
    add(m1);
    add(b);
    add(m2);
    add(c);
    add(m3);
    add(d);
    add(m4);
    add(e);
    add(m5);
    add(calculate);


   // Add action event handlers.  
    calculate.addActionListener(this);

  addWindowListener(new WindowAdapter() {
  public void windowClosing(WindowEvent we) {
  System.exit(0);
  }
  });
 } 

public void actionPerformed(ActionEvent ae) 
{ 
  String str = ae.getActionCommand();
    if(str.equals("CALCULATE")) 
   {
     Double n1,n2,n3,n4,n5;
   n1=Double.parseDouble(m1.getText());
   n2=Double.parseDouble(m2.getText());
   n3=Double.parseDouble(m3.getText());
   n4=Double.parseDouble(m4.getText());
   n5=Double.parseDouble(m5.getText());

   total=n1+n2+n3+n4+n5;  
   minmark=(80*5)*(0.5);
   percentage=(total/(80*5))*100;
   repaint(); 
} 
}
 public void paint(Graphics g)
 { 
    if(total>minmark)
    {
       g.setColor(Color.GREEN);
       g.drawString("You are passed and percentage : "+percentage,300,300);
      //smile

       g.setColor(Color.GREEN);
       g.fillOval(80, 70, 150, 150);
      g.drawOval(80, 70, 150, 150);
  
        // Ovals for eyes
        // with black color filled
        g.setColor(Color.BLACK);
        g.fillOval(120, 120, 15, 15);
        g.fillOval(170, 120, 15, 15);
  
        // Arc for the smile
        g.drawArc(130, 180, 50, 20, 180, 180);
     }
 else if(total<=minmark)
  {  
       g.setColor(Color.RED);
       g.drawString("Sorry you are failed and your percentage : "+percentage,200,200);
     //sad smile
     // Oval for face outline

        g.setColor(Color.YELLOW);
        g.fillOval(260, 240, 200, 200);
        g.setColor(Color.BLACK);
        g.fillOval(380, 300, 15, 15);
        g.fillOval(320, 300, 15, 15);
  
        // Arc for the smile
        g.setColor(Color.BLACK);
        g.drawArc(300, 350, 120, 60, 0, 180);

   } 
 }

  public static void main(String[] args) {
  StudMark appwin = new StudMark();
  appwin.setSize(new Dimension(2000,2000));
  appwin.setTitle("Percentage");
  appwin.setVisible(true);

}
}
Verified
