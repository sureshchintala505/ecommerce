package com.psl.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The Class Product.
 *
 * @author devrobot
 * @version 1.0
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
//@Table(name = "product")
public class Product {

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;

	/** The name. */
	@Column(name = "name", nullable = false)
	private String name;

	/** The description. */
	@Column(name = "description")
	private String description;

	/** The weight. */
	@Column(name = "weight")
	private double weight;

	/** The price. */
	@Column(name = "price", nullable = false)
	private double price;

	/** The pictures. */
	@Column(name = "picture1")
	private String picture1;

	/** The pictures. */
	@Column(name = "picture2")
	private String picture2;

	/** The pictures. */
	@Column(name = "picture3")
	private String picture3;

	/** The category. */
	@ManyToOne
	private Category category;

	/**
	 * Empty Constructor. Instantiates a new product.
	 */
	
}
