package edu.esprit.ecommerceproject.ejb.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Category implements Serializable {

	
	   
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int IdCategory;
		private String NameCategory;
		private static final long serialVersionUID = 1L;
		

		@ManyToOne
		private Administrator administrator;
		
		@OneToMany(mappedBy = "category")
		private List<Product> products = new ArrayList<Product>();

		public Category() {
			super();
		}   
		public int getIdCategory() {
			return this.IdCategory;
		}

		public void setIdCategory(int IdCategory) {
			this.IdCategory = IdCategory;
		}   
		public String getNameCategory() {
			return this.NameCategory;
		}

		public void setNameCategory(String NameCategory) {
			this.NameCategory = NameCategory;
		}
	   
	}
