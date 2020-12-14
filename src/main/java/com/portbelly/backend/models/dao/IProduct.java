package com.portbelly.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.portbelly.backend.models.entities.Product;

public interface IProduct extends CrudRepository<Product, Long>{

}
