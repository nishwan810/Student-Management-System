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

public class StudentDatamanagement {

	private JFrame frmStudentdatamanage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentDatamanagement window = new StudentDatamanagement();
					window.frmStudentdatamanage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StudentDatamanagement() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStudentdatamanage = new JFrame();
		frmStudentdatamanage.setTitle("Student Data management");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension ScreenSize =kit.getScreenSize();
		int width = ScreenSize.width;
		int height = ScreenSize.height;
		frmStudentdatamanage.setSize(width, height);
		frmStudentdatamanage.setLocationRelativeTo(null);
		frmStudentdatamanage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStudentdatamanage.getContentPane().setLayout(null);
		
		JLabel lblStudentDatabaseManagement = new JLabel("Student Database Management");
		lblStudentDatabaseManagement.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentDatabaseManagement.setForeground(new Color(30, 144, 255));
		lblStudentDatabaseManagement.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 35));
		lblStudentDatabaseManagement.setBounds(573, 17, 534, 70);
		frmStudentdatamanage.getContentPane().add(lblStudentDatabaseManagement);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(330, 88, 1020, 37);
		frmStudentdatamanage.getContentPane().add(separator);
		
		JPanel panel = new JPanel();
		panel.setBounds(490, 102, 700, 619);
		frmStudentdatamanage.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AddStudent.main(null);
			}
		});
		btnNewButton.setIcon(new ImageIcon(StudentDatamanagement.class.getResource("/Images/add-student.png")));
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
				ShowStudent.main(null);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(StudentDatamanagement.class.getResource("/Images/LIST.png")));
		btnNewButton_1.setBounds(395, 27, 250, 250);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UpdateStudent.main(null);
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(StudentDatamanagement.class.getResource("/Images/Update-user.png")));
		btnNewButton_2.setBounds(45, 324, 250, 250);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DeleteStudent.main(null);
			}
		});
		btnNewButton_3.setIcon(new ImageIcon(StudentDatamanagement.class.getResource("/Images/delete-user.png")));
		btnNewButton_3.setBounds(395, 324, 250, 250);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_1_1 = new JButton("Back");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmStudentdatamanage.setVisible(false);
			}
		});
		btnNewButton_1_1.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 25));
		btnNewButton_1_1.setBounds(595, 820, 216, 57);
		frmStudentdatamanage.getContentPane().add(btnNewButton_1_1);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(new Color(0, 0, 0));
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(834, 820, 11, 57);
		frmStudentdatamanage.getContentPane().add(separator_3);
		
		JButton btnNewButton_1_1_1 = new JButton("Exit");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1_1_1.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 25));
		btnNewButton_1_1_1.setBounds(867, 820, 216, 57);
		frmStudentdatamanage.getContentPane().add(btnNewButton_1_1_1);
	}

}
