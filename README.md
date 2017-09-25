package practices;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class agu {

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
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					agu window = new agu();
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
	public agu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1600, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel mcpanel = new JPanel();
		mcpanel.setBorder(new LineBorder(new Color(0, 0, 0), 6));
		mcpanel.setBounds(42, 34, 426, 343);
		frame.getContentPane().add(mcpanel);
		mcpanel.setLayout(null);
		
		JLabel lblMainCourse = new JLabel("MAIN COURSE");
		lblMainCourse.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblMainCourse.setHorizontalAlignment(SwingConstants.CENTER);
		lblMainCourse.setBounds(135, 11, 136, 14);
		mcpanel.add(lblMainCourse);
		
		JLabel lblPulav = new JLabel("PULAV");
		lblPulav.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPulav.setBounds(21, 74, 67, 30);
		mcpanel.add(lblPulav);
		
		JLabel lblAmt = new JLabel("AMT");
		lblAmt.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAmt.setBounds(210, 57, 46, 14);
		mcpanel.add(lblAmt);
		
		JLabel label = new JLabel("QTY");
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(330, 57, 46, 14);
		mcpanel.add(label);
		
		JLabel mcpamt = new JLabel("120.00");
		mcpamt.setFont(new Font("Tahoma", Font.BOLD, 14));
		mcpamt.setBounds(195, 82, 76, 14);
		mcpanel.add(mcpamt);
		
		mcptf = new JTextField();
		mcptf.setBounds(312, 81, 86, 20);
		mcpanel.add(mcptf);
		mcptf.setColumns(10);
		
		JLabel lblBiryani = new JLabel("BIRYANI");
		lblBiryani.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBiryani.setBounds(21, 115, 67, 30);
		mcpanel.add(lblBiryani);
		
		JLabel mcbamt = new JLabel("150.00");
		mcbamt.setFont(new Font("Tahoma", Font.BOLD, 14));
		mcbamt.setBounds(195, 123, 76, 14);
		mcpanel.add(mcbamt);
		
		mcbtf = new JTextField();
		mcbtf.setColumns(10);
		mcbtf.setBounds(312, 122, 86, 20);
		mcpanel.add(mcbtf);
		
		JLabel lblNorth = new JLabel("N.THALI");
		lblNorth.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNorth.setBounds(21, 150, 67, 39);
		mcpanel.add(lblNorth);
		
		JLabel mcntamt = new JLabel("180.00");
		mcntamt.setFont(new Font("Tahoma", Font.BOLD, 14));
		mcntamt.setBounds(195, 162, 76, 14);
		mcpanel.add(mcntamt);
		
		mcntf = new JTextField();
		mcntf.setColumns(10);
		mcntf.setBounds(312, 161, 86, 20);
		mcpanel.add(mcntf);
		
		JLabel lblSthali = new JLabel("S.THALI");
		lblSthali.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSthali.setBounds(21, 193, 67, 39);
		mcpanel.add(lblSthali);
		
		JLabel mcstamt = new JLabel("170.00");
		mcstamt.setFont(new Font("Tahoma", Font.BOLD, 14));
		mcstamt.setBounds(195, 205, 76, 14);
		mcpanel.add(mcstamt);
		
		mcstf = new JTextField();
		mcstf.setColumns(10);
		mcstf.setBounds(312, 204, 86, 20);
		mcpanel.add(mcstf);
		
		JLabel lblChicken = new JLabel("CHICKEN");
		lblChicken.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblChicken.setBounds(21, 243, 86, 39);
		mcpanel.add(lblChicken);
		
		JLabel mccamt = new JLabel("210.00");
		mccamt.setFont(new Font("Tahoma", Font.BOLD, 14));
		mccamt.setBounds(195, 255, 76, 14);
		mcpanel.add(mccamt);
		
		mcctf = new JTextField();
		mcctf.setColumns(10);
		mcctf.setBounds(312, 254, 86, 20);
		mcpanel.add(mcctf);
		
		JLabel mcgamt = new JLabel("MAIN COURSE COST");
		mcgamt.setFont(new Font("Tahoma", Font.BOLD, 14));
		mcgamt.setBounds(21, 293, 162, 14);
		mcpanel.add(mcgamt);
		
		mcgamttf = new JTextField();
		mcgamttf.setFont(new Font("Tahoma", Font.BOLD, 14));
		mcgamttf.setColumns(10);
		mcgamttf.setBounds(195, 292, 101, 20);
		mcpanel.add(mcgamttf);
		
		JPanel cpanel = new JPanel();
		cpanel.setLayout(null);
		cpanel.setBorder(new LineBorder(new Color(0, 0, 0), 6));
		cpanel.setBounds(529, 34, 511, 343);
		frame.getContentPane().add(cpanel);
		
		JLabel lblChinese = new JLabel("CHINESE");
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
		cgamttf.setBounds(250, 292, 106, 20);
		cpanel.add(cgamttf);
		
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
		dqty.setBounds(330, 57, 46, 14);
		dpanel.add(dqty);
		
		JLabel dicamt = new JLabel("80.00");
		dicamt.setFont(new Font("Tahoma", Font.BOLD, 14));
		dicamt.setBounds(195, 82, 76, 14);
		dpanel.add(dicamt);
		
		dictf = new JTextField();
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
		dgamttf.setBounds(184, 278, 101, 20);
		dpanel.add(dgamttf);
		
		JPanel swpanel = new JPanel();
		swpanel.setLayout(null);
		swpanel.setBorder(new LineBorder(new Color(0, 0, 0), 6));
		swpanel.setBounds(529, 528, 511, 323);
		frame.getContentPane().add(swpanel);
		
		JLabel sweets = new JLabel("SWEETS");
		sweets.setHorizontalAlignment(SwingConstants.CENTER);
		sweets.setFont(new Font("Tahoma", Font.BOLD, 17));
		sweets.setBounds(135, 11, 136, 14);
		swpanel.add(sweets);
		
		JLabel lblGulabJam = new JLabel("GULAB JAM");
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
		swgjtf.setColumns(10);
		swgjtf.setBounds(389, 81, 86, 20);
		swpanel.add(swgjtf);
		
		JLabel lblRasmalai = new JLabel("RASMALAI");
		lblRasmalai.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRasmalai.setBounds(21, 115, 120, 30);
		swpanel.add(lblRasmalai);
		
		JLabel swramt = new JLabel("90.00");
		swramt.setFont(new Font("Tahoma", Font.BOLD, 14));
		swramt.setBounds(260, 123, 76, 14);
		swpanel.add(swramt);
		
		swrtf = new JTextField();
		swrtf.setColumns(10);
		swrtf.setBounds(389, 122, 86, 20);
		swpanel.add(swrtf);
		
		JLabel lblKalakan = new JLabel("KALAKAN");
		lblKalakan.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblKalakan.setBounds(21, 150, 177, 39);
		swpanel.add(lblKalakan);
		
		JLabel swkamt = new JLabel("80.00");
		swkamt.setFont(new Font("Tahoma", Font.BOLD, 14));
		swkamt.setBounds(260, 162, 76, 14);
		swpanel.add(swkamt);
		
		swktf = new JTextField();
		swktf.setColumns(10);
		swktf.setBounds(389, 153, 86, 20);
		swpanel.add(swktf);
		
		JLabel lblKalaJamun = new JLabel("KALA JAMUN");
		lblKalaJamun.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblKalaJamun.setBounds(21, 193, 177, 39);
		swpanel.add(lblKalaJamun);
		
		JLabel swkjamt = new JLabel("90.00");
		swkjamt.setFont(new Font("Tahoma", Font.BOLD, 14));
		swkjamt.setBounds(260, 200, 76, 14);
		swpanel.add(swkjamt);
		
		swkjtf = new JTextField();
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
		swkotf.setColumns(10);
		swkotf.setBounds(389, 243, 86, 20);
		swpanel.add(swkotf);
		
		swgamttf = new JTextField();
		swgamttf.setFont(new Font("Tahoma", Font.BOLD, 14));
		swgamttf.setColumns(10);
		swgamttf.setBounds(254, 281, 106, 20);
		swpanel.add(swgamttf);
		
		JLabel swgamt = new JLabel("SWEETS COST");
		swgamt.setFont(new Font("Tahoma", Font.BOLD, 14));
		swgamt.setBounds(21, 270, 177, 39);
		swpanel.add(swgamt);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 6));
		panel_4.setBounds(42, 410, 998, 89);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnTotal = new JButton("TOTAL");
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double total1,total2,total3,total4,gt;
				double p=Double.parseDouble(mcptf.getText());
				double b=Double.parseDouble(mcbtf.getText());
				double nt=Double.parseDouble(mcntf.getText());
				double st=Double.parseDouble(mcstf.getText());
				double c=Double.parseDouble(mcctf.getText());
			    total1=((p*120.00)+(b*150.00)+(nt*180.00)+(st*170.00)+(c*210.00));
			    String t1=String.format("%2f", total1);
				mcgamttf.setText(t1);
				double ic=Double.parseDouble(dictf.getText());
				double ms=Double.parseDouble(dmstf.getText());
				double l=Double.parseDouble(dltf.getText());
				double ca=Double.parseDouble(dctf.getText());
				double s=Double.parseDouble(dstf.getText());
				total2=((ic*80.00)+(ms*100.00)+(l*80.00)+(ca*75.00)+(s*85.00));
				String t2=String.format("%2f", total2);
				dgamttf.setText(t2);
				//chinese
				double vm=Double.parseDouble(cvmtf.getText());
				double vn=Double.parseDouble(cvntf.getText());
				double cm=Double.parseDouble(ccmtf.getText());
				double en=Double.parseDouble(centf.getText());
				double cn=Double.parseDouble(ccntf.getText());
				total3=((vm*110.00)+(vn*90.00)+(cm*130.00)+(en*110.00)+(cn*140.00));
				String t3=String.format("%2f", total3);
				cgamttf.setText(t3);
				//sweets
				
				double gj=Double.parseDouble(swgjtf.getText());
				double ras=Double.parseDouble(swrtf.getText());
				double k=Double.parseDouble(swktf.getText());
				double kj=Double.parseDouble(swkjtf.getText());
				double ko=Double.parseDouble(swkotf.getText());
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
		btnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double qt1=Double.parseDouble(mcgamttf.getText());
				double qt2=Double.parseDouble(cgamttf.getText());
				double qt3=Double.parseDouble(dgamttf.getText());
				double qt4=Double.parseDouble(swgamttf.getText());
				//txtarea.append("")
			}
		});
		btnReceipt.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReceipt.setBounds(293, 21, 99, 44);
		panel_4.add(btnReceipt);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
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
		panel.setBounds(1115, 40, 438, 89);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel all = new JLabel("GRAND TOTAL");
		all.setFont(new Font("Tahoma", Font.BOLD, 14));
		all.setBounds(60, 24, 117, 35);
		panel.add(all);
		
		alltf = new JTextField();
		alltf.setFont(new Font("Tahoma", Font.BOLD, 14));
		alltf.setBounds(260, 27, 101, 29);
		panel.add(alltf);
		alltf.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 6));
		panel_1.setBounds(1115, 164, 436, 687);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
	}
}
