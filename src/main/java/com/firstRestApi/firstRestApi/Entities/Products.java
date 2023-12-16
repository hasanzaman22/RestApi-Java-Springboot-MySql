package com.firstRestApi.firstRestApi.Entities;

import jakarta.persistence.*;

@Entity
@Table(name="products")
public class Products {
	
	@Id
	@Column(name="productID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="productname")
	private String productName;
	
	@Column(name="categoryid")
	private int categoryId;
	
	@Column(name="unit")
	private String unit;

	@Column(name="price")
	private int price;
	
	public Products(int id, String productName, int categoryId, String unit, int price) {
		super();
		this.id = id;
		this.productName = productName;
		this.categoryId = categoryId;
		this.unit = unit;
		this.price = price;
	}
	
	public Products() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
