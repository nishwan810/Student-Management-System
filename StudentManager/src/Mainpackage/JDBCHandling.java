package Mainpackage;
 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;







public class JDBCHandling implements JDBC {
	
	
	Connection con ;
	PreparedStatement pstmt ;
	Statement stmt;
	ResultSet result;
	
	JDBCHandling(){
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver mil Gaya");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://LocalHost:3306/test3","root","nishwan810");
			System.out.println("Connection mil gaya");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	




@Override
public Student getoneStudent(int Rollno) {
	System.out.println("Reached to this Method");
	Student s1 = new Student();
	
	String query = "Select * from student_table where Roll_Number=?";



	try {
		pstmt = con.prepareStatement(query);
		
		pstmt.setInt(1, Rollno);

		result = pstmt.executeQuery();

		while(result.next()) {
			
//			s1.setRollNumber(Rollno);
			s1.setRollNumber(result.getInt(1));
			s1.setFirstName(result.getString(2));
			s1.setLastName(result.getString(3));
			
//			String mobileStr = result.getString("Mobile No"); 
//            long mobile = (mobileStr != null && !mobileStr.isEmpty()) ? Long.parseLong(mobileStr) : 0L;
//            s1.setMobileNo(mobile);
            
			  s1.setMobileNo(result.getLong(4));
			  s1.setAddress(result.getString(5));
			  s1.setDob(result.getString(6));
			  s1.setSub1(result.getString(7));
			  s1.setSub2(result.getString(8));
			  s1.setGender(result.getString(9));
			  s1.setDegree(result.getString(10));


		}
		con.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}


	return s1;

}




@Override
public int insertrecord(Student s1) {
	int status= 0;
	String query = "insert into student_table value(?,?,?,?,?,?,?,?,?,?)";
	
	try {
		
//		pstmt.setString(1,Rollno);
//		pstmt.setString(2,username);
//		pstmt.setString(3,lastname);
//		pstmt.setLong(4, mobile);
//		pstmt.setString(5, address);
//		pstmt.setString(6, dob);
//		pstmt.setString(7, sub1);
//		pstmt.setString(8, sub2);
//		pstmt.setString(9, gender);
//		pstmt.setString(10, degree);
		
		
		pstmt =con.prepareStatement(query);
		pstmt.setInt(1,s1.getRollNumber());
		pstmt.setString(2,s1.getFirstName());
		pstmt.setString(3,s1.getLastName());
		pstmt.setLong(4,s1.getMobileNo());
		pstmt.setString(5,s1.getAddress());
		pstmt.setString(6,s1.getDob());
		pstmt.setString(7,s1.getSub1());
		pstmt.setString(8,s1.getSub2());
		pstmt.setString(9,s1.getGender());
		pstmt.setString(10,s1.getDegree());
		
		status = pstmt.executeUpdate();
		con.close();
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	

	return status;
}




@Override
public ArrayList<Student> getAllStudent() {
	
	
	ArrayList<Student> studentList =new ArrayList<>();
	String query = "select * from student_table ";
	
	try {
		stmt = con.createStatement();
		
		
		result = stmt.executeQuery(query);
		while(result.next()) {
			
			Student s1 = new Student();
			
			s1.setRollNumber(result.getInt(1));
			s1.setFirstName(result.getString(2));
			s1.setLastName(result.getString(3));
			
//			student.setMobileNo(rs.getObject("mobile", Long.class)
			  s1.setMobileNo(result.getLong(4));
			  s1.setAddress(result.getString(5));
			  s1.setDob(result.getString(6));
			  s1.setSub1(result.getString(7));
			  s1.setSub2(result.getString(8));
			  s1.setGender(result.getString(9));
			  s1.setDegree(result.getString(10));

			
			studentList.add(s1);
			
			
			
			
			
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	
	
	return studentList;
}





@Override
public int updateRecord(Student s1) {
	int Status =0;
	
    String query = "update student_table set `First Name`=?, `Last Name`=?, `Mobile No`=?, Address=?, DOB=?, Sub1=?, Sub2=?, Gender=?, Degree=? WHERE Roll_Number =?";
	

	
	
	
	try {
		pstmt =con.prepareStatement(query);
		pstmt.setString(1, s1.getFirstName());
		pstmt.setString(2, s1.getLastName());
		pstmt.setLong(3,s1.getMobileNo());
		pstmt.setString(4,s1.getAddress());
		pstmt.setString(5,s1.getDob());
		pstmt.setString(6,s1.getSub1());
		pstmt.setString(7,s1.getSub2());
		pstmt.setString(8,s1.getGender());
		pstmt.setString(9,s1.getDegree());
		
		pstmt.setInt(10, s1.getRollNumber());
		
		
		Status = pstmt.executeUpdate();
		
		con.close();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	

	
	
	return Status ;
}




@Override
public int deleteRecord(int rollNumber) {
	
	int Status = 0;
	
	String query = "delete from student_table where Roll_Number=?";
	
	try {
		pstmt =con.prepareStatement(query);
		pstmt.setInt(1, rollNumber);
		
		Status = pstmt.executeUpdate();
		
		con.close();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
	

	
	return Status;
}



//  STAFF MANAGEMENT


@Override
public Staff getoneStaff(int Prn) {
	System.out.println("Reached to this Method");
//	Student s1 = new Student();
	Staff z1 =new Staff();
	
	String query = "Select * from staff_table where Prn=?";



	try {
		pstmt = con.prepareStatement(query);
		
		pstmt.setInt(1, Prn);

		result = pstmt.executeQuery();

		while(result.next()) {
			
//			s1.setRollNumber(Rollno);
			z1.setPrn(result.getInt(1));
			z1.setFirstName(result.getString(2));
			z1.setLastName(result.getString(3));
			
//			String mobileStr = result.getString("Mobile No"); 
//            long mobile = (mobileStr != null && !mobileStr.isEmpty()) ? Long.parseLong(mobileStr) : 0L;
//            s1.setMobileNo(mobile);
            
			  z1.setMobileNo(result.getLong(4));
			  z1.setAddress(result.getString(5));
			 
			  z1.setSub1(result.getString(6));
			  z1.setSub2(result.getString(7));
			  z1.setGender(result.getString(8));
			  z1.setDegree(result.getString(9));


		}
		con.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}


	return z1;
}






@Override
public int insertrecord(Staff z1) {
	int status= 0;
	String query = "insert into staff_table value(?,?,?,?,?,?,?,?,?)";
	
	try {
		
		
		
		pstmt =con.prepareStatement(query);
		pstmt.setInt(1,z1.getPrn());
		pstmt.setString(2,z1.getFirstName());
		pstmt.setString(3,z1.getLastName());
		pstmt.setLong(4,z1.getMobileNo());
		pstmt.setString(5,z1.getAddress());
	
		pstmt.setString(6,z1.getSub1());
		pstmt.setString(7,z1.getSub2());
		pstmt.setString(8,z1.getGender());
		pstmt.setString(9,z1.getDegree());
		
		status = pstmt.executeUpdate();
		con.close();
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	

	return status;
}






@Override
public ArrayList<Staff> getAllStaff() {
	ArrayList<Staff> staffList = new ArrayList<>();
	String query = "select * from staff_table ";
	
	try {
		stmt = con.createStatement();
		
		
		result = stmt.executeQuery(query);
		while(result.next()) {
			
			Staff z1 = new Staff();
			
			z1.setPrn(result.getInt(1));
			z1.setFirstName(result.getString(2));
			z1.setLastName(result.getString(3));
			
//			student.setMobileNo(rs.getObject("mobile", Long.class)
			  z1.setMobileNo(result.getLong(4));
			  z1.setAddress(result.getString(5));
			 
			  z1.setSub1(result.getString(6));
			  z1.setSub2(result.getString(7));
			  z1.setGender(result.getString(8));
			  z1.setDegree(result.getString(9));

			
			  staffList.add(z1);
			
			
			
			
			
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	
	
	return staffList;
}






@Override
public int updateRecord(Staff z2) {
int Status =0;
	
    String query = "update staff_table set username=?, LastName=?, `Mobile No`=?, Address=?, Subject1=?, Subject2=?, Gender=?, Degree=? WHERE Prn=?";
	

	
	
	
	try {
		pstmt =con.prepareStatement(query);
		pstmt.setString(1, z2.getFirstName());
		pstmt.setString(2, z2.getLastName());
		pstmt.setLong(3,z2.getMobileNo());
		pstmt.setString(4,z2.getAddress());
		
		pstmt.setString(5,z2.getSub1());
		pstmt.setString(6,z2.getSub2());
		pstmt.setString(7,z2.getGender());
		pstmt.setString(8,z2.getDegree());
		
		pstmt.setInt(9, z2.getPrn());
		
		
		Status = pstmt.executeUpdate();
		
		con.close();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	

	
	
	return Status ;
}






@Override
public int deleteStaff(int Prn) {
	int Status = 0;
	
	String query = "delete from staff_table where Prn=?";
	
	try {
		pstmt =con.prepareStatement(query);
		pstmt.setInt(1, Prn);
		
		Status = pstmt.executeUpdate();
		
		con.close();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
	

	
	return Status;
}





	

}
