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
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;

public class AddStaff {

	private JFrame frmAddStaff;
	private JTextField Usrfield;
	private JTextField Prnfield;
	private JTextField mobilefield;
	private JTextField lastfield;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddStaff window = new AddStaff();
					window.frmAddStaff.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddStaff() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddStaff = new JFrame();
		frmAddStaff.setTitle("ADD STAFF");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension ScreenSize =kit.getScreenSize();
		int width = ScreenSize.width;
		int height = ScreenSize.height;
		frmAddStaff.setSize(width/2, height*2/3);
		frmAddStaff.setLocationRelativeTo(null);
		//frame.setBounds(100, 100, 450, 300);
		frmAddStaff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAddStaff.getContentPane().setLayout(null);
		
		JLabel lblStaffEntryForm = new JLabel("Staff Entry Form");
		lblStaffEntryForm.setHorizontalAlignment(SwingConstants.CENTER);
		lblStaffEntryForm.setForeground(new Color(30, 144, 255));
		lblStaffEntryForm.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 30));
		lblStaffEntryForm.setBounds(153, 6, 534, 70);
		frmAddStaff.getContentPane().add(lblStaffEntryForm);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(78, 64, 683, 37);
		frmAddStaff.getContentPane().add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("Username");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 20));
		lblNewLabel_2.setBounds(81, 86, 153, 24);
		frmAddStaff.getContentPane().add(lblNewLabel_2);
		
		Usrfield = new JTextField();
		Usrfield.setColumns(10);
		Usrfield.setBounds(81, 108, 314, 34);
		frmAddStaff.getContentPane().add(Usrfield);
		
		JLabel lblNewLabel_2_2_3 = new JLabel("PRN");
		lblNewLabel_2_2_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_3.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 20));
		lblNewLabel_2_2_3.setBounds(81, 175, 153, 24);
		frmAddStaff.getContentPane().add(lblNewLabel_2_2_3);
		
		Prnfield = new JTextField();
		Prnfield.setColumns(10);
		Prnfield.setBounds(81, 200, 314, 34);
		frmAddStaff.getContentPane().add(Prnfield);
		
		mobilefield = new JTextField();
		mobilefield.setColumns(10);
		mobilefield.setBounds(440, 200, 314, 34);
		frmAddStaff.getContentPane().add(mobilefield);
		
		JLabel lblNewLabel_2_2 = new JLabel("Mobile Number");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 20));
		lblNewLabel_2_2.setBounds(440, 175, 153, 24);
		frmAddStaff.getContentPane().add(lblNewLabel_2_2);
		
		lastfield = new JTextField();
		lastfield.setColumns(10);
		lastfield.setBounds(440, 112, 314, 34);
		frmAddStaff.getContentPane().add(lastfield);
		
		JLabel lblNewLabel_2_1 = new JLabel("Lastname");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(440, 86, 153, 24);
		frmAddStaff.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("Gender");
		lblNewLabel_2_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_2.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 20));
		lblNewLabel_2_2_2.setBounds(78, 265, 153, 24);
		frmAddStaff.getContentPane().add(lblNewLabel_2_2_2);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(95, 308, 300, 34);
		frmAddStaff.getContentPane().add(panel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setBounds(6, 6, 141, 23);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(153, 6, 141, 23);
		panel.add(rdbtnFemale);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Address");
		lblNewLabel_2_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_1.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 20));
		lblNewLabel_2_2_1.setBounds(440, 265, 153, 24);
		frmAddStaff.getContentPane().add(lblNewLabel_2_2_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(440, 294, 321, 116);
		frmAddStaff.getContentPane().add(textArea);
		
		JLabel lblNewLabel_2_2_2_1 = new JLabel("Degree");
		lblNewLabel_2_2_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_2_1.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 20));
		lblNewLabel_2_2_2_1.setBounds(440, 432, 153, 24);
		frmAddStaff.getContentPane().add(lblNewLabel_2_2_2_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(SystemColor.activeCaptionBorder);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"B.tech", "M.tech", "BCA", "MCA"}));
		comboBox.setBounds(440, 468, 321, 34);
		frmAddStaff.getContentPane().add(comboBox);
		
		JCheckBox chk2 = new JCheckBox("Python");
		chk2.setForeground(SystemColor.controlHighlight);
		chk2.setBounds(217, 433, 128, 23);
		frmAddStaff.getContentPane().add(chk2);
		
		JCheckBox chk1 = new JCheckBox("Java");
		chk1.setForeground(SystemColor.controlHighlight);
		chk1.setBounds(78, 433, 128, 23);
		frmAddStaff.getContentPane().add(chk1);
		
		JLabel lblNewLabel_2_2_2_1_1 = new JLabel("Subject");
		lblNewLabel_2_2_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_2_1_1.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 20));
		lblNewLabel_2_2_2_1_1.setBounds(81, 386, 153, 24);
		frmAddStaff.getContentPane().add(lblNewLabel_2_2_2_1_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(24, 576, 792, 17);
		frmAddStaff.getContentPane().add(separator_1);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmAddStaff.setVisible(false);
			}
		});
		btnBack.setBounds(72, 615, 117, 29);
		frmAddStaff.getContentPane().add(btnBack);
		
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
		        


			
			 String PrnText = Prnfield.getText();
                String username= Usrfield.getText();
                String lastName = lastfield.getText();
               
                
                String MobileTxt =mobilefield.getText();
				long mobile = Long.parseLong(mobilefield.getText());
				String address = textArea.getText();
//				 String dobText = Datefield.getText();
//				 
//				 SimpleDateFormat sdf = new SimpleDateFormat(dobText);
//					String formattedDate = sdf.format(Datefield.getText());
				 
//				  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//			        LocalDate dob = LocalDate.parse(dobText, formatter);
//
//				SimpleDateFormat sdf = new  SimpleDateFormat("yyyy-MM-dd");
//				String  date = sdf.format(Datefield.getText());
//				
//				String datestr = Datefield.getText();
//				
//		        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//		        
//		           java.util.Date date = null;
//				try {
//					date = formatter.parse(datestr);
//				} catch (ParseException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
//		            
				 
				 String gender = null;
			        if(rdbtnNewRadioButton.isSelected()) {
			        	gender = "male";
			        	
			        }else if(rdbtnFemale.isSelected()) {
			        	gender="female";
			        }
				 
			        String degree = null;
			        degree = (String) comboBox.getSelectedItem();
			        
			        
  System.out.println(PrnText + username + lastName + mobile + address   +sub1 +sub2 +gender +degree);
	                
	                if (!PrnText.isEmpty() && !username.isEmpty() && !lastName.isEmpty() && !MobileTxt.isEmpty() && !address.isEmpty() &&  !degree.isEmpty()) {
	                    try {
	                       
	                        int Prn = Integer.parseInt(Prnfield.getText());

	                     
	                        Staff staff =new Staff();
//	                        Student student = new Student();
	                        staff.setPrn(Prn);
	                        staff.setFirstName(username);
	                        staff.setLastName(lastName);
	                        staff.setMobileNo(mobile);
	                        staff.setAddress(address);
//	                        staff.setDob(formattedDate);
	                        staff.setSub1(sub1);
	                        staff.setSub2(sub2);
	                        staff.setGender(gender);
	                        staff.setDegree(degree);

	                        
	                        JDBCHandling jdbc1 = new JDBCHandling();
	                        int status = jdbc1.insertrecord(staff); 

	                        
	                        if (status > 0) {
	                            JOptionPane.showMessageDialog(frmAddStaff, "Student record inserted successfully!");
	                           
	                            
	                        } else {
	                            JOptionPane.showMessageDialog(frmAddStaff, "Failed to insert student record.");
	                        }

	                    } catch (NumberFormatException ex) {
	                        JOptionPane.showMessageDialog(frmAddStaff, "Please enter a valid Prn!");
	                    }
	                } else {
	                    JOptionPane.showMessageDialog(frmAddStaff, "All fields must be filled!");
	                }
			        
				
				
				
				
				
			}
		});
		btnNewButton_1.setBounds(268, 615, 117, 29);
		frmAddStaff.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Reset");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				Prnfield.setText(null);
				Usrfield.setText(null);
				lastfield.setText(null);
				mobilefield.setText(null);
				textArea.setText(null);
				
				chk1.setSelected(false);
				chk2.setSelected(false);
				
				
				
				
				
				
			}
		});
		btnNewButton_2.setBounds(459, 615, 117, 29);
		frmAddStaff.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Close");
		btnNewButton_3.setBounds(638, 615, 117, 29);
		frmAddStaff.getContentPane().add(btnNewButton_3);
	}
}
