package com.firstRestApi.firstRestApi.Dal;

import java.util.List;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.firstRestApi.firstRestApi.Entities.Categories;
import jakarta.persistence.EntityManager;

@Repository
public class HibernateCategoryDal implements ICategoryDal {
	
	private EntityManager entityManager;

	@Autowired
	public HibernateCategoryDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public List<Categories> categoryGetAll() {
		Session session = entityManager.unwrap(Session.class);
		List<Categories> categories = session.createQuery("from Categories", Categories.class).getResultList();
		return categories;
	}

	@Override
	public void categoryAdd(Categories categories) {
		if(categories.getId() == 0) {
			Session session = entityManager.unwrap(Session.class);
			session.saveOrUpdate(session);
		}else {
			System.out.println("This item already exists.");
		}
	}

	@Override
	public void categoryUpdate(Categories categories) {
		if(categories.getId() != 0) {
			Session session = entityManager.unwrap(Session.class);
			session.saveOrUpdate(session);
		}else {
			System.out.println("This item does not exists.");
		}
		
	}
	
	@Override
	public void categoryDelete(Categories categories) {
		Session session = entityManager.unwrap(Session.class);
		Categories productToDelete = session.get(Categories.class, categories.getCategoryName());
		session.delete(session);
		
	}

	@Override
	public Categories categoryGetById(int id) {
		Session session = entityManager.unwrap(Session.class);
		Categories categories = session.get(Categories.class, id);
		return categories;
	}
}
