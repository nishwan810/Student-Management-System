package Mainpackage;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainEntryPage {

	private JFrame frmNInfinityAcademy;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainEntryPage window = new MainEntryPage();
					window.frmNInfinityAcademy.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainEntryPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNInfinityAcademy = new JFrame();
		frmNInfinityAcademy.setTitle("N Infinity Academy");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension ScreenSize =kit.getScreenSize();
		int width = ScreenSize.width;
		int height = ScreenSize.height;
		frmNInfinityAcademy.setSize(width, height);
		frmNInfinityAcademy.setLocationRelativeTo(null);
		//frmNInfinityAcademy.setBounds(100, 100, 450, 300);
		frmNInfinityAcademy.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNInfinityAcademy.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome To N Inifinity Academy");
		lblNewLabel.setForeground(new Color(30, 144, 255));
		lblNewLabel.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 35));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(573, 16, 534, 70);
		frmNInfinityAcademy.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setBounds(330, 92, 1020, 37);
		frmNInfinityAcademy.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(0, 0, 0));
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(834, 98, 12, 667);
		frmNInfinityAcademy.getContentPane().add(separator_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(138, 101, 697, 664);
		frmNInfinityAcademy.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(MainEntryPage.class.getResource("/Images/staff.png")));
		lblNewLabel_1.setBounds(116, 6, 464, 591);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Staff ");
		btnNewButton.setOpaque(true);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setContentAreaFilled(true);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				StaffDataManagement.main(null);
			}
		});
		btnNewButton.setBackground(new Color(30, 144, 255));
		btnNewButton.setForeground(new Color(230, 230, 250));
		btnNewButton.setFont(new Font("Apple SD Gothic Neo", Font.BOLD | Font.ITALIC, 40));
		btnNewButton.setBounds(134, 591, 429, 67);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(842, 101, 697, 664);
		frmNInfinityAcademy.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(MainEntryPage.class.getResource("/Images/student.png")));
		lblNewLabel_2.setBounds(74, 82, 539, 515);
		panel_1.add(lblNewLabel_2);
		
		JButton btnStudent = new JButton("Student");
		btnStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				StudentDatamanagement.main(null);
			}
		});
		btnStudent.setOpaque(true);
		btnStudent.setForeground(new Color(230, 230, 250));
		btnStudent.setFont(new Font("Apple SD Gothic Neo", Font.BOLD | Font.ITALIC, 40));
		btnStudent.setContentAreaFilled(true);
		btnStudent.setBorderPainted(false);
		btnStudent.setBackground(new Color(30, 144, 255));
		btnStudent.setBounds(134, 591, 429, 67);
		panel_1.add(btnStudent);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 25));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmNInfinityAcademy.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(607, 877, 216, 57);
		frmNInfinityAcademy.getContentPane().add(btnNewButton_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setForeground(new Color(0, 0, 0));
		separator_2.setBounds(835, 877, 9, 57);
		frmNInfinityAcademy.getContentPane().add(separator_2);
		
		JButton btnNewButton_1_1 = new JButton("Exit");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnNewButton_1_1.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 25));
		btnNewButton_1_1.setBounds(856, 877, 216, 57);
		frmNInfinityAcademy.getContentPane().add(btnNewButton_1_1);
	}

}
