package edu.esprit.ecommerceproject.ejb.entities; 

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;    																																																																																																																											
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class MemberComplaint implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private MemberComplaintPK mc;
     private Member member;
	
	@ManyToOne
	@JoinColumn(insertable=false , updatable=false , name="IdMember" , referencedColumnName="IdMember")
	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}
	
    @ManyToOne
    @JoinColumn(insertable=false , updatable =false , name="IdComplaint" , referencedColumnName="IdComplaint")
	public Complaint getComplaint() {
		return complaint;
	}

	public void setComplaint(Complaint complaint) {
		this.complaint = complaint;
	}

	private Complaint complaint;
	
    @EmbeddedId
	public MemberComplaintPK getMC() {
		return mc;
	}

	public void setMC(MemberComplaintPK mc) {
		this.mc = mc;
	}

	public MemberComplaint() {
		super();
	}
	

   
}
