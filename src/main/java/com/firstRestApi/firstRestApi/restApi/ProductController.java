package com.firstRestApi.firstRestApi.restApi;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.firstRestApi.firstRestApi.Business.IProductService;
import com.firstRestApi.firstRestApi.Entities.Products;

@RestController
@RequestMapping("/api")
public class ProductController {
	
	private IProductService productService;

	@Autowired
	public ProductController(IProductService productService) {
		this.productService = productService;
	}
	
	@GetMapping("/products")
	public List<Products> get(){
		return productService.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Products products, int id) {
		productService.add(products);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody Products products, int id) {
		productService.update(products);
	}
	
	@PostMapping("/delete")
	public void delete(@RequestBody Products products) {
		productService.delete(products);
	}
	
	@GetMapping("/products/{id}")
	public Products getByCode(@PathVariable int id){
		return productService.getById(id);
	}
}
