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
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DeleteStaff {

	private JFrame frame;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteStaff window = new DeleteStaff();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	 private static Staff getStaffByPrn(int Prn) {
	        

	       JDBCHandling jdbcImpl = new JDBCHandling();
	        Staff staff = jdbcImpl.getoneStaff(Prn); 
	        
	        return staff;
	    }
	/**
	 * Create the application.
	 */
	public DeleteStaff() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension ScreenSize =kit.getScreenSize();
		int width = ScreenSize.width;
		int height = ScreenSize.height;
		frame.setSize(width/2, height*1/3);
		frame.setLocationRelativeTo(null);
		//frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblDeleteStaff = new JLabel("Delete Staff");
		lblDeleteStaff.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeleteStaff.setForeground(new Color(30, 144, 255));
		lblDeleteStaff.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 30));
		lblDeleteStaff.setBounds(76, 6, 314, 70);
		frame.getContentPane().add(lblDeleteStaff);
		
		JLabel lblNewLabel_2_2_3 = new JLabel("PRN");
		lblNewLabel_2_2_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_3.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 20));
		lblNewLabel_2_2_3.setBounds(415, 25, 66, 24);
		frame.getContentPane().add(lblNewLabel_2_2_3);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(481, 21, 166, 34);
		frame.getContentPane().add(textField);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(76, 64, 683, 37);
		frame.getContentPane().add(separator);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.BLACK);
		separator_2.setBounds(76, 243, 683, 37);
		frame.getContentPane().add(separator_2);
		
		JButton btnDeleteRecord = new JButton("Delete record");
		btnDeleteRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String Prn = textField.getText();
				
				
				 if (!Prn.isEmpty()) {
	                   try {
	                       int PRN = Integer.parseInt(Prn);

	                     
	                       JDBCHandling jdbcImpl = new JDBCHandling();
	                       int status = jdbcImpl.deleteStaff(PRN); 
	                       
	                       if (status > 0) {
	                           JOptionPane.showMessageDialog(frame, "Staff record deleted successfully!");
	                       } else {
	                           JOptionPane.showMessageDialog(frame, "Staff not found or deletion failed!");
	                       }

	                      

	                   } catch (NumberFormatException ex) {
	                       JOptionPane.showMessageDialog(frame, "Please enter a valid Prn!");
	                   }
	               } else {
	                   JOptionPane.showMessageDialog(frame, "Prn cannot be empty!");
	               }
				
				
			}
		});
		btnDeleteRecord.setBounds(362, 270, 117, 29);
		frame.getContentPane().add(btnDeleteRecord);
		
		JButton btnGetStaff = new JButton("Get Staff");
		btnGetStaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				String PrnText = textField.getText();
				
				
				if (!PrnText.isEmpty()) {

				
				try {
	                int Prn = Integer.parseInt(PrnText);

	                
	                Staff staff = getStaffByPrn(Prn);

	         
	                DefaultTableModel model = new DefaultTableModel();
	                model.addColumn("Prn");
	                model.addColumn("First Name");
	                model.addColumn("Last Name");
	                model.addColumn("Mobile No");
	                model.addColumn("Address");
	               
	                model.addColumn("sub1");
	                model.addColumn("sub2");
	                model.addColumn("Gender");
	                model.addColumn("Degree");

	                
	                if (staff != null) {
	                    Object[] row = {staff.getPrn(), staff.getFirstName(), staff.getLastName(), staff.getMobileNo(), staff.getAddress(),
	                    		 staff.getSub1(), staff.getSub2(), staff.getGender(), staff.getDegree()};
	                    model.addRow(row);
	                } else {
	                    JOptionPane.showMessageDialog(frame, "Staff not found!");
	                }

	                
	                table.setModel(model);

	            } catch (NumberFormatException ex) {
	                JOptionPane.showMessageDialog(frame, "Please enter a valid Prn!");
	            }
	        } else {
	            JOptionPane.showMessageDialog(frame, "Prn cannot be empty!");
	        }
			
				
				
				
			}

			
		});
		btnGetStaff.setBounds(86, 270, 117, 29);
		frame.getContentPane().add(btnGetStaff);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.setVisible(false);
			}
		});
		btnClose.setBounds(642, 270, 117, 29);
		frame.getContentPane().add(btnClose);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 86, 816, 150);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
             table.setModel(new DefaultTableModel(
				
				new Object[][] {
					
				},
				new String[] {
						"First name", "Last name","Mobile Number ", "Address", "sub1", "sub2", "Gender", "Degree"
						
						
				}
				));
	}

}
