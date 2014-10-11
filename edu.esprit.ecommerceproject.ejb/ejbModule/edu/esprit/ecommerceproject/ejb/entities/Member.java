package edu.esprit.ecommerceproject.ejb.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import edu.esprit.ecommerceproject.ejb.entities.Administrator;
import edu.esprit.ecommerceproject.ejb.entities.MemberComplaint;
import edu.esprit.ecommerceproject.ejb.entities.ShoppingCart;

@Entity

public class Member implements Serializable {

	   
	@Id
	private int IdMember;
	private String LoginM;
	private String PasswordM;
	private String LastName;
	private String FirstName;
	private int Age;
	private String Sex;
	private String DateOfBirth;
	private String Address;
	private String MailAccount;
	private String PhoneNumber;
	private boolean IsBlocked;
	private static final long serialVersionUID = 1L;
	@OneToMany(mappedBy="member")
	private List<MemberComplaint> membrecomplaints;
	 @OneToOne
	 @JoinColumn(insertable=true,name="IdShopCart", referencedColumnName="IdShopCart")
	private ShoppingCart sc;
	
	@ManyToOne
	private Administrator administrator;

	
	public List<MemberComplaint> getMembrecomplaints() {
		return membrecomplaints;
	}
	public void setMembrecomplaints(List<MemberComplaint> membrecomplaints) {
		this.membrecomplaints = membrecomplaints;
	}
	public Member() {
		super();
	}   
	public int getIdMember() {
		return this.IdMember;
	}

	public void setIdMember(int IdMember) {
		this.IdMember = IdMember;
	}   
	public String getLoginM() {
		return this.LoginM;
	}

	public void setLoginM(String LoginM) {
		this.LoginM = LoginM;
	}   
	public String getPasswordM() {
		return this.PasswordM;
	}

	public void setPasswordM(String PasswordM) {
		this.PasswordM = PasswordM;
	}   
	public String getLastName() {
		return this.LastName;
	}

	public void setLastName(String LastName) {
		this.LastName = LastName;
	}   
	public String getFirstName() {
		return this.FirstName;
	}

	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}   
	public int getAge() {
		return this.Age;
	}

	public void setAge(int Age) {
		this.Age = Age;
	}   
	public String getSex() {
		return this.Sex;
	}

	public void setSex(String Sex) {
		this.Sex = Sex;
	}   
	public String getDateOfBirth() {
		return this.DateOfBirth;
	}

	public void setDateOfBirth(String DateOfBirth) {
		this.DateOfBirth = DateOfBirth;
	}   
	public String getAddress() {
		return this.Address;
	}

	public void setAddress(String Address) {
		this.Address = Address;
	}   
	public String getMailAccount() {
		return this.MailAccount;
	}

	public void setMailAccount(String MailAccount) {
		this.MailAccount = MailAccount;
	}   
	public String getPhoneNumber() {
		return this.PhoneNumber;
	}

	public void setPhoneNumber(String PhoneNumber) {
		this.PhoneNumber = PhoneNumber;
	}   
	public boolean getIsBlocked() {
		return this.IsBlocked;
	}

	public void setIsBlocked(boolean IsBlocked) {
		this.IsBlocked = IsBlocked;
	}
   
   
	public ShoppingCart getSc() {
		return sc;
	}
	public void setSc(ShoppingCart sc) {
		this.sc = sc;
	}

	
	
	public void assignMemberComplaintToThisMember(List<MemberComplaint> membercomplaints){
		
		this.setMembrecomplaints(membercomplaints);
		for(MemberComplaint mc :membercomplaints){
		   mc.setMember(this);
		}
	}
}
