package edu.esprit.ecommerceproject.ejb.services;

import java.util.List;

import javax.ejb.Remote;

import edu.esprit.ecommerceproject.ejb.entities.Category;


@Remote
public interface CategoryManagementRemote {
	
	public void addCategory();
	public void updateCategory(Category c);
	public Category findCategory(int idCategory);
	public void deleteCategory(Category c);
	public List<Category> findAll();
	


}
