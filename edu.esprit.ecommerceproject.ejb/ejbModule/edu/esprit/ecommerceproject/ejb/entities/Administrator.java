package edu.esprit.ecommerceproject.ejb.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Administrator
 *
 */
@Entity

public class Administrator implements Serializable {

	   
	@Id
	private int IdA;
	private String LoginA;
	private String PasswordA;
	private static final long serialVersionUID = 1L;
	
	
	@OneToMany(mappedBy = "administrator")
	private List<Category> categories = new ArrayList<Category>();

	@OneToMany(mappedBy = "administrator")
	private List<Complaint> complaints = new ArrayList<Complaint>();
	
	@OneToMany(mappedBy = "administrator")
	private List<Member> members = new ArrayList<Member>();
	
	@OneToMany(mappedBy = "administrator")
	private List<Order> orders = new ArrayList<Order>();
	
	@OneToMany(mappedBy = "administrator")
	private List<Review> reviews = new ArrayList<Review>();

	public Administrator() {
		super();
	}   
	public int getIdA() {
		return this.IdA;
	}

	public void setIdA(int IdA) {
		this.IdA = IdA;
	}   
	public String getLoginA() {
		return this.LoginA;
	}

	public void setLoginA(String LoginA) {
		this.LoginA = LoginA;
	}   
	public String getPasswordA() {
		return this.PasswordA;
	}

	public void setPasswordA(String PasswordA) {
		this.PasswordA = PasswordA;
	}
   
}
