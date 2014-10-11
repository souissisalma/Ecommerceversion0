package edu.esprit.ecommerceproject.ejb.entities;

import java.io.Serializable;

import javax.persistence.*;

@Entity

public class ShoppingCart implements Serializable {

	   
	@Id
	private int IdShopCart;
	private int NumberOfProducts;
	private static final long serialVersionUID = 1L;

	public ShoppingCart() {
		super();
	}   
	public int getIdShopCart() {
		return this.IdShopCart;
	}

	public void setIdShopCart(int IdShopCart) {
		this.IdShopCart = IdShopCart;
	}   
	public int getNumberOfProducts() {
		return this.NumberOfProducts;
	}

	public void setNumberOfProducts(int NumberOfProducts) {
		this.NumberOfProducts = NumberOfProducts;
	}
   
}

