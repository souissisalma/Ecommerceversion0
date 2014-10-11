package edu.esprit.ecommerceproject.ejb.services;

import java.util.List;

import javax.ejb.Remote;

import edu.esprit.ecommerceproject.ejb.entities.Product;

@Remote
public interface ProductManagementRemote {
	
	public void addProduct(Product p);
	public void updateProduct(Product p);
	public Product findProduct(int idProduct);
	public void deleteProduct(Product p);
	public List<Product> findAll();

}
