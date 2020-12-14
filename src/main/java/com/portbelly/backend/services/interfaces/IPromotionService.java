package com.portbelly.backend.services.interfaces;

import java.util.List;

import com.portbelly.backend.models.entities.Promotion;

public interface IPromotionService {

	public void save(Promotion p);//Create-updateç
	public Promotion findById(Long id); //retrieve
	public void delete (Long id); //delete
	public List<Promotion> findAll();//list
}
