package edu.esprit.ecommerceproject.ejb.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.esprit.ecommerceproject.ejb.entities.Category;


/**
 * Session Bean implementation class CategoryManagement
 */
@Stateless
public class CategoryManagement implements CategoryManagementRemote {


	@PersistenceContext
	EntityManager em;
	
	Category category;
	
   public CategoryManagement() {
   	
       
   }
   
	@Override
	public void addCategory() {
		// TODO Auto-generated method stub
		Category cat=new Category();
		cat.setNameCategory("Computing Tools");
		em.persist(cat);
		
	}

	@Override
	public void updateCategory(Category c) {
		// TODO Auto-generated method stub
		em.merge(c);
		
	}

	@Override
	public void deleteCategory(Category c) {
		// TODO Auto-generated method stub
		em.remove(em.find(Category.class, c.getIdCategory()));
		
	}

	@Override
	public Category findCategory(int idCategory) {
		// TODO Auto-generated method stub
		return em.find(Category.class, idCategory);
	}

	@Override
	public List<Category> findAll() {
		// TODO Auto-generated method stub
		return(List<Category>) em.createNamedQuery("findAllCategories").getResultList();
	}

}
