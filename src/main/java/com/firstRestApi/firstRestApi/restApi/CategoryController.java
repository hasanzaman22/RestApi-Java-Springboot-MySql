package com.firstRestApi.firstRestApi.restApi;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.firstRestApi.firstRestApi.Business.ICategoryService;
import com.firstRestApi.firstRestApi.Entities.Categories;

@RestController
@RequestMapping("/api")
public class CategoryController {
	
	private ICategoryService categoryService;
	
	private int id = 0;

	@Autowired
	public CategoryController(ICategoryService categoryService) {
		this.categoryService = categoryService;
	}
	
	@GetMapping("/categories")
	public List<Categories> get(){
		return categoryService.categoryGetAll();
	}
	
	@PostMapping("/categoryAdd")
	public void add(@RequestBody Categories categories) {
		categoryService.categoryAdd(categories);
	}
	
	@PostMapping("/categoryUpdate")
	public void update(@RequestBody Categories categories) {
		categoryService.categoryUpdate(categories);
	}
	
	@PostMapping("/categoryDelete")
	public void delete(@RequestBody Categories categories) {
		categoryService.categoryDelete(categories);
	}
	
	@GetMapping("/categories/{id}")
	public Categories getByCode(@PathVariable int id){
		return categoryService.categoryGetById(id);
	}
}
