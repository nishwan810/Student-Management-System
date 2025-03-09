package Mainpackage;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StaffDataManagement {

	private JFrame frmStaffDataManager;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StaffDataManagement window = new StaffDataManagement();
					window.frmStaffDataManager.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StaffDataManagement() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStaffDataManager = new JFrame();
		frmStaffDataManager.setTitle("STAFF DATA MANAGER");
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension ScreenSize =kit.getScreenSize();
		int width = ScreenSize.width;
		int height = ScreenSize.height;
		frmStaffDataManager.setSize(width, height);
		frmStaffDataManager.setLocationRelativeTo(null);
//		frame.setBounds(100, 100, 450, 300);
		frmStaffDataManager.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStaffDataManager.getContentPane().setLayout(null);
		
		JLabel lblStudentDatabaseManagement = new JLabel("Staff Database Management");
		lblStudentDatabaseManagement.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentDatabaseManagement.setForeground(new Color(30, 144, 255));
		lblStudentDatabaseManagement.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 35));
		lblStudentDatabaseManagement.setBounds(573, 48, 534, 70);
		frmStaffDataManager.getContentPane().add(lblStudentDatabaseManagement);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(330, 119, 1020, 37);
		frmStaffDataManager.getContentPane().add(separator);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(490, 133, 700, 619);
		frmStaffDataManager.getContentPane().add(panel);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddStaff.main(null);
			}
		});
		btnNewButton.setIcon(new ImageIcon(StaffDataManagement.class.getResource("/Images/add-student.png")));
		btnNewButton.setBounds(45, 27, 250, 250);
		panel.add(btnNewButton);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(-160, 291, 1020, 37);
		panel.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setForeground(Color.BLACK);
		separator_2.setBounds(344, -2, 12, 624);
		panel.add(separator_2);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ShowStaff.main(null);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(StaffDataManagement.class.getResource("/Images/LIST.png")));
		btnNewButton_1.setBounds(395, 27, 250, 250);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UpdateStaff.main(null);
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(StaffDataManagement.class.getResource("/Images/Update-user.png")));
		btnNewButton_2.setBounds(45, 324, 250, 250);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DeleteStaff.main(null);
			}
		});
		btnNewButton_3.setIcon(new ImageIcon(StaffDataManagement.class.getResource("/Images/delete-user.png")));
		btnNewButton_3.setBounds(395, 324, 250, 250);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_1_1 = new JButton("Back");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmStaffDataManager.setVisible(false);
			}
		});
		btnNewButton_1_1.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 25));
		btnNewButton_1_1.setBounds(573, 842, 216, 57);
		frmStaffDataManager.getContentPane().add(btnNewButton_1_1);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(Color.BLACK);
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(834, 842, 12, 64);
		frmStaffDataManager.getContentPane().add(separator_3);
		
		JButton btnNewButton_1_1_1 = new JButton("Exit");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1_1_1.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 25));
		btnNewButton_1_1_1.setBounds(891, 842, 216, 57);
		frmStaffDataManager.getContentPane().add(btnNewButton_1_1_1);
	}
}
