package edu.esprit.ecommerceproject.ejb.entities;

import java.io.Serializable;


import javax.persistence.*;


@Entity
public class Product implements Serializable {

	   
	@Id
	private int IdProduct;
	private String NameProduct;
	private String Model;
	private String Brand;
	private int Quantity;
	private String DiscountRate;
	private String Description;
	private String Supplier;
	private float UnitPrice;
	private String picture;
	private static final long serialVersionUID = 1L;
	

	@ManyToOne
	private Category category;

	public Product() {
		super();
	}   
	public int getIdProduct() {
		return this.IdProduct;
	}

	public void setIdProduct(int IdProduct) {
		this.IdProduct = IdProduct;
	}   
	public String getNameProduct() {
		return this.NameProduct;
	}

	public void setNameProduct(String NameProduct) {
		this.NameProduct = NameProduct;
	}   
	public String getModel() {
		return this.Model;
	}

	public void setModel(String Model) {
		this.Model = Model;
	}   
	public String getBrand() {
		return this.Brand;
	}

	public void setBrand(String Brand) {
		this.Brand = Brand;
	}   
	public int getQuantity() {
		return this.Quantity;
	}

	public void setQuantity(int Quantity) {
		this.Quantity = Quantity;
	}   
	public String getDiscountRate() {
		return this.DiscountRate;
	}

	public void setDiscountRate(String DiscountRate) {
		this.DiscountRate = DiscountRate;
	}   
	public String getDescription() {
		return this.Description;
	}

	public void setDescription(String Description) {
		this.Description = Description;
	}   
	public String getSupplier() {
		return this.Supplier;
	}

	public void setSupplier(String Supplier) {
		this.Supplier = Supplier;
	}   
	public float getUnitPrice() {
		return this.UnitPrice;
	}

	public void setUnitPrice(float UnitPrice) {
		this.UnitPrice = UnitPrice;
	}   
	public String getPicture() {
		return this.picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}
   
}


