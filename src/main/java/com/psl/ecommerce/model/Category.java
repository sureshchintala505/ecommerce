package com.psl.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "categories")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "category_name")
	private @NotBlank String categoryName;

	private @NotBlank String description;

	private @NotBlank String price;


	public Category() {
	}

	public Category(@NotBlank String categoryName, @NotBlank String description) {
		this.categoryName = categoryName;
		this.description = description;
	}

	public Category(@NotBlank String categoryName, @NotBlank String description, @NotBlank String price) {
		this.categoryName = categoryName;
		this.description = description;
		this.price = price;
	}

	public String getCategoryName() {
		return this.categoryName;
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

	@Override
	public String toString() {
		return "User {category id=" + id + ", category name='" + categoryName + "', description='" + description + "'}";
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}