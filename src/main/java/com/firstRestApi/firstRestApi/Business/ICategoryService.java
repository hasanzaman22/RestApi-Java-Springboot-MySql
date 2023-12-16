package com.firstRestApi.firstRestApi.Business;

import java.util.List;

import com.firstRestApi.firstRestApi.Entities.Categories;

public interface ICategoryService {
	List<Categories> categoryGetAll();
	void categoryAdd(Categories categories);
	void categoryUpdate(Categories categories);
	void categoryDelete(Categories categories);
	Categories categoryGetById(int id);
}
