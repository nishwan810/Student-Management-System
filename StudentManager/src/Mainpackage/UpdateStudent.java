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
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import java.awt.SystemColor;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;

public class UpdateStudent {

	private JFrame frmUpdateStudent;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField txtYyyymmdd;
	private JTextField txtroll;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateStudent window = new UpdateStudent();
					window.frmUpdateStudent.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UpdateStudent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmUpdateStudent = new JFrame();
		frmUpdateStudent.setTitle("Update Student");
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension ScreenSize =kit.getScreenSize();
		int width = ScreenSize.width;
		int height = ScreenSize.height;
		
		frmUpdateStudent.setSize(width/2, height*2/3);
		frmUpdateStudent.setLocationRelativeTo(null);
		//frmUpdateStudent.setBounds(100, 100, 450, 300);
		frmUpdateStudent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUpdateStudent.getContentPane().setLayout(null);
		
		JLabel lblStudentEntryForm = new JLabel("Update Student");
		lblStudentEntryForm.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentEntryForm.setForeground(new Color(30, 144, 255));
		lblStudentEntryForm.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 30));
		lblStudentEntryForm.setBounds(74, 6, 314, 70);
		frmUpdateStudent.getContentPane().add(lblStudentEntryForm);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(74, 64, 683, 37);
		frmUpdateStudent.getContentPane().add(separator);
		
		
		
		JButton btnNewButton_3 = new JButton("Close");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmUpdateStudent.setVisible(false);
			}
		});
		btnNewButton_3.setBounds(640, 602, 117, 29);
		frmUpdateStudent.getContentPane().add(btnNewButton_3);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmUpdateStudent.setVisible(false);
			}
		});
		btnBack.setBounds(74, 602, 117, 29);
		frmUpdateStudent.getContentPane().add(btnBack);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(20, 563, 792, 17);
		frmUpdateStudent.getContentPane().add(separator_1);
		
		JLabel lblNewLabel_2 = new JLabel("Username");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 20));
		lblNewLabel_2.setBounds(77, 113, 153, 24);
		frmUpdateStudent.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(77, 135, 314, 34);
		frmUpdateStudent.getContentPane().add(textField);
		
		JLabel lblNewLabel_2_2 = new JLabel("Mobile Number");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 20));
		lblNewLabel_2_2.setBounds(74, 206, 153, 24);
		frmUpdateStudent.getContentPane().add(lblNewLabel_2_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(74, 231, 314, 34);
		frmUpdateStudent.getContentPane().add(textField_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Lastname");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(436, 113, 153, 24);
		frmUpdateStudent.getContentPane().add(lblNewLabel_2_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(436, 139, 314, 34);
		frmUpdateStudent.getContentPane().add(textField_3);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Address");
		lblNewLabel_2_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_1.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 20));
		lblNewLabel_2_2_1.setBounds(436, 206, 153, 24);
		frmUpdateStudent.getContentPane().add(lblNewLabel_2_2_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(436, 235, 321, 116);
		frmUpdateStudent.getContentPane().add(textArea);
		
		JLabel lblNewLabel_2_2_2_1 = new JLabel("Degree");
		lblNewLabel_2_2_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_2_1.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 20));
		lblNewLabel_2_2_2_1.setBounds(436, 383, 153, 24);
		frmUpdateStudent.getContentPane().add(lblNewLabel_2_2_2_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(SystemColor.activeCaptionBorder);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"B.tech", "M.tech", "BCA", "MCA"}));
		
		comboBox.setBounds(436, 419, 321, 34);
		frmUpdateStudent.getContentPane().add(comboBox);
		
		JCheckBox chk2 = new JCheckBox("Python");
		chk2.setForeground(SystemColor.controlHighlight);
		chk2.setBounds(217, 506, 128, 23);
		frmUpdateStudent.getContentPane().add(chk2);
		
		JCheckBox chk1 = new JCheckBox("Java");
		chk1.setForeground(SystemColor.controlHighlight);
		chk1.setBounds(77, 506, 128, 23);
		frmUpdateStudent.getContentPane().add(chk1);
		
		JLabel lblNewLabel_2_2_2_1_1 = new JLabel("Subject");
		lblNewLabel_2_2_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_2_1_1.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 20));
		lblNewLabel_2_2_2_1_1.setBounds(78, 470, 153, 24);
		frmUpdateStudent.getContentPane().add(lblNewLabel_2_2_2_1_1);
		
		txtYyyymmdd = new JTextField();
		txtYyyymmdd.setText("YYYY-MM-DD");
		txtYyyymmdd.setColumns(10);
		txtYyyymmdd.setBounds(77, 412, 314, 34);
		frmUpdateStudent.getContentPane().add(txtYyyymmdd);
		
		JLabel lblNewLabel_2_2_2_2 = new JLabel("DOB");
		lblNewLabel_2_2_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_2_2.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 20));
		lblNewLabel_2_2_2_2.setBounds(77, 383, 153, 24);
		frmUpdateStudent.getContentPane().add(lblNewLabel_2_2_2_2);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("Gender");
		lblNewLabel_2_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_2.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 20));
		lblNewLabel_2_2_2.setBounds(77, 282, 153, 24);
		frmUpdateStudent.getContentPane().add(lblNewLabel_2_2_2);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(78, 321, 300, 34);
		frmUpdateStudent.getContentPane().add(panel);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Male");
		rdbtnNewRadioButton_1.setBounds(6, 6, 141, 23);
		panel.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnFemale_1 = new JRadioButton("Female");
		rdbtnFemale_1.setBounds(153, 6, 141, 23);
		panel.add(rdbtnFemale_1);
		
		JLabel lblNewLabel_2_2_3 = new JLabel("Roll Number");
		lblNewLabel_2_2_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_3.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 20));
		lblNewLabel_2_2_3.setBounds(355, 28, 153, 24);
		frmUpdateStudent.getContentPane().add(lblNewLabel_2_2_3);
		
		txtroll = new JTextField();
		txtroll.setColumns(10);
		txtroll.setBounds(479, 21, 166, 34);
		frmUpdateStudent.getContentPane().add(txtroll);
		
		JButton btnNewButton_1 = new JButton("Update");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 String rollNumberText = txtroll.getText();
	                String username= textField.getText();
	                String lastName =textField_3.getText();
	               
	                
	                String MobileTxt =textField_2.getText();
					long mobile = Long.parseLong(textField_2.getText());
					String address = textArea.getText();
					 String dobText = txtYyyymmdd.getText();
					 
					 String gender = null;
				        if(rdbtnNewRadioButton_1.isSelected()) {
				        	gender = "male";
				        	
				        }else if(rdbtnFemale_1.isSelected()) {
				        	gender="female";
				        }
					 
				        String degree = null;
				        degree = (String) comboBox.getSelectedItem();
				        
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
				        
                
              
                
                
                if (!rollNumberText.isEmpty() && !username.isEmpty() && !lastName.isEmpty() && !MobileTxt.isEmpty() && !address.isEmpty() && !dobText.isEmpty()  && !degree.isEmpty()) {
                    try {
                   
                        int rollNumber = Integer.parseInt(rollNumberText);

                     
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
                        int status = jdbcImpl.updateRecord(student); 

                        
                        if (status > 0) {
                            JOptionPane.showMessageDialog(frmUpdateStudent, "Student record updated successfully!");
                            
//                            loadAllStudentsData(table);
                        } else {
                            JOptionPane.showMessageDialog(frmUpdateStudent, "Failed to update student record.");
                        }

                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(frmUpdateStudent, "Please enter a valid roll number!");
                    }
                } else {
                    JOptionPane.showMessageDialog(frmUpdateStudent, "All fields must be filled!");
                }
				
				
				
				
				
			}
		});
		btnNewButton_1.setBounds(270, 602, 117, 29);
		frmUpdateStudent.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Reset");
		

		btnNewButton_2.setBounds(461, 602, 117, 29);
		frmUpdateStudent.getContentPane().add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				txtroll.setText(null);
				textField.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textArea.setText(null);
				lblNewLabel_2_2_2_2 .setText("YYYY-MM-DD");
				chk1.setSelected(false);
				chk2.setSelected(false);
				
			}
		});
	}
}
