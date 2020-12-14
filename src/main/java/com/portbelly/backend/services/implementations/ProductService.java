package com.portbelly.backend.services.implementations;

import java.util.List;

import org.springframework.stereotype.Service;

import com.portbelly.backend.models.dao.IProduct;
import com.portbelly.backend.models.entities.Product;
import com.portbelly.backend.services.interfaces.IProductService;

@Service
public class ProductService implements IProductService{

	private IProduct dao;
	@Override
	public void save(Product p) {
		dao.save(p);
		
	}

	@Override
	public Product findById(Long id) {
		return dao.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		Product p = this.findById(id);
		dao.delete(p);
		
	}

	@Override
	public List<Product> findAll() {
		return (List<Product>) dao.findAll();
	}

}
