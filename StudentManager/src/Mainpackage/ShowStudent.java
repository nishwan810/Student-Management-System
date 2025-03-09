package Mainpackage;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.RowSorter;
import javax.swing.SortOrder;

import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class ShowStudent {

	private JFrame frmStudentList;
	private JTable table;
	
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowStudent window = new ShowStudent();
					window.frmStudentList.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	  private static void loadDataFromDatabase(JTable table) {
	        
	        JDBCHandling jdbcImpl = new JDBCHandling();
	        
	        
	        ArrayList<Student> studentList = jdbcImpl.getAllStudent();

	      
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

	        
	        for (Student student : studentList) {
	            Object[] row = {student.getRollNumber(), student.getFirstName(), student.getLastName(), student.getMobileNo(), student.getAddress(),
	            		student.getDob(), student.getSub1(), student.getSub2(), student.getGender(), student.getDegree()};
	            model.addRow(row);
	        }

	        
	        table.setModel(model);
	        
	     // Create TableRowSorter and set it to the table
	        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
	        table.setRowSorter(sorter);

	        // Sort by "Roll Number" (First column, index 0)
	        ArrayList<RowSorter.SortKey> sortKeys = new ArrayList<>();
	        sortKeys.add(new RowSorter.SortKey(0, SortOrder.ASCENDING)); // Ascending order

	        sorter.setSortKeys(sortKeys);
	        sorter.sort();
	    }
	
	private static void loadAllStudentsData(JTable table) {
        
        JDBCHandling jdbcImpl = new JDBCHandling();
        java.util.List<Student> studentList = jdbcImpl.getAllStudent(); 

        
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
        
       
//        "First name", "Last name", "Mobile no", "Address", "DOB", "sub1", "sub2", "Gender", "Degree"
       
        for (Student student : studentList) {
            Object[] row = {student.getRollNumber(), student.getFirstName(), student.getLastName(), student.getMobileNo(), student.getAddress(),
            		student.getDob(), student.getSub1(), student.getSub2(), student.getGender(), student.getDegree()};
            model.addRow(row);
        }

       
        table.setModel(model);
    }
	/**
	 * Create the application.
	 */
	public ShowStudent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStudentList = new JFrame();
		frmStudentList.setTitle("Student List");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension ScreenSize =kit.getScreenSize();
		int width = ScreenSize.width;
		int height = ScreenSize.height;
		frmStudentList.setSize(width, height);
		frmStudentList.setLocationRelativeTo(null);
//		frame.setBounds(100, 100, 450, 300);
		frmStudentList.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStudentList.getContentPane().setLayout(null);
		
		JLabel lblStudent = new JLabel("Student Database");
		lblStudent.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudent.setForeground(new Color(30, 144, 255));
		lblStudent.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 30));
		lblStudent.setBounds(573, 19, 534, 70);
		frmStudentList.getContentPane().add(lblStudent);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(498, 81, 683, 37);
		frmStudentList.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(498, 923, 683, 37);
		frmStudentList.getContentPane().add(separator_1);
		
		JButton btnNewButton = new JButton("Show");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				loadDataFromDatabase(table);
//				JDBCHandling db =new JDBCHandling();
//				
//				ResultSet result =db.getTable();
//				
//				DefaultTableModel model = new DefaultTableModel();
//				String[] columnNames = {"First name", "Last name", "Mobile no", "Address", "DOB", "sub1", "sub2", "Gender", "Degree"};
//				
//				model.setColumnIdentifiers(columnNames);
//				
//				
//				try {
//					while(result.next()) {
//						model.addRow(new Object[] {
//								
//								result.getString(1),
//								result.getString(2),
//								result.getLong(3),
//								result.getString(4),
//								
//								result.getString(5),
//								result.getString(6),
//								result.getString(7),
//								result.getString(8),
//								result.getString(9),
//						});
//						
//						
//						
//						
//					}
//				} catch (SQLException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
//						
//				
//				
//				table.setModel(model);
//				table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
//				
//				try {
//					result.close();
//				} catch (SQLException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
//				
//				
				
				
			}
		});
		btnNewButton.setBounds(781, 956, 117, 29);
		frmStudentList.getContentPane().add(btnNewButton);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmStudentList.setVisible(false);
			}
		});
		btnExit.setBounds(1064, 956, 117, 29);
		frmStudentList.getContentPane().add(btnExit);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmStudentList.setVisible(false);
			}
		});
		btnBack.setBounds(498, 956, 117, 29);
		frmStudentList.getContentPane().add(btnBack);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(191, 180, 1297, 661);
		frmStudentList.getContentPane().add(scrollPane);
		
//		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		table.setForeground(Color.BLUE);
		table.setModel(new DefaultTableModel(
				
				new Object[][] {
					
				},
				new String[] {
						"First name", "Last name", "Mobile no", "Address", "DOB", "sub1", "sub2", "Gender", "Degree"
						
						
				}
				));
	}
}
