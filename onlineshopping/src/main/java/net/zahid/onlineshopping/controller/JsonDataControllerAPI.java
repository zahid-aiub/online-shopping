package net.zahid.onlineshopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import net.zahid.shoppingBackend.dao.ProductDAO;
import net.zahid.shoppingBackend.dto.Product;

@Controller
@RequestMapping("/json/data")
public class JsonDataControllerAPI {
	
	@Autowired
	private ProductDAO productDAO;
	
	@RequestMapping("/all/products")
	@ResponseBody
	public List<Product> getAllProduct() {
		
		return productDAO.listOfActiveProducts();
	}
	
	@RequestMapping("/category/{id}/products")
	@ResponseBody
	public List<Product> getAllProductByCategory(@PathVariable int id) {
		
		return productDAO.listOfActiveProductByCategory(id); 
	}

}
