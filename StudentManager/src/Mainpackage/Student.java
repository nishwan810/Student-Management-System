package Mainpackage;

public class Student {

	int Rollno;
	String username;
	String lastName;
	Long mobile;
	String address;
	String dob;
	String sub1;
	String sub2;
	String gender;
	String degree;
	
	
	
	
//	pstmt.setString(1,Rollno);
//	pstmt.setString(2,username);
//	pstmt.setString(3,lastname);
//	pstmt.setLong(4, mobile);
//	pstmt.setString(5, address);
//	pstmt.setString(6, dob);
//	pstmt.setString(7, sub1);
//	pstmt.setString(8, sub2);
//	pstmt.setString(9, gender);
//	pstmt.setString(10, degree);

	public int getRollNumber() {
		return Rollno;
	}

	public void setRollNumber(int Rollno) {
		this.Rollno = Rollno;
	}

	public String getFirstName() {
		return username;
	}

	public void setFirstName(String username) {
		this.username = username;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public long getMobileNo() {
		return mobile;
	}

	public void setMobileNo(long mobile) {
		this.mobile = mobile;
	}
	
	public String getAddress() {
		return lastName;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
	
	public String getSub1() {
		return sub1;
	}

	public void setSub1(String sub1) {
		this.sub1 = sub1;
	}
	
	public String getSub2() {
		return sub2;
	}

	public void setSub2(String sub2) {
		this.sub2 = sub2;
	}
	
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}
	
	


//	String Rollno ,String username ,String lastname,long mobile ,String address ,String dob ,String sub1 ,String sub2, String gender ,String degree
	
	public Student(int Rollno, String username, String lastName,long mobile ,String address ,String dob ,String sub1 ,String sub2, String gender ,String degree) {
		super();
		this.Rollno = Rollno;
		this.username = username;
		this.lastName = lastName;
		this.mobile = mobile;
		this.address = address;
		this.dob = dob;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.gender = gender;
		this.degree = degree;
		
	}
      public Student() {
		
		super();
		
		
	 }
	
	@Override
	public String toString() {
		return "Student [rollNumber=" + Rollno + ", firstName=" + username + ", lastName=" + lastName + "mobile="+ mobile +", address=" + address + ", DOB= " + dob + ", Sub1=" + sub1 +", Sub2=" + sub2 +", gender=" + gender + ", Degree ="+ degree+ "]"  ;
	}

	


}
