package Mainpackage;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class LoginForm {

	private JFrame frmLoginPage;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm window = new LoginForm();
					window.frmLoginPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLoginPage = new JFrame();
		frmLoginPage.setTitle("Login Page");
		
ImageIcon imgIcon = new ImageIcon("/Images/ninfinityinfosolutions_logo.jpeg");
        
        // Set icon to frame
        frmLoginPage.setIconImage(imgIcon.getImage());

        // Ensure decorations are enabled (important for macOS)
        JFrame.setDefaultLookAndFeelDecorated(true);
//		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(LoginForm.class.getResource("/Images/ninfinityinfosolutions_logo.jpeg")));
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension ScreenSize =kit.getScreenSize();
		int width = ScreenSize.width;
		int height = ScreenSize.height;
		frmLoginPage.setSize(width/2, height/2);
		frmLoginPage.setLocationRelativeTo(null);
		frmLoginPage.setResizable(false);
		//frame.setBounds(100, 100, 450, 300);
		frmLoginPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLoginPage.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(451, -5, 391, 505);
		frmLoginPage.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(2, 0, 402, 503);
		panel.add(lblNewLabel);
		 ImageIcon originalIcon = new ImageIcon("/Users/nishantwankhade/eclipse/infinity/StudentManager/src/Images/loginimg.jpg");
		        // Resize the image to fit within JLabel dimensions
		        Image scaledImage = originalIcon.getImage().getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_SMOOTH);
		        
		                // Set the resized icon to JLabel
		                
		
       
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        lblNewLabel.setIcon(scaledIcon);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(6, 6, 431, 485);
		frmLoginPage.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("N Infinity Academy");
		lblNewLabel_1.setForeground(new Color(30, 144, 255));
		lblNewLabel_1.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 30));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(7, 23, 416, 46);
		panel_1.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setBounds(12, 74, 407, 12);
		panel_1.add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("Username");
		lblNewLabel_2.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 20));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setBounds(41, 181, 153, 24);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Login ");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 30));
		lblNewLabel_2_1.setBounds(135, 86, 160, 34);
		panel_1.add(lblNewLabel_2_1);
		
		textField = new JTextField();
		textField.setBounds(41, 211, 333, 34);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2_2 = new JLabel("Password");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 20));
		lblNewLabel_2_2.setBounds(42, 278, 153, 24);
		panel_1.add(lblNewLabel_2_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(41, 305, 333, 39);
		panel_1.add(passwordField);
		
		JButton btnNewButton_1 = new JButton("Reset Field");
		btnNewButton_1.setBackground(SystemColor.BLUE);
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 15));
		btnNewButton_1.setForeground(SystemColor.BLUE);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				passwordField.setText(null);
				textField.setText(null);
			}
		});
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1.setBounds(26, 352, 124, 29);
		panel_1.add(btnNewButton_1);
		
		JButton btnExitt = new JButton("Exit");
		btnExitt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnExitt.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnExitt.setBounds(233, 410, 141, 33);
		panel_1.add(btnExitt);
		
		JButton btnNewButton_2_1 = new JButton("Login");  
		
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String Username = textField.getText();
				String Password = passwordField.getText();
				
				
				if(Username.equals("Nishwan") && Password.equals("nishwan")) {
//					System.out.println("Login success");
					
					MainEntryPage.main(null);
				}else {
					JOptionPane.showMessageDialog(null, "invalid User");
				}
			}
		});
		btnNewButton_2_1.setBackground(new Color(30, 144, 255));
		btnNewButton_2_1.setForeground(new Color(0, 0, 0));
		btnNewButton_2_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnNewButton_2_1.setBounds(41, 410, 141, 33);
		

		
		panel_1.add(btnNewButton_2_1);
		
	}
}
