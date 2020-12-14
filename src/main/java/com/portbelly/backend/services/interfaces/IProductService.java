package com.portbelly.backend.services.interfaces;

import java.util.List;

import com.portbelly.backend.models.entities.Product;

public interface IProductService {

	public void save(Product p);//Create-updateç
	public Product findById(Long id); //retrieve
	public void delete (Long id); //delete
	public List<Product> findAll();//list
}
