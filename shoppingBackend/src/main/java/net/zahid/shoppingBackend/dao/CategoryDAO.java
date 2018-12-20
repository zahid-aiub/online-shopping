package net.zahid.shoppingBackend.dao;

import java.util.List;

import net.zahid.shoppingBackend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	Category get(int id);

}
