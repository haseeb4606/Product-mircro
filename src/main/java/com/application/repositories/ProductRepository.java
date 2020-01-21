package com.application.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.application.entities.ProductEntity;

@Repository
public interface ProductRepository  extends CrudRepository<ProductEntity, Long>{
	
	public List<ProductEntity> findAll();

}
