package practices;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class firstwindow {

	private JFrame frame;
	private JTextField mcptf;
	private JTextField mcbtf;
	private JTextField mcntf;
	private JTextField mcstf;
	private JTextField mcctf;
	private JTextField cvmtf;
	private JTextField cvntf;
	private JTextField ccmtf;
	private JTextField centf;
	private JTextField ccntf;
	private JTextField dictf;
	private JTextField dmstf;
	private JTextField dltf;
	private JTextField dctf;
	private JTextField dstf;
	private JTextField swgjtf;
	private JTextField swrtf;
	private JTextField swktf;
	private JTextField swkjtf;
	private JTextField swkotf;
	private JTextField mcgamttf;
	private JTextField cgamttf;
	private JTextField swgamttf;
	private JTextField dgamttf;
	private JTextField alltf;


	/**
	 * Launch the application.
	 */
	public static void first() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					firstwindow window = new firstwindow();
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
	public firstwindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 140, 0));
		frame.setBounds(0, 0, 1600, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JPanel mcpanel = new JPanel();
		mcpanel.setForeground(Color.BLACK);
		mcpanel.setBorder(new LineBorder(new Color(0, 0, 0), 6));
		mcpanel.setBounds(42, 34, 426, 343);
		frame.getContentPane().add(mcpanel);
		mcpanel.setLayout(null);
		
		JLabel lblMainCourse = new JLabel("MAIN COURSE");
		lblMainCourse.setForeground(new Color(255, 215, 0));
		lblMainCourse.setBounds(149, 11, 136, 14);
		lblMainCourse.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblMainCourse.setHorizontalAlignment(SwingConstants.CENTER);
		mcpanel.add(lblMainCourse);
		
		JLabel lblPulav = new JLabel("PULAV");
		lblPulav.setBounds(21, 74, 67, 30);
		lblPulav.setFont(new Font("Tahoma", Font.BOLD, 14));
		mcpanel.add(lblPulav);
		
		JLabel lblAmt = new JLabel("AMT");
		lblAmt.setForeground(new Color(0, 0, 0));
		lblAmt.setBounds(210, 57, 46, 14);
		lblAmt.setFont(new Font("Tahoma", Font.BOLD, 14));
		mcpanel.add(lblAmt);
		
		JLabel label = new JLabel("QTY");
		label.setForeground(new Color(0, 0, 0));
		label.setBounds(341, 57, 46, 14);
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		mcpanel.add(label);
		
		JLabel mcpamt = new JLabel("120.00");
		mcpamt.setBounds(195, 82, 76, 14);
		mcpamt.setFont(new Font("Tahoma", Font.BOLD, 14));
		mcpanel.add(mcpamt);
		
		mcptf = new JTextField();
		mcptf.setFont(new Font("Tahoma", Font.BOLD, 14));
		mcptf.setBounds(312, 81, 86, 20);
		mcpanel.add(mcptf);
		mcptf.setColumns(10);
		
		JLabel lblBiryani = new JLabel("BIRYANI");
		lblBiryani.setBounds(21, 115, 67, 30);
		lblBiryani.setFont(new Font("Tahoma", Font.BOLD, 14));
		mcpanel.add(lblBiryani);
		
		JLabel mcbamt = new JLabel("150.00");
		mcbamt.setForeground(new Color(0, 0, 0));
		mcbamt.setBounds(195, 123, 76, 14);
		mcbamt.setFont(new Font("Tahoma", Font.BOLD, 14));
		mcpanel.add(mcbamt);
		
		mcbtf = new JTextField();
		mcbtf.setFont(new Font("Tahoma", Font.BOLD, 14));
		mcbtf.setBounds(312, 122, 86, 20);
		mcbtf.setColumns(10);
		mcpanel.add(mcbtf);
		
		JLabel lblNorth = new JLabel("N.THALI");
		lblNorth.setBounds(21, 150, 67, 39);
		lblNorth.setFont(new Font("Tahoma", Font.BOLD, 14));
		mcpanel.add(lblNorth);
		
		JLabel mcntamt = new JLabel("180.00");
		mcntamt.setBounds(195, 162, 76, 14);
		mcntamt.setFont(new Font("Tahoma", Font.BOLD, 14));
		mcpanel.add(mcntamt);
		
		mcntf = new JTextField();
		mcntf.setFont(new Font("Tahoma", Font.BOLD, 14));
		mcntf.setBounds(312, 161, 86, 20);
		mcntf.setColumns(10);
		mcpanel.add(mcntf);
		
		JLabel lblSthali = new JLabel("S.THALI");
		lblSthali.setBounds(21, 193, 67, 39);
		lblSthali.setFont(new Font("Tahoma", Font.BOLD, 14));
		mcpanel.add(lblSthali);
		
		JLabel mcstamt = new JLabel("170.00");
		mcstamt.setBounds(195, 205, 76, 14);
		mcstamt.setFont(new Font("Tahoma", Font.BOLD, 14));
		mcpanel.add(mcstamt);
		
		mcstf = new JTextField();
		mcstf.setFont(new Font("Tahoma", Font.BOLD, 14));
		mcstf.setBounds(312, 204, 86, 20);
		mcstf.setColumns(10);
		mcpanel.add(mcstf);
		
		JLabel lblChicken = new JLabel("CHICKEN");
		lblChicken.setBounds(21, 243, 86, 39);
		lblChicken.setFont(new Font("Tahoma", Font.BOLD, 14));
		mcpanel.add(lblChicken);
		
		JLabel mccamt = new JLabel("210.00");
		mccamt.setBounds(195, 255, 76, 14);
		mccamt.setFont(new Font("Tahoma", Font.BOLD, 14));
		mcpanel.add(mccamt);
		
		mcctf = new JTextField();
		mcctf.setFont(new Font("Tahoma", Font.BOLD, 14));
		mcctf.setBounds(312, 254, 86, 20);
		mcctf.setColumns(10);
		mcpanel.add(mcctf);
		
		JLabel mcgamt = new JLabel("MAIN COURSE COST");
		mcgamt.setBounds(21, 293, 162, 14);
		mcgamt.setFont(new Font("Tahoma", Font.BOLD, 14));
		mcpanel.add(mcgamt);
		
		mcgamttf = new JTextField();
		mcgamttf.setBounds(179, 292, 117, 20);
		mcgamttf.setFont(new Font("Tahoma", Font.BOLD, 14));
		mcgamttf.setColumns(10);
		mcpanel.add(mcgamttf);
		
		JButton btnNewButton = new JButton("RESET");
		btnNewButton.setBounds(312, 293, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mcptf.setText(null);
				mcbtf.setText(null);
				mcntf.setText(null);
				mcstf.setText(null);
				mcctf.setText(null);
				mcgamttf.setText(null);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		mcpanel.add(btnNewButton);
		
		JLabel mcpiclabel = new JLabel("");
		mcpiclabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		Image img=new ImageIcon(getClass().getResource("/ppp.jpg")).getImage();
		mcpiclabel.setIcon(new ImageIcon(img));
		mcpiclabel.setBounds(0, 0, 426, 343);
		mcpanel.add(mcpiclabel);
		
		//Image img=new ImageIcon(getClass().getResource("/finalpulav.jpg")).getImage();
		
		JPanel cpanel = new JPanel();
		cpanel.setLayout(null);
		cpanel.setBorder(new LineBorder(new Color(0, 0, 0), 6));
		cpanel.setBounds(529, 34, 511, 343);
		frame.getContentPane().add(cpanel);
		
		JLabel lblChinese = new JLabel("CHINESE");
		lblChinese.setForeground(new Color(0, 0, 0));
		lblChinese.setHorizontalAlignment(SwingConstants.CENTER);
		lblChinese.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblChinese.setBounds(135, 11, 136, 14);
		cpanel.add(lblChinese);
		
		JLabel lblManchuria = new JLabel("V.MANCHURIA");
		lblManchuria.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblManchuria.setBounds(21, 74, 120, 30);
		cpanel.add(lblManchuria);
		
		JLabel camt = new JLabel("AMT");
		camt.setFont(new Font("Tahoma", Font.BOLD, 14));
		camt.setBounds(268, 57, 46, 14);
		cpanel.add(camt);
		
		JLabel label_6 = new JLabel("QTY");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_6.setBounds(400, 57, 46, 14);
		cpanel.add(label_6);
		
		JLabel cvmamt = new JLabel("110.00");
		cvmamt.setFont(new Font("Tahoma", Font.BOLD, 14));
		cvmamt.setBounds(260, 82, 76, 14);
		cpanel.add(cvmamt);
		
		cvmtf = new JTextField();
		cvmtf.setFont(new Font("Tahoma", Font.BOLD, 14));
		cvmtf.setColumns(10);
		cvmtf.setBounds(389, 81, 86, 20);
		cpanel.add(cvmtf);
		
		JLabel lblVnoodles = new JLabel("V.NOODLES");
		lblVnoodles.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblVnoodles.setBounds(21, 115, 120, 30);
		cpanel.add(lblVnoodles);
		
		JLabel cvnamt = new JLabel("90.00");
		cvnamt.setFont(new Font("Tahoma", Font.BOLD, 14));
		cvnamt.setBounds(260, 123, 76, 14);
		cpanel.add(cvnamt);
		
		cvntf = new JTextField();
		cvntf.setFont(new Font("Tahoma", Font.BOLD, 14));
		cvntf.setColumns(10);
		cvntf.setBounds(389, 122, 86, 20);
		cpanel.add(cvntf);
		
		JLabel lblNvmanchuria = new JLabel("CHICKEN MANCHURIA");
		lblNvmanchuria.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNvmanchuria.setBounds(21, 150, 177, 39);
		cpanel.add(lblNvmanchuria);
		
		JLabel ccmamt = new JLabel("130.00");
		ccmamt.setFont(new Font("Tahoma", Font.BOLD, 14));
		ccmamt.setBounds(260, 162, 76, 14);
		cpanel.add(ccmamt);
		
		ccmtf = new JTextField();
		ccmtf.setFont(new Font("Tahoma", Font.BOLD, 14));
		ccmtf.setColumns(10);
		ccmtf.setBounds(389, 153, 86, 20);
		cpanel.add(ccmtf);
		
		JLabel lblEggNoodles = new JLabel("EGG NOODLES");
		lblEggNoodles.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEggNoodles.setBounds(21, 193, 177, 39);
		cpanel.add(lblEggNoodles);
		
		JLabel cenamt = new JLabel("110.00");
		cenamt.setFont(new Font("Tahoma", Font.BOLD, 14));
		cenamt.setBounds(260, 200, 76, 14);
		cpanel.add(cenamt);
		
		centf = new JTextField();
		centf.setFont(new Font("Tahoma", Font.BOLD, 14));
		centf.setColumns(10);
		centf.setBounds(389, 199, 86, 20);
		cpanel.add(centf);
		
		JLabel lblChickenNoodles = new JLabel("CHICKEN NOODLES");
		lblChickenNoodles.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblChickenNoodles.setBounds(21, 231, 177, 39);
		cpanel.add(lblChickenNoodles);
		
		JLabel ccnamt = new JLabel("140.00");
		ccnamt.setFont(new Font("Tahoma", Font.BOLD, 14));
		ccnamt.setBounds(260, 243, 76, 14);
		cpanel.add(ccnamt);
		
		ccntf = new JTextField();
		ccntf.setFont(new Font("Tahoma", Font.BOLD, 14));
		ccntf.setColumns(10);
		ccntf.setBounds(389, 243, 86, 20);
		cpanel.add(ccntf);
		
		JLabel cgamt = new JLabel("CHINESE COST");
		cgamt.setFont(new Font("Tahoma", Font.BOLD, 14));
		cgamt.setBounds(21, 281, 153, 39);
		cpanel.add(cgamt);
		
		cgamttf = new JTextField();
		cgamttf.setFont(new Font("Tahoma", Font.BOLD, 14));
		cgamttf.setColumns(10);
		cgamttf.setBounds(220, 292, 136, 20);
		cpanel.add(cgamttf);
		
		JButton button = new JButton("RESET");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cvmtf.setText(null);
				cvntf.setText(null);
				ccmtf.setText(null);
				centf.setText(null);
				ccntf.setText(null);
				cgamttf.setText(null);
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 14));
		button.setBounds(389, 289, 89, 23);
		cpanel.add(button);
		
		JLabel chinesepiclabel = new JLabel("");
		Image img1=new ImageIcon(getClass().getResource("/n1.jpg")).getImage();
		chinesepiclabel.setIcon(new ImageIcon(img1));
		chinesepiclabel.setBounds(0, 0, 511, 343);
		cpanel.add(chinesepiclabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(-320, 215, 426, 343);
		cpanel.add(lblNewLabel_1);
		
		
		JPanel dpanel = new JPanel();
		dpanel.setLayout(null);
		dpanel.setBorder(new LineBorder(new Color(0, 0, 0), 6));
		dpanel.setBounds(42, 528, 426, 323);
		frame.getContentPane().add(dpanel);
		
		JLabel lblDeserts = new JLabel("DESERTS");
		lblDeserts.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeserts.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblDeserts.setBounds(135, 11, 136, 14);
		dpanel.add(lblDeserts);
		
		JLabel lblIceCream = new JLabel("ICE CREAM");
		lblIceCream.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblIceCream.setBounds(21, 74, 102, 30);
		dpanel.add(lblIceCream);
		
		JLabel damt = new JLabel("AMT");
		damt.setFont(new Font("Tahoma", Font.BOLD, 14));
		damt.setBounds(210, 57, 46, 14);
		dpanel.add(damt);
		
		JLabel dqty = new JLabel("QTY");
		dqty.setFont(new Font("Tahoma", Font.BOLD, 14));
		dqty.setBounds(352, 57, 46, 14);
		dpanel.add(dqty);
		
		JLabel dicamt = new JLabel("80.00");
		dicamt.setFont(new Font("Tahoma", Font.BOLD, 14));
		dicamt.setBounds(195, 82, 76, 14);
		dpanel.add(dicamt);
		
		dictf = new JTextField();
		dictf.setFont(new Font("Tahoma", Font.BOLD, 14));
		dictf.setColumns(10);
		dictf.setBounds(312, 81, 86, 20);
		dpanel.add(dictf);
		
		JLabel lblMilkshake = new JLabel("MILKSHAKE");
		lblMilkshake.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMilkshake.setBounds(21, 115, 102, 30);
		dpanel.add(lblMilkshake);
		
		JLabel dmsamt = new JLabel("100.00");
		dmsamt.setFont(new Font("Tahoma", Font.BOLD, 14));
		dmsamt.setBounds(195, 123, 76, 14);
		dpanel.add(dmsamt);
		
		dmstf = new JTextField();
		dmstf.setFont(new Font("Tahoma", Font.BOLD, 14));
		dmstf.setColumns(10);
		dmstf.setBounds(312, 122, 86, 20);
		dpanel.add(dmstf);
		
		JLabel lblLassi = new JLabel("LASSI");
		lblLassi.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLassi.setBounds(21, 150, 67, 39);
		dpanel.add(lblLassi);
		
		JLabel dlamt = new JLabel("80.00");
		dlamt.setFont(new Font("Tahoma", Font.BOLD, 14));
		dlamt.setBounds(195, 162, 76, 14);
		dpanel.add(dlamt);
		
		dltf = new JTextField();
		dltf.setFont(new Font("Tahoma", Font.BOLD, 14));
		dltf.setColumns(10);
		dltf.setBounds(312, 161, 86, 20);
		dpanel.add(dltf);
		
		JLabel lblCake = new JLabel("CAKE");
		lblCake.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCake.setBounds(21, 193, 67, 39);
		dpanel.add(lblCake);
		
		JLabel dcamt = new JLabel("75.00");
		dcamt.setFont(new Font("Tahoma", Font.BOLD, 14));
		dcamt.setBounds(195, 205, 76, 14);
		dpanel.add(dcamt);
		
		dctf = new JTextField();
		dctf.setFont(new Font("Tahoma", Font.BOLD, 14));
		dctf.setColumns(10);
		dctf.setBounds(312, 204, 86, 20);
		dpanel.add(dctf);
		
		JLabel lblSalad = new JLabel("SALAD");
		lblSalad.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSalad.setBounds(21, 230, 86, 39);
		dpanel.add(lblSalad);
		
		JLabel dsamt = new JLabel("85.00");
		dsamt.setFont(new Font("Tahoma", Font.BOLD, 14));
		dsamt.setBounds(195, 242, 76, 14);
		dpanel.add(dsamt);
		
		dstf = new JTextField();
		dstf.setFont(new Font("Tahoma", Font.BOLD, 14));
		dstf.setColumns(10);
		dstf.setBounds(312, 235, 86, 20);
		dpanel.add(dstf);
		
		JLabel dgamt = new JLabel("DESERT COST");
		dgamt.setFont(new Font("Tahoma", Font.BOLD, 14));
		dgamt.setBounds(21, 267, 177, 39);
		dpanel.add(dgamt);
		
		dgamttf = new JTextField();
		dgamttf.setFont(new Font("Tahoma", Font.BOLD, 14));
		dgamttf.setColumns(10);
		dgamttf.setBounds(158, 278, 127, 20);
		dpanel.add(dgamttf);
		
		JButton button_2 = new JButton("RESET");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dictf.setText(null);
				dmstf.setText(null);
				dltf.setText(null);
				dctf.setText(null);
				dstf.setText(null);
				dgamttf.setText(null);
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_2.setBounds(312, 277, 89, 23);
		dpanel.add(button_2);
		
		JLabel desertspiclabel = new JLabel("");
		Image img2=new ImageIcon(getClass().getResource("/deserts.jpg")).getImage();
		desertspiclabel.setIcon(new ImageIcon(img2));
		desertspiclabel.setBounds(0, 0, 426, 323);
		dpanel.add(desertspiclabel);
		//Image img=new ImageIcon(getClass().getResource("/pic.jpg")).getImage();
		
		
		JPanel swpanel = new JPanel();
		swpanel.setLayout(null);
		swpanel.setBorder(new LineBorder(new Color(0, 0, 0), 6));
		swpanel.setBounds(529, 528, 511, 323);
		frame.getContentPane().add(swpanel);
		
		JLabel sweets = new JLabel("OUR SPECIAL SWEETS");
		sweets.setHorizontalAlignment(SwingConstants.CENTER);
		sweets.setFont(new Font("Tahoma", Font.BOLD, 17));
		sweets.setBounds(135, 11, 249, 14);
		swpanel.add(sweets);
		
		JLabel lblGulabJam = new JLabel("GULAB JAM");
		lblGulabJam.setForeground(new Color(255, 255, 0));
		lblGulabJam.setBackground(new Color(255, 255, 255));
		lblGulabJam.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblGulabJam.setBounds(21, 74, 120, 30);
		swpanel.add(lblGulabJam);
		
		JLabel swamt = new JLabel("AMT");
		swamt.setFont(new Font("Tahoma", Font.BOLD, 14));
		swamt.setBounds(268, 57, 46, 14);
		swpanel.add(swamt);
		
		JLabel swqty = new JLabel("QTY");
		swqty.setFont(new Font("Tahoma", Font.BOLD, 14));
		swqty.setBounds(400, 57, 46, 14);
		swpanel.add(swqty);
		
		JLabel swgjamt = new JLabel("75.00");
		swgjamt.setFont(new Font("Tahoma", Font.BOLD, 14));
		swgjamt.setBounds(260, 82, 76, 14);
		swpanel.add(swgjamt);
		
		swgjtf = new JTextField();
		swgjtf.setFont(new Font("Tahoma", Font.BOLD, 14));
		swgjtf.setColumns(10);
		swgjtf.setBounds(389, 81, 86, 20);
		swpanel.add(swgjtf);
		
		JLabel lblRasmalai = new JLabel("RASMALAI");
		lblRasmalai.setForeground(new Color(255, 255, 0));
		lblRasmalai.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRasmalai.setBounds(21, 115, 120, 30);
		swpanel.add(lblRasmalai);
		
		JLabel swramt = new JLabel("90.00");
		swramt.setFont(new Font("Tahoma", Font.BOLD, 14));
		swramt.setBounds(260, 123, 76, 14);
		swpanel.add(swramt);
		
		swrtf = new JTextField();
		swrtf.setFont(new Font("Tahoma", Font.BOLD, 14));
		swrtf.setColumns(10);
		swrtf.setBounds(389, 122, 86, 20);
		swpanel.add(swrtf);
		
		JLabel lblKalakan = new JLabel("KALAKAN");
		lblKalakan.setForeground(new Color(255, 255, 0));
		lblKalakan.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblKalakan.setBounds(21, 150, 177, 39);
		swpanel.add(lblKalakan);
		
		JLabel swkamt = new JLabel("80.00");
		swkamt.setFont(new Font("Tahoma", Font.BOLD, 14));
		swkamt.setBounds(260, 162, 76, 14);
		swpanel.add(swkamt);
		
		swktf = new JTextField();
		swktf.setFont(new Font("Tahoma", Font.BOLD, 14));
		swktf.setColumns(10);
		swktf.setBounds(389, 153, 86, 20);
		swpanel.add(swktf);
		
		JLabel lblKalaJamun = new JLabel("KALA JAMUN");
		lblKalaJamun.setForeground(new Color(0, 0, 0));
		lblKalaJamun.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblKalaJamun.setBounds(21, 193, 177, 39);
		swpanel.add(lblKalaJamun);
		
		JLabel swkjamt = new JLabel("90.00");
		swkjamt.setFont(new Font("Tahoma", Font.BOLD, 14));
		swkjamt.setBounds(260, 200, 76, 14);
		swpanel.add(swkjamt);
		
		swkjtf = new JTextField();
		swkjtf.setFont(new Font("Tahoma", Font.BOLD, 14));
		swkjtf.setColumns(10);
		swkjtf.setBounds(389, 199, 86, 20);
		swpanel.add(swkjtf);
		
		JLabel lblKowa = new JLabel("KOWA");
		lblKowa.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblKowa.setBounds(21, 231, 177, 39);
		swpanel.add(lblKowa);
		
		JLabel swkoamt = new JLabel("70.00");
		swkoamt.setFont(new Font("Tahoma", Font.BOLD, 14));
		swkoamt.setBounds(260, 243, 76, 14);
		swpanel.add(swkoamt);
		
		swkotf = new JTextField();
		swkotf.setFont(new Font("Tahoma", Font.BOLD, 14));
		swkotf.setColumns(10);
		swkotf.setBounds(389, 243, 86, 20);
		swpanel.add(swkotf);
		
		swgamttf = new JTextField();
		swgamttf.setFont(new Font("Tahoma", Font.BOLD, 14));
		swgamttf.setColumns(10);
		swgamttf.setBounds(224, 281, 136, 20);
		swpanel.add(swgamttf);
		
		JLabel swgamt = new JLabel("SWEETS COST");
		swgamt.setFont(new Font("Tahoma", Font.BOLD, 14));
		swgamt.setBounds(21, 270, 177, 39);
		swpanel.add(swgamt);
		
		JButton button_1 = new JButton("RESET");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				swkotf.setText(null);
				swkjtf.setText(null);
				swktf.setText(null);
				swrtf.setText(null);
				swgjtf.setText(null);
				swgamttf.setText(null);
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_1.setBounds(386, 282, 89, 23);
		swpanel.add(button_1);
		
		JLabel swpiclabel = new JLabel("");
		Image img5=new ImageIcon(getClass().getResource("/swlabel.jpg")).getImage();
		swpiclabel.setIcon(new ImageIcon(img5));
		swpiclabel.setBounds(0, 0, 511, 323);
		swpanel.add(swpiclabel);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(139, 69, 19));
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 6));
		panel_4.setBounds(42, 410, 998, 89);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnTotal = new JButton("TOTAL");
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double total1,total2,total3,total4,gt;
				double p=0;
				double b=0,nt=0,st=0,c=0,ic=0,ms=0,l=0,ca=0,s=0,gj=0,k=0,ras=0,ko=0,kj=0,vm=0,vn=0,en=0,cm=0,cn=0;
				JOptionPane.showMessageDialog(null, "IF U DONOT WANT ANY ITEM PLEASE SELECT QUANTITY AS 0", "INSTRUCTION", JOptionPane.PLAIN_MESSAGE);
				String Mcptf=mcptf.getText();
				//System.out.println("The value is" +Mcptf);
				if(mcptf.getText()!=null)
				{
				p=Double.parseDouble(mcptf.getText());
				}
				if(mcptf.getText().trim().isEmpty())
				{
					p=0;
				}
				if(mcbtf.getText()==null)
				{
					b=0;
				}
				   if(mcbtf.getText()!=null)
				   {
				    b=Double.parseDouble(mcbtf.getText());
				    }
				   if(mcntf.getText()!=null)
				   { nt=Double.parseDouble(mcntf.getText()); }
				   if(mcntf.getText()==null)
				   {
					   nt=0;
				   }
				   if(mcstf.getText()!=null)	   
				   {st=Double.parseDouble(mcstf.getText()); }
				   if(mcstf.getText()==null){
					   st=0;
				   }
				   if(mcctf.getText()!=null)
					   {c=Double.parseDouble(mcctf.getText());}
				   if(mcctf.getText()==null)
				   {
					   c=0;
				   }
			    total1=((p*120.00)+(b*150.00)+(nt*180.00)+(st*170.00)+(c*210.00));
			    String t1=String.format("%2f", total1);
				mcgamttf.setText(t1);
				if(dictf.getText()!=null)
				{ic=Double.parseDouble(dictf.getText());}	
				if(dmstf.getText()!=null)
				{ms=Double.parseDouble(dmstf.getText());}
				if(dltf.getText()!=null)
				{l=Double.parseDouble(dltf.getText());}
				if(dctf.getText()!=null)
				{ca=Double.parseDouble(dctf.getText());}
				if(dstf.getText()!=null)
				{s=Double.parseDouble(dstf.getText());}
				total2=((ic*80.00)+(ms*100.00)+(l*80.00)+(ca*75.00)+(s*85.00));
				String t2=String.format("%2f", total2);
				dgamttf.setText(t2);
				//chinese
				if(cvmtf.getText()!=null)
				{vm=Double.parseDouble(cvmtf.getText());}
				if(cvntf.getText()!=null)
				{vn=Double.parseDouble(cvntf.getText());}
				if(ccmtf.getText()!=null)
				{cm=Double.parseDouble(ccmtf.getText());}
				if(centf.getText()!=null)
				{en=Double.parseDouble(centf.getText());}
				if(ccntf.getText()!=null)
				{cn=Double.parseDouble(ccntf.getText());}
				total3=((vm*110.00)+(vn*90.00)+(cm*130.00)+(en*110.00)+(cn*140.00));
				String t3=String.format("%2f", total3);
				cgamttf.setText(t3);
				//sweets
				if(swgjtf.getText()!=null)
				{gj=Double.parseDouble(swgjtf.getText());}
				if(swrtf.getText()!=null)
				{ras=Double.parseDouble(swrtf.getText());}
				if(swktf.getText()!=null)
				{k=Double.parseDouble(swktf.getText());}
				if(swkjtf.getText()!=null)
				{kj=Double.parseDouble(swkjtf.getText());}
				if(swkotf.getText()!=null)
				{ko=Double.parseDouble(swkotf.getText());}
				total4=((gj*75.00)+(ras*90.00)+(k*80.00)+(kj*90.00)+(ko*70.00));
				String t4=String.format("%2f", total4);
				swgamttf.setText(t4);
				gt=0.15*(total1+total2+total3+total4)+total1+total2+total3+total4;
				String Gt=String.format("%2f", gt);
				alltf.setText(Gt);
				

			}
		});
		btnTotal.setBounds(56, 21, 99, 44);
		panel_4.add(btnTotal);
		
		JButton btnReceipt = new JButton("RECEIPT");
		JTextArea textarea = new JTextArea();
		textarea.setBounds(28, 68, 452, 561);
		textarea.setFont(new Font("Monospaced", Font.BOLD, 17));
		btnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e, JTextArea textarea) {
				
				
				
			
			    
			}
			public void actionPerformed(ActionEvent e) {
				double qt5=Double.parseDouble(mcgamttf.getText());
				double qt2=Double.parseDouble(cgamttf.getText());
				double qt3=Double.parseDouble(dgamttf.getText());
				double qt4=Double.parseDouble(swgamttf.getText());
				/*String q1=String.format("%2f", qt5);
				String q2=String.format("%2f", qt2);
				String q3=String.format("%2f ", qt3);*/
				double tax=0.15*(qt5+qt2+qt3+qt4);
				String q4=String.format("%2f",tax);
				//textarea.append("maincourse grand total\t"+q1+"\n chinese grand total \t"+q2+"\n deserts grand total \t"+q3+ "\n sweets grand total \t"+q4+"\n tax @ 0.15 %");
				if(mcptf.getText()==null)
				{
					
				}
				else
				{
					double qtmcp=Double.parseDouble(mcptf.getText());
					double a=qtmcp*120;
					String q5=String.format("%2f",a);
					textarea.append("\n pulav cost    \t\t"+q5);
				}
				if(mcbtf.getText()==null)
				{
					
					
				}
				else
				{
					double qtmcb=Double.parseDouble(mcbtf.getText());
					double b=qtmcb*150;
					String q6=String.format("%2f",b);
					textarea.append("\n biryani cost \t\t"+q6);
				}
				if(mcntf.getText()==null)
				{
					
				}
				else
				{
					double qtmcnt=Double.parseDouble(mcntf.getText());
					double c=qtmcnt*180;
					String q7=String.format("%2f",c);
					textarea.append("\n north thali cost   \t"+q7);
				}
				if(mcstf.getText()==null)
				{
					
				}
				else
				{
					double qtmcst=Double.parseDouble(mcstf.getText());
					double d=qtmcst*170;
					String q8=String.format("%2f",d);
					textarea.append("\n south thali cost    \t"+q8);
				}
				if(mcctf.getText()==null)
				{
					
				}
				else
				{
					double qtmcc=Double.parseDouble(mcctf.getText());
					double d=qtmcc*210;
					String q9=String.format("%2f",d);
					textarea.append("\n chicken cost\t\t"+q9);
				}
				if(dictf.getText()==null)
				{
					
				}
				else
				{
					double qtdic=Double.parseDouble(dictf.getText());
					double d=qtdic*80;
					String q10=String.format("%2f",d);
					textarea.append("\n ice cream cost      \t"+q10);
				}
				if(dmstf.getText()==null)
				{
					
				}
				else
				{
					double qtdms=Double.parseDouble(dmstf.getText());
					double d=qtdms*100;
					String q11=String.format("%2f",d);
					textarea.append("\n milk shake cost     \t"+q11);
				}
				if(dltf.getText()==null)
				{
					
				}
				else
				{
					double qtdl=Double.parseDouble(dltf.getText());
					double d=qtdl*80;
					String q12=String.format("%2f",d);
					textarea.append("\n lassi cost   \t\t"+q12);
				}
				if(dctf.getText()==null)
				{
					
				}
				else
				{
					double qtdca=Double.parseDouble(dctf.getText());
					double c=qtdca*75;
					String q13=String.format("%2f",c);
					textarea.append("\n cake cost   \t\t"+q13);
				}
				if(dstf.getText()==null)
				{
					
				}
				else
				{
					double qtds=Double.parseDouble(dstf.getText());
					double s=qtds*85;
					String q14=String.format("%2f",s);
					textarea.append("\n salad cost   \t\t"+q14);
				}
				if(cvmtf.getText()==null)
				{
					
				}
				else
				{
					double qtcvm=Double.parseDouble(cvmtf.getText());
					double vm=qtcvm*110;
					String q15=String.format("%2f",vm);
					textarea.append("\n veg manchuria      \t"+q15);
				}
				if(cvntf.getText()==null)
				{
					
				}
				else
				{
					double qtcvn=Double.parseDouble(cvntf.getText());
					double vn=qtcvn*90;
					String q16=String.format("%2f", vn);
					textarea.append("\n veg noodles \t\t"+q16);
				}
				if(ccmtf.getText()==null)
				{
					
				}
				else
				{
					double qtccm=Double.parseDouble(ccmtf.getText());
					double cm=qtccm*130;
					String q17=String.format("%2f",cm);
					textarea.append("\n chicken manchuria cost    "+q17);
				}
				if(centf.getText()==null)
				{
					
				}
				else
				{
					double qtcen=Double.parseDouble(centf.getText());
					double en=qtcen*110;
					String q18=String.format("%2f",en);
					textarea.append("\n egg noodles cost    \t"+q18);
				}
				if(ccntf.getText()==null)
				{
					
				}
				else
				{
					double qtccn=Double.parseDouble(ccntf.getText());
					double cn=qtccn*140;
					String q19=String.format("%2f",cn);
					textarea.append("\n chicken noodles      \t"+q19);
				}
				if(swgjtf.getText()==null)
				{
					
				}
				else
				{
					double qtswgj=Double.parseDouble(swgjtf.getText());
					double gj=qtswgj*75;
					String q20=String.format("%2f",gj);
					textarea.append("\n gulab jamun cost      \t"+q20);
				}
				if(swrtf.getText()==null)
				{
					
				}
				else
				{
					double qtswr=Double.parseDouble(swrtf.getText());
					double r=qtswr*90;
					String q21=String.format("%2f",r);
					textarea.append("\n rasmalai cost      \t"+q21);
				}
				if(swktf.getText()==null)
				{
					
				}
				else
				{
					double qtswk=Double.parseDouble(swktf.getText());
					double k=80*qtswk;
					String q22=String.format("%2f",k);
					textarea.append("\n kalakan cost       \t"+q22);
				}
				if(swkjtf.getText()==null)
				{
					
				}
				else
				{
					double qtswkj=Double.parseDouble(swkjtf.getText());
					double kj=qtswkj*90;
					String q24=String.format("%2f", kj);
					textarea.append("\n kala jamun cost       \t"+q24);
				}
				if(swkotf.getText()==null)
				{
					
				}
				else
				{
					double qtswko=Double.parseDouble(swkotf.getText());
					double ko=qtswko*70;
					String q23=String.format("%2f",ko);
					textarea.append("\n kowa cost    \t\t"+q23);
				}
				textarea.append("\n tax amount \t\t"+q4);
				double qt1=Double.parseDouble(alltf.getText());
				String q1=String.format("%2f",qt1);
				textarea.append("\n total amount \t\t"+q1);
			}
		});
		btnReceipt.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReceipt.setBounds(293, 21, 99, 44);
		panel_4.add(btnReceipt);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alltf.setText(null);
				mcgamttf.setText(null);
				cgamttf.setText(null);
				swgamttf.setText(null);
				dgamttf.setText(null);
				mcptf.setText(null);
				mcbtf.setText(null);
				mcntf.setText(null);
				mcstf.setText(null);
				mcctf.setText(null);
				dictf.setText(null);
				dmstf.setText(null);
				dltf.setText(null);
				dctf.setText(null);
				dstf.setText(null);
				swkotf.setText(null);
				swkjtf.setText(null);
				swktf.setText(null);
				swrtf.setText(null);
				swgjtf.setText(null);
				cvmtf.setText(null);
				cvntf.setText(null);
				ccmtf.setText(null);
				centf.setText(null);
				ccntf.setText(null);
				textarea.setText("");
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReset.setBounds(529, 21, 99, 44);
		panel_4.add(btnReset);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnExit.setBounds(791, 21, 99, 44);
		panel_4.add(btnExit);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 6));
		panel.setBounds(1084, 34, 490, 89);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel all = new JLabel("GRAND TOTAL");
		all.setFont(new Font("Tahoma", Font.BOLD, 14));
		all.setBounds(60, 24, 117, 35);
		panel.add(all);
		
		alltf = new JTextField();
		alltf.setFont(new Font("Tahoma", Font.BOLD, 14));
		alltf.setBounds(242, 27, 148, 29);
		panel.add(alltf);
		alltf.setColumns(10);
		
		JLabel gtlabel = new JLabel("");
		Image img7=new ImageIcon(getClass().getResource("/currency.jpg")).getImage();
		gtlabel.setIcon(new ImageIcon(img7));
		gtlabel.setBounds(0, 0, 490, 89);
		panel.add(gtlabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 6));
		panel_1.setBounds(1084, 159, 490, 692);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("RECEIPT");
		lblNewLabel.setBounds(28, 27, 154, 14);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel_1.add(lblNewLabel);
		panel_1.add(textarea);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					homewindow window = new homewindow();
					window.frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				//System.out.println("");
			}
		});
		btnNewButton_1.setBounds(339, 640, 101, 41);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_1.add(btnNewButton_1);
		
		JButton btnFeedback = new JButton("FEEDBACK");
		btnFeedback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondwindow sw=new secondwindow();
				sw.secondwindow();
			}
		});
		btnFeedback.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnFeedback.setBounds(100, 640, 146, 41);
		panel_1.add(btnFeedback);
		
		JLabel lblNewLabel_2 = new JLabel("");
		Image img6=new ImageIcon(getClass().getResource("/billing.jpg")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img6));
		lblNewLabel_2.setBounds(0, 0, 480, 692);
		panel_1.add(lblNewLabel_2);
		
		
	}
public  void testing(){
	double total1,total2,total3,total4,gt;
	double p=0;
	double b=0,nt=0,st=0,c=0,ic=0,ms=0,l=0,ca=0,s=0,gj=0,k=0,ras=0,ko=0,kj=0,vm=0,vn=0,en=0,cm=0,cn=0;
	//JOptionPane.showMessageDialog(null, "IF U DONOT WANT ANY ITEM PLEASE SELECT QUANTITY AS 0", "INSTRUCTION", JOptionPane.PLAIN_MESSAGE);
	String Mcptf=mcptf.getText();
	//System.out.println("The value is" +Mcptf);
	if(mcptf.getText()!=null)
	{
	p=Double.parseDouble(mcptf.getText());
	}
	if(mcptf.getText().trim().isEmpty())
	{
		p=0;
	}
	if(mcbtf.getText()==null)
	{
		b=0;
	}
	   if(mcbtf.getText()!=null)
	   {
	    b=Double.parseDouble(mcbtf.getText());
	    }
	   if(mcntf.getText()!=null)
	   { nt=Double.parseDouble(mcntf.getText()); }
	   if(mcntf.getText()==null)
	   {
		   nt=0;
	   }
	   if(mcstf.getText()!=null)	   
	   {st=Double.parseDouble(mcstf.getText()); }
	   if(mcstf.getText()==null){
		   st=0;
	   }
	   if(mcctf.getText()!=null)
		   {c=Double.parseDouble(mcctf.getText());}
	   if(mcctf.getText()==null)
	   {
		   c=0;
	   }
    total1=((p*120.00)+(b*150.00)+(nt*180.00)+(st*170.00)+(c*210.00));
    String t1=String.format("%2f", total1);
	mcgamttf.setText(t1);
	if(dictf.getText()!=null)
	{ic=Double.parseDouble(dictf.getText());}	
	if(dmstf.getText()!=null)
	{ms=Double.parseDouble(dmstf.getText());}
	if(dltf.getText()!=null)
	{l=Double.parseDouble(dltf.getText());}
	if(dctf.getText()!=null)
	{ca=Double.parseDouble(dctf.getText());}
	if(dstf.getText()!=null)
	{s=Double.parseDouble(dstf.getText());}
	total2=((ic*80.00)+(ms*100.00)+(l*80.00)+(ca*75.00)+(s*85.00));
	String t2=String.format("%2f", total2);
	dgamttf.setText(t2);
	//chinese
	if(cvmtf.getText()!=null)
	{vm=Double.parseDouble(cvmtf.getText());}
	if(cvntf.getText()!=null)
	{vn=Double.parseDouble(cvntf.getText());}
	if(ccmtf.getText()!=null)
	{cm=Double.parseDouble(ccmtf.getText());}
	if(centf.getText()!=null)
	{en=Double.parseDouble(centf.getText());}
	if(ccntf.getText()!=null)
	{cn=Double.parseDouble(ccntf.getText());}
	total3=((vm*110.00)+(vn*90.00)+(cm*130.00)+(en*110.00)+(cn*140.00));
	String t3=String.format("%2f", total3);
	cgamttf.setText(t3);
	//sweets
	if(swgjtf.getText()!=null)
	{gj=Double.parseDouble(swgjtf.getText());}
	if(swrtf.getText()!=null)
	{ras=Double.parseDouble(swrtf.getText());}
	if(swktf.getText()!=null)
	{k=Double.parseDouble(swktf.getText());}
	if(swkjtf.getText()!=null)
	{kj=Double.parseDouble(swkjtf.getText());}
	if(swkotf.getText()!=null)
	{ko=Double.parseDouble(swkotf.getText());}
	total4=((gj*75.00)+(ras*90.00)+(k*80.00)+(kj*90.00)+(ko*70.00));
	String t4=String.format("%2f", total4);
	swgamttf.setText(t4);
	gt=0.15*(total1+total2+total3+total4)+total1+total2+total3+total4;
	String Gt=String.format("%2f", gt);
	alltf.setText(Gt);

	
}
}
