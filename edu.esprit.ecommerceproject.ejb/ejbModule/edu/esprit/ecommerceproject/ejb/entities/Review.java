package edu.esprit.ecommerceproject.ejb.entities;

import java.io.Serializable;

import javax.persistence.*;

import edu.esprit.ecommerceproject.ejb.entities.Administrator;

@Entity

public class Review implements Serializable {

	   
	@Id
	private int IdReview;
	private String Subject;
	private static final long serialVersionUID = 1L;
	


	@ManyToOne
	private Administrator administrator;

	public Review() {
		super();
	}   
	public int getIdReview() {
		return this.IdReview;
	}

	public void setIdReview(int IdReview) {
		this.IdReview = IdReview;
	}   
	public String getSubject() {
		return this.Subject;
	}

	public void setSubject(String Subject) {
		this.Subject = Subject;
	}
   
}

