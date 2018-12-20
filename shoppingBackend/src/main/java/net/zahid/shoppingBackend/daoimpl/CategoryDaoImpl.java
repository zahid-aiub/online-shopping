package net.zahid.shoppingBackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.zahid.shoppingBackend.dao.CategoryDAO;
import net.zahid.shoppingBackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDaoImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();
	
	static {
		
		Category category = new Category();
		
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is testing purpose for Television");
		category.setImageURL("CAT_1.png");
		
		categories.add(category);
		
		category = new Category();
		
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is testing purpose for Mobile");
		category.setImageURL("CAT_2.png");
		
		categories.add(category);
		
		category = new Category();
		
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is testing purpose for Laptop");
		category.setImageURL("CAT_3.png");
		
		categories.add(category);
		
	}
	
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}


	@Override
	public Category get(int id) {
		// TODO Auto-generated method stub
		for(Category category : categories) {
			if (category.getId()== id) {
				return category;
			}
		}
		
		return null;
	}

}
