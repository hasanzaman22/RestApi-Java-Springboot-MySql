package com.firstRestApi.firstRestApi.Dal;

import java.util.List;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.firstRestApi.firstRestApi.Entities.Products;
import jakarta.persistence.EntityManager;

@Repository
public class HibernateProductDal implements IProductDal {
	
	private EntityManager entityManager;

	@Autowired
	public HibernateProductDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public List<Products> getAll() {
		Session session = entityManager.unwrap(Session.class);
		List<Products> products = session.createQuery("from Products", Products.class).getResultList();
		return products;
	}

	@Override
	public void add(Products products) {
		if(products.getId() == 0) {
			Session session = entityManager.unwrap(Session.class);
			session.saveOrUpdate(session);
		}else {
			System.out.println("This item already exists.");
		}
	}

	@Override
	public void update(Products products) {
		if(products.getId() != 0) {
			Session session = entityManager.unwrap(Session.class);
			session.saveOrUpdate(session);
		}else {
			System.out.println("This item does not exists.");
		}
	}
	
	@Override
	public void delete(Products products) {
		Session session = entityManager.unwrap(Session.class);
		Products productToDelete = session.get(Products.class, products.getProductName());
		session.delete(session);
		
	}

	@Override
	public Products getById(int id) {
		Session session = entityManager.unwrap(Session.class);
		Products products = session.get(Products.class, id);
		return products;
	}

}
