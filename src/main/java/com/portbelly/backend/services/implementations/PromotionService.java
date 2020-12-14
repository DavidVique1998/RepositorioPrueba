package com.portbelly.backend.services.implementations;

import java.util.List;

import com.portbelly.backend.models.dao.IPromotion;
import com.portbelly.backend.models.entities.Promotion;
import com.portbelly.backend.services.interfaces.IPromotionService;

import org.springframework.stereotype.Service;

@Service
public class PromotionService implements IPromotionService{
	
	private IPromotion dao;

	@Override
	public void save(Promotion p) {
		dao.save(p);
		
	}

	@Override
	public Promotion findById(Long id) {
		return dao.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		Promotion p = this.findById(id);
		dao.delete(p);
	}

	@Override
	public List<Promotion> findAll() {
		return (List<Promotion>) dao.findAll();
	}

}
