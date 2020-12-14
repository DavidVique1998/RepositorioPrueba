package com.portbelly.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.portbelly.backend.models.entities.Promotion;

public interface IPromotion extends CrudRepository<Promotion, Long>{

}
