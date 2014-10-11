package edu.esprit.ecommerceproject.ejb.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.esprit.ecommerceproject.ejb.entities.Product;


/**
 * Session Bean implementation class ProductManagement
 */
@Stateless
public class ProductManagement implements ProductManagementRemote {

	@PersistenceContext
	EntityManager em;
	
	Product product;
	
    /**
     * Default constructor. 
     */
    public ProductManagement() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void addProduct(Product p) {
		em.persist(p);
		
	}

	@Override
	public void updateProduct(Product p) {
		em.merge(p);
		
	}

	@Override
	public Product findProduct(int idProduct) {
		
		return em.find(Product.class, idProduct);
	}

	@Override
	public void deleteProduct(Product p) {
		em.remove(em.find(Product.class, p.getIdProduct()));
		
	}

	@Override
	public List<Product> findAll() {
		
		return (List<Product>) em.createNamedQuery("findAllProduts").getResultList();
	}

	
}
