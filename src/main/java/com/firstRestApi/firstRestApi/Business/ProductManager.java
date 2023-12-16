package com.firstRestApi.firstRestApi.Business;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.firstRestApi.firstRestApi.Dal.IProductDal;
import com.firstRestApi.firstRestApi.Entities.Products;

@Service
public class ProductManager implements IProductService {
	private IProductDal productDal;
	
	public ProductManager(IProductDal productDal) {
		this.productDal = productDal;
	}
	
	@Override
	@Autowired
	public List<Products> getAll() {
		return this.productDal.getAll();
	}
	
	@Override
	@Transactional
	public void add(Products products) {
		this.productDal.add(products);
		
	}

	@Override
	@Transactional
	public void update(Products products) {
		this.productDal.update(products);
		
	}

	@Override
	@Transactional
	public void delete(Products products) {
		this.productDal.delete(products);		
	}

	@Override
	@Transactional
	public Products getById(int id) {
		return this.productDal.getById(id);
	}

}
