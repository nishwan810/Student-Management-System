package Mainpackage;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.UIManager;


import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class AddStudent {

	private JFrame frmAddStudent;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField txtYyyymmdd;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddStudent window = new AddStudent();
					window.frmAddStudent.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddStudent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddStudent = new JFrame();
		frmAddStudent.setTitle("Add Student");
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension ScreenSize =kit.getScreenSize();
		int width = ScreenSize.width;
		int height = ScreenSize.height;
		frmAddStudent.setSize(width/2, height*2/3);
		frmAddStudent.setLocationRelativeTo(null);
		frmAddStudent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAddStudent.getContentPane().setLayout(null);
		
		JLabel lblStudentEntryForm = new JLabel("Student Entry Form");
		lblStudentEntryForm.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentEntryForm.setForeground(new Color(30, 144, 255));
		lblStudentEntryForm.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 30));
		lblStudentEntryForm.setBounds(153, 6, 534, 70);
		frmAddStudent.getContentPane().add(lblStudentEntryForm);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(78, 64, 683, 37);
		frmAddStudent.getContentPane().add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("Username");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 20));
		lblNewLabel_2.setBounds(88, 127, 153, 24);
		frmAddStudent.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(88, 149, 314, 34);
		frmAddStudent.getContentPane().add(textField);
		
		JLabel lblNewLabel_2_1 = new JLabel("Lastname");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(447, 127, 153, 24);
		frmAddStudent.getContentPane().add(lblNewLabel_2_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(0, 0, 0));
		separator_1.setBounds(24, 563, 792, 17);
		frmAddStudent.getContentPane().add(separator_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(447, 153, 314, 34);
		frmAddStudent.getContentPane().add(textField_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Mobile Number");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 20));
		lblNewLabel_2_2.setBounds(447, 216, 153, 24);
		frmAddStudent.getContentPane().add(lblNewLabel_2_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(447, 241, 314, 34);
		frmAddStudent.getContentPane().add(textField_2);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Address");
		lblNewLabel_2_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_1.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 20));
		lblNewLabel_2_2_1.setBounds(447, 306, 153, 24);
		frmAddStudent.getContentPane().add(lblNewLabel_2_2_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(447, 335, 321, 116);
		frmAddStudent.getContentPane().add(textArea);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("Gender");
		lblNewLabel_2_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_2.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 20));
		lblNewLabel_2_2_2.setBounds(88, 296, 153, 24);
		frmAddStudent.getContentPane().add(lblNewLabel_2_2_2);
		
		JPanel panel = new JPanel();
		panel.setBounds(98, 332, 300, 34);
		frmAddStudent.getContentPane().add(panel);
		panel.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(6, 6, 141, 23);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		buttonGroup.add(rdbtnFemale);
		rdbtnFemale.setBounds(153, 6, 141, 23);
		panel.add(rdbtnFemale);
		
		JLabel lblNewLabel_2_2_2_1 = new JLabel("Degree");
		lblNewLabel_2_2_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_2_1.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 20));
		lblNewLabel_2_2_2_1.setBounds(447, 473, 153, 24);
		frmAddStudent.getContentPane().add(lblNewLabel_2_2_2_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(SystemColor.activeCaptionBorder);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"B.tech", "M.tech", "BCA", "MCA"}));
		comboBox.setBounds(447, 509, 321, 34);
		frmAddStudent.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_2_2_2_1_1 = new JLabel("Subject");
		lblNewLabel_2_2_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_2_1_1.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 20));
		lblNewLabel_2_2_2_1_1.setBounds(89, 484, 153, 24);
		frmAddStudent.getContentPane().add(lblNewLabel_2_2_2_1_1);
		
		JCheckBox chk1 = new JCheckBox("Java");
		chk1.setForeground(SystemColor.controlHighlight);
		chk1.setBounds(88, 520, 128, 23);
		frmAddStudent.getContentPane().add(chk1);
		
		JCheckBox chk2 = new JCheckBox("Python");
		chk2.setForeground(SystemColor.controlHighlight);
		chk2.setBounds(228, 520, 128, 23);
		frmAddStudent.getContentPane().add(chk2);
		
		JButton btnNewButton_2 = new JButton("Reset");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textArea.setText(null);
				txtYyyymmdd.setText("YYYY-MM-DD");
				chk1.setSelected(false);
				chk2.setSelected(false);
				
			}
		});
		btnNewButton_2.setBounds(465, 602, 117, 29);
		frmAddStudent.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Close");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmAddStudent.setVisible(false);
			}
		});
		btnNewButton_3.setBounds(644, 602, 117, 29);
		frmAddStudent.getContentPane().add(btnNewButton_3);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmAddStudent.setVisible(false);
			}
		});
		btnBack.setBounds(78, 602, 117, 29);
		frmAddStudent.getContentPane().add(btnBack);
		
		JButton btnNewButton_1 = new JButton("Save");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
				
			        String sub1 = null;
			        String sub2 = null;
			        
			        boolean isSelected = chk1.isSelected();
			        if(isSelected) {
			        	sub1 =chk1.getLabel();
			        }
			        
			        isSelected = chk2.isSelected();
			        if(isSelected) {
			        	sub2 =chk2.getLabel();
			        }
			        
	

				
				 String rollNumberText = textField_3.getText();
	                String username= textField.getText();
	                String lastName = textField_1.getText();
	               
	                
	                String MobileTxt =textField_3.getText();
					long mobile = Long.parseLong(textField_2.getText());
					String address = textArea.getText();
					 String dobText = txtYyyymmdd.getText();
					 
					 String gender = null;
				        if(rdbtnNewRadioButton.isSelected()) {
				        	gender = "male";
				        	
				        }else if(rdbtnFemale.isSelected()) {
				        	gender="female";
				        }
					 
				        String degree = null;
				        degree = (String) comboBox.getSelectedItem();
				        
					 			        
//					 			        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//					 			        LocalDate dob = LocalDate.parse(dobText, formatter);
//					 
//					 				SimpleDateFormat sdf = new  SimpleDateFormat("yyyy-MM-dd");
//					 				String  date = sdf.format(txtYyyymmdd.getText());
					 				
					 				
					 				
					 				
					 				
					 				
					 				
					 				
	                System.out.println(rollNumberText + username + lastName + mobile + address +dobText +sub1 +sub2 +gender +degree);
	                
	                if (!rollNumberText.isEmpty() && !username.isEmpty() && !lastName.isEmpty() && !MobileTxt.isEmpty() && !address.isEmpty() && !dobText.isEmpty()  && !degree.isEmpty()) {
	                    try {
	                       
	                        int rollNumber = Integer.parseInt(textField_3.getText());

	                     
	                        Student student = new Student();
	                        student.setRollNumber(rollNumber);
	                        student.setFirstName(username);
	                        student.setLastName(lastName);
	                        student.setMobileNo(mobile);
	                        student.setAddress(address);
	                        student.setDob(dobText);
	                        student.setSub1(sub1);
	                        student.setSub2(sub2);
	                        student.setGender(gender);
	                        student.setDegree(degree);

	                        
	                        JDBCHandling jdbcImpl = new JDBCHandling();
	                        int status = jdbcImpl.insertrecord(student); 

	                        
	                        if (status > 0) {
	                            JOptionPane.showMessageDialog(frmAddStudent, "Student record inserted successfully!");
	                           
	                            
	                        } else {
	                            JOptionPane.showMessageDialog(frmAddStudent, "Failed to insert student record.");
	                        }

	                    } catch (NumberFormatException ex) {
	                        JOptionPane.showMessageDialog(frmAddStudent, "Please enter a valid roll number!");
	                    }
	                } else {
	                    JOptionPane.showMessageDialog(frmAddStudent, "All fields must be filled!");
	                }
				
				
				
				
				
				
				
			}
		});
		btnNewButton_1.setBounds(274, 602, 117, 29);
		frmAddStudent.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_2_2_2_2 = new JLabel("D.O.B");
		lblNewLabel_2_2_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_2_2.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 20));
		lblNewLabel_2_2_2_2.setBounds(88, 397, 153, 24);
		frmAddStudent.getContentPane().add(lblNewLabel_2_2_2_2);
		
		txtYyyymmdd = new JTextField();
		txtYyyymmdd.setText("YYYY-MM-DD");
		txtYyyymmdd.setColumns(10);
		txtYyyymmdd.setBounds(88, 426, 314, 34);
		frmAddStudent.getContentPane().add(txtYyyymmdd);
		
		JLabel lblNewLabel = new JLabel("(YYYY-MM-DD)");
		lblNewLabel.setForeground(SystemColor.scrollbar);
		lblNewLabel.setBounds(149, 400, 109, 16);
		frmAddStudent.getContentPane().add(lblNewLabel);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(88, 241, 314, 34);
		frmAddStudent.getContentPane().add(textField_3);
		
		JLabel lblNewLabel_2_2_3 = new JLabel("Roll Number");
		lblNewLabel_2_2_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_3.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 20));
		lblNewLabel_2_2_3.setBounds(88, 216, 153, 24);
		frmAddStudent.getContentPane().add(lblNewLabel_2_2_3);
	}
}
