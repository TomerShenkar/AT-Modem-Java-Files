import java.awt.EventQueue;

import javax.swing.*;

import com.fazecast.jSerialComm.SerialPort;

import java.util.concurrent.TimeUnit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class smsSender {

	private SerialPort[] strarr = SerialPort.getCommPorts();
	private JFrame frame;
	private int index = 0;
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					smsSender window = new smsSender();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public smsSender() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(236, 144, 198, 28);
		frame.getContentPane().add(textArea);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setToolTipText("Select COM");
		comboBox.setBounds(236, 43, 198, 35);
		for(int i = 0; i<strarr.length; i++) {
	    	comboBox.addItem(strarr[i].getDescriptivePortName());  
	      }
	      frame.getContentPane().add(comboBox);
	      
	      JButton btnNewButton = new JButton("Open Port");
	      btnNewButton.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent arg0) {
	      		index = comboBox.getSelectedIndex();
	      		strarr[index].openPort();
	      		textArea.setText("Opening port " + strarr[index].getDescriptivePortName());
	      		btnNewButton.setEnabled(false);
	      	}
	      });
	      btnNewButton.setBounds(269, 89, 141, 23);
	      frame.getContentPane().add(btnNewButton);
	      
		frame.getContentPane().add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(10, 43, 198, 129);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Send Text");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String SMS = "AT+CMGS=" + "\"0525246585\"" + "\r";
	      		byte[] bytearr = SMS.getBytes();	
	      		//index = 3;
	      		strarr[index].writeBytes(bytearr, bytearr.length);
	      		textArea.setText(SMS);
	      		
	      		try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
	      		
	      		String MSG = textField.getText();
	        	byte[] bytearr2 = MSG.getBytes();
	      		strarr[index].writeBytes(bytearr2, bytearr2.length);
	      		textArea.setText(MSG);
	      		
	      		byte[] bytearr3 = new byte[1];
	      		bytearr3[0] = 26;
	      		strarr[index].writeBytes(bytearr3, bytearr3.length);
	    		textArea.setText("Completed");
			}
		});
		btnNewButton_1.setBounds(10, 179, 100, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		
	}
}
