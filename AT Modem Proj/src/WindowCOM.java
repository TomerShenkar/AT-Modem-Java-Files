import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import com.fazecast.jSerialComm.*;
import javax.swing.JComboBox;
public class WindowCOM {

	private JFrame frame;
	private SerialPort[] strarr = SerialPort.getCommPorts();
	/**
	 * Launch the application.
	 */
	public static void NewWindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowCOM window = new WindowCOM();
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
	public WindowCOM() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JComboBox comboBox = new JComboBox();
		for(int i = 0; i<strarr.length; i++) {
			comboBox.addItem(strarr[i].getSystemPortName());
		}
		frame.getContentPane().add(comboBox, BorderLayout.CENTER);
	}

}
