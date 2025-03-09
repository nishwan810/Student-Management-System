package Mainpackage;

import java.util.ArrayList;


public interface JDBC {

Student getoneStudent(int rollNumber);
	
	int insertrecord(Student s1);
	
	 ArrayList<Student>  getAllStudent();
	 
	 int updateRecord(Student s1);
	 
	 int deleteRecord(int rollNumber);
	 
	 // STAFF
	 
	 Staff getoneStaff(int Prn);
	 
	 int insertrecord(Staff z1);
	 
	 ArrayList<Staff>  getAllStaff();
	 
	 int updateRecord(Staff z1);
	 
	 int deleteStaff(int Prn);

}
