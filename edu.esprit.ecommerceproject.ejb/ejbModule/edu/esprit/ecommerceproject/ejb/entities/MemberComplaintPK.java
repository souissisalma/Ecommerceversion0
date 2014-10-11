package edu.esprit.ecommerceproject.ejb.entities;

import java.io.Serializable;

import javax.persistence.*;



/**
 * Entity implementation class for Entity: MemberComplaintPK
 *
 */
@Embeddable
public class MemberComplaintPK  implements Serializable {   
   
	         
	private int IdMember;         
	private int IdComplaint;
	private static final long serialVersionUID = 1L;

	public MemberComplaintPK() {}

	

	public int getIdMember() {
		return this.IdMember;
	}

	public void setIdMember(int IdMember) {
		this.IdMember = IdMember;
	}
	

	public int getIdComplaint() {
		return this.IdComplaint;
	}

	public void setIdComplaint(int IdComplaint) {
		this.IdComplaint = IdComplaint;
	}
	
   
	/*
	 * @see java.lang.Object#equals(Object)²
	 */	
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof MemberComplaintPK)) {
			return false;
		}
		MemberComplaintPK other = (MemberComplaintPK) o;
		return true
			&& getIdMember() == other.getIdMember()
			&& getIdComplaint() == other.getIdComplaint();
	}
	
	/*	 
	 * @see java.lang.Object#hashCode()
	 */	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + getIdMember();
		result = prime * result + getIdComplaint();
		return result;
	}
   
   
}

