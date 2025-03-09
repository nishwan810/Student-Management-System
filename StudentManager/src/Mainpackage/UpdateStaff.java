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
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import java.awt.SystemColor;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UpdateStaff {

	private JFrame frmUpdateStaff;
	private JTextField prnfield;
	private JTextField usrfield;
	private JTextField lastfield;
	private JTextField mobfield;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateStaff window = new UpdateStaff();
					window.frmUpdateStaff.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UpdateStaff() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmUpdateStaff = new JFrame();
		frmUpdateStaff.setTitle("Update Staff");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension ScreenSize =kit.getScreenSize();
		int width = ScreenSize.width;
		int height = ScreenSize.height;
		
		frmUpdateStaff.setSize(width/2, height*2/3);
		frmUpdateStaff.setLocationRelativeTo(null);
//		frame.setBounds(100, 100, 450, 300);
		frmUpdateStaff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUpdateStaff.getContentPane().setLayout(null);
		
		JLabel lblUpdateStaff = new JLabel("Update Staff");
		lblUpdateStaff.setHorizontalAlignment(SwingConstants.CENTER);
		lblUpdateStaff.setForeground(new Color(30, 144, 255));
		lblUpdateStaff.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 30));
		lblUpdateStaff.setBounds(178, 6, 256, 70);
		frmUpdateStaff.getContentPane().add(lblUpdateStaff);
		
		JLabel lblNewLabel_2_2_3 = new JLabel("Prn");
		lblNewLabel_2_2_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_3.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 20));
		lblNewLabel_2_2_3.setBounds(428, 26, 153, 24);
		frmUpdateStaff.getContentPane().add(lblNewLabel_2_2_3);
		
		prnfield = new JTextField();
		prnfield.setColumns(10);
		prnfield.setBounds(471, 17, 166, 34);
		frmUpdateStaff.getContentPane().add(prnfield);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(78, 64, 683, 37);
		frmUpdateStaff.getContentPane().add(separator);
		
		usrfield = new JTextField();
		usrfield.setColumns(10);
		usrfield.setBounds(81, 122, 314, 34);
		frmUpdateStaff.getContentPane().add(usrfield);
		
		JLabel lblNewLabel_2 = new JLabel("Username");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 20));
		lblNewLabel_2.setBounds(81, 100, 153, 24);
		frmUpdateStaff.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Lastname");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(440, 100, 153, 24);
		frmUpdateStaff.getContentPane().add(lblNewLabel_2_1);
		
		lastfield = new JTextField();
		lastfield.setColumns(10);
		lastfield.setBounds(440, 126, 314, 34);
		frmUpdateStaff.getContentPane().add(lastfield);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Address");
		lblNewLabel_2_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_1.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 20));
		lblNewLabel_2_2_1.setBounds(440, 193, 153, 24);
		frmUpdateStaff.getContentPane().add(lblNewLabel_2_2_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(428, 227, 321, 116);
		frmUpdateStaff.getContentPane().add(textArea);
		
		JLabel lblNewLabel_2_2 = new JLabel("Mobile Number");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 20));
		lblNewLabel_2_2.setBounds(78, 193, 153, 24);
		frmUpdateStaff.getContentPane().add(lblNewLabel_2_2);
		
		mobfield = new JTextField();
		mobfield.setColumns(10);
		mobfield.setBounds(78, 218, 314, 34);
		frmUpdateStaff.getContentPane().add(mobfield);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("Gender");
		lblNewLabel_2_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_2.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 20));
		lblNewLabel_2_2_2.setBounds(78, 290, 153, 24);
		frmUpdateStaff.getContentPane().add(lblNewLabel_2_2_2);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(78, 326, 300, 34);
		frmUpdateStaff.getContentPane().add(panel);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Male");
		rdbtnNewRadioButton_1.setBounds(6, 6, 141, 23);
		panel.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnFemale_1 = new JRadioButton("Female");
		rdbtnFemale_1.setBounds(153, 6, 141, 23);
		panel.add(rdbtnFemale_1);
		
		JLabel lblNewLabel_2_2_2_1 = new JLabel("Degree");
		lblNewLabel_2_2_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_2_1.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 20));
		lblNewLabel_2_2_2_1.setBounds(428, 396, 153, 24);
		frmUpdateStaff.getContentPane().add(lblNewLabel_2_2_2_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(SystemColor.activeCaptionBorder);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"B.tech", "M.tech", "BCA", "MCA"}));
		comboBox.setBounds(428, 454, 321, 34);
		frmUpdateStaff.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_2_2_2_1_1 = new JLabel("Subject");
		lblNewLabel_2_2_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_2_1_1.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 20));
		lblNewLabel_2_2_2_1_1.setBounds(78, 396, 153, 24);
		frmUpdateStaff.getContentPane().add(lblNewLabel_2_2_2_1_1);
		
		JCheckBox chk1 = new JCheckBox("Java");
		chk1.setForeground(SystemColor.controlHighlight);
		chk1.setBounds(78, 458, 128, 23);
		frmUpdateStaff.getContentPane().add(chk1);
		
		JCheckBox chk2 = new JCheckBox("Python");
		chk2.setForeground(SystemColor.controlHighlight);
		chk2.setBounds(218, 458, 128, 23);
		frmUpdateStaff.getContentPane().add(chk2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(42, 572, 755, 37);
		frmUpdateStaff.getContentPane().add(separator_1);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmUpdateStaff.setVisible(false);
			}
		});
		btnBack.setBounds(71, 601, 117, 29);
		frmUpdateStaff.getContentPane().add(btnBack);
		
		JButton btnNewButton_1 = new JButton("Update");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				 String PRN = prnfield.getText();
	                String username= usrfield.getText();
	                String lastName =lastfield.getText();
	               
	                
	                String MobileTxt =mobfield.getText();
					long mobile = Long.parseLong(mobfield.getText());
					String address = textArea.getText();
						
					 
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
				        
             
           
             
             
             if (!PRN.isEmpty() && !username.isEmpty() && !lastName.isEmpty() && !MobileTxt.isEmpty() && !address.isEmpty()  && !degree.isEmpty()) {
                 try {
                
                     int Prn = Integer.parseInt(PRN);

                  
                     Staff z2 = new Staff();
//                     Student student = new Student();
                     z2.setPrn(Prn);
                     z2.setFirstName(username);
                     z2.setLastName(lastName);
                     z2.setMobileNo(mobile);
                     z2.setAddress(address);
                    
                     z2.setSub1(sub1);
                     z2.setSub2(sub2);
                     z2.setGender(gender);
                     z2.setDegree(degree);
                     
                     JDBCHandling jdbcImpl = new JDBCHandling();
                     int status = jdbcImpl.updateRecord(z2); 

                     
                     if (status > 0) {
                         JOptionPane.showMessageDialog(frmUpdateStaff, "Staff record updated successfully!");
                         
//                         loadAllStudentsData(table);
                     } else {
                         JOptionPane.showMessageDialog(frmUpdateStaff, "Failed to update staff record.");
                     }

                 } catch (NumberFormatException ex) {
                     JOptionPane.showMessageDialog(frmUpdateStaff, "Please enter a valid PRN!");
                 }
             } else {
                 JOptionPane.showMessageDialog(frmUpdateStaff, "All fields must be filled!");
             }
				
				
				
				
				
				
			}
		});
		btnNewButton_1.setBounds(267, 601, 117, 29);
		frmUpdateStaff.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Reset");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				prnfield.setText(null);
				usrfield.setText(null);
				lastfield.setText(null);
				mobfield.setText(null);
				textArea.setText(null);
				
				chk1.setSelected(false);
				chk2.setSelected(false);
			}
		});
		btnNewButton_2.setBounds(458, 601, 117, 29);
		frmUpdateStaff.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Close");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmUpdateStaff.setVisible(false);
			}
		});
		btnNewButton_3.setBounds(637, 601, 117, 29);
		frmUpdateStaff.getContentPane().add(btnNewButton_3);
	}
}
