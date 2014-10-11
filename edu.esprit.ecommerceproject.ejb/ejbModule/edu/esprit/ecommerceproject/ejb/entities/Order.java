package edu.esprit.ecommerceproject.ejb.entities;

import java.io.Serializable;

import javax.persistence.*;

import edu.esprit.ecommerceproject.ejb.entities.Administrator;
@Entity

public class Order implements Serializable {

	   
	@Id
	private int IdOrder;
	private String NumberOfOrder;
	private String MailingDate;
	private String DeliveryDate;
	private int QuantityOrdered;
	private String Statuts;
	private static final long serialVersionUID = 1L;
	


	@ManyToOne
	private Administrator administrator;

	public Order() {
		super();
	}   
	public int getIdOrder() {
		return this.IdOrder;
	}

	public void setIdOrder(int IdOrder) {
		this.IdOrder = IdOrder;
	}   
	public String getNumberOfOrder() {
		return this.NumberOfOrder;
	}

	public void setNumberOfOrder(String NumberOfOrder) {
		this.NumberOfOrder = NumberOfOrder;
	}   
	public String getMailingDate() {
		return this.MailingDate;
	}

	public void setMailingDate(String MailingDate) {
		this.MailingDate = MailingDate;
	}   
	public String getDeliveryDate() {
		return this.DeliveryDate;
	}

	public void setDeliveryDate(String DeliveryDate) {
		this.DeliveryDate = DeliveryDate;
	}   
	public int getQuantityOrdered() {
		return this.QuantityOrdered;
	}

	public void setQuantityOrdered(int QuantityOrdered) {
		this.QuantityOrdered = QuantityOrdered;
	}   
	public String getStatuts() {
		return this.Statuts;
	}

	public void setStatuts(String Statuts) {
		this.Statuts = Statuts;
	}
   
}

