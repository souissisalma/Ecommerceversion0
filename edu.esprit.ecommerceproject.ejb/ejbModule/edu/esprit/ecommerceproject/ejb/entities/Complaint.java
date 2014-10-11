package edu.esprit.ecommerceproject.ejb.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import edu.esprit.ecommerceproject.ejb.entities.Administrator;
import edu.esprit.ecommerceproject.ejb.entities.MemberComplaint;

/**
 * Entity implementation class for Entity: Complaint
 *
 */
@Entity

public class Complaint implements Serializable {

	   
	@Id
	private int IdComplaint;
	private String Topic;
	private String DateOfDispatch;
	private String MailingAddress;
	private static final long serialVersionUID = 1L;
	@OneToMany(mappedBy="complaint")
	private List<MemberComplaint> membercomplaints;
	@ManyToOne
	private Administrator administrator;
	

	
	public List<MemberComplaint> getMembercomplaints() {
		return membercomplaints;
	}
	public void setMembercomplaints(List<MemberComplaint> membercomplaints) {
		this.membercomplaints = membercomplaints;
	}


	public Complaint() {
		super();
	}   
	public int getIdComplaint() {
		return this.IdComplaint;
	}

	public void setIdComplaint(int IdComplaint) {
		this.IdComplaint = IdComplaint;
	}   
	public String getTopic() {
		return this.Topic;
	}

	public void setTopic(String Topic) {
		this.Topic = Topic;
	}   
	public String getDateOfDispatch() {
		return this.DateOfDispatch;
	}

	public void setDateOfDispatch(String DateOfDispatch) {
		this.DateOfDispatch = DateOfDispatch;
	}   
	public String getMailingAddress() {
		return this.MailingAddress;
	}

	public void setMailingAddress(String MailingAddress) {
		this.MailingAddress = MailingAddress;
	}
	
public void assignMemberComplaintToThisMember(List<MemberComplaint> membercomplaints){
		
		this.setMembercomplaints(membercomplaints);
		for(MemberComplaint mc :membercomplaints){
			mc.setComplaint(this);
		}
   
}
}