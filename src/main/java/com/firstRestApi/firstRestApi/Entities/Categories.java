package com.firstRestApi.firstRestApi.Entities;

import jakarta.persistence.*;

@Entity
@Table(name="categories")
public class Categories {
	
	@Id
	@Column(name="categoryID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="categoryname")
	private String categoryName;
	
	@Column(name="description")
	private String description;

	public Categories(int id, String categoryName, String description) {
		super();
		this.id = id;
		this.categoryName = categoryName;
		this.description = description;
	}
	
	public Categories() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
