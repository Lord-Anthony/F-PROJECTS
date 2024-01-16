
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.border.*;
//import java.awt.Color;
//import java.awt.Cursor;
//import java.awt.Event;
//import java.awt.EventQueue;
//import java.awt.geom.RoundRectangle2D;
//
//import javax.swing.ImageIcon;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.border.Border;
//import javax.swing.border.EmptyBorder;
//import java.awt.FlowLayout;
//import java.awt.Font;
//import java.awt.GradientPaint;
//import java.awt.Graphics;
//import java.awt.Graphics2D;
//import java.awt.TextField;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import javax.swing.JLabel;
//import javax.swing.JOptionPane;
//import javax.swing.JTextField;
//import javax.swing.border.EtchedBorder;
//import javax.swing.border.LineBorder;
//import javax.swing.SwingConstants;
//import javax.swing.UIManager;
//import javax.swing.JPasswordField;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseMotionAdapter;
//import java.awt.event.KeyAdapter;
//import java.awt.event.KeyEvent;
//import javax.swing.JSeparator;
//import java.awt.event.FocusAdapter;
//import java.awt.event.FocusEvent;
//import java.awt.event.FocusListener;

public class POSSystemPetShopModern extends JFrame {
	
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtEMailUsername;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
	EventQueue.invokeLater(new Runnable() 
	{
	public void run() 
	{
	try
	{
	POSSystemPetShopModern frame = new POSSystemPetShopModern();
	frame.setVisible(true);
	} 
	catch (Exception e) 
	{
	e.printStackTrace();
	}
	}
	});
	}
	int positionX = 0;
	int positionY= 0;
	private JTextField textField2;
	/**
	 * Create the frame.
	 */
	public POSSystemPetShopModern() 
	{
	setUndecorated(true);
	setResizable(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 720, 360);
	contentPane = new JPanel();

	contentPane.addMouseListener(new MouseAdapter() 
	{
	public void mousePressed(MouseEvent e) 
	{
	positionX = e.getX();
	positionY = e.getY();
	}
	});
		
	      contentPane.addMouseMotionListener(new MouseMotionAdapter() 
	      {
	      public void mouseDragged(MouseEvent e) {
	      setLocation(e.getXOnScreen()-positionX, e.getYOnScreen()-positionY);
	      }
	      });
	contentPane.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
	contentPane.setBackground(new Color(139, 69, 19));
	getComponents();
	setLocationRelativeTo(null);
	setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 15, 15));
		

	setContentPane(contentPane);
	contentPane.setLayout(null);
	JFrame jFrame = new JFrame();
	jFrame.getContentPane();
	
	textField2 = new JPasswordField();
	textField2.setText("Password");
	((JPasswordField) textField2).setEchoChar('\u0000');
	       textField2.addFocusListener(new FocusAdapter() 
	       {
	       public void focusGained(FocusEvent e) 
	       {
	       if (textField2.getText().equals("Password")) 
	       {
	       textField2.setText(null);
	       textField2.requestFocus();
	       textField2.setForeground(new Color(0, 0, 0));
	       ((JPasswordField) textField2).setEchoChar('●');
	       }
	       }
	       });
	textField2.setFont(new Font("Arial", Font.PLAIN, 12));
	textField2.setBounds(446, 212, 201, 20);
	textField2.setBorder(null);
	textField2.setForeground(Color.GRAY);
	textField2.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
	jFrame.getContentPane();getContentPane().add(textField2);
	textField2.setColumns(10);
	
	txtEMailUsername = new JTextField();
	       txtEMailUsername.addFocusListener(new FocusAdapter() 
	       {
	       public void focusGained(FocusEvent e) 
	       {
	       if (txtEMailUsername.getText().equals("E- mail/ Username")) 
	       {
	       txtEMailUsername.setText("");
	       txtEMailUsername.setForeground(new Color(0, 0, 0));
	       }
	       }
	       public void focusLost(FocusEvent e) {
	       if (txtEMailUsername.getText().equals("")) {
	       txtEMailUsername.setText("E- mail/ Username");
	       txtEMailUsername.setForeground(new Color(0, 0, 0));
	       }
	       }
	       });
	txtEMailUsername.setFont(new Font("Arial", Font.PLAIN, 12));
	txtEMailUsername.setText("E- mail/ Username");
	txtEMailUsername.setBounds(446, 156, 201, 20);
	txtEMailUsername.setBorder(null);
	txtEMailUsername.setForeground(Color.GRAY);
	txtEMailUsername.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
	jFrame.getContentPane();getContentPane().add(txtEMailUsername);
	txtEMailUsername.setColumns(10);
		
		
	final JButton btnLogin = new JButton("LOGIN");
	btnLogin.setBackground(new Color(220, 220, 220));
	btnLogin.setBounds(424, 271, 80, 23);
	btnLogin.setFont(new Font("Arial", Font.BOLD, 11));
	btnLogin.setBorder(null);
	btnLogin.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
			String password = textField2.getText();
			String username = txtEMailUsername.getText();
			
			if (password.contains("Pets") && username.contains("Shop")) {
				POSSystemPetShopModern2 frame2 = new POSSystemPetShopModern2();
				frame2.setVisible(true);
				dispose();

			}
			else {
				JOptionPane.showMessageDialog(null, "Invalid Login Details", "Login Error", JOptionPane.ERROR_MESSAGE);
			}
		    }
		    });
	contentPane.add(btnLogin);
		
	JButton btnReset = new JButton(" RESET");
		btnReset.setFocusTraversalKeysEnabled(false);
		btnReset.setFocusable(false);
		btnReset.setFocusPainted(false);
		btnReset.setBounds(569, 271, 64, 23);
		btnReset.setFont(new Font("Arial", Font.BOLD, 11));
		btnReset.setBorder(null);
		btnReset.setBackground(new Color(254, 187, 91));
		btnReset.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				setBackground(Color.BLACK);
			}
		});
		btnReset.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
				txtEMailUsername.setText("E- mail/ Username");
				txtEMailUsername.setForeground(Color.GRAY);
				
				textField2.setText("Password");
				((JPasswordField) textField2).setEchoChar('\u0000');
				textField2.setForeground(Color.GRAY);
				
            }
        });
		contentPane.add(btnReset);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(0, 0, 360, 360);
		ImageIcon image1 = new ImageIcon(this.getClass().getResource("/cutie1.png"));
		lblNewLabel_1.setIcon(image1);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(409, 40, 254, 63);
		contentPane.add(lblNewLabel_2);
		ImageIcon image2 = new ImageIcon(this.getClass().getResource("/pet1.png"));
		lblNewLabel_2.setIcon(image2);
		
		final JButton btnClose = new JButton("X");
		btnClose.setBounds(679, 0, 41, 32);
		btnClose.setFont(new Font("Arial", Font.BOLD, 11));
		btnClose.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(139, 69, 19), new Color(139, 69, 19)));
		btnClose.setForeground(new Color(255, 255, 255));
		btnClose.setBackground(new Color(139, 69, 19));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(ABORT);
		}
		});
		btnClose.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				btnClose.setBackground(Color.RED);
			}
			public void mouseExited(MouseEvent e) {
				btnClose.setBackground(new Color(139, 69, 19));
			}
		});
	    contentPane.setLayout(null);
		contentPane.add(btnClose);
		
		JButton btnMinimize = new JButton("_");
		btnMinimize.setBounds(635, 0, 41, 32);
		btnMinimize.setForeground(Color.WHITE);
		btnMinimize.setFont(new Font("Arial", Font.BOLD, 11));
		btnMinimize.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(139, 69, 19), new Color(139, 69, 19)));
		btnMinimize.setBackground(new Color(139, 69, 19));
		btnMinimize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setState(JFrame.ICONIFIED);
		}
		});
		contentPane.add(btnMinimize);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		ImageIcon image8 = new ImageIcon(this.getClass().getResource("/3.png"));
		lblNewLabel_6.setIcon(image8);
		lblNewLabel_6.setBounds(419, 153, 26, 23);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("New label");
		ImageIcon image9 = new ImageIcon(this.getClass().getResource("/2.png"));
		lblNewLabel_6_1.setIcon(image9);
		lblNewLabel_6_1.setBounds(419, 212, 26, 23);
		contentPane.add(lblNewLabel_6_1);
		
	
		
		JLabel oblong_1 = new JLabel("New label");
		oblong_1.setBounds(409, 151, 254, 31);
		ImageIcon image3 = new ImageIcon(this.getClass().getResource("/oblong.png"));
		oblong_1.setIcon(image3);
		contentPane.add(oblong_1);
		
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(409, 206, 254, 32);
		ImageIcon image5 = new ImageIcon(this.getClass().getResource("/oblong.png"));
		lblNewLabel_3.setIcon(image5);
		contentPane.add(lblNewLabel_3);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.WHITE);
		separator.setBackground(Color.WHITE);
		separator.setBounds(419, 114, 244, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(409, 266, 116, 32);
		ImageIcon image6 = new ImageIcon(this.getClass().getResource("/long oblong.png"));
		lblNewLabel_4.setIcon(image6);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBackground(new Color(255, 255, 51));
		lblNewLabel_5.setBounds(547, 262, 116, 40);
		ImageIcon image7 = new ImageIcon(this.getClass().getResource("/brown.png"));
		lblNewLabel_5.setIcon(image7);
		contentPane.add(lblNewLabel_5);
	}
}
