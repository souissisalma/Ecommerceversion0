package edu.esprit.ecommerceproject.ejb.services;

import java.util.List;

import javax.ejb.Remote;

import edu.esprit.ecommerceproject.ejb.entities.Complaint;

@Remote
public interface ComplaintManagementRemote {

	public void deleteComplaint(Complaint com);

	public Complaint findComplaint(int idComplaint);

	public List<Complaint> findAll();
	

}
