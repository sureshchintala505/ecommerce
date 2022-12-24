package com.psl.ecommerce.iservice;

import java.util.List;

import com.psl.ecommerce.model.Product;

public interface IProductService {
	 List<Product> getAll();
	 Product getById( int id);
	 Product persist(Product product) ;
	
	public List<Product> delete(int id) ;
		
}
