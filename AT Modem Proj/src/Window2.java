import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class Window2 extends JFrame{

 private JButton button;
 private String s = "";
 private JTextField textField;
 private JTextField textField_1;
 /**
 * 
 */
public Window2(){
      
	 
	 JPanel p = new JPanel();
	 
	  JButton button2 = new JButton("2");
	  button2.addMouseListener(new MouseAdapter() {
	  	@Override
	  	public void mouseClicked(MouseEvent e) {
	  		s = s + "2";
      		textField.setText(s);
	  	}
	  });
      p.setLayout(null);
      button2.setBounds(110,300,60,50);
      p.add(button2);
	 
      JButton button5 = new JButton("5");
      button5.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      		s = s + "5";
      		textField.setText(s);
      	}
      });
      p.setLayout(null);
      button5.setBounds(110,350,60,50);
      p.add(button5);
      
      JButton button8 = new JButton("8");
      button8.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      		s = s + "8";
      		textField.setText(s);
      	}
      });
      p.setLayout(null);
      button8.setBounds(110,400,60,50);
      p.add(button8);
      
      JButton button0 = new JButton("0");
      button0.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      		s = s + "0";
      		textField.setText(s);
      	}
      });
      p.setLayout(null);
      button0.setBounds(110,450,60,50);
      p.add(button0);
      
      JButton button1 = new JButton("1");
      button1.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent arg0) {
      		s = s + "1";
      		textField.setText(s);
      	}
      });
      p.setLayout(null);
      button1.setBounds(50,300,60,50);
      p.add(button1);
      
      JButton button4 = new JButton("4");
      button4.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      		s = s + "4";
      		textField.setText(s);
      	}
      });
      p.setLayout(null);
      button4.setBounds(50,350,60,50);
      p.add(button4);
      
      JButton button7 = new JButton("7");
      button7.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      		s = s + "7";
      		textField.setText(s);
      	}
      });
      p.setLayout(null);
      button7.setBounds(50,400,60,50);
      p.add(button7);
      
      JButton button3 = new JButton("3");
      button3.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      		s = s + "3";
      		textField.setText(s);
      	}
      });
      p.setLayout(null);
      button3.setBounds(170,300,60,50);
      p.add(button3);
      
      JButton button6 = new JButton("6");
      button6.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      		s = s + "6";
      		textField.setText(s);
      	}
      });
      p.setLayout(null);
      button6.setBounds(170,350,60,50);
      p.add(button6);
      
      JButton button9 = new JButton("9");
      button9.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      		s = s + "9";
      		textField.setText(s);
      	}
      });
      p.setLayout(null);
      button9.setBounds(170,400,60,50);
      p.add(button9);
      
      getContentPane().add(p);
      
      
      JButton Answer = new JButton("Call");
      p.setLayout(null);
      Answer.setBounds(20, 240, 60, 30);
      p.add(Answer);
      
      JButton HangUp = new JButton("End");
      p.setLayout(null);
      HangUp.setBounds(200, 240, 60, 30);
      p.add(HangUp);
      
      JButton Menu1 = new JButton("mnu");
      p.setLayout(null);
      Menu1.setBounds(20, 205, 60, 30);
      p.add(Menu1);
      
      JButton Menu2= new JButton("Clr");
      Menu2.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      		if (s != null && s.length() > 0) {
      	        s = s.substring(0, s.length() - 1);
      	        textField.setText(s);
      	    }
      	}
      });
      p.setLayout(null);
      Menu2.setBounds(200, 205, 60, 30);
      p.add(Menu2);
      
      textField = new JTextField();
      textField.setBounds(20, 30, 240, 164);
      p.add(textField);
      textField.setColumns(10);
      
      JButton buttonUP = new JButton("↑");
      buttonUP.setBounds(113, 205, 50, 30);
      p.add(buttonUP);
      
      JButton buttonDOWN = new JButton("↓");
      buttonDOWN.setBounds(113, 265, 50, 30);
      p.add(buttonDOWN);
      
      JButton buttonLEFT = new JButton("←");
      buttonLEFT.setBounds(90, 235, 50, 30);
      p.add(buttonLEFT);
      
      JButton buttonRIGHT = new JButton("→");
      buttonRIGHT.setBounds(136, 235, 50, 30);
      p.add(buttonRIGHT);
      
      textField_1 = new JTextField();
      textField_1.setBounds(20, 500, 240, 50);
      p.add(textField_1);
      textField_1.setColumns(10);
      
      //setLayout(null);
      setDefaultCloseOperation(3);
      setSize(300,600);
      setVisible(true);

     }
   public static void main(String...args){
       new Window2();
       }
}