import javax.swing.*;
import java.awt.*;
public class Window2 extends JFrame{

 private JButton button;
 private JTextField textField;
 public Window2(){
      
	 JPanel p = new JPanel();
	 
	  JButton button2 = new JButton("2");
      p.setLayout(null);
      button2.setBounds(110,200,60,50);
      p.add(button2);
	 
      JButton button5 = new JButton("5");
      p.setLayout(null);
      button5.setBounds(110,250,60,50);
      p.add(button5);
      
      JButton button8 = new JButton("8");
      p.setLayout(null);
      button8.setBounds(110,300,60,50);
      p.add(button8);
      
      JButton button0 = new JButton("0");
      p.setLayout(null);
      button0.setBounds(110,350,60,50);
      p.add(button0);
      
      JButton button1 = new JButton("1");
      p.setLayout(null);
      button1.setBounds(50,200,60,50);
      p.add(button1);
      
      JButton button4 = new JButton("4");
      p.setLayout(null);
      button4.setBounds(50,250,60,50);
      p.add(button4);
      
      JButton button7 = new JButton("7");
      p.setLayout(null);
      button7.setBounds(50,300,60,50);
      p.add(button7);
      
      JButton button3 = new JButton("3");
      p.setLayout(null);
      button3.setBounds(170,200,60,50);
      p.add(button3);
      
      JButton button6 = new JButton("6");
      p.setLayout(null);
      button6.setBounds(170,250,60,50);
      p.add(button6);
      
      JButton button9 = new JButton("9");
      p.setLayout(null);
      button9.setBounds(170,300,60,50);
      p.add(button9);
      
      getContentPane().add(p);
      
      
      textField = new JTextField();
      textField.setBounds(50, 33, 180, 156);
      p.add(textField);
      textField.setColumns(10);
      //setLayout(null);
      setDefaultCloseOperation(3);
      setSize(300,600);
      setVisible(true);

     }
   public static void main(String...args){
       new Window2();
       }
}
