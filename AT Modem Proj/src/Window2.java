import javax.swing.*;

import com.fazecast.jSerialComm.SerialPort;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings({"unused", "serial"})
public class Window2 extends JFrame{
	
 private static String s = "";
 private static JTextField textField;
 
 private static String Callnum = "";
 private JTextField COMReader;
 private SerialPort[] strarr = SerialPort.getCommPorts();
 private int index = 0;
 private static SerialPort PortChosen;
 
	private static enum State{
		Idle, TypingNumber, TypingMessage, Dialing, Ringing, DuringCall;
	}
	
	static State PhoneState = State.Idle;
	private static JTextArea textArea;
	
public Window2(){ 
		
	 JPanel p = new JPanel();
	 textArea = new JTextArea();
     textArea.setBounds(270, 30, 284, 67);
     p.add(textArea);
     
     ImageIcon image2 = new ImageIcon("C:/Users/tomer/Documents/Nokia2.jpg");
	  JButton button2 = new JButton("");
	  button2.setIcon(image2);
	  button2.addMouseListener(new MouseAdapter() {
	  	@Override
	  	public void mouseClicked(MouseEvent e) {
	  		CreatingNumber("2");
	  	}
	  });
      p.setLayout(null);
      button2.setBounds(110,300,60,50);
      p.add(button2);
	 
      ImageIcon image5 = new ImageIcon("C:/Users/tomer/Documents/Nokia5.jpg");
      JButton button5 = new JButton("");
      button5.setIcon(image5);
      button5.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      		CreatingNumber("5");
      	}
      });
      p.setLayout(null);
      button5.setBounds(110,350,60,50);
      p.add(button5);
      
      ImageIcon image8 = new ImageIcon("C:/Users/tomer/Documents/Nokia8.jpg");
      JButton button8 = new JButton("");
      button8.setIcon(image8);
      button8.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      		CreatingNumber("8");
      	}
      });
      p.setLayout(null);
      button8.setBounds(110,400,60,50);
      p.add(button8);
      
      ImageIcon image0 = new ImageIcon("C:/Users/tomer/Documents/Nokia0.jpg");
      JButton button0 = new JButton("");
      button0.setIcon(image0);
      button0.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      		CreatingNumber("0");
      	}
      });
      p.setLayout(null);
      button0.setBounds(110,450,60,50);
      p.add(button0);
      
      ImageIcon image1 = new ImageIcon("C:/Users/tomer/Documents/Nokia1.png");
      JButton button1 = new JButton("");
      button1.setIcon(image1);
      button1.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent arg0) {
      		CreatingNumber("1");
      	}
      });
      p.setLayout(null);
      button1.setBounds(50,300,60,50);
      p.add(button1);
      
      ImageIcon image4 = new ImageIcon("C:/Users/tomer/Documents/Nokia4.jpg");
      JButton button4 = new JButton("");
      button4.setIcon(image4);
      button4.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      		CreatingNumber("4");
      	}
      });
      p.setLayout(null);
      button4.setBounds(50,350,60,50);
      p.add(button4);
      
      ImageIcon image7 = new ImageIcon("C:/Users/tomer/Documents/Nokia7.jpg");
      JButton button7 = new JButton("");
      button7.setIcon(image7);
      button7.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      		CreatingNumber("7");
      	}
      });
      p.setLayout(null);
      button7.setBounds(50,400,60,50);
      p.add(button7);
      
      ImageIcon image3 = new ImageIcon("C:/Users/tomer/Documents/Nokia3.jpg");
      JButton button3 = new JButton("");
      button3.setIcon(image3);
      button3.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      		CreatingNumber("3");
      	}
      });
      p.setLayout(null);
      button3.setBounds(170,300,60,50);
      p.add(button3);
      
      ImageIcon image6 = new ImageIcon("C:/Users/tomer/Documents/Nokia6.jpg");
      JButton button6 = new JButton("");
      button6.setIcon(image6);
      button6.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      		CreatingNumber("6");
      	}
      });
      p.setLayout(null);
      button6.setBounds(170,350,60,50);
      p.add(button6);
      
      ImageIcon image9 = new ImageIcon("C:/Users/tomer/Documents/Nokia9.jpg");
      JButton button9 = new JButton("");
      button9.setIcon(image9);
      button9.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      		CreatingNumber("9");
      	}
      });
      p.setLayout(null);
      button9.setBounds(170,400,60,50);
      p.add(button9);
      
      getContentPane().add(p);
      
      //PORT 
      JComboBox<String> comboBox = new JComboBox<String>();
      comboBox.setBounds(270, 108, 284, 35);
      for(int i = 0; i<strarr.length; i++) {
    	comboBox.addItem(strarr[i].getDescriptivePortName());  
      }
      p.add(comboBox);
      
      JButton btnNewButton = new JButton("Open Port");
      btnNewButton.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent arg0) {
      		index = comboBox.getSelectedIndex();
      		PortChosen = strarr[index];
      		PortChosen.openPort();
      		textArea.setText("Opening port " + PortChosen.getDescriptivePortName());
      		btnNewButton.setEnabled(false);
      	}
      });
      btnNewButton.setBounds(270, 154, 141, 23);
      p.add(btnNewButton);
      
      //CALL CALL
      ImageIcon imageCall = new ImageIcon("C:/Users/tomer/Documents/NokiaAnswer.jpg");
      JButton Answer = new JButton("");
      Answer.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent arg0) {
      	}
      });
      Answer.setIcon(imageCall);
      Answer.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      		switch(PhoneState) {
      			case TypingNumber :
      				Callnum = s;
      	      		//s = "";
      	      		State Dialing;
      	      		String call = "ATD" + s + ";" + "\r";
      	      		byte[] bytearr = call.getBytes();	
      	      		//index = 3;
      	      		PortChosen.writeBytes(bytearr, bytearr.length);
      	      		textArea.setText("Calling " + s);
      				break;
      			
      			case Ringing :
      				//Answer
      				break;
      				
      			default :
      				break;
      		  }
      		}
      	}
      );
      p.setLayout(null);
      Answer.setBounds(20, 240, 60, 30);
      p.add(Answer);
      
      //END CALL 
      ImageIcon imageEnd = new ImageIcon("C:/Users/tomer/Documents/NokiaEnd.jpg");
      JButton HangUp = new JButton("");
      HangUp.setIcon(imageEnd);
      HangUp.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent arg0) {
      		String end = "ATH\r";
      		byte[] bytearrend = end.getBytes(); 
      		strarr[index].writeBytes(bytearrend, bytearrend.length);
      		State Idle;
      	}
      });
      HangUp.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      		s = "";
      		textField.setText(s);
      		PhoneState = State.Idle;
      		textArea.setText(PhoneState.toString());
      	}
      });
      p.setLayout(null);
      HangUp.setBounds(200, 240, 60, 30);
      p.add(HangUp);
      
      ImageIcon imageLeft = new ImageIcon("C:/Users/tomer/Documents/NokiaMenuLeft.jpg");
      JButton MenuLeft = new JButton("");
      MenuLeft.setIcon(imageLeft);
      p.setLayout(null);
      MenuLeft.setBounds(20, 205, 60, 30);
      p.add(MenuLeft);
      
      ImageIcon imageRight = new ImageIcon("C:/Users/tomer/Documents/NokiaMenuRight.jpg");
      JButton MenuRight = new JButton("");
      MenuRight.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      	}
      });
      MenuRight.setIcon(imageRight);
      MenuRight.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      		if (s != null && s.length() > 0) {
      	        s = s.substring(0, s.length() - 1);
      	        textField.setText(s);
      	        if(s.length() == 0) {
      	        	PhoneState = State.Idle;
      	        }
      	    }
      	}
      });
      p.setLayout(null);
      MenuRight.setBounds(200, 205, 60, 30);
      p.add(MenuRight);
      
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
      
      ImageIcon imageHash = new ImageIcon("C:/Users/tomer/Documents/Nokia#.jpg");
      JButton buttonHash = new JButton("");
      buttonHash.setIcon(imageHash);
      buttonHash.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		CreatingNumber("#");
      	}
      });
      buttonHash.setBounds(170, 450, 60, 50);
      p.add(buttonHash);
      
      ImageIcon imageStar = new ImageIcon("C:/Users/tomer/Documents/NokiaStar.png");
      JButton buttonStar = new JButton("");
      buttonStar.setIcon(imageStar);
      buttonStar.addActionListener(new ActionListener() {
      		public void actionPerformed(ActionEvent e) {
      			CreatingNumber("*");
          	}
      	}
      );
      
      buttonStar.setBounds(50, 450, 60, 50);
      p.add(buttonStar);
      
      JButton btnSms = new JButton("SMS");
      btnSms.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent arg0) {
      		smsSender.NewScreen();
      	}
      });
      btnSms.setBounds(270, 188, 152, 35);
      p.add(btnSms);
      
      //setLayout(null);
      setDefaultCloseOperation(3);
      setSize(580,600);
      setVisible(true);

     }
	
public static void CreatingNumber(String n) {
	 s = s + n;
	 textField.setText(s);
	 PhoneState = State.TypingNumber;
	 textArea.setText(PhoneState.toString());
}

public static String getCallnum() {
	  return s;
}

public static SerialPort getSP() {
	return PortChosen;
}
	public static void main(String...args){
       new Window2();
       }
}