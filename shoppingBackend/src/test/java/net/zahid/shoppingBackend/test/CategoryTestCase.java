package net.zahid.shoppingBackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.zahid.shoppingBackend.dao.CategoryDAO;
import net.zahid.shoppingBackend.dto.Category;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;
	private static CategoryDAO categoryDAO;
	private Category category;

	@BeforeClass
	public static void init() {

		context = new AnnotationConfigApplicationContext();
		context.scan("net.zahid.shoppingBackend");
		context.refresh();

		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");

	}

	/*@Test
	public void testAddCategory(){

		category = new Category();

		category.setName("Laptop");
		category.setDescription("This is testing purpose for Laptop");
		category.setImageURL("CAT_2.png");

		assertEquals("Successfully added Category into database table", true, categoryDAO.add(category));

	}*/
	
	

}
