package com.firstRestApi.firstRestApi.Business;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.firstRestApi.firstRestApi.Dal.ICategoryDal;
import com.firstRestApi.firstRestApi.Entities.Categories;

@Service
public class CategoryManager implements ICategoryService {
	private ICategoryDal categoryDal;
	
	public CategoryManager(ICategoryDal categoryDal) {
		this.categoryDal = categoryDal;
	}
	
	@Override
	@Autowired
	public List<Categories> categoryGetAll() {
		return this.categoryDal.categoryGetAll();
	}
	
	@Override
	@Transactional
	public void categoryAdd(Categories categories) {
		this.categoryDal.categoryAdd(categories);
		
	}

	@Override
	@Transactional
	public void categoryUpdate(Categories categories) {
		this.categoryDal.categoryUpdate(categories);
		
	}

	@Override
	@Transactional
	public void categoryDelete(Categories categories) {
		this.categoryDal.categoryDelete(categories);		
	}

	@Override
	@Transactional
	public Categories categoryGetById(int id) {
		return this.categoryDal.categoryGetById(id);
	}

}
