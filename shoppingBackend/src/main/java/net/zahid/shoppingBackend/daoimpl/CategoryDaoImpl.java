package net.zahid.shoppingBackend.daoimpl;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.zahid.shoppingBackend.dao.CategoryDAO;
import net.zahid.shoppingBackend.dto.Category;

@Repository("categoryDAO")
@Transactional
public class CategoryDaoImpl implements CategoryDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	
	@Override
	public List<Category> list() {
		
		String selectActiveCategory_sql = "FROM Category WHERE active = :active";
		Query query= sessionFactory.getCurrentSession().createQuery(selectActiveCategory_sql);
		query.setParameter("active", true);
		
		return query.getResultList();
	}


	@Override
	public Category get(int id) {
		
		return sessionFactory.getCurrentSession().get(Category.class, Integer.valueOf(id));
	}


	@Override
	public boolean add(Category category) {
		try {
			sessionFactory.getCurrentSession().persist(category);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}


	@Override
	public boolean update(Category category) {
		try {
			sessionFactory.getCurrentSession().update(category);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}


	@Override
	public boolean delete(Category category) {
		try {
			
			sessionFactory.getCurrentSession().update(category);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
