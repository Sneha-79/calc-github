
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Calculator extends JFrame implements ActionListener
{
    JPanel panelTop;
    //JPanel paneLeft;
    JPanel panelRight;
    JPanel panelBottom;
 JTextField calcDisplay;
 JButton buttonOne;
 String expression = " ";
  
 public Calculator()
 {
super("My Prog5001 Calculator");
setPreferredSize(new Dimension(400,400));
setLayout(null);

 panelTop = new JPanel();
panelTop.setBackground(Color.green);
panelTop.setBounds(10,10,360,35);
add(panelTop);


panelBottom = new JPanel();
panelBottom.setBackground(Color.green); 
panelBottom.setBounds(10,50,360,200);
add(panelBottom);

calcDisplay = new JTextField();
calcDisplay.setPreferredSize(new Dimension(350,25));
panelTop.add(calcDisplay);
 buttonOne = new JButton("1");
buttonOne.setActionCommand("CMD_One");
buttonOne.addActionListener(this);
JButton buttonTwo = new JButton("2");
buttonTwo.setActionCommand("CMD_Two");
buttonTwo.addActionListener(this);
 JButton buttonThree = new JButton("3");
buttonThree.setActionCommand("CMD_Three");
buttonThree.addActionListener(this);
JButton buttonFour = new JButton("4");
buttonFour.setActionCommand("CMD_Four");
buttonFour.addActionListener(this);
JButton buttonFive = new JButton("5");
buttonFive.setActionCommand("CMD_Five");
buttonFive.addActionListener(this);
JButton buttonSix = new JButton("6");
buttonSix.setActionCommand("CMD_Six");
buttonSix.addActionListener(this);
JButton buttonSeven = new JButton("7");
buttonSeven.setActionCommand("CMD_Seven");
buttonSeven.addActionListener(this);
 JButton buttonEight = new JButton("8");
buttonEight.setActionCommand("CMD_Eight");
buttonEight.addActionListener(this);
 JButton buttonNine = new JButton("9");
buttonNine.setActionCommand("CMD_Nine");
buttonNine.addActionListener(this);
 JButton buttonZero = new JButton("0");
buttonZero.setActionCommand("CMD_Zero");
buttonZero.addActionListener(this);
JButton buttonDot = new JButton(".");
buttonDot.setActionCommand("CMD_Dot");
buttonDot.addActionListener(this);
JButton buttonSign = new JButton("+");
 buttonSign.setActionCommand("CMD_Sign");
buttonSign.addActionListener(this);
JButton buttonEqual = new JButton("=");
buttonEqual.setActionCommand("CMD_Equal");
buttonEqual.addActionListener(this);




panelBottom.add(buttonOne);
panelBottom.add(buttonTwo);
panelBottom.add(buttonThree);
panelBottom.add(buttonFour);
panelBottom.add(buttonFive);
panelBottom.add(buttonSix);
panelBottom.add(buttonSeven);
panelBottom.add(buttonEight);
panelBottom.add(buttonNine);
panelBottom.add(buttonZero);
panelBottom.add(buttonDot);
panelBottom.add(buttonSign);
panelBottom.add(buttonEqual);
pack();
//setFocusable(true);
//addKeyListener(this);
}
public void actionPerformed(ActionEvent e) {
    String cmd = e.getActionCommand();
    if (cmd.equals("CMD_One")) {
        expression = expression + "1";
    } else 
    if (cmd.equals("CMD_Two")) {
        expression = expression + "2";
    } else 
    if (cmd.equals("CMD_Three")) {
        expression = expression + "3";
    } else 
    if (cmd.equals("CMD_Four")) {
        expression = expression + "4";
    } else
    if (cmd.equals("CMD_Five")) {
        expression = expression + "5";
    } else 
    if (cmd.equals("CMD_Six")) {
        expression = expression + "6";
    } else
    if (cmd.equals("CMD_Seven")) {
        expression = expression + "7";
    } else 
    if (cmd.equals("CMD_Eight")) {
        expression = expression + "8";
    } else 
    if (cmd.equals("CMD_Nine")) {
        expression = expression + "9";
    } else 
    if (cmd.equals("CMD_Zero")) {
        expression = expression + "o";
    } else 
    if (cmd.equals("CMD_Dot")) {
        expression = expression + ".";
    } else 
    if (cmd.equals("CMD_Sign")) {
        expression = expression + "+";
    } else 
    if (cmd.equals("CMD_Equal")) {
        expression = expression + "=";
    } calcDisplay.setText(expression); 
        
    }

public static void main(String arg[])
{
    Calculator gui = new Calculator();
    gui. setVisible(true);
 
}
}

