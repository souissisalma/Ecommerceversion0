package edu.esprit.ecommerceproject.ejb.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.esprit.ecommerceproject.ejb.entities.Complaint;

/**
 * Session Bean implementation class ComplaintManagement
 */
@Stateless
public class ComplaintManagement implements ComplaintManagementRemote {

    	@PersistenceContext
    	EntityManager em;
    	
    	Complaint complaint;
    	
       public ComplaintManagement() {
       	
           
       }
       

    	@Override
    	public void deleteComplaint(Complaint com) {
    		// TODO Auto-generated method stub
    		em.remove(em.find(Complaint.class, com.getIdComplaint()));
    		
    	}

    	@Override
    	public Complaint findComplaint(int idComplaint) {
    		// TODO Auto-generated method stub
    		return em.find(Complaint.class, idComplaint);
    	}

    	@Override
    	public List<Complaint> findAll() {
    		// TODO Auto-generated method stub
    		return(List<Complaint>) em.createNamedQuery("findAllComplaints").getResultList();
    	}

}


