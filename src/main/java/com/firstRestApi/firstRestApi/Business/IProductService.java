package com.firstRestApi.firstRestApi.Business;

import java.util.List;

import com.firstRestApi.firstRestApi.Entities.Products;

public interface IProductService {
	List<Products> getAll();
	void add(Products products);
	void update(Products products);
	void delete(Products products);
	Products getById(int id);
}
