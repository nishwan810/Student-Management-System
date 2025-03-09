package Mainpackage;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class ShowStaff {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowStaff window = new ShowStaff();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	 private static void loadDataFromDatabase(JTable table) {
	        
	        JDBCHandling jdbcImpl = new JDBCHandling();
	        
	        
	        ArrayList<Staff> staffList = jdbcImpl.getAllStaff();

	      
	        DefaultTableModel model = new DefaultTableModel();
	        model.addColumn("Roll Number");
	        model.addColumn("First Name");
	        model.addColumn("Last Name");
	        model.addColumn("Mobile No");
	        model.addColumn("Address");
	        model.addColumn("sub1");
	        model.addColumn("sub2");
	        model.addColumn("Gender");
	        model.addColumn("Degree");

	        
	        for (Staff staff : staffList) {
	            Object[] row = {staff.getPrn(), staff.getFirstName(), staff.getLastName(), staff.getMobileNo(), staff.getAddress(),
	            		 staff.getSub1(), staff.getSub2(), staff.getGender(), staff.getDegree()};
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
	
	/**
	 * Create the application.
	 */
	public ShowStaff() {
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
		frame.setSize(width*2/3, height*2/3);
		frame.setLocationRelativeTo(null);
//		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblStaffDatabase = new JLabel("Staff Database");
		lblStaffDatabase.setHorizontalAlignment(SwingConstants.CENTER);
		lblStaffDatabase.setForeground(new Color(30, 144, 255));
		lblStaffDatabase.setFont(new Font("Apple SD Gothic Neo", Font.BOLD, 30));
		lblStaffDatabase.setBounds(293, 6, 534, 70);
		frame.getContentPane().add(lblStaffDatabase);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(71, 68, 978, 37);
		frame.getContentPane().add(separator);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(43, 125, 1034, 422);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		
		table.setForeground(Color.BLUE);
		table.setModel(new DefaultTableModel(
				
				new Object[][] {
					
				},
				new String[] {
						"First name", "Last name", "Mobile no", "Address", "sub1", "sub2", "Gender", "Degree"
						
						
				}
				));
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(71, 572, 978, 37);
		frame.getContentPane().add(separator_1);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.setVisible(false);
			}
			
			
		});
		btnBack.setBounds(267, 606, 117, 29);
		frame.getContentPane().add(btnBack);
		
		JButton btnNewButton = new JButton("Show");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				loadDataFromDatabase(table);
				
				
			}
		});
		btnNewButton.setBounds(501, 606, 117, 29);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnExit.setBounds(737, 606, 117, 29);
		frame.getContentPane().add(btnExit);
	}
}
