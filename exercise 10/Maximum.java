// 3.Program to find maximum of three numbers using AWT.

import java.awt.*;
import java.awt.event.*;

 class Maximum extends Frame implements ActionListener {
	TextField num1,num2,num3;
	int NUMBER1,NUMBER2,NUMBER3,max;
    Button maximum;
    Label resultlabel;
	

	public Maximum() {

	
    setLayout(new FlowLayout());  // Use a flow layout

// create controls

    Label num1label = new Label("Enter first number : ",Label.RIGHT);
    Label num2label = new Label("Enter second number : ",Label.RIGHT);
    Label num3label = new Label("Enter third number : ",Label.RIGHT);
    resultlabel = new Label("",Label.RIGHT);

    num1 = new TextField(3);
    num2 = new TextField(3);
    num3 = new TextField(3);

    maximum = new Button("MAXIMUM");

// Adding controls

    add(num1label);
    add(num1);
    add(num2label);
    add(num2);
    add(num3label);
    add(num3);
    add(maximum);
    add(resultlabel);

    maximum.addActionListener(this);

	addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent we) {
			System.exit(0);
		}
	});
}

//Handle button action events

public void actionPerformed(ActionEvent ae) {
    String str = ae.getActionCommand();
    if(str.equals("MAXIMUM")) {
    
        NUMBER1=Integer.parseInt(num1.getText());
        NUMBER2=Integer.parseInt(num2.getText());
        NUMBER3=Integer.parseInt(num3.getText());

        if(NUMBER1 > NUMBER2 && NUMBER1 > NUMBER3){
              max = NUMBER1;
              resultlabel.setText("maximum is : "+max);
        }
        else if(NUMBER2 > NUMBER1 && NUMBER2 > NUMBER3){
              max = NUMBER2;
              resultlabel.setText("maximum is : "+max);
        }
        else{
              max = NUMBER3;
              resultlabel.setText("maximum is : "+max);
        }
    }
    
    }

public static void main(String[] args) {
	Maximum maxapp = new Maximum();

		maxapp.setSize(new Dimension(280, 280));
		maxapp.setTitle("Maximum");
		maxapp.setVisible(true);
	}
}
Verified
