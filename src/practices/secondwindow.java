package practices;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class secondwindow {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void secondwindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					secondwindow window = new secondwindow();
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
	public secondwindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		
		frame.getContentPane().setBackground(new Color(240, 128, 128));
		frame.setBounds(0, 0, 465, 461);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(67, 87, 307, 202);
		textField.setFont(new Font("Tahoma", Font.BOLD, 14));
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("THANKS FOR THE FEEDBACK");
		//Image img=new ImageIcon(getClass().getResource("/edback2.jpg")).getImage();
		//lblNewLabel_1.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(119, 300, 224, 38);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setBounds(174, 349, 89, 23);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					homewindow window = new homewindow();
					window.frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		frame.getContentPane().add(btnNewButton);
		
	}

}
