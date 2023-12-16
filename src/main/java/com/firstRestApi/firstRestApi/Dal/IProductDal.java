package com.firstRestApi.firstRestApi.Dal;

import java.util.List;

import com.firstRestApi.firstRestApi.Entities.Products;

public interface IProductDal {
	List<Products> getAll();
	void add(Products products);
	void update(Products products);
	void delete(Products products);
	Products getById(int id);
}
