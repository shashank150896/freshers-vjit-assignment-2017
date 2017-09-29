package practices;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.*;
public class homewindow {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					homewindow window = new homewindow();
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
	public homewindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 218, 185));
		frame.setBounds(0, 0, 600, 517);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 88, 564, 363);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 6));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnTable = new JButton("TABLE1");
		btnTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=0;
				//JOptionPane.showMessageDialog(null, "TABLE IS FILLED AND ARE  READY FOR RECEIPT ", "WARNING", JOptionPane.PLAIN_MESSAGE);
				//JOptionPane.showMessageDialog(null, "TABLE IS FILLED CLICK OK TO SEE STATUS", "WARNING", JOptionPane.PLAIN_MESSAGE);
				firstwindow dvs=new firstwindow();				
				if(i==1)
				{
									JOptionPane.showMessageDialog(null, "TABLE IS FILLED CLICK OK TO SEE STATUS", "WARNING", JOptionPane.PLAIN_MESSAGE);
									dvs.testing();
				}
				
				i=i+1;
				if(i==2)
				{
									JOptionPane.showMessageDialog(null, "TABLE IS FILLED AND ARE  READY FOR RECEIPT ", "WARNING", JOptionPane.PLAIN_MESSAGE);
									dvs.testing();
				}
				if(i==3)
				{
					i=0;
				}
				firstwindow f=new firstwindow();	
				f.first();
		
				
			}
		});
		btnTable.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnTable.setBounds(27, 28, 110, 32);
		panel.add(btnTable);
		
		JButton btnTable_1 = new JButton("TABLE2");
		btnTable_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=0;
				firstwindow dvs=new firstwindow();				
				if(i==1)
				{
									JOptionPane.showMessageDialog(null, "TABLE IS FILLED CLICK OK TO SEE STATUS", "WARNING", JOptionPane.PLAIN_MESSAGE);
									dvs.testing();
				}
				
				i=i+1;
				if(i==2)
				{
									JOptionPane.showMessageDialog(null, "TABLE IS FILLED AND ARE  READY FOR RECEIPT ", "WARNING", JOptionPane.PLAIN_MESSAGE);
									dvs.testing();
				}
				if(i==3)
				{
					i=0;
				}
				firstwindow f=new firstwindow();
				f.first();

			}
		});
		btnTable_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnTable_1.setBounds(230, 28, 110, 32);
		panel.add(btnTable_1);
		
		JButton btnTable_2 = new JButton("TABLE3");
		btnTable_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=0;
				firstwindow dvs=new firstwindow();				
				if(i==1)
				{
									JOptionPane.showMessageDialog(null, "TABLE IS FILLED CLICK OK TO SEE STATUS", "WARNING", JOptionPane.PLAIN_MESSAGE);
									dvs.testing();
				}
				
				i=i+1;
				if(i==2)
				{
									JOptionPane.showMessageDialog(null, "TABLE IS FILLED AND ARE  READY FOR RECEIPT ", "WARNING", JOptionPane.PLAIN_MESSAGE);
									dvs.testing();
				}
				if(i==3)
				{
					i=0;
				}
				firstwindow f=new firstwindow();
				f.first();

			}
		});
		btnTable_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnTable_2.setBounds(433, 28, 110, 32);
		panel.add(btnTable_2);
		
		JButton btnTable_3 = new JButton("TABLE4");
		btnTable_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=0;
				firstwindow dvs=new firstwindow();				
				if(i==1)
				{
									JOptionPane.showMessageDialog(null, "TABLE IS FILLED CLICK OK TO SEE STATUS", "WARNING", JOptionPane.PLAIN_MESSAGE);
									dvs.testing();
				}
				
				i=i+1;
				if(i==2)
				{
									JOptionPane.showMessageDialog(null, "TABLE IS FILLED AND ARE  READY FOR RECEIPT ", "WARNING", JOptionPane.PLAIN_MESSAGE);
									dvs.testing();
				}
				if(i==3)
				{
					i=0;
				}
				firstwindow f=new firstwindow();
				f.first();

			}
		});
		btnTable_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnTable_3.setBounds(27, 92, 110, 32);
		panel.add(btnTable_3);
		
		JButton btnTable_6 = new JButton("TABLE7");
		btnTable_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=0;
				firstwindow dvs=new firstwindow();				
				if(i==1)
				{
									JOptionPane.showMessageDialog(null, "TABLE IS FILLED CLICK OK TO SEE STATUS", "WARNING", JOptionPane.PLAIN_MESSAGE);
									dvs.testing();
				}
				
				i=i+1;
				if(i==2)
				{
									JOptionPane.showMessageDialog(null, "TABLE IS FILLED AND ARE  READY FOR RECEIPT ", "WARNING", JOptionPane.PLAIN_MESSAGE);
									dvs.testing();
				}
				if(i==3)
				{
					i=0;
				}
				firstwindow f=new firstwindow();
				f.first();

			}
		});
		btnTable_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnTable_6.setBounds(27, 156, 110, 32);
		panel.add(btnTable_6);
		
		JButton btnTable_9 = new JButton("TABLE10");
		btnTable_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=0;
				firstwindow dvs=new firstwindow();				
				if(i==1)
				{
									JOptionPane.showMessageDialog(null, "TABLE IS FILLED CLICK OK TO SEE STATUS", "WARNING", JOptionPane.PLAIN_MESSAGE);
									dvs.testing();
				}
				
				i=i+1;
				if(i==2)
				{
									JOptionPane.showMessageDialog(null, "TABLE IS FILLED AND ARE  READY FOR RECEIPT ", "WARNING", JOptionPane.PLAIN_MESSAGE);
									dvs.testing();
				}
				if(i==3)
				{
					i=0;
				}
				firstwindow f=new firstwindow();
				f.first();

			}
		});
		btnTable_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnTable_9.setBounds(27, 224, 110, 32);
		panel.add(btnTable_9);
		
		JButton btnTable_12 = new JButton("TABLE13");
		btnTable_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=0;
				firstwindow dvs=new firstwindow();				
				if(i==1)
				{
									JOptionPane.showMessageDialog(null, "TABLE IS FILLED CLICK OK TO SEE STATUS", "WARNING", JOptionPane.PLAIN_MESSAGE);
									dvs.testing();
				}
				
				i=i+1;
				if(i==2)
				{
									JOptionPane.showMessageDialog(null, "TABLE IS FILLED AND ARE  READY FOR RECEIPT ", "WARNING", JOptionPane.PLAIN_MESSAGE);
									dvs.testing();
				}
				if(i==3)
				{
					i=0;
				}
				firstwindow f=new firstwindow();
				f.first();

			}
		});
		btnTable_12.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnTable_12.setBounds(27, 285, 110, 32);
		panel.add(btnTable_12);
		
		JButton btnTable_4 = new JButton("TABLE5");
		btnTable_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=0;
				firstwindow dvs=new firstwindow();				
				if(i==1)
				{
									JOptionPane.showMessageDialog(null, "TABLE IS FILLED CLICK OK TO SEE STATUS", "WARNING", JOptionPane.PLAIN_MESSAGE);
									dvs.testing();
				}
				
				i=i+1;
				if(i==2)
				{
									JOptionPane.showMessageDialog(null, "TABLE IS FILLED AND ARE  READY FOR RECEIPT ", "WARNING", JOptionPane.PLAIN_MESSAGE);
									dvs.testing();
				}
				if(i==3)
				{
					i=0;
				}
				firstwindow f=new firstwindow();
				f.first();

			}
		});
		btnTable_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnTable_4.setBounds(230, 92, 110, 32);
		panel.add(btnTable_4);
		
		JButton btnTable_7 = new JButton("TABLE8");
		btnTable_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=0;
				firstwindow dvs=new firstwindow();				
				if(i==1)
				{
									JOptionPane.showMessageDialog(null, "TABLE IS FILLED CLICK OK TO SEE STATUS", "WARNING", JOptionPane.PLAIN_MESSAGE);
									dvs.testing();
				}
				
				i=i+1;
				if(i==2)
				{
									JOptionPane.showMessageDialog(null, "TABLE IS FILLED AND ARE  READY FOR RECEIPT ", "WARNING", JOptionPane.PLAIN_MESSAGE);
									dvs.testing();
				}
				if(i==3)
				{
					i=0;
				}
				firstwindow f=new firstwindow();
				f.first();

			}
		});
		btnTable_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnTable_7.setBounds(230, 156, 110, 32);
		panel.add(btnTable_7);
		
		JButton btnTable_10 = new JButton("TABLE11");
		btnTable_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=0;
				firstwindow dvs=new firstwindow();				
				if(i==1)
				{
									JOptionPane.showMessageDialog(null, "TABLE IS FILLED CLICK OK TO SEE STATUS", "WARNING", JOptionPane.PLAIN_MESSAGE);
									dvs.testing();
				}
				
				i=i+1;
				if(i==2)
				{
									JOptionPane.showMessageDialog(null, "TABLE IS FILLED AND ARE  READY FOR RECEIPT ", "WARNING", JOptionPane.PLAIN_MESSAGE);
									dvs.testing();
				}
				if(i==3)
				{
					i=0;
				}
				firstwindow f=new firstwindow();
				f.first();

			}
		});
		btnTable_10.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnTable_10.setBounds(230, 224, 110, 32);
		panel.add(btnTable_10);
		
		JButton btnTable_13 = new JButton("TABLE14");
		btnTable_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=0;
				firstwindow dvs=new firstwindow();				
				if(i==1)
				{
									JOptionPane.showMessageDialog(null, "TABLE IS FILLED CLICK OK TO SEE STATUS", "WARNING", JOptionPane.PLAIN_MESSAGE);
									dvs.testing();
				}
				
				i=i+1;
				if(i==2)
				{
									JOptionPane.showMessageDialog(null, "TABLE IS FILLED AND ARE  READY FOR RECEIPT ", "WARNING", JOptionPane.PLAIN_MESSAGE);
									dvs.testing();
				}
				if(i==3)
				{
					i=0;
				}
				firstwindow f=new firstwindow();
				f.first();

			}
		});
		btnTable_13.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnTable_13.setBounds(230, 285, 110, 32);
		panel.add(btnTable_13);
		
		JButton btnTable_5 = new JButton("TABLE6");
		btnTable_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=0;
				firstwindow dvs=new firstwindow();				
				if(i==1)
				{
									JOptionPane.showMessageDialog(null, "TABLE IS FILLED CLICK OK TO SEE STATUS", "WARNING", JOptionPane.PLAIN_MESSAGE);
									dvs.testing();
				}
				
				i=i+1;
				if(i==2)
				{
									JOptionPane.showMessageDialog(null, "TABLE IS FILLED AND ARE  READY FOR RECEIPT ", "WARNING", JOptionPane.PLAIN_MESSAGE);
									dvs.testing();
				}
				if(i==3)
				{
					i=0;
				}
				firstwindow f=new firstwindow();
				f.first();

			}
		});
		btnTable_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnTable_5.setBounds(433, 92, 110, 32);
		panel.add(btnTable_5);
		
		JButton btnTable_8 = new JButton("TABLE9");
		btnTable_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=0;
				firstwindow dvs=new firstwindow();				
				if(i==1)
				{
									JOptionPane.showMessageDialog(null, "TABLE IS FILLED CLICK OK TO SEE STATUS", "WARNING", JOptionPane.PLAIN_MESSAGE);
									dvs.testing();
				}
				
				i=i+1;
				if(i==2)
				{
									JOptionPane.showMessageDialog(null, "TABLE IS FILLED AND ARE  READY FOR RECEIPT ", "WARNING", JOptionPane.PLAIN_MESSAGE);
									dvs.testing();
				}
				if(i==3)
				{
					i=0;
				}
				firstwindow f=new firstwindow();
				f.first();

			}
		});
		btnTable_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnTable_8.setBounds(433, 156, 110, 32);
		panel.add(btnTable_8);
		
		JButton btnTable_11 = new JButton("TABLE12");
		btnTable_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=0;
				firstwindow dvs=new firstwindow();				
				if(i==1)
				{
									JOptionPane.showMessageDialog(null, "TABLE IS FILLED CLICK OK TO SEE STATUS", "WARNING", JOptionPane.PLAIN_MESSAGE);
									dvs.testing();
				}
				
				i=i+1;
				if(i==2)
				{
									JOptionPane.showMessageDialog(null, "TABLE IS FILLED AND ARE  READY FOR RECEIPT ", "WARNING", JOptionPane.PLAIN_MESSAGE);
									dvs.testing();
				}
				if(i==3)
				{
					i=0;
				}
				firstwindow f=new firstwindow();
				f.first();

			}
		});
		btnTable_11.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnTable_11.setBounds(433, 224, 110, 32);
		panel.add(btnTable_11);
		
		JButton btnTable_14 = new JButton("TABLE15");
		btnTable_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=0;
				//JOptionPane.showMessageDialog(null, "TABLE IS FILLED CLICK OK TO SEE STATUS", "WARNING", JOptionPane.PLAIN_MESSAGE);
				firstwindow dvs=new firstwindow();	
				
				if(i==1)
				{
									JOptionPane.showMessageDialog(null, "TABLE IS FILLED CLICK OK TO SEE STATUS", "WARNING", JOptionPane.PLAIN_MESSAGE);
									dvs.testing();
				}
				
				i=i+1;
				if(i==2)
				{
									JOptionPane.showMessageDialog(null, "TABLE IS FILLED AND ARE  READY FOR RECEIPT ", "WARNING", JOptionPane.PLAIN_MESSAGE);
									dvs.testing();
				}
				if(i==3)
				{
					i=0;
				}
				firstwindow f=new firstwindow();
				f.first();

			}
		});
		btnTable_14.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnTable_14.setBounds(433, 285, 110, 32);
		panel.add(btnTable_14);
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image img=new ImageIcon(getClass().getResource("/pic.jpg")).getImage();
				lblNewLabel_1.setIcon(new ImageIcon(img));
		lblNewLabel_1.setBounds(0, 0, 564, 363);
		panel.add(lblNewLabel_1);
		
		
		JLabel lblNewLabel = new JLabel("RUBICON RESTAURANT MANAGEMENT SYSTEM");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(109, 22, 352, 55);
		frame.getContentPane().add(lblNewLabel);
		
		
		
		

	}
}
