package edu.esprit.ecommerceproject.ejb.entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Payment
 *
 */
@Entity

public class Payment implements Serializable {

	   
	@Id
	private int IdCard;
	private String CardNumber;
	private String Type;
	private float Amount;
	private static final long serialVersionUID = 1L;

	public Payment() {
		super();
	}   
	public int getIdCard() {
		return this.IdCard;
	}

	public void setIdCard(int IdCard) {
		this.IdCard = IdCard;
	}   
	public String getCardNumber() {
		return this.CardNumber;
	}

	public void setCardNumber(String CardNumber) {
		this.CardNumber = CardNumber;
	}   
	public String getType() {
		return this.Type;
	}

	public void setType(String Type) {
		this.Type = Type;
	}   
	public float getAmount() {
		return this.Amount;
	}

	public void setAmount(float Amount) {
		this.Amount = Amount;
	}
   
}
