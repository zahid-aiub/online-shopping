package net.zahid.shoppingBackend.dao;

import java.util.List;

import net.zahid.shoppingBackend.dto.Product;

public interface ProductDAO {
	
	Product get(int productId);
	List<Product> list();
	boolean add(Product product);
	boolean update(Product product);
	boolean delete(Product product);
	
	//Buiesness Methods
	List<Product> listOfActiveProducts();
	List<Product> listOfActiveProductByCategory(int categoryId);
	List<Product> getLeatestUpdateProducts(int count);

}
