package Mainpackage;

import java.util.Date;

public class Staff {
	
	int Prn;
	String username;
	String lastName;
	Long mobile;
	String address;
	String dob;
	String sub1;
	String sub2;
	String gender;
	String degree;
	
	
	public int getPrn() {
		return Prn;
	}

	public void setPrn(int Prn) {
		this.Prn = Prn;
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
	
//	
//	public String getDob() {
//		return dob;
//	}
//
//	public void setDob(String dobText) {
//		this.dob = dobText;
//	}
	
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
	
	
	public Staff(int Prn, String username, String lastName,long mobile ,String address, String sub1 ,String sub2, String gender ,String degree) {
		super();
		this.Prn = Prn;
		this.username = username;
		this.lastName = lastName;
		this.mobile = mobile;
		this.address = address;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.gender = gender;
		this.degree = degree;
		
	}
      public Staff() {
		
		super();
		
		
	 }
	
	@Override
	public String toString() {
		return "Staff [rollNumber=" + Prn + ", firstName=" + username + ", lastName=" + lastName + "mobile="+ mobile +", address=" + address + ", Sub1=" + sub1 +", Sub2=" + sub2 +", gender=" + gender + ", Degree ="+ degree+ "]"  ;
	}

	

	


}
	

