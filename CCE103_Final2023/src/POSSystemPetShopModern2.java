

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.RoundRectangle2D;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.border.MatteBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTable;
import javax.swing.JSeparator;
import javax.swing.JTextField;


public class POSSystemPetShopModern2 extends JFrame {

	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					POSSystemPetShopModern2 frame2 = new POSSystemPetShopModern2();
					frame2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	int positionX = 0;
	int positionY= 0;
	private JTextField Caahinput;

	/**
	 * Create the frame.
	 */
	public POSSystemPetShopModern2() {
		setUndecorated(true);
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				positionX = e.getX();
				positionY = e.getY();
			}
		});
		
		contentPane.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) {
				setLocation(e.getXOnScreen()-positionX, e.getYOnScreen()-positionY);
			}
		});
		contentPane.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		contentPane.setBackground(SystemColor.control);
		getComponents();
		setLocationRelativeTo(null);
		setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 15, 15));

		setContentPane(contentPane);
		
		final JButton btnClose2 = new JButton("X");
		btnClose2.setBounds(1325, 0, 41, 32);
		btnClose2.setFont(new Font("Arial", Font.BOLD, 11));
		btnClose2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 229, 182), new Color(255, 229, 182)));
		btnClose2.setForeground(new Color(139, 69, 19));
		btnClose2.setBackground(new Color(255, 229, 182));
		btnClose2.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				btnClose2.setBackground(Color.RED);
			}
			public void mouseExited(MouseEvent e) {
				btnClose2.setBackground(SystemColor.control);
			}
		});
		btnClose2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(ABORT);
		}
		});
		contentPane.setLayout(null);
		contentPane.add(btnClose2);
		
		final JButton btnMinimize2 = new JButton("_");
		btnMinimize2.setBounds(1274, 0, 41, 32);
		btnMinimize2.setForeground(new Color(139, 69, 19));
		btnMinimize2.setFont(new Font("Arial", Font.BOLD, 11));
		btnMinimize2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 229, 182), new Color(255, 229, 182)));
		btnMinimize2.setBackground(new Color(255, 229, 182));
		btnMinimize2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setState(JFrame.ICONIFIED);
		}
		});
		contentPane.add(btnMinimize2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 147, 720);
		panel_1.setBackground(Color.WHITE);
		contentPane.add(panel_1);
		
		
		JLabel logoimg = new JLabel();
		logoimg.setBounds(10, 11, 127, 73);
		ImageIcon image10 = new ImageIcon(this.getClass().getResource("/4.png"));
		panel_1.setLayout(null);
		logoimg.setIcon(image10);
		panel_1.add(logoimg);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(173, 50, 857, 653);
		
		panel.setLayout(null);
		
		final JPanel receipt = new JPanel();
		receipt.addMouseListener(new MouseAdapter() {
			public void mouseExited(MouseEvent e) {
				btnClose2.setBackground(Color.WHITE);
			}
		});
		receipt.setBackground(Color.WHITE);
		receipt.setBounds(1017, 0, 349, 720);
		contentPane.add(receipt);
		receipt.setVisible(false);
		receipt.setLayout(null);
		
		JButton Printreceipt = new JButton("Print Receipt");
		Printreceipt.setForeground(new Color(109, 79, 38));
		Printreceipt.setBackground(Color.WHITE);
		Printreceipt.setBorder(null);
		Printreceipt.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 18));
		Printreceipt.setBounds(26, 659, 301, 25);
		receipt.add(Printreceipt);
		
		JButton Pay = new JButton("Pay");
		Pay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Pay.setBackground(new Color(109, 79, 38));
		Pay.setForeground(Color.WHITE);
		Pay.setBorder(null);
		Pay.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 18));
		Pay.setBounds(26, 582, 301, 25);
		receipt.add(Pay);
		
		JLabel Paybutton = new JLabel("");
		Paybutton.setBounds(10, 570, 329, 50);
		ImageIcon image52 = new ImageIcon(this.getClass().getResource("/paybutton.png"));
		Paybutton.setIcon(image52);
		receipt.add(Paybutton);
		
		JLabel PrintButton = new JLabel("");
		PrintButton.setBounds(10, 648, 329, 50);
		ImageIcon image53 = new ImageIcon(this.getClass().getResource("/printreceiptbutton.png"));
		PrintButton.setIcon(image53);
		receipt.add(PrintButton);
		
		JButton DeleteButton = new JButton("Delete");
		DeleteButton.setFont(new Font("Microsoft JhengHei", Font.BOLD, 15));
		DeleteButton.setBorder(null);
		DeleteButton.setForeground(Color.WHITE);
		DeleteButton.setBackground(new Color(109,73,38));
		DeleteButton.setBounds(230, 384, 89, 25);
		receipt.add(DeleteButton);
		
		JLabel delete = new JLabel("");
		delete.setBounds(217, 380, 110, 37);
		ImageIcon image64 = new ImageIcon(this.getClass().getResource("/dt.png"));
		delete.setIcon(image64);
		receipt.add(delete);
		
		JLabel Total = new JLabel("Total:");
		Total.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		Total.setBounds(26, 436, 54, 37);
		receipt.add(Total);
		
		JLabel Cash = new JLabel("Cash:");
		Cash.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		Cash.setBounds(26, 474, 54, 37);
		receipt.add(Cash);
		
		JLabel Balance = new JLabel("Balance:");
		Balance.setFont(new Font("Microsoft JhengHei", Font.BOLD, 18));
		Balance.setBounds(26, 522, 80, 37);
		receipt.add(Balance);
		
		Caahinput = new JTextField();
		Caahinput.setBounds(97, 486, 230, 20);
		receipt.add(Caahinput);
		Caahinput.setColumns(10);
		
		JLabel cashinput = new JLabel("");
		cashinput.setBounds(85, 481, 254, 31);
		ImageIcon image65 = new ImageIcon(this.getClass().getResource("/cash.png"));
		cashinput.setIcon(image65);
		receipt.add(cashinput);
		
		final JButton Logout = new JButton();
		Logout.setBounds(0, 622, 148, 87);
		Logout.setVerticalAlignment(SwingConstants.CENTER);
		Logout.setBackground(Color.WHITE);
		Logout.setForeground(Color.GRAY);
		Logout.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		Logout.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), new Color(255, 255, 255)));
		ImageIcon image16 = new ImageIcon(this.getClass().getResource("/logout1.png"));
		Logout.setIcon(image16);
		Logout.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				Logout.setBackground(new Color(255,222,173));
			}
			public void mouseExited(MouseEvent e) {
				Logout.setBackground(Color.WHITE);
			}
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Are you sure you want to logout?", "Are you sure you want to leave?", JOptionPane.YES_NO_CANCEL_OPTION);
				POSSystemPetShopModern frame1 = new POSSystemPetShopModern();
				frame1.setVisible(true);
				dispose();
			}
		});
		panel_1.add(Logout);
		
		final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, -24, 1394, 831);
		contentPane.add(tabbedPane);
		
		JPanel homepanel = new JPanel();
		tabbedPane.addTab("New tab", null, homepanel, null);
		homepanel.setLayout(null);
		
		final JPanel hpanel = new JPanel();
		hpanel.setBounds(0, 0, 1404, 732);
		homepanel.add(hpanel);
		hpanel.setLayout(null);
		
		JLabel back = new JLabel("");
		back.setBounds(144, 0, 1226, 721);
		ImageIcon image63 = new ImageIcon(this.getClass().getResource("/About Us1.png"));
		back.setIcon(image63);
		hpanel.add(back);
		
		final JPanel petpanel = new JPanel();
		petpanel.setBackground(SystemColor.control);
		tabbedPane.addTab("New tab", null, petpanel, null);
		petpanel.setLayout(null);
		
		final JPanel ppanel = new JPanel();
		ppanel.setBackground(Color.WHITE);
		ppanel.setBounds(162, 21, 829, 687);
		petpanel.add(ppanel);
		ppanel.setVisible(false);
		ppanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PETS");
		lblNewLabel.setForeground(new Color(139, 69, 19));
		lblNewLabel.setFont(new Font("Bauhaus 93", Font.BOLD, 57));
		lblNewLabel.setBounds(20, 21, 194, 58);
		ppanel.add(lblNewLabel);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(0, 220, 829, 32);
		ppanel.add(panel_3);

		panel_3.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(139, 69, 19));
		separator.setBackground(new Color(139, 69, 19));
		separator.setBounds(22, 11, 774, 10);
		panel_3.add(separator);

		final JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBackground(Color.WHITE);
		tabbedPane_1.setBounds(-11, 220, 854, 491);
		tabbedPane_1.setVisible(false);
		ppanel.add(tabbedPane_1);
		
		final JPanel dogs = new JPanel();
		dogs.setBackground(Color.WHITE);
		tabbedPane_1.addTab("New tab", null, dogs, null);
		dogs.setLayout(null);
		
		final JButton dog1 = new JButton();
		dog1.setBackground(Color.WHITE);
		dog1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, SystemColor.control, SystemColor.control));
		dog1.setBounds(49, 35, 130, 130);
		dog1.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				dog1.setBackground(new Color(222, 184, 135));
			}
			public void mouseExited(MouseEvent e) {
				dog1.setBackground(Color.WHITE);
			}
			public void mouseClicked(MouseEvent e) {
			}
		});
		ImageIcon image21 = new ImageIcon(this.getClass().getResource("/lr.png"));
		dog1.setIcon(image21);
		dogs.add(dog1);
		
		final JButton dog2 = new JButton("");
		dog2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, SystemColor.control, SystemColor.control));
		dog2.setBackground(Color.WHITE);
		dog2.setBounds(243, 35, 130, 130);
		dog2.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				dog2.setBackground(new Color(222, 184, 135));
			}
			public void mouseExited(MouseEvent e) {
				dog2.setBackground(Color.WHITE);
			}
			public void mouseClicked(MouseEvent e) {
			}
		});
		ImageIcon image22 = new ImageIcon(this.getClass().getResource("/gs.png"));
		dog2.setIcon(image22);
		dogs.add(dog2);
		
		final JButton dog3 = new JButton("");
		dog3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, SystemColor.control, SystemColor.control));
		dog3.setBackground(Color.WHITE);
		dog3.setBounds(429, 35, 130, 130);
		dog3.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				dog3.setBackground(new Color(222, 184, 135));
			}
			public void mouseExited(MouseEvent e) {
				dog3.setBackground(Color.WHITE);
			}
			public void mouseClicked(MouseEvent e) {
			}
		});
		ImageIcon image23 = new ImageIcon(this.getClass().getResource("/gr.png"));
		dog3.setIcon(image23);
		dogs.add(dog3);
		
		final JButton dog4 = new JButton("");
		dog4.setBorder(new EtchedBorder(EtchedBorder.LOWERED, SystemColor.control, SystemColor.control));
		dog4.setBackground(Color.WHITE);
		dog4.setBounds(611, 35, 130, 130);
		dog4.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				dog4.setBackground(new Color(222, 184, 135));
			}
			public void mouseExited(MouseEvent e) {
				dog4.setBackground(Color.WHITE);
			}
			public void mouseClicked(MouseEvent e) {
			}
		});
		ImageIcon image24 = new ImageIcon(this.getClass().getResource("/fb.png"));
		dog4.setIcon(image24);
		dogs.add(dog4);
		
		final JButton dog5 = new JButton("");
		dog5.setBorder(new EtchedBorder(EtchedBorder.LOWERED, SystemColor.control, SystemColor.control));
		dog5.setBackground(Color.WHITE);
		dog5.setBounds(243, 238, 130, 130);
		dog5.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				dog5.setBackground(new Color(222, 184, 135));
			}
			public void mouseExited(MouseEvent e) {
				dog5.setBackground(Color.WHITE);
			}
			public void mouseClicked(MouseEvent e) {
			}
		});
		ImageIcon image25 = new ImageIcon(this.getClass().getResource("/pd.png"));
		dog5.setIcon(image25);
		dogs.add(dog5);
		
		final JButton dog6 = new JButton("");
		dog6.setBorder(new EtchedBorder(EtchedBorder.LOWERED, SystemColor.control, SystemColor.control));
		dog6.setBackground(Color.WHITE);
		dog6.setBounds(429, 238, 130, 130);
		dog6.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				dog6.setBackground(new Color(222, 184, 135));
			}
			public void mouseExited(MouseEvent e) {
				dog6.setBackground(Color.WHITE);
			}
			public void mouseClicked(MouseEvent e) {
			}
		});
		ImageIcon image26 = new ImageIcon(this.getClass().getResource("/ds.png"));
		dog6.setIcon(image26);
		dogs.add(dog6);
		
		JLabel lr = new JLabel("Labrador Retriever");
		lr.setForeground(new Color(139, 69, 19));
		lr.setHorizontalAlignment(SwingConstants.CENTER);
		lr.setHorizontalTextPosition(SwingConstants.CENTER);
		lr.setFont(new Font("Arial", Font.BOLD, 13));
		lr.setBounds(49, 185, 130, 14);
		dogs.add(lr);
		
		JLabel gs = new JLabel("German Shepherd");
		gs.setHorizontalTextPosition(SwingConstants.CENTER);
		gs.setHorizontalAlignment(SwingConstants.CENTER);
		gs.setForeground(new Color(139, 69, 19));
		gs.setFont(new Font("Arial", Font.BOLD, 13));
		gs.setBounds(243, 185, 130, 14);
		dogs.add(gs);
		
		JLabel gr = new JLabel("Golden Retriever");
		gr.setHorizontalTextPosition(SwingConstants.CENTER);
		gr.setHorizontalAlignment(SwingConstants.CENTER);
		gr.setForeground(new Color(139, 69, 19));
		gr.setFont(new Font("Arial", Font.BOLD, 13));
		gr.setBounds(429, 185, 130, 14);
		dogs.add(gr);
		
		JLabel fb = new JLabel("French Bulldog");
		fb.setHorizontalTextPosition(SwingConstants.CENTER);
		fb.setHorizontalAlignment(SwingConstants.CENTER);
		fb.setForeground(new Color(139, 69, 19));
		fb.setFont(new Font("Arial", Font.BOLD, 13));
		fb.setBounds(611, 185, 130, 14);
		dogs.add(fb);
		
		JLabel pd = new JLabel("Poodle");
		pd.setHorizontalTextPosition(SwingConstants.CENTER);
		pd.setHorizontalAlignment(SwingConstants.CENTER);
		pd.setForeground(new Color(139, 69, 19));
		pd.setFont(new Font("Arial", Font.BOLD, 13));
		pd.setBounds(243, 392, 130, 14);
		dogs.add(pd);
		
		JLabel ds = new JLabel("Dachshund");
		ds.setHorizontalTextPosition(SwingConstants.CENTER);
		ds.setHorizontalAlignment(SwingConstants.CENTER);
		ds.setForeground(new Color(139, 69, 19));
		ds.setFont(new Font("Arial", Font.BOLD, 13));
		ds.setBounds(429, 392, 130, 14);
		dogs.add(ds);
		
		JSeparator separator_1_1_1_4 = new JSeparator();
		separator_1_1_1_4.setForeground(new Color(139, 69, 19));
		separator_1_1_1_4.setBackground(new Color(139, 69, 19));
		separator_1_1_1_4.setBounds(22, 417, 774, 10);
		dogs.add(separator_1_1_1_4);
		
		final JPanel cats = new JPanel();
		cats.setBackground(Color.WHITE);
		tabbedPane_1.addTab("New tab", null, cats, null);
		cats.setLayout(null);
		
		final JButton cat1 = new JButton("");
		cat1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, SystemColor.control, SystemColor.control));
		cat1.setBackground(Color.WHITE);
		cat1.setBounds(49, 35, 130, 130);
		cat1.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				cat1.setBackground(new Color(222, 184, 135));
			}
			public void mouseExited(MouseEvent e) {
				cat1.setBackground(Color.WHITE);
			}
			public void mouseClicked(MouseEvent e) {
			}
		});
		ImageIcon image28 = new ImageIcon(this.getClass().getResource("/rg.png"));
		cat1.setIcon(image28);
		cats.add(cat1);
		
		final JButton cat2 = new JButton("");
		cat2.setBackground(Color.WHITE);
		cat2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, SystemColor.control, SystemColor.control));
		cat2.setBounds(243, 35, 130, 130);
		cat2.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				cat2.setBackground(new Color(222, 184, 135));
			}
			public void mouseExited(MouseEvent e) {
				cat2.setBackground(Color.WHITE);
			}
			public void mouseClicked(MouseEvent e) {
			}
		});
		ImageIcon image29 = new ImageIcon(this.getClass().getResource("/ps1.png"));
		cat2.setIcon(image29);
		cats.add(cat2);
		
		final JButton cat3 = new JButton("");
		cat3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, SystemColor.control, SystemColor.control));
		cat3.setBackground(Color.WHITE);
		cat3.setBounds(429, 35, 130, 130);
		cat3.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				cat3.setBackground(new Color(222, 184, 135));
			}
			public void mouseExited(MouseEvent e) {
				cat3.setBackground(Color.WHITE);
			}
			public void mouseClicked(MouseEvent e) {
			}
		});
		ImageIcon image30 = new ImageIcon(this.getClass().getResource("/ch.png"));
		cat3.setIcon(image30);
		cats.add(cat3);
		
		final JButton cat4 = new JButton("");
		cat4.setBorder(new EtchedBorder(EtchedBorder.LOWERED, SystemColor.control, SystemColor.control));
		cat4.setBackground(Color.WHITE);
		cat4.setBounds(605, 35, 130, 130);
		cat4.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				cat4.setBackground(new Color(222, 184, 135));
			}
			public void mouseExited(MouseEvent e) {
				cat4.setBackground(Color.WHITE);
			}
			public void mouseClicked(MouseEvent e) {
			}
		});
		ImageIcon image31 = new ImageIcon(this.getClass().getResource("/ex.png"));
		cat4.setIcon(image31);
		cats.add(cat4);
		
		final JButton cat5 = new JButton("");
		cat5.setBackground(Color.WHITE);
		cat5.setBorder(new EtchedBorder(EtchedBorder.LOWERED, SystemColor.control, SystemColor.control));
		cat5.setBounds(243, 227, 130, 130);
		cat5.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				cat5.setBackground(new Color(222, 184, 135));
			}
			public void mouseExited(MouseEvent e) {
				cat5.setBackground(Color.WHITE);
			}
			public void mouseClicked(MouseEvent e) {
			}
		});
		ImageIcon image32 = new ImageIcon(this.getClass().getResource("/mc.png"));
		cat5.setIcon(image32);
		cats.add(cat5);
		
		JButton cat6 = new JButton("");
		cat6.setBorder(new EtchedBorder(EtchedBorder.LOWERED, SystemColor.control, SystemColor.control));
		cat6.setBackground(Color.WHITE);
		cat6.setBounds(429, 227, 130, 130);
		ImageIcon image33 = new ImageIcon(this.getClass().getResource("/s.png"));
		cat6.setIcon(image33);
		cats.add(cat6);
		
		JLabel rgd = new JLabel("Ragdoll");
		rgd.setHorizontalTextPosition(SwingConstants.CENTER);
		rgd.setHorizontalAlignment(SwingConstants.CENTER);
		rgd.setForeground(new Color(139, 69, 19));
		rgd.setFont(new Font("Arial", Font.BOLD, 13));
		rgd.setBounds(49, 185, 130, 14);
		cats.add(rgd);
		
		JLabel ps = new JLabel("Persian");
		ps.setHorizontalTextPosition(SwingConstants.CENTER);
		ps.setHorizontalAlignment(SwingConstants.CENTER);
		ps.setForeground(new Color(139, 69, 19));
		ps.setFont(new Font("Arial", Font.BOLD, 13));
		ps.setBounds(243, 185, 130, 14);
		cats.add(ps);
		
		JLabel cx = new JLabel("Chartreux ");
		cx.setHorizontalTextPosition(SwingConstants.CENTER);
		cx.setHorizontalAlignment(SwingConstants.CENTER);
		cx.setForeground(new Color(139, 69, 19));
		cx.setFont(new Font("Arial", Font.BOLD, 13));
		cx.setBounds(429, 185, 130, 14);
		cats.add(cx);
		
		JLabel exsh = new JLabel("Exotic Shorthair ");
		exsh.setHorizontalTextPosition(SwingConstants.CENTER);
		exsh.setHorizontalAlignment(SwingConstants.CENTER);
		exsh.setForeground(new Color(139, 69, 19));
		exsh.setFont(new Font("Arial", Font.BOLD, 13));
		exsh.setBounds(611, 185, 130, 14);
		cats.add(exsh);
		
		JLabel mc = new JLabel("Maine Coon");
		mc.setHorizontalTextPosition(SwingConstants.CENTER);
		mc.setHorizontalAlignment(SwingConstants.CENTER);
		mc.setForeground(new Color(139, 69, 19));
		mc.setFont(new Font("Arial", Font.BOLD, 13));
		mc.setBounds(243, 381, 130, 14);
		cats.add(mc);
		
		JLabel s = new JLabel("Siamese");
		s.setHorizontalTextPosition(SwingConstants.CENTER);
		s.setHorizontalAlignment(SwingConstants.CENTER);
		s.setForeground(new Color(139, 69, 19));
		s.setFont(new Font("Arial", Font.BOLD, 13));
		s.setBounds(429, 381, 130, 14);
		cats.add(s);
		
		final JPanel birds = new JPanel();
		birds.setBackground(Color.WHITE);
		tabbedPane_1.addTab("New tab", null, birds, null);
		birds.setLayout(null);
		
		final JButton bird1 = new JButton("");
		bird1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, SystemColor.control, SystemColor.control));
		bird1.setBackground(Color.WHITE);
		bird1.setBounds(49, 35, 130, 130);
		bird1.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				bird1.setBackground(new Color(222, 184, 135));
			}
			public void mouseExited(MouseEvent e) {
				bird1.setBackground(Color.WHITE);
			}
			public void mouseClicked(MouseEvent e) {
			}
		});
		ImageIcon image34 = new ImageIcon(this.getClass().getResource("/lvb.png"));
		bird1.setIcon(image34);
		birds.add(bird1);
		
		final JButton bird2 = new JButton("");
		bird2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, SystemColor.control, SystemColor.control));
		bird2.setBackground(Color.WHITE);
		bird2.setBounds(243, 35, 130, 130);
		bird2.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				bird2.setBackground(new Color(222, 184, 135));
			}
			public void mouseExited(MouseEvent e) {
				bird2.setBackground(Color.WHITE);
			}
			public void mouseClicked(MouseEvent e) {
			}
		});
		ImageIcon image35 = new ImageIcon(this.getClass().getResource("/cn.png"));
		bird2.setIcon(image35);
		birds.add(bird2);
		
		final JButton bird3 = new JButton("");
		bird3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, SystemColor.control, SystemColor.control));
		bird3.setBackground(Color.WHITE);
		bird3.setBounds(429, 35, 130, 130);
		bird3.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				bird3.setBackground(new Color(222, 184, 135));
			}
			public void mouseExited(MouseEvent e) {
				bird3.setBackground(Color.WHITE);
			}
			public void mouseClicked(MouseEvent e) {
			}
		});
		ImageIcon image36 = new ImageIcon(this.getClass().getResource("/pks.png"));
		bird3.setIcon(image36);
		birds.add(bird3);
		
		JLabel lovebird = new JLabel("Lovebirds");
		lovebird.setHorizontalTextPosition(SwingConstants.CENTER);
		lovebird.setHorizontalAlignment(SwingConstants.CENTER);
		lovebird.setForeground(new Color(139, 69, 19));
		lovebird.setFont(new Font("Arial", Font.BOLD, 13));
		lovebird.setBounds(49, 185, 130, 14);
		birds.add(lovebird);
		
		JLabel canary = new JLabel("Canaries");
		canary.setHorizontalTextPosition(SwingConstants.CENTER);
		canary.setHorizontalAlignment(SwingConstants.CENTER);
		canary.setForeground(new Color(139, 69, 19));
		canary.setFont(new Font("Arial", Font.BOLD, 13));
		canary.setBounds(243, 185, 130, 14);
		birds.add(canary);
		
		JLabel parakeet = new JLabel("Parakeets");
		parakeet.setHorizontalTextPosition(SwingConstants.CENTER);
		parakeet.setHorizontalAlignment(SwingConstants.CENTER);
		parakeet.setForeground(new Color(139, 69, 19));
		parakeet.setFont(new Font("Arial", Font.BOLD, 13));
		parakeet.setBounds(429, 185, 130, 14);
		birds.add(parakeet);
		
		final JPanel fishes = new JPanel();
		fishes.setBackground(Color.WHITE);
		tabbedPane_1.addTab("New tab", null, fishes, null);
		fishes.setLayout(null);
		
		final JButton fish1 = new JButton("");
		fish1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, SystemColor.control, SystemColor.control));
		fish1.setBackground(Color.WHITE);
		fish1.setBounds(49, 35, 130, 130);
		fish1.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				fish1.setBackground(new Color(222, 184, 135));
			}
			public void mouseExited(MouseEvent e) {
				fish1.setBackground(Color.WHITE);
			}
			public void mouseClicked(MouseEvent e) {
			}
		});
		ImageIcon image37 = new ImageIcon(this.getClass().getResource("/gf.png"));
		fish1.setIcon(image37);
		fishes.add(fish1);
		
		final JButton fish2 = new JButton("");
		fish2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, SystemColor.control, SystemColor.control));
		fish2.setBackground(Color.WHITE);
		fish2.setBounds(243, 35, 130, 130);
		fish2.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				fish2.setBackground(new Color(222, 184, 135));
			}
			public void mouseExited(MouseEvent e) {
				fish2.setBackground(Color.WHITE);
			}
			public void mouseClicked(MouseEvent e) {
			}
		});
		ImageIcon image38 = new ImageIcon(this.getClass().getResource("/cf.png"));
		fish2.setIcon(image38);
		fishes.add(fish2);
		
		final JButton fish3 = new JButton("");
		fish3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, SystemColor.control, SystemColor.control));
		fish3.setBackground(Color.WHITE);
		fish3.setBounds(429, 35, 130, 130);
		fish3.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				fish3.setBackground(new Color(222, 184, 135));
			}
			public void mouseExited(MouseEvent e) {
				fish3.setBackground(Color.WHITE);
			}
			public void mouseClicked(MouseEvent e) {
			}
		});
		ImageIcon image39 = new ImageIcon(this.getClass().getResource("/af.png"));
		fish3.setIcon(image39);
		fishes.add(fish3);
		
		final JButton fish4 = new JButton("");
		fish4.setBorder(new EtchedBorder(EtchedBorder.LOWERED, SystemColor.control, SystemColor.control));
		fish4.setBackground(Color.WHITE);
		fish4.setBounds(610, 38, 130, 130);
		fish4.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				fish4.setBackground(new Color(222, 184, 135));
			}
			public void mouseExited(MouseEvent e) {
				fish4.setBackground(Color.WHITE);
			}
			public void mouseClicked(MouseEvent e) {
			}
		});
		ImageIcon image40 = new ImageIcon(this.getClass().getResource("/m.png"));
		fish4.setIcon(image40);
		fishes.add(fish4);
		
		JButton fish5 = new JButton("");
		fish5.setBorder(new EtchedBorder(EtchedBorder.LOWERED, SystemColor.control, SystemColor.control));
		fish5.setBackground(Color.WHITE);
		fish5.setBounds(321, 237, 130, 130);
		ImageIcon image41 = new ImageIcon(this.getClass().getResource("/tb.png"));
		fish5.setIcon(image41);
		fishes.add(fish5);
		
		JLabel gf = new JLabel("Goldfish");
		gf.setHorizontalTextPosition(SwingConstants.CENTER);
		gf.setHorizontalAlignment(SwingConstants.CENTER);
		gf.setForeground(new Color(139, 69, 19));
		gf.setFont(new Font("Arial", Font.BOLD, 13));
		gf.setBounds(49, 185, 130, 14);
		fishes.add(gf);
		
		JLabel cf = new JLabel("Clown Fish");
		cf.setHorizontalTextPosition(SwingConstants.CENTER);
		cf.setHorizontalAlignment(SwingConstants.CENTER);
		cf.setForeground(new Color(139, 69, 19));
		cf.setFont(new Font("Arial", Font.BOLD, 13));
		cf.setBounds(243, 185, 130, 14);
		fishes.add(cf);
		
		JLabel af = new JLabel("Angelfish");
		af.setHorizontalTextPosition(SwingConstants.CENTER);
		af.setHorizontalAlignment(SwingConstants.CENTER);
		af.setForeground(new Color(139, 69, 19));
		af.setFont(new Font("Arial", Font.BOLD, 13));
		af.setBounds(429, 185, 130, 14);
		fishes.add(af);
		
		JLabel ml = new JLabel("Mollies");
		ml.setHorizontalTextPosition(SwingConstants.CENTER);
		ml.setHorizontalAlignment(SwingConstants.CENTER);
		ml.setForeground(new Color(139, 69, 19));
		ml.setFont(new Font("Arial", Font.BOLD, 13));
		ml.setBounds(611, 185, 130, 14);
		fishes.add(ml);
		
		JLabel tb = new JLabel("Tiger Barbs");
		tb.setHorizontalTextPosition(SwingConstants.CENTER);
		tb.setHorizontalAlignment(SwingConstants.CENTER);
		tb.setForeground(new Color(139, 69, 19));
		tb.setFont(new Font("Arial", Font.BOLD, 13));
		tb.setBounds(321, 388, 130, 14);
		fishes.add(tb);
		
		
		final JButton Dog = new JButton();
		Dog.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				Dog.setBackground(new Color(184, 134, 11));
				tabbedPane_1.setVisible(true);
				tabbedPane_1.setSelectedIndex(0);
			}
			public void mouseExited(MouseEvent e) {
				Dog.setBackground(Color.WHITE);
			}
			public void mouseClicked(MouseEvent e) {
				tabbedPane_1.setSelectedIndex(0);
				tabbedPane_1.setVisible(true);
			}
		});
		Dog.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(240, 240, 240), new Color(240, 240, 240)));
		Dog.setBackground(Color.WHITE);
		Dog.setBounds(20, 90, 114, 95);
		ImageIcon image17 = new ImageIcon(this.getClass().getResource("/dogg.png"));
		Dog.setIcon(image17);
		ppanel.add(Dog);
		
		final JButton Cat = new JButton();
		Cat.setBorder(new EtchedBorder(EtchedBorder.LOWERED, SystemColor.control, SystemColor.control));
		Cat.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				Cat.setBackground(new Color(184, 134, 11));
				tabbedPane_1.setVisible(true);
				tabbedPane_1.setSelectedIndex(1);
			}
			public void mouseExited(MouseEvent e) {
				Cat.setBackground(Color.WHITE);
			}
			public void mouseClicked(MouseEvent e) {
				tabbedPane_1.setSelectedIndex(1);
				tabbedPane_1.setVisible(true);
			}
		});
		Cat.setBackground(Color.WHITE);
		Cat.setBounds(163, 90, 114, 95);
		ImageIcon image18 = new ImageIcon(this.getClass().getResource("/cat.png"));
		Cat.setIcon(image18);
		ppanel.add(Cat);
		
		final JButton Bird = new JButton();
		Bird.setBorder(new EtchedBorder(EtchedBorder.LOWERED, SystemColor.control, SystemColor.control));
		Bird.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				Bird.setBackground(new Color(184, 134, 11));
				tabbedPane_1.setVisible(true);
				tabbedPane_1.setSelectedIndex(2);
			}
			public void mouseExited(MouseEvent e) {
				Bird.setBackground(Color.WHITE);
			}
			public void mouseClicked(MouseEvent e) {
				tabbedPane_1.setSelectedIndex(2);
				tabbedPane_1.setVisible(true);
			}
		});
		Bird.setBackground(Color.WHITE);
		Bird.setBounds(307, 90, 114, 95);
		ImageIcon image19 = new ImageIcon(this.getClass().getResource("/bird.png"));
		Bird.setIcon(image19);
		ppanel.add(Bird);
		
		final JButton Fish = new JButton();
		Fish.setBorder(new EtchedBorder(EtchedBorder.LOWERED, SystemColor.control, SystemColor.control));
		Fish.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				Fish.setBackground(new Color(184, 134, 11));
				tabbedPane_1.setVisible(true);
				tabbedPane_1.setSelectedIndex(3);
			}
			public void mouseExited(MouseEvent e) {
				Fish.setBackground(Color.WHITE);
			}
			public void mouseClicked(MouseEvent e) {
				tabbedPane_1.setSelectedIndex(3);
				tabbedPane_1.setVisible(true);
			}
		});
		Fish.setBackground(Color.WHITE);
		Fish.setBounds(453, 90, 114, 95);
		ImageIcon image20 = new ImageIcon(this.getClass().getResource("/fish.png"));
		Fish.setIcon(image20);
		ppanel.add(Fish);
		
		JLabel design1 = new JLabel("");
		design1.setBounds(0, 0, 829, 230);
		ImageIcon image27 = new ImageIcon(this.getClass().getResource("/design.png"));
		design1.setIcon(image27);
		ppanel.add(design1);
		
		final JPanel foodpanel = new JPanel();
		tabbedPane.addTab("New tab", null, foodpanel, null);
		foodpanel.setLayout(null);
		
		final JPanel fpanel = new JPanel();
		fpanel.setLayout(null);
		fpanel.setBackground(Color.WHITE);
		fpanel.setBounds(162, 21, 829, 687);
		fpanel.setVisible(false);
		foodpanel.add(fpanel);
		
		final JLabel lblFood = new JLabel("FOOD");
		lblFood.setForeground(new Color(139, 69, 19));
		lblFood.setFont(new Font("Bauhaus 93", Font.BOLD, 57));
		lblFood.setBounds(20, 21, 194, 58);
		fpanel.add(lblFood);
		
		final JButton food1 = new JButton("");
		food1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, SystemColor.control, SystemColor.control));
		food1.setBackground(Color.WHITE);
		food1.setBounds(50, 171, 130, 130);
		food1.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				food1.setBackground(new Color(222, 184, 135));
			}
			public void mouseExited(MouseEvent e) {
				food1.setBackground(Color.WHITE);
			}
			public void mouseClicked(MouseEvent e) {
			}
		});
		ImageIcon image43 = new ImageIcon(this.getClass().getResource("/df.png"));
		food1.setIcon(image43);
		fpanel.add(food1);
		
		final JButton food2 = new JButton("");
		food2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, SystemColor.control, SystemColor.control));
		food2.setBackground(Color.WHITE);
		food2.setBounds(227, 171, 130, 130);
		food2.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				food2.setBackground(new Color(222, 184, 135));
			}
			public void mouseExited(MouseEvent e) {
				food2.setBackground(Color.WHITE);
			}
			public void mouseClicked(MouseEvent e) {
			}
		});
		ImageIcon image44 = new ImageIcon(this.getClass().getResource("/cfood.png"));
		food2.setIcon(image44);
		fpanel.add(food2);
		
		final JButton food3 = new JButton("");
		food3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, SystemColor.control, SystemColor.control));
		food3.setBackground(Color.WHITE);
		food3.setBounds(395, 171, 130, 130);
		food3.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				food3.setBackground(new Color(222, 184, 135));
			}
			public void mouseExited(MouseEvent e) {
				food3.setBackground(Color.WHITE);
			}
			public void mouseClicked(MouseEvent e) {
			}
		});
		ImageIcon image45 = new ImageIcon(this.getClass().getResource("/bf.png"));
		food3.setIcon(image45);
		fpanel.add(food3);
		
		final JButton food4 = new JButton("");
		food4.setBorder(new EtchedBorder(EtchedBorder.LOWERED, SystemColor.control, SystemColor.control));
		food4.setBackground(Color.WHITE);
		food4.setBounds(569, 171, 130, 130);
		food4.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				food4.setBackground(new Color(222, 184, 135));
			}
			public void mouseExited(MouseEvent e) {
				food4.setBackground(Color.WHITE);
			}
			public void mouseClicked(MouseEvent e) {
			}
		});
		ImageIcon image46 = new ImageIcon(this.getClass().getResource("/ff2.png"));
		food4.setIcon(image46);
		fpanel.add(food4);

		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(139, 69, 19));
		separator_1.setBackground(new Color(139, 69, 19));
		separator_1.setBounds(20, 123, 774, 10);
		fpanel.add(separator_1);
		
		JLabel df = new JLabel("Dog Food");
		df.setHorizontalTextPosition(SwingConstants.CENTER);
		df.setHorizontalAlignment(SwingConstants.CENTER);
		df.setForeground(new Color(139, 69, 19));
		df.setFont(new Font("Arial", Font.BOLD, 13));
		df.setBounds(50, 332, 130, 14);
		fpanel.add(df);
		
		JLabel cfood = new JLabel("Cat Food");
		cfood.setHorizontalTextPosition(SwingConstants.CENTER);
		cfood.setHorizontalAlignment(SwingConstants.CENTER);
		cfood.setForeground(new Color(139, 69, 19));
		cfood.setFont(new Font("Arial", Font.BOLD, 13));
		cfood.setBounds(227, 332, 130, 14);
		fpanel.add(cfood);
		
		JLabel bf = new JLabel("Bird Food");
		bf.setHorizontalTextPosition(SwingConstants.CENTER);
		bf.setHorizontalAlignment(SwingConstants.CENTER);
		bf.setForeground(new Color(139, 69, 19));
		bf.setFont(new Font("Arial", Font.BOLD, 13));
		bf.setBounds(395, 332, 130, 14);
		fpanel.add(bf);
		
		JLabel ff = new JLabel("Fish Food");
		ff.setHorizontalTextPosition(SwingConstants.CENTER);
		ff.setHorizontalAlignment(SwingConstants.CENTER);
		ff.setForeground(new Color(139, 69, 19));
		ff.setFont(new Font("Arial", Font.BOLD, 13));
		ff.setBounds(569, 332, 130, 14);
		fpanel.add(ff);
		
		JLabel design2 = new JLabel("");
		design2.setBounds(0, -108, 829, 230);
		ImageIcon image60 = new ImageIcon(this.getClass().getResource("/design.png"));
		design2.setIcon(image60);
		fpanel.add(design2);
		
		JSeparator separator_1_1_1_3 = new JSeparator();
		separator_1_1_1_3.setForeground(new Color(139, 69, 19));
		separator_1_1_1_3.setBackground(new Color(139, 69, 19));
		separator_1_1_1_3.setBounds(20, 666, 774, 10);
		fpanel.add(separator_1_1_1_3);
		
		JPanel vitapanel = new JPanel();
		tabbedPane.addTab("New tab", null, vitapanel, null);
		vitapanel.setLayout(null);
		
		final JPanel vpanel = new JPanel();
		vpanel.setLayout(null);
		vpanel.setBackground(Color.WHITE);
		vpanel.setBounds(162, 21, 829, 687);
		vitapanel.add(vpanel);
		
		JLabel lblVitamins = new JLabel("VITAMINS");
		lblVitamins.setForeground(new Color(139, 69, 19));
		lblVitamins.setFont(new Font("Bauhaus 93", Font.BOLD, 57));
		lblVitamins.setBounds(20, 21, 373, 58);
		vpanel.add(lblVitamins);
		
		final JButton v1 = new JButton("");
		v1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, SystemColor.control, SystemColor.control));
		v1.setBackground(Color.WHITE);
		v1.setBounds(50, 171, 130, 130);
		v1.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				v1.setBackground(new Color(222, 184, 135));
			}
			public void mouseExited(MouseEvent e) {
				v1.setBackground(Color.WHITE);
			}
			public void mouseClicked(MouseEvent e) {
			}
		});
		ImageIcon image47 = new ImageIcon(this.getClass().getResource("/dv.png"));
		v1.setIcon(image47);
		vpanel.add(v1);
		
		final JButton v2 = new JButton("");
		v2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, SystemColor.control, SystemColor.control));
		v2.setBackground(Color.WHITE);
		v2.setBounds(227, 171, 130, 130);
		v2.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				v2.setBackground(new Color(222, 184, 135));
			}
			public void mouseExited(MouseEvent e) {
				v2.setBackground(Color.WHITE);
			}
			public void mouseClicked(MouseEvent e) {
			}
		});
		ImageIcon image48 = new ImageIcon(this.getClass().getResource("/cv.png"));
		v2.setIcon(image48);
		vpanel.add(v2);
		
		final JButton v3 = new JButton("");
		v3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, SystemColor.control, SystemColor.control));
		v3.setBackground(Color.WHITE);
		v3.setBounds(395, 171, 130, 130);
		v3.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				v3.setBackground(new Color(222, 184, 135));
			}
			public void mouseExited(MouseEvent e) {
				v3.setBackground(Color.WHITE);
			}
			public void mouseClicked(MouseEvent e) {
			}
		});
		ImageIcon image49 = new ImageIcon(this.getClass().getResource("/bv.png"));
		v3.setIcon(image49);
		vpanel.add(v3);
		
		final JButton v4 = new JButton("");
		v4.setBorder(new EtchedBorder(EtchedBorder.LOWERED, SystemColor.control, SystemColor.control));
		v4.setBackground(Color.WHITE);
		v4.setBounds(569, 171, 130, 130);
		v4.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				v4.setBackground(new Color(222, 184, 135));
			}
			public void mouseExited(MouseEvent e) {
				v4.setBackground(Color.WHITE);
			}
			public void mouseClicked(MouseEvent e) {
			}
		});
		ImageIcon image50 = new ImageIcon(this.getClass().getResource("/fv.png"));
		v4.setIcon(image50);
		vpanel.add(v4);
		
		final JButton v5 = new JButton("");
		v5.setBorder(new EtchedBorder(EtchedBorder.LOWERED, SystemColor.control, SystemColor.control));
		v5.setBackground(Color.WHITE);
		v5.setBounds(313, 403, 130, 130);
		v5.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				v5.setBackground(new Color(222, 184, 135));
			}
			public void mouseExited(MouseEvent e) {
				v5.setBackground(Color.WHITE);
			}
			public void mouseClicked(MouseEvent e) {
			}
		});
		ImageIcon image51 = new ImageIcon(this.getClass().getResource("/pv.png"));
		v5.setIcon(image51);
		vpanel.add(v5);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setForeground(new Color(139, 69, 19));
		separator_1_1.setBackground(new Color(139, 69, 19));
		separator_1_1.setBounds(20, 123, 774, 10);
		vpanel.add(separator_1_1);
		
		JLabel lblDogMultivitaminSupplement = new JLabel("Dog Multivitamin");
		lblDogMultivitaminSupplement.setHorizontalTextPosition(SwingConstants.CENTER);
		lblDogMultivitaminSupplement.setHorizontalAlignment(SwingConstants.CENTER);
		lblDogMultivitaminSupplement.setForeground(new Color(139, 69, 19));
		lblDogMultivitaminSupplement.setFont(new Font("Arial", Font.BOLD, 13));
		lblDogMultivitaminSupplement.setBounds(50, 330, 130, 14);
		vpanel.add(lblDogMultivitaminSupplement);
		
		JLabel lblCatMultivitamin = new JLabel("Cat Multivitamin");
		lblCatMultivitamin.setHorizontalTextPosition(SwingConstants.CENTER);
		lblCatMultivitamin.setHorizontalAlignment(SwingConstants.CENTER);
		lblCatMultivitamin.setForeground(new Color(139, 69, 19));
		lblCatMultivitamin.setFont(new Font("Arial", Font.BOLD, 13));
		lblCatMultivitamin.setBounds(227, 330, 130, 14);
		vpanel.add(lblCatMultivitamin);
		
		JLabel lblBirdMultivitamin = new JLabel("Bird Multivitamin");
		lblBirdMultivitamin.setHorizontalTextPosition(SwingConstants.CENTER);
		lblBirdMultivitamin.setHorizontalAlignment(SwingConstants.CENTER);
		lblBirdMultivitamin.setForeground(new Color(139, 69, 19));
		lblBirdMultivitamin.setFont(new Font("Arial", Font.BOLD, 13));
		lblBirdMultivitamin.setBounds(395, 330, 130, 14);
		vpanel.add(lblBirdMultivitamin);
		
		JLabel lblFishMultivitamin = new JLabel("Fish Multivitamin");
		lblFishMultivitamin.setHorizontalTextPosition(SwingConstants.CENTER);
		lblFishMultivitamin.setHorizontalAlignment(SwingConstants.CENTER);
		lblFishMultivitamin.setForeground(new Color(139, 69, 19));
		lblFishMultivitamin.setFont(new Font("Arial", Font.BOLD, 13));
		lblFishMultivitamin.setBounds(569, 330, 130, 14);
		vpanel.add(lblFishMultivitamin);
		
		JLabel lblSupplement = new JLabel("Syrup");
		lblSupplement.setHorizontalTextPosition(SwingConstants.CENTER);
		lblSupplement.setHorizontalAlignment(SwingConstants.CENTER);
		lblSupplement.setForeground(new Color(139, 69, 19));
		lblSupplement.setFont(new Font("Arial", Font.BOLD, 13));
		lblSupplement.setBounds(50, 356, 130, 14);
		vpanel.add(lblSupplement);
		
		JLabel lblSyrup = new JLabel("Syrup");
		lblSyrup.setHorizontalTextPosition(SwingConstants.CENTER);
		lblSyrup.setHorizontalAlignment(SwingConstants.CENTER);
		lblSyrup.setForeground(new Color(139, 69, 19));
		lblSyrup.setFont(new Font("Arial", Font.BOLD, 13));
		lblSyrup.setBounds(227, 355, 130, 14);
		vpanel.add(lblSyrup);
		
		JLabel lblDrops_1 = new JLabel("Drops");
		lblDrops_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblDrops_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDrops_1.setForeground(new Color(139, 69, 19));
		lblDrops_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblDrops_1.setBounds(395, 355, 130, 14);
		vpanel.add(lblDrops_1);
		
		JLabel lblDrops = new JLabel("Drops");
		lblDrops.setHorizontalTextPosition(SwingConstants.CENTER);
		lblDrops.setHorizontalAlignment(SwingConstants.CENTER);
		lblDrops.setForeground(new Color(139, 69, 19));
		lblDrops.setFont(new Font("Arial", Font.BOLD, 13));
		lblDrops.setBounds(569, 355, 130, 14);
		vpanel.add(lblDrops);
		
		JLabel lblLcVitMultivitamin = new JLabel("LC- Vit Multivitamin");
		lblLcVitMultivitamin.setHorizontalTextPosition(SwingConstants.CENTER);
		lblLcVitMultivitamin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLcVitMultivitamin.setForeground(new Color(139, 69, 19));
		lblLcVitMultivitamin.setFont(new Font("Arial", Font.BOLD, 13));
		lblLcVitMultivitamin.setBounds(313, 551, 130, 14);
		vpanel.add(lblLcVitMultivitamin);
		
		JLabel lblSupplement_1 = new JLabel("Syrup");
		lblSupplement_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblSupplement_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSupplement_1.setForeground(new Color(139, 69, 19));
		lblSupplement_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblSupplement_1.setBounds(313, 576, 130, 14);
		vpanel.add(lblSupplement_1);
		
		JLabel design3 = new JLabel("");
		design3.setBounds(0, -107, 829, 230);
		ImageIcon image61 = new ImageIcon(this.getClass().getResource("/design.png"));
		design3.setIcon(image61);
		vpanel.add(design3);
		
		JSeparator separator_1_1_1_2 = new JSeparator();
		separator_1_1_1_2.setForeground(new Color(139, 69, 19));
		separator_1_1_1_2.setBackground(new Color(139, 69, 19));
		separator_1_1_1_2.setBounds(20, 666, 774, 10);
		vpanel.add(separator_1_1_1_2);
		
		JPanel toypanel = new JPanel();
		tabbedPane.addTab("New tab", null, toypanel, null);
		toypanel.setLayout(null);
		
		final JPanel tpanel = new JPanel();
		tpanel.setLayout(null);
		tpanel.setBackground(Color.WHITE);
		tpanel.setBounds(162, 21, 829, 687);
		toypanel.add(tpanel);
		
		JLabel lblToysAndAccessories = new JLabel("TOYS AND ACCESSORIES");
		lblToysAndAccessories.setForeground(new Color(139, 69, 19));
		lblToysAndAccessories.setFont(new Font("Bauhaus 93", Font.BOLD, 57));
		lblToysAndAccessories.setBounds(20, 21, 708, 58);
		tpanel.add(lblToysAndAccessories);
		
		final JButton t1 = new JButton("");
		t1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, SystemColor.control, SystemColor.control));
		t1.setBackground(Color.WHITE);
		t1.setBounds(50, 171, 130, 130);
		t1.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				t1.setBackground(new Color(222, 184, 135));
			}
			public void mouseExited(MouseEvent e) {
				t1.setBackground(Color.WHITE);
			}
			public void mouseClicked(MouseEvent e) {
			}
		});
		ImageIcon image54 = new ImageIcon(this.getClass().getResource("/collar.png"));
		t1.setIcon(image54);
		tpanel.add(t1);
		
		final JButton t2 = new JButton("");
		t2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, SystemColor.control, SystemColor.control));
		t2.setBackground(Color.WHITE);
		t2.setBounds(227, 171, 130, 130);
		t2.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				t2.setBackground(new Color(222, 184, 135));
			}
			public void mouseExited(MouseEvent e) {
				t2.setBackground(Color.WHITE);
			}
			public void mouseClicked(MouseEvent e) {
			}
		});
		ImageIcon image55 = new ImageIcon(this.getClass().getResource("/leash.png"));
		t2.setIcon(image55);
		tpanel.add(t2);
		
		final JButton t3 = new JButton("");
		t3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, SystemColor.control, SystemColor.control));
		t3.setBackground(Color.WHITE);
		t3.setBounds(395, 171, 130, 130);
		t3.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				t3.setBackground(new Color(222, 184, 135));
			}
			public void mouseExited(MouseEvent e) {
				t3.setBackground(Color.WHITE);
			}
			public void mouseClicked(MouseEvent e) {
			}
		});
		ImageIcon image56 = new ImageIcon(this.getClass().getResource("/toys.png"));
		t3.setIcon(image56);
		tpanel.add(t3);
		
		final JButton t4 = new JButton("");
		t4.setBorder(new EtchedBorder(EtchedBorder.LOWERED, SystemColor.control, SystemColor.control));
		t4.setBackground(Color.WHITE);
		t4.setBounds(569, 171, 130, 130);
		t4.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				t4.setBackground(new Color(222, 184, 135));
			}
			public void mouseExited(MouseEvent e) {
				t4.setBackground(Color.WHITE);
			}
			public void mouseClicked(MouseEvent e) {
			}
		});
		ImageIcon image57 = new ImageIcon(this.getClass().getResource("/bed.png"));
		t4.setIcon(image57);
		tpanel.add(t4);
		
		final JButton t5 = new JButton("");
		t5.setBorder(new EtchedBorder(EtchedBorder.LOWERED, SystemColor.control, SystemColor.control));
		t5.setBackground(Color.WHITE);
		t5.setBounds(227, 403, 130, 130);
		t5.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				t5.setBackground(new Color(222, 184, 135));
			}
			public void mouseExited(MouseEvent e) {
				t5.setBackground(Color.WHITE);
			}
			public void mouseClicked(MouseEvent e) {
			}
		});
		ImageIcon image58 = new ImageIcon(this.getClass().getResource("/fishbowl.png"));
		t5.setIcon(image58);
		tpanel.add(t5);
		
		final JButton t6 = new JButton("");
		t6.setBorder(new EtchedBorder(EtchedBorder.LOWERED, SystemColor.control, SystemColor.control));
		t6.setBackground(Color.WHITE);
		t6.setBounds(395, 403, 130, 130);
		t6.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				t6.setBackground(new Color(222, 184, 135));
			}
			public void mouseExited(MouseEvent e) {
				t6.setBackground(Color.WHITE);
			}
			public void mouseClicked(MouseEvent e) {
			}
		});
		ImageIcon image59 = new ImageIcon(this.getClass().getResource("/treestand.png"));
		t6.setIcon(image59);
		tpanel.add(t6);
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setForeground(new Color(139, 69, 19));
		separator_1_1_1.setBackground(new Color(139, 69, 19));
		separator_1_1_1.setBounds(20, 123, 774, 10);
		tpanel.add(separator_1_1_1);
		
		JLabel pc = new JLabel("Pet Collar");
		pc.setHorizontalTextPosition(SwingConstants.CENTER);
		pc.setHorizontalAlignment(SwingConstants.CENTER);
		pc.setForeground(new Color(139, 69, 19));
		pc.setFont(new Font("Arial", Font.BOLD, 13));
		pc.setBounds(50, 330, 130, 14);
		tpanel.add(pc);
		
		JLabel pl = new JLabel("Pet Leash");
		pl.setHorizontalTextPosition(SwingConstants.CENTER);
		pl.setHorizontalAlignment(SwingConstants.CENTER);
		pl.setForeground(new Color(139, 69, 19));
		pl.setFont(new Font("Arial", Font.BOLD, 13));
		pl.setBounds(227, 330, 130, 14);
		tpanel.add(pl);
		
		JLabel ct = new JLabel("Chew Toys");
		ct.setHorizontalTextPosition(SwingConstants.CENTER);
		ct.setHorizontalAlignment(SwingConstants.CENTER);
		ct.setForeground(new Color(139, 69, 19));
		ct.setFont(new Font("Arial", Font.BOLD, 13));
		ct.setBounds(395, 330, 130, 14);
		tpanel.add(ct);
		
		JLabel pb = new JLabel("Pet Bed/ Couch");
		pb.setHorizontalTextPosition(SwingConstants.CENTER);
		pb.setHorizontalAlignment(SwingConstants.CENTER);
		pb.setForeground(new Color(139, 69, 19));
		pb.setFont(new Font("Arial", Font.BOLD, 13));
		pb.setBounds(569, 330, 130, 14);
		tpanel.add(pb);
		
		JLabel fbowl = new JLabel("Fish Bowl");
		fbowl.setHorizontalTextPosition(SwingConstants.CENTER);
		fbowl.setHorizontalAlignment(SwingConstants.CENTER);
		fbowl.setForeground(new Color(139, 69, 19));
		fbowl.setFont(new Font("Arial", Font.BOLD, 13));
		fbowl.setBounds(227, 551, 130, 14);
		tpanel.add(fbowl);
		
		JLabel ts = new JLabel("Java Tree Stand");
		ts.setHorizontalTextPosition(SwingConstants.CENTER);
		ts.setHorizontalAlignment(SwingConstants.CENTER);
		ts.setForeground(new Color(139, 69, 19));
		ts.setFont(new Font("Arial", Font.BOLD, 13));
		ts.setBounds(395, 551, 130, 14);
		tpanel.add(ts);
		
		JLabel design4 = new JLabel("");
		design4.setBounds(0, -107, 829, 230);
		ImageIcon image62 = new ImageIcon(this.getClass().getResource("/design.png"));
		design4.setIcon(image62);
		tpanel.add(design4);
		
		JSeparator separator_1_1_1_1 = new JSeparator();
		separator_1_1_1_1.setForeground(new Color(139, 69, 19));
		separator_1_1_1_1.setBackground(new Color(139, 69, 19));
		separator_1_1_1_1.setBounds(20, 666, 774, 10);
		tpanel.add(separator_1_1_1_1);
		
		final JButton Home = new JButton();
		Home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Home.setBounds(0, 119, 148, 87);
		Home.setBackground(Color.WHITE);
		Home.setForeground(Color.GRAY);
		Home.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		Home.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255)));
		ImageIcon image11 = new ImageIcon(this.getClass().getResource("/home1.png"));
		Home.setIcon(image11);
		Home.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				Home.setBackground(new Color(255,222,173));
				btnMinimize2.setBackground(new Color(255, 229, 182));
				btnClose2.setBackground(new Color(255, 229, 182));
				btnMinimize2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 229, 182), new Color(255, 229, 182)));
				btnClose2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 229, 182), new Color(255, 229, 182)));
				hpanel.setVisible(true);
				receipt.setVisible(false);
				tabbedPane.setSelectedIndex(0);
			}
			public void mouseExited(MouseEvent e) {
				Home.setBackground(Color.WHITE);
			}
			public void mouseClicked(MouseEvent e) {
				receipt.setVisible(false);
				hpanel.setVisible(true);
				tabbedPane.setSelectedIndex(0);
				btnMinimize2.setBackground(new Color(255, 229, 182));
				btnClose2.setBackground(new Color(255, 229, 182));
				btnMinimize2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 229, 182), new Color(255, 229, 182)));
				btnClose2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 229, 182), new Color(255, 229, 182)));
			}
		});
		panel_1.add(Home);
		
		final JButton Pets = new JButton();
		Pets.setBounds(0, 206, 148, 87);
		Pets.setVerticalAlignment(SwingConstants.CENTER);
		Pets.setBackground(Color.WHITE);
		Pets.setForeground(Color.GRAY);
		Pets.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		Pets.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255)));
		ImageIcon image12 = new ImageIcon(this.getClass().getResource("/pets1.png"));
		Pets.setIcon(image12);
		Pets.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				Pets.setBackground(new Color(255,222,173));
				btnMinimize2.setBackground(SystemColor.control);
				btnClose2.setBackground(SystemColor.control);
				btnMinimize2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, SystemColor.control, SystemColor.control));
				btnClose2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, SystemColor.control, SystemColor.control));
				ppanel.setVisible(true);
				tabbedPane.setSelectedIndex(1);
			}
			public void mouseExited(MouseEvent e) {
				Pets.setBackground(Color.WHITE);
			}
			public void mouseClicked(MouseEvent e) {
				receipt.setVisible(true);
				ppanel.setVisible(true);
				tabbedPane.setSelectedIndex(1);
				btnMinimize2.setBackground(Color.WHITE);
				btnClose2.setBackground(Color.WHITE);
				btnMinimize2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.WHITE, Color.WHITE));
				btnClose2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.WHITE, Color.WHITE));
				
			}
		});
		panel_1.add(Pets);
		
		final JButton Food = new JButton();
		Food.setBounds(0, 293, 148, 87);
		Food.setVerticalAlignment(SwingConstants.CENTER);
		Food.setBackground(Color.WHITE);
		Food.setForeground(Color.GRAY);
		Food.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		Food.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255)));
		ImageIcon image13 = new ImageIcon(this.getClass().getResource("/Food1.png"));
		Food.setIcon(image13);
		Food.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				Food.setBackground(new Color(255,222,173));
				btnMinimize2.setBackground(SystemColor.control);
				btnClose2.setBackground(SystemColor.control);
				btnMinimize2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, SystemColor.control, SystemColor.control));
				btnClose2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, SystemColor.control, SystemColor.control));
				fpanel.setVisible(true);
				tabbedPane.setSelectedIndex(2);
			}
			public void mouseExited(MouseEvent e) {
				Food.setBackground(Color.WHITE);
			}
			public void mouseClicked(MouseEvent e) {
				receipt.setVisible(true);
				fpanel.setVisible(true);
				tabbedPane.setSelectedIndex(2);
				btnMinimize2.setBackground(Color.WHITE);
				btnClose2.setBackground(Color.WHITE);
				btnMinimize2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.WHITE, Color.WHITE));
				btnClose2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.WHITE, Color.WHITE));
			}
		});
		panel_1.add(Food);
		
		final JButton Vitamins = new JButton();
		Vitamins.setBounds(0, 380, 148, 87);
		Vitamins.setVerticalAlignment(SwingConstants.CENTER);
		Vitamins.setBackground(Color.WHITE);
		Vitamins.setForeground(Color.GRAY);
		Vitamins.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		Vitamins.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255)));
		ImageIcon image14 = new ImageIcon(this.getClass().getResource("/Vitamin1.png"));
		Vitamins.setIcon(image14);
		Vitamins.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				Vitamins.setBackground(new Color(255,222,173));
				btnMinimize2.setBackground(SystemColor.control);
				btnClose2.setBackground(SystemColor.control);
				btnMinimize2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, SystemColor.control, SystemColor.control));
				btnClose2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, SystemColor.control, SystemColor.control));
				vpanel.setVisible(true);
				tabbedPane.setSelectedIndex(3);
			}
			public void mouseExited(MouseEvent e) {
				Vitamins.setBackground(Color.WHITE);
			}
			public void mouseClicked(MouseEvent e) {
				receipt.setVisible(true);
				vpanel.setVisible(true);
				tabbedPane.setSelectedIndex(3);
				btnMinimize2.setBackground(Color.WHITE);
				btnClose2.setBackground(Color.WHITE);
				btnMinimize2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.WHITE, Color.WHITE));
				btnClose2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.WHITE, Color.WHITE));
			}
		});
		panel_1.add(Vitamins);
		
		final JButton ToysandAccessories = new JButton();
		ToysandAccessories.setToolTipText("");
		ToysandAccessories.setBounds(0, 467, 148, 87);
		ToysandAccessories.setVerticalAlignment(SwingConstants.CENTER);
		ToysandAccessories.setBackground(Color.WHITE);
		ToysandAccessories.setForeground(Color.GRAY);
		ToysandAccessories.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		ToysandAccessories.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255)));
		ImageIcon image15 = new ImageIcon(this.getClass().getResource("/collar3.png"));
		ToysandAccessories.setIcon(image15);
		ToysandAccessories.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				ToysandAccessories.setBackground(new Color(255,222,173));
				btnMinimize2.setBackground(SystemColor.control);
				btnClose2.setBackground(SystemColor.control);
				btnMinimize2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, SystemColor.control, SystemColor.control));
				btnClose2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, SystemColor.control, SystemColor.control));
				tpanel.setVisible(true);
				tabbedPane.setSelectedIndex(4);
			}
			public void mouseExited(MouseEvent e) {
				ToysandAccessories.setBackground(Color.WHITE);
			}
			public void mouseClicked(MouseEvent e) {
				receipt.setVisible(true);
				tpanel.setVisible(true);
				tabbedPane.setSelectedIndex(4);
				btnMinimize2.setBackground(Color.WHITE);
				btnClose2.setBackground(Color.WHITE);
				btnMinimize2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.WHITE, Color.WHITE));
				btnClose2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.WHITE, Color.WHITE));
			}
		});
		panel_1.add(ToysandAccessories);

		
	}
}

