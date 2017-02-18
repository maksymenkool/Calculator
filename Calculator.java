import javax.swing.*;

import java.awt.GridLayout;
import java.awt.BorderLayout;

public class Calculator {
	
	// Declare all calculator's components.
	JPanel windowContent;
	private JTextField displayField;
	JButton but0;
	JButton but1;
	JButton but2;
	JButton but3;
	JButton but4;
	JButton but5;
	JButton but6;
	JButton but7;
	JButton but8;
	JButton but9;
	JButton butPoint;
	JButton butEq;
	JPanel p1, p2;
	JButton butPlus, butMinus, butMultiply, butDivide;
	
	public void setDisplayValue(String val){
        displayField.setText(val);
    }

    public String getDisplayValue() {
        return displayField.getText();
    }
	
	// Constructor  creates the components
    // and adds the to the frame using combination of 
    // Borderlayout and Gridlayout

	Calculator(){
		windowContent= new JPanel();

		// Set the layout manager for this panel
		BorderLayout bl = new BorderLayout(); 
	    windowContent.setLayout(bl);
		
		// Create the display field and place it in the   
	    // North area of the window
	    displayField = new JTextField(30);
		displayField.setHorizontalAlignment(JTextField.RIGHT);
		windowContent.add("North",displayField);
		
		// Create buttons using constructor of the  
	    // class JButton that takes the label of the 
	    // button as a parameter
		but0 = new JButton("0");
		but1 = new JButton("1");
		but2 = new JButton("2");
		but3 = new JButton("3");
		but4 = new JButton("4");
		but5 = new JButton("5");
		but6 = new JButton("6");
		but7 = new JButton("7");
		but8 = new JButton("8");
		but9 = new JButton("9");
		butPoint = new JButton(".");
		butEq = new JButton("=");
		
		// Create the panel with the GridLayout with 12 buttons 
	    //10 numeric ones, period, and the equal sign
		p1 = new JPanel();
		GridLayout g1 =new GridLayout(4,3); 
		p1.setLayout(g1);
		
		// Add window controls to the panel p1
		p1.add(but0);
		p1.add(but1);
		p1.add(but2);
		p1.add(but3);
		p1.add(but4);
		p1.add(but5);
		p1.add(but6);
		p1.add(but7);
		p1.add(but8);
		p1.add(but9);
		p1.add(butPoint);
		p1.add(butEq);
		
		CalcEngine calcEngine = new CalcEngine(this);
		but0.addActionListener(calcEngine);
		but1.addActionListener(calcEngine);
		but2.addActionListener(calcEngine);
		but3.addActionListener(calcEngine);
		but4.addActionListener(calcEngine);
		but5.addActionListener(calcEngine);
		but6.addActionListener(calcEngine);
		but7.addActionListener(calcEngine);
		but8.addActionListener(calcEngine);
		but9.addActionListener(calcEngine);
		butPoint.addActionListener(calcEngine);
		butEq.addActionListener(calcEngine);
		
		// Add the panel p1 to the center of the window	
		windowContent.add("Center", p1);
		
		p2 = new JPanel();
        GridLayout eastL =new GridLayout(4,1); 
		p2.setLayout(g1);
		  
		butPlus = new JButton("+");
		butMinus = new JButton("-");
		butMultiply = new JButton("*");
		butDivide = new JButton("/");
		
		p2.add(butPlus);
		p2.add(butMinus);
		p2.add(butMultiply);
		p2.add(butDivide);
		
		butPlus.addActionListener(calcEngine);
		butMinus.addActionListener(calcEngine);
		butMultiply.addActionListener(calcEngine);
		butDivide.addActionListener(calcEngine);
		
		windowContent.add("East", p2);
		
		//Create the frame and set its content pane	               
	      JFrame frame = new JFrame("Calculator");
		  frame.setContentPane(windowContent);

		 // Set the size of the window to be big enough to accommodate all controls 		
		  frame.pack(); 
		   
		  // enable the window's close button
		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

		  // Display the window
	      frame.setVisible(true);
	}

	public static void main(String[] args) {
		new Calculator();
	}
}
