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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DeleteStudent {

	private JFrame frmDeleteStudent;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteStudent window = new DeleteStudent();
					window.frmDeleteStudent.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	  private static Student getStudentByRollNumber(int rollNumber) {
	        

	       JDBCHandling jdbcImpl = new JDBCHandling();
	        Student student = jdbcImpl.getoneStudent(rollNumber); 
	        
	        return student;
	    }
	/**
	 * Create the application.
	 */
	public DeleteStudent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDeleteStudent = new JFrame();
		frmDeleteStudent.setTitle("Delete Student");
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension ScreenSize =kit.getScreenSize();
		int width = ScreenSize.width;
		int height = ScreenSize.height;
		frmDeleteStudent.setSize(width/2, height*1/3);
		frmDeleteStudent.setLocationRelativeTo(null);
		
		//frame.setBounds(100, 100, 450, 300);
		frmDeleteStudent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDeleteStudent.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_2_2_3 = new JLabel("Roll Number");
		lblNewLabel_2_2_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_3.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 20));
		lblNewLabel_2_2_3.setBounds(356, 28, 153, 24);
		frmDeleteStudent.getContentPane().add(lblNewLabel_2_2_3);
		
		JLabel lblDeleteStudent = new JLabel("Delete Student");
		lblDeleteStudent.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeleteStudent.setForeground(new Color(30, 144, 255));
		lblDeleteStudent.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 30));
		lblDeleteStudent.setBounds(75, 6, 314, 70);
		frmDeleteStudent.getContentPane().add(lblDeleteStudent);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(480, 21, 166, 34);
		frmDeleteStudent.getContentPane().add(textField);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(75, 64, 683, 37);
		frmDeleteStudent.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(21, 563, 792, 17);
		frmDeleteStudent.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.BLACK);
		separator_2.setBounds(75, 243, 683, 37);
		frmDeleteStudent.getContentPane().add(separator_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 102, 792, 111);
		frmDeleteStudent.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
	table.setModel(new DefaultTableModel(
				
				new Object[][] {
					
				},
				new String[] {
						"First name", "Last name","Mobile Number ", "Address", "DOB", "sub1", "sub2", "Gender", "Degree"
						
						
				}
				));
	
	JButton btnNewButton = new JButton("Get Student");
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			
			String rollNumberText = textField.getText();
			
			
			if (!rollNumberText.isEmpty()) {

			
			try {
                int rollNumber = Integer.parseInt(rollNumberText);

                
                Student student = getStudentByRollNumber(rollNumber);

         
                DefaultTableModel model = new DefaultTableModel();
                model.addColumn("Roll Number");
                model.addColumn("First Name");
                model.addColumn("Last Name");
                model.addColumn("Mobile No");
                model.addColumn("Address");
                model.addColumn("DOB");
                model.addColumn("sub1");
                model.addColumn("sub2");
                model.addColumn("Gender");
                model.addColumn("Degree");

                
                if (student != null) {
                    Object[] row = {student.getRollNumber(), student.getFirstName(), student.getLastName(), student.getMobileNo(), student.getAddress(),
                    		student.getDob(), student.getSub1(), student.getSub2(), student.getGender(), student.getDegree()};
                    model.addRow(row);
                } else {
                    JOptionPane.showMessageDialog(frmDeleteStudent, "Student not found!");
                }

                
                table.setModel(model);

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frmDeleteStudent, "Please enter a valid roll number!");
            }
        } else {
            JOptionPane.showMessageDialog(frmDeleteStudent, "Roll number cannot be empty!");
        }
		
			
			
			
		}
	});
	btnNewButton.setBounds(85, 270, 117, 29);
	frmDeleteStudent.getContentPane().add(btnNewButton);
	
	JButton btnDeleteRecord = new JButton("Delete record");
	btnDeleteRecord.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			String rollNumberText = textField.getText();
			
			
			 if (!rollNumberText.isEmpty()) {
                   try {
                       int rollNumber = Integer.parseInt(rollNumberText);

                     
                       JDBCHandling jdbcImpl = new JDBCHandling();
                       int status = jdbcImpl.deleteRecord(rollNumber); 
                       
                       if (status > 0) {
                           JOptionPane.showMessageDialog(frmDeleteStudent, "Student record deleted successfully!");
                       } else {
                           JOptionPane.showMessageDialog(frmDeleteStudent, "Student not found or deletion failed!");
                       }

                      

                   } catch (NumberFormatException ex) {
                       JOptionPane.showMessageDialog(frmDeleteStudent, "Please enter a valid roll number!");
                   }
               } else {
                   JOptionPane.showMessageDialog(frmDeleteStudent, "Roll number cannot be empty!");
               }
		}
	});
	btnDeleteRecord.setBounds(361, 270, 117, 29);
	frmDeleteStudent.getContentPane().add(btnDeleteRecord);
	
	JButton btnClose = new JButton("Close");
	btnClose.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			
			frmDeleteStudent.setVisible(false);
		}
	});
	btnClose.setBounds(641, 270, 117, 29);
	frmDeleteStudent.getContentPane().add(btnClose);
	}
}
